package cn.edu.ncut.repository;

import cn.edu.ncut.model.User;
import cn.edu.ncut.service.SystemService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/3.
 */

@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Resource
    private SystemService systemService;

    @Test
    public void testFindByName() {
        User user = userRepository.findByName("xdm");
        Assert.assertNotNull(user);
    }

    @Test
    public void testUpdateUser() {
        systemService.update(1,"12345");
    }

    @Test
    public void testSaveUser() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("hk","123456"));
        userList.add(new User("aym","123456"));

        systemService.save(userList);
    }


}
