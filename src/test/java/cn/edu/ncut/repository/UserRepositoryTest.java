package cn.edu.ncut.repository;

import cn.edu.ncut.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Ocean lin on 2017/7/3.
 */

@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void testFindByName() {
        User user = userRepository.findByName("xdm");
        Assert.assertNotNull(user);
    }
}
