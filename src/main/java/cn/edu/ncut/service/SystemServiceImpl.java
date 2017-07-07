package cn.edu.ncut.service;

import cn.edu.ncut.model.User;
import cn.edu.ncut.repository.UserCrudReposity;
import cn.edu.ncut.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lh on 2017/4/14.
 */

@Service("systemService")
public class SystemServiceImpl implements SystemService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserCrudReposity userCrudReposity;

    @Transactional
    @Override
    public void update(Integer id, String password) {
        userRepository.update(id, password);
    }


    @Transactional
    public void save(List<User> userList)
    {
        userCrudReposity.save(userList);
    }

}
