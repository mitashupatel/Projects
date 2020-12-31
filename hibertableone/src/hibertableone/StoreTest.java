package hibertableone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreTest {

	public static void main(String args[]) {
		StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session =factory.openSession();
		
		Transaction t1=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setName("Mitashu");
		
		Regular_Employee e2 =new Regular_Employee();
	    e1.setName("Mark42");
	    e2.setSalary(10);
	    e2.setBonus(1500);
	    
	    Contract_Employee e3=new Contract_Employee();
	    e3.setName("veronika");
	    e3.setPay_per_hour(100);
	    e3.setContract_duration("15 hours");

	    
	    session.persist(e1);
	    session.flush();
	    session.clear();
	    session.persist(e2);
	    session.flush();
	    session.clear();
	    session.persist(e3);
	    
	    t1.commit();
	    session.close();
	    
		System.out.println("SUccesfull");
		System.out.println("Check Your Table : ");
	}
}
