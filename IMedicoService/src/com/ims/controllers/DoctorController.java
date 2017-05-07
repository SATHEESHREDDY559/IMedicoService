package com.ims.controllers;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.validation.Valid;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ims.models.Booking;
import com.ims.models.DateTimeSlots;
import com.ims.models.Doctor;
import com.ims.models.PatientReport;
import com.ims.models.Register;
import com.ims.models.User;
import com.ims.models.UserLogin;
import com.ims.services.RegisterService;

@Controller
public class DoctorController {
    private RegisterService registerservice;
	
	@Autowired(required=true)
	@Qualifier(value="RegisterService")
	public void setRegisterservice(RegisterService registerservice) {
		this.registerservice = registerservice;
	}
	 

	


	@RequestMapping(value="Doctor",method=RequestMethod.GET)
	public String doctorRegistration( @ModelAttribute("doctorRegistered") Doctor d,BindingResult b1, Model model){
		return "Doctor";
		
		
	}
	
	@RequestMapping(value="doctorRegister",method=RequestMethod.POST)
	public String doctorValidRegistration(@Valid @ModelAttribute("doctorRegistered")Doctor d,BindingResult b1, Model model){
		List<Doctor> totalData = registerservice.getAllDoctors();
		System.out.println(d.getUserName());
		
		boolean check = b1.hasErrors();
		if(check){
					     
			   model.addAttribute("errormessage","OOPS! Somthing went wrong");
			   return "Doctor";
		}
			
		else{		
			 
			      for(Doctor r:totalData){
			    	  
			    	    
			    	  if(r.getUserName().equals(d.getUserName())){
			    		  model.addAttribute("ExistingUser","Please select different user there is and existing user");
			    		    return "Doctor";
			    	  }
			    	  else if(r.getEmail().equals(d.getEmail())){
			    		 model.addAttribute("ExistingEmail", "Please Select different email this already exist");
			    		   return "Doctor";
			    	  }
			    	  else if(r.getPhone()==d.getPhone()){
			    		  model.addAttribute("ExistingMobile", "Please Select different MobileNumber this already exist");
			    		   return "Doctor";
			    	  }
			    	  
			      }
			        DateTimeSlots dts=new DateTimeSlots();
					DateTime date = new DateTime();
					dts.setDoctorId(d.getUserName());
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
					System.out.println("Record Id :"+registerservice.Insert(dts)); 
			        registerservice.Insert(d);
				    return "DoctorHome";
				 			     
				
		}
		
		
	}
	
