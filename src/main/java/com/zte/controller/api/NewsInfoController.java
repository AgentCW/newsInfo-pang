package com.zte.controller.api;

import com.zte.bean.News;
import com.zte.dao.NewsDao;
import com.zte.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

@Controller("newsInfoController")
@RequestMapping("/news_info")
public class NewsInfoController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private NewsDao newsDao;

    @RequestMapping("/search")
    public String search(News news){
        newsService.getNews(news);
        return "/content/newsAdd";
    }
    @RequestMapping("/add")
    public String toAdd(HttpServletRequest request, News news, @RequestParam(value = "imgFile")MultipartFile file) throws IOException {
        String msg = "";
        String dirPath = request.getServletContext().getRealPath("upload");
        //如果目录不存在，则创建目录
        File dir = new File(dirPath);
        if(!dir.exists()){
            dir.mkdirs();
        }
        String filename = file.getOriginalFilename();
        File newsFile = new File(dirPath,filename);
        try {
            file.transferTo(newsFile);
            news.setImgFileName("upload/" + filename);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        news.setCommentTotalNum(1);
        newsDao.insert(news);

        return "/content/newsAdd";
    }
}
