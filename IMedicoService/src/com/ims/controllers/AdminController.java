package com.ims.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ims.models.Booking;
import com.ims.models.Register;
import com.ims.models.UserLogin;
import com.ims.services.RegisterService;

@Controller
public class AdminController {
	
	private RegisterService registerservice;

	@Autowired(required=true)
	@Qualifier(value="RegisterService")
	public void setRegisterservice(RegisterService registerservice) {
		this.registerservice = registerservice;
	}
	
	@RequestMapping(value="ViewLog",method=RequestMethod.GET)
	public String viewUserlogDetails(@ModelAttribute("user") UserLogin patientInfo, Model model, HttpSession session){
		List<UserLogin> users = registerservice.getAllLogins();
		model.addAttribute("users", users);
		System.out.println(users.size());
		return "ViewLog";
	}
	
	@RequestMapping(value = "ViewLog", method = RequestMethod.POST)
	public String viewLogData(@ModelAttribute("user") UserLogin patientInfo, Model model, HttpSession session) {
		List<UserLogin> users = registerservice.getAllLogins();
		model.addAttribute("users", users);
		return "ViewLog";
	}
	
	
	@RequestMapping(value = "/deleteLog/{id}", method = RequestMethod.GET)
	public String deletelog(@ModelAttribute("user") UserLogin patientInfo,@PathVariable Integer id) {
		registerservice.deleteUserLogin(id);
		return "DeleteConfirm";
	}
	

	@RequestMapping(value = "AllUsers", method = RequestMethod.POST)
	public String viewPatientsData(@ModelAttribute("user") Register r1, Model model, HttpSession session) {
		List<Register> users = registerservice.getAllData();
		model.addAttribute("users", users);
		return "AllUsers";
	}
	
	@RequestMapping(value = "AllUsers", method = RequestMethod.GET)
	public String viewPatients(@ModelAttribute("user") Register r1, Model model, HttpSession session) {
		List<Register> users = registerservice.getAllData();
		model.addAttribute("users", users);
		return "AllUsers";
	}

	@RequestMapping(value = "/deletePatient/{id}", method = RequestMethod.GET)
	public String delete(@ModelAttribute("user") Register patientInfo, @PathVariable Integer id) {
		registerservice.deleteUser(id);
		return "DeleteConfirm";
	}
	
	@RequestMapping(value="AdminViewAppoitments", method=RequestMethod.GET)
	public String provideAppoitments(@ModelAttribute("user") Booking b1, Model model){
		List<Booking> bookings =registerservice.getAllBookings();
		model.addAttribute("users", bookings);
		return "AdminViewAppoitments";
		
	}
	@RequestMapping(value="AdminViewAppoitments", method=RequestMethod.POST)
	public String provideAppoitment(@ModelAttribute("user") Booking b1, Model model){
		List<Booking> bookings =registerservice.getAllBookings();
		model.addAttribute("users", bookings);
		return "AdminViewAppoitments";
		
	}
}
