package com.app.efa.ServiceImp;

import java.util.ArrayList;
import java.util.List;
import com.app.efa.Helpers.EntityToModelConverter;
import com.app.efa.Helpers.ModelToEntityConverter;
import com.app.efa.Model.AdminModel;
import com.app.efa.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.efa.Entity.Admin;
import com.app.efa.Repository.AdminRepo;

@Service
public class AdminServiceImp implements AdminService {
	private AdminRepo adminRepo;
	@Autowired
	public AdminServiceImp(AdminRepo adminRepo)
	{
		this.adminRepo = adminRepo;
	}

	@Override
	public void add_admin(AdminModel adminModel)
	{
		adminRepo.save(ModelToEntityConverter.AdminModelToAdminEntity(adminModel));
	}

	@Override
	public AdminModel get_admin(long id)
	{
		return EntityToModelConverter.AdminEntityToAdminModel(adminRepo.getReferenceById(id));
	}

	@Override
	public List<AdminModel> all_admin()
	{
		List<Admin> admins = adminRepo.findAll();
		List<AdminModel> adminModels = new ArrayList<>();
		admins.forEach(e->
		{
			adminModels.add(EntityToModelConverter.AdminEntityToAdminModel(e));
		});
		return adminModels;
	}

	@Override
	public Admin update_admin(long id)
	{
		return null;
	}

	@Override
	public void delete_admin(long id)
	{
		adminRepo.deleteById(id);
	}

	@Override
	public void delete_all()
	{
		adminRepo.deleteAll();
	}
}
