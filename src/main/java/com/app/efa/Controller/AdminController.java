package com.app.efa.Controller;
import com.app.efa.Model.AdminModel;
import com.app.efa.ServiceImp.AdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AdminController {
	private AdminServiceImp adminServiceImp;
	@Autowired
	public AdminController(AdminServiceImp adminServiceImp)
	{
		this.adminServiceImp = adminServiceImp;
	}
	//get all admins
	@RequestMapping("/api/admins")
	public List<AdminModel> getAllAdmins()
	{
		return adminServiceImp.all_admin();
	}
	//get admin by id
	@RequestMapping("/api/admin")
	public AdminModel getAdmin(long id)
	{
		return adminServiceImp.get_admin(id);
	}
	//add admin to database
	@RequestMapping("/api/addAdmin")
	public String addAdmin(AdminModel adminModel)
	{
		System.out.println("add admin controller");
		System.out.println(adminModel.getLevel());
		System.out.println(adminModel.getFirstName());
		System.out.println(adminModel.getLastName());
		System.out.println(adminModel.getDateOfBirth());
		System.out.println(adminModel.getEmail());
		System.out.println(adminModel.getGender());
		System.out.println(adminModel.getPassword());
		System.out.println(adminModel.getPhoneNumber());
		System.out.println(adminModel.getProfilePicture());
		System.out.println(adminModel.getCity());
		System.out.println(adminModel.getState());
		System.out.println(adminModel.getCountry());
		adminServiceImp.add_admin(adminModel);
		 return "admin added";
	}
}
