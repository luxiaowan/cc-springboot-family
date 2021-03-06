package cc.kevinlu.springboot.mybatisxml.service.impl;

import cc.kevinlu.springboot.mybatisxml.dao.mapper.UserMapper;
import cc.kevinlu.springboot.mybatisxml.entity.User;
import com.example.springboot.mybatisxml.entity.User;
import cc.kevinlu.springboot.mybatisxml.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
        log.info("/queryAllUsers start...");
        return userMapper.queryAllUsers();
    }
}
