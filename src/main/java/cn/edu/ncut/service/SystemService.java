package cn.edu.ncut.service;

import cn.edu.ncut.model.User;

import java.util.List;

/**
 * Created by lh on 2017/4/14.
 */
public interface SystemService {

    void update(Integer id, String password);


    void save(List<User> userList);
}
