package Entities;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ahmed on 5/26/2017.
 */
public class studentDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Transactional
    public void insert(Student student) {

        sessionFactory.getCurrentSession().save(student);

    }

    //    private HibernateTemplate template;
//
//
//    public HibernateTemplate getTemplate() {
//        return template;
//    }
//
//    public void setTemplate(HibernateTemplate template) {
//        this.template = template;
//    }
//
//    @Transactional
//    public void insert(student student) {
//
//        template.save(student);
//
//
//    }

}
