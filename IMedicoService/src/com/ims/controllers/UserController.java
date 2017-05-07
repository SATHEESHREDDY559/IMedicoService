package com.ims.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ims.models.Booking;
import com.ims.models.DateTimeSlots;
import com.ims.models.Doctor;
import com.ims.models.Register;
import com.ims.models.User;
import com.ims.models.UserLogin;
import com.ims.services.RegisterService;

@Controller
public class UserController {
 
	
	private RegisterService registerservice;

	@Autowired(required=true)
	@Qualifier(value="RegisterService")
	public void setRegisterservice(RegisterService registerservice) {
		this.registerservice = registerservice;
	}
	 
	@RequestMapping(value="/", method =RequestMethod.GET)
	public String Home(){
		
		System.out.println("In Home Page  ");
		/*List<Doctor> doclist=registerservice.getAllDoctors();
	
		System.out.println("Doctor Size:  "+doclist.size());
		
		if(doclist.size()>0)
		{
			for(int i=0;i<doclist.size();i++)
			{
			DateTimeSlots dts=new DateTimeSlots();
			DateTime date = new DateTime();
			dts.setDoctorId(doclist.get(i).getUserName());
			dts.setDay1(date.toString("yyyy-MM-dd")); 
			date=date.plusDays(1);
			dts.setDay2(date.toString("yyyy-MM-dd")); 
			date=date.plusDays(1);
			dts.setDay3(date.toString("yyyy-MM-dd")); 
			date=date.plusDays(1);
			dts.setDay4(date.toString("yyyy-MM-dd")); 
			date=date.plusDays(1);
			dts.setDay5(date.toString("yyyy-MM-dd")); 
			date=date.plusDays(1);
			
			dts.setDay1Slot1("09:00");
			dts.setDay1Slot2("12:00");
			dts.setDay1Slot3("14:00");
			dts.setDay1Slot4("16:00");
			
			dts.setDay1Slot1Status("Y");
			dts.setDay1Slot2Status("Y");
			dts.setDay1Slot3Status("Y");
			dts.setDay1Slot4Status("Y");
			
			dts.setDay2Slot1("09:00");
			dts.setDay2Slot2("12:00");
			dts.setDay2Slot3("14:00");
			dts.setDay2Slot4("16:00");
			
			dts.setDay2Slot1Status("Y");
			dts.setDay2Slot2Status("Y");
			dts.setDay2Slot3Status("Y");
			dts.setDay2Slot4Status("Y");
			
			dts.setDay3Slot1("09:00");
			dts.setDay3Slot2("12:00");
			dts.setDay3Slot3("14:00");
			dts.setDay3Slot4("16:00");
			
			dts.setDay3Slot1Status("Y");
			dts.setDay3Slot2Status("Y");
			dts.setDay3Slot3Status("Y");
			dts.setDay3Slot4Status("Y");
			
			dts.setDay4Slot1("09:00");
			dts.setDay4Slot2("12:00");
			dts.setDay4Slot3("14:00");
			dts.setDay4Slot4("16:00");
			
			dts.setDay4Slot1Status("Y");
			dts.setDay4Slot2Status("Y");
			dts.setDay4Slot3Status("Y");
			dts.setDay4Slot4Status("Y");
			
			dts.setDay5Slot1("09:00");
			dts.setDay5Slot2("12:00");
			dts.setDay5Slot3("14:00");
			dts.setDay5Slot4("16:00");
			
			dts.setDay5Slot1Status("Y");
			dts.setDay5Slot2Status("Y");
			dts.setDay5Slot3Status("Y");
			dts.setDay5Slot4Status("Y");
			System.out.println("Record Id :"+registerservice.Insert(dts));			}
			
		}
		
		
		*/
		
		
		return "Home";
	}
	
	@RequestMapping(value="Home", method =RequestMethod.GET)
	public String newHome(){
		
		System.out.println("In Home Page  ");
		return "Home";
	}
	
	@RequestMapping(value="Register",method=RequestMethod.GET )
	public String RegisterPage(@ModelAttribute("registerValid") Register r1, BindingResult b1,Model model){
		
		return "Register";
	}
	
	
	
