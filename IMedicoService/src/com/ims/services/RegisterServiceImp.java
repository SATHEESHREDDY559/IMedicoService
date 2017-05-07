package com.ims.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ims.dao.RegisterDao;
import com.ims.models.Booking;
import com.ims.models.DateTimeSlots;
import com.ims.models.Doctor;
import com.ims.models.PatientReport;
import com.ims.models.Register;
import com.ims.models.UserLogin;

@Service
public class RegisterServiceImp implements RegisterService{

	
	@Autowired
	private RegisterDao registerDao;
	
	
	
	public void setRegisterDao(RegisterDao registerdao) {
		registerDao = registerdao;
	}



	@Transactional
	public int Insert(Object obj) {
		// TODO Auto-generated method stub
		
		int id =registerDao.Insert(obj);
		return id;
		
	}



	@Override
	public List<Register> getAllData() {
		// TODO Auto-generated method stub
		return registerDao.getAllData();
	}
	public  List<Doctor> getAllDoctors(){
		return registerDao.getAllDoctors();
	}
	
	
	public List<Booking> getAllBookings(){
		
		return registerDao.getAllBookings();
	}
	public void UpdateUser(Register rj){
		registerDao.UpdateUser(rj);
	}
	public void UpdateLog(UserLogin log){
		registerDao.UpdateLog(log);
	}



	@Override
	public void updateTable(Object obj) {
		// TODO Auto-generated method stub
		registerDao.updateTable(obj);
		
	}
	
	 public List<DateTimeSlots> getAllSlots(){
		 return registerDao.getAllSlots();
	 }



	@Transactional
	public List<UserLogin> getAllLogins() {
		// TODO Auto-generated method stub
		return registerDao.getAllLogins();
	}
	
	@Transactional
	public void deleteUserLogin(int id){
		
	     registerDao.deleteUserLogin(id);
	}
	 public void deleteUser(int id){
		 registerDao.deleteUser(id);
	 }
	 public void UpdateSlots(int Id, String slotname, String updateValue){
		 registerDao.UpdateSlots(Id, slotname, updateValue);
	 }



	@Override
	public List<PatientReport> getAllPatientReport() {
		// TODO Auto-generated method stub
		return registerDao.getAllPatientReport();
	}



	@Override
	public List<Object> getDataWithField(String field, String fieldname, String tablename) {
		// TODO Auto-generated method stub
		return registerDao.getDataWithField(field, fieldname, tablename);
	}



	@Override
	public Object getAUser(int id, String tablename) {
		// TODO Auto-generated method stub
		return registerDao.getAUser(id, tablename);
	}
}
