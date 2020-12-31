package table_per_class_hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreTest {
	public static void main(String []args) {
	StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory factory=meta.getSessionFactoryBuilder().build();
	Session session=factory.openSession();
	
	Transaction t1=session.beginTransaction();
	Employee e1=new Employee();
	e1.setName("Mitashu Patel");
	
	Regular_Employee e2=new Regular_Employee();
	e2.setName("Mark 42");
	e2.setSalary(100000);
	e2.setBonus(5);
	
	Contract_Employee e3=new Contract_Employee();
	e3.setName("Veronika");
	e3.setPay_per_hour(10000);
	e3.setContract_duration("1.2 Billion year");
	
	session.persist(e1);
    session.flush();
    session.clear();
	
	session.persist(e2);
    session.flush();
    session.clear();
	
	session.persist(e3);
	
	t1.commit();
	session.close();
	System.out.println("Successful");
}
}