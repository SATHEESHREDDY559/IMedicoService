package com.ims.services;

import java.util.List;

import com.ims.models.Booking;
import com.ims.models.DateTimeSlots;
import com.ims.models.Doctor;
import com.ims.models.PatientReport;
import com.ims.models.Register;
import com.ims.models.UserLogin;

public interface RegisterService {
	
   public int Insert(Object obj);
   public  List<Register> getAllData();
   public  List<Doctor> getAllDoctors();
   public void UpdateUser(Register rj);
   public List<Booking> getAllBookings();
   public void UpdateLog(UserLogin log);
   public void updateTable(Object obj);
   public List<UserLogin> getAllLogins();
   public List<DateTimeSlots> getAllSlots();
   public List<PatientReport> getAllPatientReport();
   public void deleteUserLogin(int id);
   public void deleteUser(int id);
	public Object getAUser(int id, String tablename);
   public List<Object> getDataWithField(String field,String fieldname, String tablename) ;
   public void UpdateSlots(int Id, String slotname, String updateValue);
}
