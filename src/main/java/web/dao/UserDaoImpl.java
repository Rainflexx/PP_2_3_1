package web.dao;

import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository

public class UserDaoImpl implements UserDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void adduser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class,id);
        if (user!=null){
            entityManager.remove(user);
        }
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User",User.class).getResultList();
    }
}