	@RequestMapping(value="registerValid", method=RequestMethod.POST)
	public String RegisterSuccess(@Valid @ModelAttribute("registerValid") Register r1, BindingResult b1,Model model,HttpSession session){
		List<Register> totalData = registerservice.getAllData();
		System.out.println(r1.getUsername());
		
		boolean check = b1.hasErrors();
		if(check){
					     
			   model.addAttribute("errormessage","OOPS! Somthing went wrong");
			   return "Register";
		}
			
		else{		
			 
			      for(Register r:totalData){
			    	  
			    	   
			    	  if(r.getUsername().equals(r1.getUsername())){
			    		  model.addAttribute("ExistingUser","Please select different user there is and existing user");
			    		    return "Register";
			    	  }
			    	  else if(r.getEmail().equals(r1.getEmail())){
			    		 model.addAttribute("ExistingEmail", "Please Select different email this already exist");
			    		   return "Register";
			    	  }
			    	  else if(r.getPhone()==r1.getPhone()){
			    		  model.addAttribute("ExistingMobile", "Please Select different MobileNumber this already exist");
			    		   return "Register";
			    	  }
			    	  
			      }
			        session.setAttribute("registerMessage", "Thanks for registering with us, Please login with our service for using");
			       registerservice.Insert(r1);
				   return "registersuccess";
				 			     
				
		}
		
		
	    
	}
	