	@RequestMapping(value="DoctorLogin", method=RequestMethod.GET)
	public String LoginPage( @ModelAttribute("validateDoctor") User u1, BindingResult b2, Model m){
		
		return "DoctorLogin";
	}
	
	
	@RequestMapping(value="validatedoctor",method=RequestMethod.POST)
	public String validateDoctor(@Valid @ModelAttribute("validateDoctor") User u1, BindingResult b2, Model m, HttpSession session){
		List<Doctor> totalData = registerservice.getAllDoctors();
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
		for(Doctor r: totalData ){
			    
			if(r.getUserName().equals(u1.getUsername())){
				
				Doctor finalObj= r;
				 log.setUsername(u1.getUsername());
				 log.setUserrole("Doctor");
				 log.setLogintime(new Date());
				  if(finalObj.getPassword().equals(u1.getPassword())){
					  log.setAttempt("Success");
					  session.setAttribute("log", log);
					  registerservice.Insert(log);
					  session.setAttribute("doctorId", finalObj.getUserName());
					  System.out.println(finalObj.getUserName());
					  return "DoctorHome";
				  }
				  
				  else
				   {
					  log.setAttempt("Fail");
					  session.setAttribute("log", log);
					  registerservice.Insert(log);
                       m.addAttribute("username","Please enter correct information either usrname or password is wrong");
					  return "DoctorLogin";
				   }
			}
			
		}
		}
		m.addAttribute("username","Please enter correct information either username or password is wrong ");
		return "DoctorHome";
		
		
		
	}
	
	@RequestMapping(value="DoctorAppoitments", method=RequestMethod.GET)
	public String getAppoitments(Model model, HttpSession session){
		 
		List<Booking> books = registerservice.getAllBookings();
		
		String doctorid =  session.getAttribute("doctorId").toString();
	
		System.out.println(doctorid+"in the doctorappoitments method");
		List<Booking> users = new ArrayList();
		for(Booking b:books){
			
			if(b.getDoctorId().equals(doctorid)){
				System.out.println(b.getUsername()+" in the for loop");
				System.out.println("matched" );
				users.add(b);
				model.addAttribute("users", users);
			}
		}
		if(users.size()==0){
			model.addAttribute("ErrorAppt", "Sorry you have no appointments");
			return "DoctorHome";
		}
		else{
		return "DoctorAppoitments";
		}
	}
	
	@RequestMapping(value="DoctorAppoitments", method=RequestMethod.POST)
	public String getAppoitment(Model model, HttpSession session){
		 
		List<Booking> books = registerservice.getAllBookings();
		
		String doctorid =  session.getAttribute("doctorId").toString();
	
		System.out.println(doctorid+"in the doctorappoitments method");
		List<Booking> users = new ArrayList();
		for(Booking b:books){
			
			if(b.getDoctorId().equals(doctorid)){
				System.out.println(b.getUsername()+" in the for loop");
				System.out.println("matched" );
				users.add(b);
				model.addAttribute("users", users);
			}
		}
		
		return "DoctorAppoitments";
		
	}
	

	
	
	@RequestMapping(value = "patientHealthStatusReport", method = RequestMethod.GET)
	public String getPatientReport(@ModelAttribute("patientHealthStatusReport") PatientReport patientReport,BindingResult result,Model model,
			HttpSession session) {
		if(session.getAttribute("doctorId")==null)
		{
			return "errormessage";
		}
		// model.put("registration", new PatientInfo());
		List<Register> users= registerservice.getAllData();
		model.addAttribute("users", users);
		return "patientHealthStatusReport";
	}

	@RequestMapping(value = "patientHealthStatusReport", method = RequestMethod.POST)
	public String savePatientReport(@Valid @ModelAttribute("patientHealthStatusReport") PatientReport patientReport, BindingResult result,
			Model model, HttpSession session) {
		if(session.getAttribute("doctorId")==null)
		{
			return "errormessage";
		}
		if (result.hasErrors()) {
			return "patientHealthStatusReport";
		}
		registerservice.Insert(patientReport);
		
		return "viewpatientHealthStatusReport";
	}

	@RequestMapping(value = "viewpatientHealthStatusReport", method = RequestMethod.GET)
	public String getViewPatientReport(@ModelAttribute("viewpatientHealthStatusReport") PatientReport patientReport,Model model, HttpSession session) {
		if(session.getAttribute("doctorId")==null)
		{
			return "errormessage";
		}
		// model.put("registration", new PatientInfo());
		List<Register> users= registerservice.getAllData();
		model.addAttribute("users", users);
		System.out.println(users.size()+"in docotor");
		System.out.println(patientReport.getPatientUserName()+"in patient health");
		
		return "viewpatientHealthStatusReport";
	}

	@RequestMapping(value = "viewpatientHealthStatusReport", method = RequestMethod.POST)
	public String getViewPatientReport(@Valid @ModelAttribute("viewpatientHealthStatusReport") PatientReport patientReport, BindingResult result,
			Model model, HttpSession session,@RequestParam("patientUserName") String username) {
		if(session.getAttribute("doctorId")==null)
		{
			return "errormessage";
		}
		if (result.hasErrors()) {
			return "viewpatientHealthStatusReport";
		}
		System.out.println(username);
		List<Register> users= registerservice.getAllData();
		System.out.println(patientReport.getPatientUserName()+"in health 2");
		Register user=null;
		PatientReport pr=null;
		for(Register r :users)
		{
			if(r.getUsername().equals(username))
			{
				user=r;
			}
		}
			model.addAttribute("user", user);
			model.addAttribute("users", users);
		List<PatientReport> reports= registerservice.getAllPatientReport();
		List<PatientReport> reports2=new ArrayList();
		for(PatientReport r:reports)
		{
			
			if(r.getPatientUserName().equals(username))
			{
				reports2.add(r);
			}
		}
		
	
		model.addAttribute("reports", reports2);
		//patientService.savePatientInfo(patientReport);
		return "viewpatientHealthStatusReport";
	}
	
	
	
}
