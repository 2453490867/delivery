package com.delivery.service;


import com.delivery.dto.UserLoginDTO;
import com.delivery.entity.User;

public interface UserService {

    /**
     * 微信登录
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
