package cn.edu.ncut.repository;


import cn.edu.ncut.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

/**
 * Created by Ocean lin on 2017/7/3.
 */
@RepositoryDefinition(domainClass = User.class, idClass = Integer.class)
public interface UserRepository {
    //public interface UserRepository extends Repository<User,Integer>

    User findByName(String name);

    @Modifying
    @Query("update User u set u.password = :password where u.id = :id")
    void update(@Param("id") Integer id, @Param("password") String password);


}
