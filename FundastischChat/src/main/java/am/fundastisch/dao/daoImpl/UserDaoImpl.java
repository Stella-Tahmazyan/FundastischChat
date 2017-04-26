package am.fundastisch.dao.daoImpl;

import am.fundastisch.domain.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by stellatahmazyan on 4/26/17.
 */

@Repository
@Transactional
public class UserDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDaoImpl() {


    }

    public List<User> getAll(User user){
       Criteria criteria= entityManager.unwrap(Session.class).createCriteria(User.class);
        return criteria.list();
    }

}
