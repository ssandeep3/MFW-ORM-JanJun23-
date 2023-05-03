package hibernatepkg.hibernatedemo;

import java.lang.module.Configuration;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SecurityException
    {
        System.out.println( "Hello World!" );
        org.hibernate.cfg.Configuration conf = new org.hibernate.cfg.Configuration();
        conf.configure("hibernate.cfg.xml");
        SessionFactory factory  = conf.buildSessionFactory();
        faculty f1 = new faculty(124,"Mohan");
        
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        session.save(f1);
        t.commit();
        
        session.close();
        
        
        factory.close();
    }
}
