package com.ims.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ims.models.Booking;
import com.ims.models.DateTimeSlots;
import com.ims.models.Doctor;
import com.ims.models.PatientReport;
import com.ims.models.Register;
import com.ims.models.UserLogin;

@Repository
@Transactional
public class RegisterDaoImpl implements RegisterDao{


	protected SessionFactory sessionFactory;
	
	public Session getSessionFactory() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	public int Insert(Object obj) {
		// TODO Auto-generated method stub
		int id= (int) getSessionFactory().save(obj);
		//System.out.println(id);
		
		return id;
		
	}

	@Transactional
	public  List<Register> getAllData(){
		
		return sessionFactory.getCurrentSession().createQuery("from Register").list();
		
	
	  }
	
	 @Transactional	
      public  List<Doctor> getAllDoctors(){
		
		return sessionFactory.getCurrentSession().createQuery("from Doctor").list();
		
	
	  }
      
	  @SuppressWarnings("unchecked")
	@Transactional
      public List<Booking> getAllBookings(){
    	  
    	  return sessionFactory.getCurrentSession().createQuery("from Booking").list();
      }
      
      @Transactional
      public void UpdateUser(Register rj){
    	  
    	  Session session =getSessionFactory();
    	  
    	  Register r = (Register) session.get(Register.class,rj.getUserid());
    	  
    	  r.setFirstname(rj.getFirstname());
    	  r.setLastname(rj.getLastname());
    	  r.setAddress(rj.getAddress());
    	  r.setDob(rj.getDob());
    	  r.setGender(rj.getGender());
    	  r.setPhone(rj.getPhone());
    	  r.setEmail(rj.getEmail());
    	  r.setZipcode(rj.getZipcode());
//    	  Transaction tx = (Transaction) session.beginTransaction();
    	  session.update(r);
    	  //session.
//    	  try {
//			tx.commit();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	  
//    	  session.close();
    	  System.out.println(r.getUsername());
      }
      
      public void UpdateLog(UserLogin log){
    	  Session session =getSessionFactory();
    	  UserLogin loge = (UserLogin)session.get(UserLogin.class,log.getId());
    	  System.out.println(loge.getId());
    	  System.out.println(new Date());
    	  loge.setLogouttime(new Date());
    	  session.update(loge);
      }
      
      public DateTimeSlots getData(String doctorname){
    	  Session session =getSessionFactory();
    	  DateTimeSlots ds1 = (DateTimeSlots)session.get(DateTimeSlots.class, doctorname);
         return ds1;  
       
      }

	@Override
	public void updateTable(Object obj) {
		// TODO Auto-generated method stub
		getSessionFactory().update(obj);
		
	}
	
	  @Transactional
      public List<DateTimeSlots> getAllSlots(){
    	  
    	  return sessionFactory.getCurrentSession().createQuery("from DateTimeSlots").list();
      }
	  
	  @Transactional
      public List<PatientReport> getAllPatientReport(){
    	  
    	  return sessionFactory.getCurrentSession().createQuery("from PatientReport").list();
      }
	  
	@SuppressWarnings("unchecked")
	@Transactional
	  public List<UserLogin> getAllLogins(){
		  
		  return sessionFactory.getCurrentSession().createQuery("from UserLogin").list();
	  }
	  
	
	public void deleteUserLogin(int id){
		  
  	  Session session =getSessionFactory();
  	  
  	  UserLogin r = (UserLogin) session.get(UserLogin.class,id);
  	  session.delete(r);
	 }
	
	public void deleteUser(int id){
		  
	  	  Session session =getSessionFactory();
	  	  
	  	  Register r = (Register) session.get(Register.class,id);
	  	  session.delete(r);
	}
	
    public void UpdateSlots(int Id, String slotname, String updateValue){
    	Session session =getSessionFactory();
    	DateTimeSlots ds1 = (DateTimeSlots)session.get(DateTimeSlots.class, Id);
    	
    	String status=null;
    	if(slotname.equals("Day1Slot1Status")){
             status= ds1.getDay1Slot1Status();
             if(!(status.equals(updateValue))){
            	 ds1.setDay1Slot1Status(updateValue);
             }
             System.out.println(status);
        }
        else if(slotname.equals("Day1Slot2Status")){
        	 status= ds1.getDay1Slot2Status();
        	 if(!(status.equals(updateValue))){
            	 ds1.setDay1Slot2Status(updateValue);
             }
        	   System.out.println(status);
	    } 
		else if(slotname.equals("Day1Slot3Status")){
			 status= ds1.getDay1Slot3Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay1Slot3Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day1Slot4Status")){
			 status= ds1.getDay1Slot4Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay1Slot4Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day2Slot1Status")){
			 status= ds1.getDay2Slot1Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay2Slot1Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day2Slot2Status")){
			 status= ds1.getDay2Slot2Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay2Slot2Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day2Slot3Status")){
			 status= ds1.getDay2Slot3Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay2Slot3Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day2Slot4Status")){
			 status= ds1.getDay2Slot4Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay2Slot4Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day3Slot1Status")){
			 status= ds1.getDay3Slot1Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay3Slot1Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day3Slot2Status")){
			 status= ds1.getDay3Slot2Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay3Slot2Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day3Slot3Status")){
			 status= ds1.getDay3Slot3Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay3Slot3Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day3Slot4Status")){
			 status= ds1.getDay3Slot4Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay3Slot4Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day4Slot1Status")){
			 status= ds1.getDay4Slot1Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay4Slot1Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day4Slot2Status")){
			 status= ds1.getDay4Slot2Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay4Slot2Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day4Slot3Status")){
			 status= ds1.getDay4Slot3Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay4Slot3Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day4Slot4Status")){
			 status= ds1.getDay4Slot4Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay4Slot4Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day5Slot1Status")){
			 status= ds1.getDay5Slot1Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay5Slot1Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day5Slot2Status")){
			 status= ds1.getDay5Slot2Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay5Slot2Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day5Slot3Status")){
			 status= ds1.getDay5Slot3Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay5Slot3Status(updateValue);
             }
			   System.out.println(status);
		} 
		else if(slotname.equals("Day5Slot4Status")){
			 status= ds1.getDay5Slot4Status();
			 if(!(status.equals(updateValue))){
            	 ds1.setDay5Slot4Status(updateValue);
             }
			   System.out.println(status);
		} 
    	session.update(ds1);
       
    }
    
    
    @SuppressWarnings("unchecked")
	@Override
	public List<Object> getDataWithField(String field,String fieldname, String tablename) {
		Query query = sessionFactory.getCurrentSession().createQuery("from " + tablename + " as o where o."+fieldname+"=?");
		query.setParameter(0, field);
		List<Object> allUsers = query.list();
		return allUsers;

		// TODO Auto-generated method stub
		// return null;
	}
    
    @Override
	public Object getAUser(int id, String tablename) {


	
		@SuppressWarnings("unchecked")
		List<Object> list = sessionFactory.getCurrentSession().createQuery("from "+tablename+" where id ="+id).list(); // here should be something else than list()
	    return (list.isEmpty() ? null : list.get(0));
		
	

		// TODO Auto-generated method stub
		// return null;
	}
	
	
    
    }

