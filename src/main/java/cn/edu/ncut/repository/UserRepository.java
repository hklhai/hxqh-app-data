package cn.edu.ncut.repository;


import cn.edu.ncut.model.User;
import org.springframework.data.repository.Repository;

/**
 * Created by Ocean lin on 2017/7/3.
 */
public interface UserRepository extends Repository<User,Integer>{
    User findByName(String name);
}
