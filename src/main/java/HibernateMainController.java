import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;





import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import Pojo.Address;
import Pojo.ArtStudent;
import Pojo.Categories;
import Pojo.Customer;
import Pojo.Employee;
import Pojo.Items;
import Pojo.Owner;
import Pojo.Servents;
import Pojo.Students;
import Pojo.UserDetails;
import Pojo.Vehicle;

public class HibernateMainController {

	public static void main(String[] args) {
		try{
	//	AnnotationConfiguration cfg=new AnnotationConfiguration();s
		Configuration cfg=new Configuration();
		
		cfg.configure(" hibernate.cfg.xml");
		//creating session factory
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		
		Employee emp=new Employee();
		emp.setName("divya");
		
		//creating session
		Session session=sessionFactory.openSession();
		
		//creating transaction object
		Transaction trn=session.beginTransaction();

		/*
		Employee empParent=new Employee();
		empParent.setName("sumitbatra");
		empParent.setSalary("2000");
		empParent.setVer(0);
		//empParent.setVer(0);
//		empParent.setEmpname("Sumit Batra");
//		empParent.setEmpSal("1000");		
		//session.save(empParent);
		Employee empDBLoaded =(Employee)session.load(Employee.class,1);
		//System.out.println("employee object loaded from db"+ empDBLoaded.getName());
		empDBLoaded.setName("divya");
		*/
		
		/*
		Students st=new Students();
		st.setAge("24");
		st.setName("poorvi");
		
		ArtStudent at=new ArtStudent();
		at.setSubject("maths");
		//at.setName("divya");
		at.setAge("25");
		
		session.save(st);
		session.save(at);
		*/
		/*
		Students st=new Students();
		Query query=session.createQuery(" from Students where age=?");
		query.setInteger(0,24);
		
		List list=query.list();			
		*/
		
		/*
		Criteria crit=session.createCriteria(Students.class);
		
		List lt=new ArrayList();
		lt.add("poorvi");
		lt.add("sumit");
		lt.add("divya");
		crit.add(Restrictions.in("name",lt));
		crit.addOrder(Order.asc("name"));
		List list=crit.list();		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Students strElement=(Students)itr.next();
			System.out.println(strElement.getName()+"----"+strElement.getAge());			
		}
		*/
	
		
		Vehicle v1=new Vehicle();
		v1.setVehicleName("bullet");
		v1.setVechiclePrice(130000.44);
		
		Customer c1=new Customer();
		c1.setCustName("sachin");
		c1.setVehicle(v1);
	//	session.save(v1);
	//	session.save(c1);
		
	/*	
		Query qr=session.createSQLQuery("delete from cust_info where cust_id=?");
		qr.setInteger(0, 2);
		qr.executeUpdate();
		*/
	/*
		Query qr=session.createQuery(" from Customer where custid=?");
		qr.setParameter(0,8);
		List lt=qr.list();
		Iterator itr=lt.iterator();
		while(itr.hasNext()){
			Customer c=(Customer)itr.next();
			session.delete(c);
		}
	*/
	/*	
	Categories ct1=new Categories();	
	ct1.setCatid(103);
	ct1.setCatname("plastic");
	
	
	Categories ct2=new Categories();	
	ct2.setCatid(104);
	ct2.setCatname("electronics");
	
	Items it1=new Items();
	it1.setItemid(1002);
	it1.setItemname("ac");
	
	Items it2=new Items();
	it2.setItemid(1003);
	it2.setItemname("mobile");
		
	Set hs=new HashSet();
	hs.add(it1);
	hs.add(it2);
	
	
	
	ct1.setItemSet(hs);
	ct2.setItemSet(hs);
	
	Transaction trn=session.beginTransaction();

	session.save(ct1);
	session.save(ct2);
	
		trn.commit();
	*/	
	
	/*	
		Employee dbEmployee=(Employee)session.load(Employee.class,1);
		System.out.println("db---"+dbEmployee.getEmpid()+"--name--"+dbEmployee.getName());
		
		session.close();
		
		Session session2 = sessionFactory.openSession();
		
		Employee cacheEmployee=(Employee)session2.load(Employee.class,1);
		System.out.println("cache---"+cacheEmployee.getEmpid()+"--name--"+cacheEmployee.getName());
		session2.close();
		*/
		UserDetails user1=new UserDetails();
		user1.setUsername("sumit");
		
		Address address1=new Address();
		address1.setCity("Panipat");
		address1.setState("Haryana");
		address1.setZipcode("132103");
		
		Address address2=new Address();
		address2.setCity("Gurgaon");
		address2.setState("Haryana");
		address2.setZipcode("122016");
		
		List<Address> listOfAddress=new ArrayList<Address>();
		listOfAddress.add(address1);
		listOfAddress.add(address2);
		
		user1.setListOfAddress(listOfAddress);
		
		//Session session=sessionFactory.openSession();
		//Transaction trn=session.beginTransaction();
		//UserDetails userToBeDeleted=(UserDetails) session.get(UserDetails.class,8);
		//	session.save(user1);
		//session.delete(userToBeDeleted);
		
		
		Servents ser1=new Servents();
		ser1.setServentName("ramu");
		ser1.setServentSal("1000");
		
		
		Servents ser2=new Servents();
		ser2.setServentName("shamu");
		ser2.setServentSal("2000");
		
		Owner owner=new Owner();
		owner.setOwnerName("sumit");
		owner.setOwnerBusiness("it");
		
		List<Servents> ls=new ArrayList<Servents>();
		ls.add(ser1);
		ls.add(ser2);
		
		owner.setListServent(ls);
		
		session.save(owner);
		
		trn.commit();
		session.close();
		
		
		
		System.out.println("successfully saved");
			}catch(Exception e){
				System.out.println("exception is "+e.getMessage());
			}
		
		
	}
	
}
