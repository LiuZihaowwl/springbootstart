package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.dto.RegisterDTO;
import com.example.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean register(RegisterDTO dto){
        //生成密码的随机盐
        String salt = UUID.randomUUID().toString();
        User user = new User();
        user.setUserName(dto.getUserName());
        //密码加盐再使用md5算法
        user.setPasword(DigestUtils.md5DigestAsHex((dto.getPasword() + salt).getBytes()));
        user.setSalt(salt);
        return 1 == userMapper.insert(user);
    }

}
