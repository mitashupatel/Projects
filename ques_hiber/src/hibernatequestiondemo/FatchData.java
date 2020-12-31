package hibernatequestiondemo;
import java.util.*;
import java.util.List;

import javax.persistence.TypedQuery; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FatchData {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	        
	    TypedQuery query=session.createQuery("from Question");    
	    List<Question> list=query.getResultList();   	        
	    Iterator<Question> itr=list.iterator();    
	    while(itr.hasNext()){    
	        Question q=itr.next();    
	        System.out.println("Question Name: "+q.getQname());    
	            
	        //printing answers    
	        java.util.List<String> list2=q.getAnswer();    
	        Iterator<String> itr2=list2.iterator();    
	        while(itr2.hasNext()){    
	            System.out.println(itr2.next());    
	        }          
	    }    
	    session.close();    
	    System.out.println("success");         
	}

}
