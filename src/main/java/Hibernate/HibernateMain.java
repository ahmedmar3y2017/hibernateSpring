package Hibernate;

import Entities.Student;
import Entities.studentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ahmed on 5/25/2017.
 */
public class HibernateMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        studentDao studentDao = (Entities.studentDao) context.getBean("d");
        studentDao.insert(new Student("ahmed","123456" , "tanta"));
    }
}
