package com.zte.service.impl;




import com.zte.bean.User;
import com.zte.dao.UserDao;
import com.zte.dto.UserDto;
import com.zte.service.UserService;
import com.zte.util.CommonUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public boolean validate(UserDto userDto) {
        if (userDto != null && !CommonUtil.isEmpty(userDto.getName()) && !CommonUtil.isEmpty(userDto.getPassword())) {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            return userDao.select(user).size() == 1;
        }
        return false;
    }


}