	@RequestMapping(value="registersuccess",method=RequestMethod.GET)
	public String registersuccess(){
		
		return "registersuccess";
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String LoginPage( @ModelAttribute("validateLogin") User u1, BindingResult b2, Model m){
		
		return "login";
	}
	
	
	@RequestMapping(value="validatelogin", method=RequestMethod.GET)
	public String Validatelogin(@Valid @ModelAttribute("validateLogin") User u1, BindingResult b2, Model m, HttpSession session ){
		return "userHome";
	}
	
	@RequestMapping(value="validatelogin", method=RequestMethod.POST)
	public String ValidateLogin(@Valid @ModelAttribute("validateLogin") User u1, BindingResult b2, Model m, HttpSession session ){

		List<Register> totalData = registerservice.getAllData();
		UserLogin log = new UserLogin();
		if(u1.getUsername().equals("admin")){
			 log.setUsername(u1.getUsername());
			 log.setUserrole("admin");
			 log.setLogintime(new Date());
			 if(u1.getPassword().equals("admin")){
				  log.setAttempt("Success");
				  session.setAttribute("log", log);
				 registerservice.Insert(log);
				 return "adminHome";
			 }else{
				 log.setAttempt("Fail");
				 session.setAttribute("log", log);
				 registerservice.Insert(log);
				 return "login";
			 }
			
		}
		else{
		for(Register r: totalData ){
			
			if(r.getUsername().equals(u1.getUsername())){
				  log.setUsername(u1.getUsername());
				  log.setUserrole("user");
				  log.setLogintime(new Date());
				
				Register finalObj= r;
				 
				  if(finalObj.getPassword().equals(u1.getPassword())){
					   
					  log.setAttempt("Success");
					  session.setAttribute("username", finalObj.getUsername());
					  session.setAttribute("log", log);
					  registerservice.Insert(log);
					  System.out.println(finalObj.getAllergies()+"allergies");
					  return "userHome";
					  
				  }
				  
				  else
				   {
						log.setAttempt("Fail");
						registerservice.Insert(log);
					  m.addAttribute("username","Please enter correct information either usrname or password is wrong");
					  return "login";
				   }
			}
			
			
		}
		m.addAttribute("username","Please enter correct information either username or password is wrong ");
		return "login";
		}
	}
	
	@RequestMapping(value="BookAppoitment",method=RequestMethod.GET)
	public String bookAppoitment(){
		 
		return "BookAppoitment";
	}
	
	@RequestMapping(value="searchDoc",method=RequestMethod.POST)
	public String doctorList(@RequestParam("speciality") String speciality ,Model model ){
		System.out.println(speciality);
		List<Doctor> doctorslist =  registerservice.getAllDoctors();
		List<Doctor> DoctorsSort =   new ArrayList<Doctor>();
	
		for(Doctor d:doctorslist){
			
			if(d.getSpeciality().equals(speciality)){
				
				DoctorsSort.add(d);
				
			}
		  	
			
		}
		if(DoctorsSort.isEmpty()){
			
			model.addAttribute("message","There are no doctors for the specilization");
			return "BookAppoitment";
		}
		
		 model.addAttribute("users",DoctorsSort);
		 for(Doctor d:DoctorsSort){
			 System.out.println(d.getFullName());
		 }
		 return "DoctorsList";
		
		
	}
	
	@RequestMapping(value="viewDoctor", method=RequestMethod.POST)
	 public String ViewDoctor(@RequestParam("selectedDoctor") String doctorname,@RequestParam("doctorId") String doctorid,@RequestParam("speciality")String speciality, Model m, HttpSession session){
		
		if(doctorname==null){
			m.addAttribute("errormessage", "please select atleast one doctor");
			return "DoctorsList";
		}
		else{
			System.out.println(doctorname);
			session.setAttribute("doctorName", doctorname);
			session.setAttribute("selectedDoctorID", doctorid);
			DateTimeSlots slot =getDoctorAppoitmentDates(doctorid,session);
			m.addAttribute("DateSlots",slot);
			m.addAttribute("username",session.getAttribute("username"));
			m.addAttribute("doctorName", doctorname);
			m.addAttribute("speciality", speciality);
			m.addAttribute("doctorId", doctorid);
			return "FillAppoitmentInfo";
		}
		
		
		
	}
	@RequestMapping(value="bookappointmentPage", method =RequestMethod.POST)
	public String bookAppoitment( @Valid @ModelAttribute("bookAppoitment") Booking b, BindingResult b2, Model model ){
	     if(b2.hasErrors()){
	    	 model.addAttribute("errormessage", "Please fill in all the details ");
	    	 return "FillAppoitmentInfo";
	     }
	     else{
	    	 System.out.println(b.getDoctorName() );
//	    	 int id= registerservice.Insert(b);
//	    	 model.addAttribute("bookinId", id);
	    	 List<DateTimeSlots> dslist = registerservice.getAllSlots();
	     	
	     	DateTimeSlots finadate=null;
	     	for(DateTimeSlots ds:dslist){
	     		if(ds.getDoctorId().equals(b.getDoctorId())){
	     			 finadate = ds;
	     			
	     		}
	     		
	     	}
	     	System.out.println(finadate.getDay1());
	     	System.out.println(b.getAppointmentDate());
	     	if(finadate.getDay1().equals(b.getAppointmentDate())){
	     		
	     		if(finadate.getDay1Slot1().equals(b.getAppointmentTime())){
	     			String column ="Day1Slot1Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay1Slot2().equals(b.getAppointmentTime())){
	     			String column ="Day1Slot2Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay1Slot3().equals(b.getAppointmentTime())){
	     			String column ="Day1Slot3Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay1Slot4().equals(b.getAppointmentTime())){
	     			String column ="Day1Slot4Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		
	     	}
	     	else if(finadate.getDay2().equals(b.getAppointmentDate())){
	     		
	     		if(finadate.getDay2Slot1().equals(b.getAppointmentTime())){
	     			String column ="Day2Slot1Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay2Slot2().equals(b.getAppointmentTime())){
	     			String column ="Day2Slot2Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay2Slot3().equals(b.getAppointmentTime())){
	     			String column ="Day2Slot3Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay2Slot4().equals(b.getAppointmentTime())){
	     			String column ="Day2Slot4Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		
	     	}
	     	else if(finadate.getDay3().equals(b.getAppointmentDate())){
	     		
	     		if(finadate.getDay3Slot1().equals(b.getAppointmentTime())){
	     			String column ="Day3Slot1Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay3Slot2().equals(b.getAppointmentTime())){
	     			String column ="Day3Slot2Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay3Slot3().equals(b.getAppointmentTime())){
	     			String column ="Day3Slot3Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay3Slot4().equals(b.getAppointmentTime())){
	     			String column ="Day3Slot4Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		
	     	}
	     	else if(finadate.getDay4().equals(b.getAppointmentDate())){
	     		
	     		if(finadate.getDay4Slot1().equals(b.getAppointmentTime())){
	     			String column ="Day4Slot1Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay4Slot2().equals(b.getAppointmentTime())){
	     			String column ="Day4Slot2Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay4Slot3().equals(b.getAppointmentTime())){
	     			String column ="Day4Slot3Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay4Slot4().equals(b.getAppointmentTime())){
	     			String column ="Day4Slot4Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		
	     	}
           else if(finadate.getDay5().equals(b.getAppointmentDate())){
	     		
	     		if(finadate.getDay5Slot1().equals(b.getAppointmentTime())){
	     			String column ="Day5Slot1Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay5Slot2().equals(b.getAppointmentTime())){
	     			String column ="Day5Slot2Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay5Slot3().equals(b.getAppointmentTime())){
	     			String column ="Day5Slot3Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		else if(finadate.getDay5Slot4().equals(b.getAppointmentTime())){
	     			String column ="Day5Slot4Status";
	     			registerservice.UpdateSlots(finadate.getId(), column, "N");
	     			System.out.println(column);
	     		}
	     		
	     	} 
	     	b.setBookingStatus("Active");
	     	int id= registerservice.Insert(b);
        	model.addAttribute("bookinId", id);
	    	 return "ViewAppoitment";
	     }
		
		
	}
//	
//	@RequestMapping(value="ViewAppoitment", method=RequestMethod.GET)
//	public String ViewAppoitmentInfo(){
//		return "ViewAppoitment";
//		
//		
//	}
	
	
	public void GetDates(){
		 
		Date d = new Date();
		System.out.println(d);
		
	}
	
	@RequestMapping(value = "/ViewUser", method = RequestMethod.GET)
	public String viewData( @ModelAttribute("registerUpdate") Register r1, BindingResult b1,Model model, HttpSession session) {
		List<Register> totalData = registerservice.getAllData();
		String username= (String) session.getAttribute("username");
		Register users = null;
		for(Register r : totalData){
			if(r.getUsername().equals(username)){
				users=r;
			}
			
		}
		
		if(users!=null){
			model.addAttribute("users", users);
			return "ViewUser";
		}
		else{
			model.addAttribute("errorMessage","there are no details");
			return "login";
		}
		
	}

	@RequestMapping(value="registerUpdate", method=RequestMethod.POST)
	public String RegisterUpdate(@Valid @ModelAttribute("registerUpdate") Register r1, BindingResult b1,Model model){
		
		List<Register> totalData = registerservice.getAllData();
		System.out.println(r1.getUsername());
		
		boolean check = b1.hasErrors();
		if(check){
					     
			   model.addAttribute("errormessage","OOPS! Somthing went wrong");
			   return "ViewUser";
		}
		else{
			for(Register r:totalData){
				
			        if(r.getUserid()!=r1.getUserid()){
			        	
			        	 if(r.getUsername().equals(r1.getUsername())){
				    		  model.addAttribute("ExistingUser","Please select different user there is and existing user");
				    		    return "ViewUser";
				    	  }
				    	  else if(r.getEmail().equals(r1.getEmail())){
				    		 model.addAttribute("ExistingEmail", "Please Select different email this already exist");
				    		   return "ViewUser";
				    	  }
				    	  else if(r.getPhone()==r1.getPhone()){
				    		  model.addAttribute("ExistingMobile", "Please Select different MobileNumber this already exist");
				    		   return "ViewUser";
				    	  }
			        	
			        }
			}
			System.out.println(r1.getUserid());
			System.out.println(r1.getUsername());
			model.addAttribute("user", r1);
			registerservice.UpdateUser(r1);
			return "UpdateSuccessfull";
			
		 
		
		
	
	}
	
	}
	
	@RequestMapping(value="Logout",method=RequestMethod.GET)
	public String LogoutPage(HttpSession session){
		UserLogin log = (UserLogin) session.getAttribute("log");
		registerservice.UpdateLog(log);		
	    session.invalidate();
		return "Logout";
	}
	
    @RequestMapping(value="Contact" ,method=RequestMethod.GET)
    public String getContact(){
       return "Contact";	
    }
    
    public DateTimeSlots getDoctorAppoitmentDates(String doctorid,HttpSession session){
    	List<DateTimeSlots> dslist = new ArrayList();
    	dslist = registerservice.getAllSlots();
    	DateTimeSlots finadates=null;
    	for(DateTimeSlots ds:dslist){
    		if(ds.getDoctorId().equals(doctorid)){
    			 finadates = ds;
    			session.setAttribute("Dateslots", ds);
    		}
    		
    	}
    	
    	return finadates;
    	
    }
    
    
    
    
    @RequestMapping(value="editBookingInfo",method=RequestMethod.GET)
	public String editBookingInfoGET(@ModelAttribute("editBookingInfo") Booking booking, BindingResult b1,Model model, HttpSession session){
    	if(session.getAttribute("username")==null)
		{
			return "errormessage";
		}
		
		List<Booking> bookingInfoList=registerservice.getAllBookings();
		System.out.println(booking.getDoctorId()+" in the first edit");		
		if(bookingInfoList.size()>0){
			DateTime today=new DateTime();
			String date=today.toString("YYYY-MM-dd");
			Iterator<Booking> i = bookingInfoList.iterator();
			while (i.hasNext()) {
			
				Booking o = i.next();
			  //some condition
				if(o.getUsername().equals(session.getAttribute("username").toString()))
				{
				if(o.getAppointmentDate().compareTo(date)<0)
			    i.remove();
				}
			}
			System.out.println(bookingInfoList.size());
			model.addAttribute("bookList", bookingInfoList);
		}
		DateTimeSlots slot =getDoctorAppoitmentDates(booking.getDoctorId(),session);
		model.addAttribute("DateSlots",slot);
		
		return "editBookingInfo";
	}
    
    @RequestMapping(value="editBookingInfo",method=RequestMethod.POST)
	public String editBookingInfoPOST(@ModelAttribute("editBookingInfo") Booking booking, BindingResult b1,Model model,HttpSession session){
		 
    	
    	if(session.getAttribute("username")==null)
		{
			return "errormessage";
		}
		
		/*	List<BookingTimeSchedule> bookingTimeSchedule=patientService.getAllUsers(bookingInfo.getDoctorName(), "doctorUserName", "BookingTimeSchedule");
		//patientService.savePatientInfo(bookingInfo);
		if(bookingTimeSchedule.size()>0){
		model.addAttribute("schedule", bookingTimeSchedule.get(0));
		System.out.println(bookingTimeSchedule.get(0));
		}*/

		Booking users=null;
		System.out.println(booking.getId()+"in the edit");
		if(booking.getId()>0){
			users=(Booking) registerservice.getAUser(booking.getId(), "Booking");
			
					System.out.println(users.getDoctorId()+"in booking");
			
					
		}else 
		{
			model.addAttribute("Message", "Please select a date to reschedule. or there are no appointments available.");
			return "editBookingInfo";
		}
		DateTimeSlots schedule=null;
		//System.out.println(users);
		if(users!=null){
		
			model.addAttribute("oldbookinginfo", users);
			List<DateTimeSlots> bookingTimeSchedule=registerservice.getAllSlots();

			
				if(bookingTimeSchedule.size()>0){
					
					for(DateTimeSlots b:bookingTimeSchedule)
					{ 
						if(users.getDoctorId().equals(b.getDoctorId()))
						{
							schedule=b;
							System.out.println(b.getDoctorId()+"--in booking slots");
							break;
						}
						
					}
					
				
			
				}
			}
		model.addAttribute("DateSlots", schedule);

		model.addAttribute("bookList", null);
		System.out.println(schedule.getDoctorId()+"selected booking slots");
		
		//System.out.println(slot.getDoctorId()+"in the edit");
		return "editBookingInfo";
	}
    
    
    

    @RequestMapping(value = "resheduleappointmentinfodate", method = RequestMethod.POST)
	public String updateRescheduleAppointmentinfo(@ModelAttribute("resheduleappointmentinfodate") Booking bookingInfo, Model model, HttpSession session) {
		Booking bkinfo=null;
    	if(session.getAttribute("username")==null)
		{
			return "errormessage";
		}
		
		//old times
		List<Booking> books = registerservice.getAllBookings();
		for(Booking b:books){
			if(b.getId()==bookingInfo.getId()){
				bkinfo=b;
				break;
			}
		}
		
	
		List<DateTimeSlots> bookingTimeSchedule=registerservice.getAllSlots();
		DateTimeSlots schedule=null;
		if(bookingTimeSchedule.size()>0){
			
			for(DateTimeSlots b:bookingTimeSchedule)
			{ 
				if(bkinfo.getDoctorId().equals(b.getDoctorId()))
				{
					schedule=b;
					break;
				}
				
			}
				
		}
		//registerservice.UpdateSlots(Id, slotname, updateValue);
		
		
		if(bkinfo.getUsername().equals(session.getAttribute("username").toString()))
		{
		
		bookingInfo.setDoctorName(bkinfo.getDoctorName());
		bookingInfo.setHasInsurance(bkinfo.getHasInsurance());
		bookingInfo.setPrevVisit(bkinfo.getPrevVisit());
		bookingInfo.setReason(bkinfo.getReason());
		bookingInfo.setUsername(bkinfo.getUsername());
		bookingInfo.setDoctorId(schedule.getDoctorId());
		bookingInfo.setBookingStatus("Active");
	
		
		if(bkinfo.getAppointmentDate().equals(schedule.getDay1()))
		{
			if(bkinfo.getAppointmentTime().equals(schedule.getDay1Slot1()))
			{
				schedule.setDay1Slot1Status("Y");
				
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay1Slot2()))
			{
				schedule.setDay1Slot2Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay1Slot3()))
			{
				schedule.setDay1Slot3Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay1Slot4()))
			{
				schedule.setDay1Slot4Status("Y");
			} 
		} else if(bkinfo.getAppointmentDate().equals(schedule.getDay2()))
		{
			if(bkinfo.getAppointmentTime().equals(schedule.getDay2Slot1()))
			{
				schedule.setDay2Slot1Status("Y");
				
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay2Slot2()))
			{
				schedule.setDay2Slot2Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay2Slot3()))
			{
				schedule.setDay2Slot3Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay2Slot4()))
			{
				schedule.setDay2Slot4Status("Y");
			} 
		} else if(bkinfo.getAppointmentDate().equals(schedule.getDay3()))
		{
			if(bkinfo.getAppointmentTime().equals(schedule.getDay3Slot1()))
			{
				schedule.setDay3Slot1Status("Y");
				
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay3Slot2()))
			{
				schedule.setDay3Slot2Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay3Slot3()))
			{
				schedule.setDay3Slot3Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay3Slot4()))
			{
				schedule.setDay3Slot4Status("Y");
			} 
		} else if(bkinfo.getAppointmentDate().equals(schedule.getDay4()))
		{
			if(bkinfo.getAppointmentTime().equals(schedule.getDay4Slot1()))
			{
				schedule.setDay4Slot1Status("Y");
				
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay4Slot2()))
			{
				schedule.setDay4Slot2Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay4Slot3()))
			{
				schedule.setDay4Slot3Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay4Slot4()))
			{
				schedule.setDay4Slot4Status("Y");
			} 
		} else if(bkinfo.getAppointmentDate().equals(schedule.getDay5()))
		{
			if(bkinfo.getAppointmentTime().equals(schedule.getDay5Slot1()))
			{
				schedule.setDay5Slot1Status("Y");
				
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay5Slot2()))
			{
				schedule.setDay5Slot2Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay5Slot3()))
			{
				schedule.setDay5Slot3Status("Y");
			} else if(bkinfo.getAppointmentTime().equals(schedule.getDay5Slot4()))
			{
				schedule.setDay5Slot4Status("Y");
			} 
		} 
		
		
		if(bookingInfo.getAppointmentDate().equals(schedule.getDay1()))
		{
			if(bookingInfo.getAppointmentTime().equals(schedule.getDay1Slot1()))
			{
				schedule.setDay1Slot1Status("N");
				
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay1Slot2()))
			{
				schedule.setDay1Slot2Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay1Slot3()))
			{
				schedule.setDay1Slot3Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay1Slot4()))
			{
				schedule.setDay1Slot4Status("N");
			} 
			
		} else if(bookingInfo.getAppointmentDate().equals(schedule.getDay2()))
		{
			if(bookingInfo.getAppointmentTime().equals(schedule.getDay2Slot1()))
			{
				schedule.setDay2Slot1Status("N");
				
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay2Slot2()))
			{
				schedule.setDay2Slot2Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay2Slot3()))
			{
				schedule.setDay2Slot3Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay2Slot4()))
			{
				schedule.setDay2Slot4Status("N");
			} 
			
		} else if(bookingInfo.getAppointmentDate().equals(schedule.getDay3()))
		{
			if(bookingInfo.getAppointmentTime().equals(schedule.getDay3Slot1()))
			{
				schedule.setDay3Slot1Status("N");
				
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay3Slot2()))
			{
				schedule.setDay3Slot2Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay3Slot3()))
			{
				schedule.setDay3Slot3Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay3Slot4()))
			{
				schedule.setDay3Slot4Status("N");
			} 
			
		} else if(bookingInfo.getAppointmentDate().equals(schedule.getDay4()))
		{
			if(bookingInfo.getAppointmentTime().equals(schedule.getDay4Slot1()))
			{
				schedule.setDay4Slot1Status("N");
				
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay4Slot2()))
			{
				schedule.setDay4Slot2Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay4Slot3()))
			{
				schedule.setDay4Slot3Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay4Slot4()))
			{
				schedule.setDay4Slot4Status("N");
			} 
			
		} 
		else if(bookingInfo.getAppointmentDate().equals(schedule.getDay5()))
		{
			if(bookingInfo.getAppointmentTime().equals(schedule.getDay5Slot1()))
			{
				schedule.setDay5Slot1Status("N");
				
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay5Slot2()))
			{
				schedule.setDay5Slot2Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay5Slot3()))
			{
				schedule.setDay5Slot3Status("N");
			} else if(bookingInfo.getAppointmentTime().equals(schedule.getDay5Slot4()))
			{
				schedule.setDay5Slot4Status("N");
			} 
			
		} 
		

		registerservice.updateTable(bookingInfo);
		registerservice.updateTable(schedule);
		model.addAttribute("Message", "The appointment has been rescheduled.");
		}

		model.addAttribute("bookinId", bookingInfo.getId());
		
		return "ViewAppoitment";
    }
    
    
    
  //emailService
  		@RequestMapping(value = "emailService", method = RequestMethod.GET)
  		public String getemailService(Model model,HttpSession session) {
  			if(session.getAttribute("username")==null)
  			{
  				return "errormessage";
  			}
  			model.addAttribute("appinfo", (Booking)session.getAttribute("appinfo"));
  			return "emailService";
  		}
  		
  		@RequestMapping(value = "emailService", method = RequestMethod.POST)
  		public String postemailService(HttpSession session,Model model) {
  			if(session.getAttribute("username")==null)
  			{
  				return "errormessage";
  			}
  			Register patient=null;
  			List<Register> users= registerservice.getAllData();
  			for(Register r:users)
  			{
  				if(session.getAttribute("username").toString().equals(r.getUsername()))
  				{
  					patient=r;
  					break;
  				}
  				
  			}
  					
  					
  			session.setAttribute("mailid", patient.getEmail());
  			System.out.println("Mail Id is:"+patient.getEmail());
  			model.addAttribute("Message", "A confirmation mail is send to your email.<br>Please check it out.");
  			return "EmailSendingServlet";
  		}
  		
  		
  		//emailService
  		@RequestMapping(value = "EmailSendingServlet", method = RequestMethod.GET)
  		public String getEmailSendingServlet(HttpSession session,Model model) {
  			if(session.getAttribute("username")==null)
  			{
  				return "errormessage";
  			}
  			return "ViewAppoitment";
  		}
  		
  		@RequestMapping(value = "ViewAppoitment", method = RequestMethod.GET)
  		public String viewappointmentinfo(@ModelAttribute("BookingApp") Booking bookingInfo, Model model, HttpSession session) {
  			
  			if(session.getAttribute("username")==null)
  			{
  				return "errormessage";
  			}
  			List<Booking> bookingInfoList=registerservice.getAllBookings();
  					List<Booking> users=new ArrayList();
  					for(Booking b:bookingInfoList)
  					{
  						if(b.getUsername().equals(session.getAttribute("username").toString()))
  						{
  							users.add(b);
  						}
  						
  					}
  			
  			if(users.size()>0)
  			model.addAttribute("bookList", users);
  			else
  				model.addAttribute("Message", "There are no appointments available.");
  			return "ViewAppoitment";
  		}
  		
  		@RequestMapping(value = "ViewAppoitment/{bid}/{uname}", method = RequestMethod.GET)
  		public String viewappointmentinfo(@ModelAttribute("BookingApp") Booking bookingInfo, Model model,
  				@PathVariable(value="bid")int bid,@PathVariable(value="uname")String uName,HttpSession session) {
  			if(uName!=null)
  			{
  				System.out.println("i m inside "+uName);
  				session.setAttribute("username", uName);
  			}
  			System.out.println("im here outside");
  			if(session.getAttribute("username")==null)
  			{
  				return "errormessage";
  			}
  			List<Booking> bookingInfoList=registerservice.getAllBookings();
  					List<Booking> users=new ArrayList();
  					for(Booking b:bookingInfoList)
  					{
  						if(b.getUsername().equals(session.getAttribute("username").toString()))
  						{
  							users.add(b);
  						}
  						
  					}
  			Booking viewBooking=(Booking)registerservice.getAUser(bid, "Booking");
  			model.addAttribute("viewBooking", viewBooking);
  			if(users.size()>0)
  			model.addAttribute("bookList", users);
  			else
  				model.addAttribute("Message", "There are no appointments available.");
  			return "ViewAppoitment";
  		}
  		
  		@RequestMapping(value = "ViewAppoitment", method = RequestMethod.POST)
  		public String getviewappointmentinfo(@ModelAttribute("BookingApp") Booking bookingInfo, Model model, HttpSession session) {
  			
  			if(session.getAttribute("username")==null)
  			{
  				return "errormessage";
  			}
  			List<Booking> bookingInfoList=registerservice.getAllBookings();
				List<Booking> users=new ArrayList();
				for(Booking b:bookingInfoList)
				{
					if(b.getUsername().equals(session.getAttribute("username").toString()))
					{
						users.add(b);
					}
					
				}
		if(users.size()>0)
			
		model.addAttribute("bookList", users);
  			
		Booking users2=(Booking)registerservice.getAUser(bookingInfo.getId(),"Booking");
  			
  			if(users2==null)
  			{
  			model.addAttribute("Message", "There are no appointments available.");
  			
  			}else
  			{
  				model.addAttribute("user", users2);
  				session.setAttribute("appinfo",users2);
  				
  			}
  				
  			return "ViewAppoitment";
  		}
  		
  		
  		
  		//SMS Service for Appointment Information
  		
  		@RequestMapping(value = "smsService", method = RequestMethod.GET)
		public String smsService(HttpSession session,Model model) {
			//session.invalidate();
			System.out.println("GET: sms service");
			Register user=null;
			List<Register> users= registerservice.getAllData();
			for(Register r:users)
			{
				if(r.getUsername().equals(session.getAttribute("username").toString()))
				{
					user=r;
					break;
					
				}
				
			}
			
			session.setAttribute("phoneNo", user.getPhone());
			
		
			Booking bi=(Booking)session.getAttribute("appinfo");

			session.setAttribute("SMScontent", "Appointment Details ************* Token ID : "+
			bi.getId()+", Doctor Name : "+bi.getDoctorName()+" , Appointment Date : "+bi.getAppointmentDate()+
			",  Appointment Time : "+bi.getAppointmentTime()+", Reason for visit : "+bi.getReason()+
			" ----*******-- Thank you for choosing IMS. "+
			"For any other information please mail us : ims2016service@gmail.com"+
					" or Call us : +1(469) 518-2616");

			
			System.out.println("phone No  is:"+user.getPhone());
			model.addAttribute("Message", "Text SMS has sent to your mobile No : "+user.getPhone()+".<br>Please check it out.");
			
			return "smsService";
		}
  		
  	
  		
}