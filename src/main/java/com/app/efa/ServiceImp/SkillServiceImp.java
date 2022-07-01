package com.app.efa.ServiceImp;
import java.util.List;
import com.app.efa.Model.SkillModel;
import com.app.efa.Service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.efa.Repository.SkillRepo;

@Service
public class SkillServiceImp implements SkillService {
	private SkillRepo skillRepo;
	@Autowired
	public SkillServiceImp(SkillRepo skillRepo)
	{
		this.skillRepo = skillRepo;
	}
	@Override
	public void add_skill(SkillModel skillModel)
	{
		//skillRepo.save(skill);
	}
	@Override
	public SkillModel get_skill(long id)
	{
		return null;
	}
	@Override
	public List<SkillModel> all_skill()
	{
		return null;
	}
	@Override
	public void update_skill(long id)
	{

	}
	@Override
	public void delete_skill(long id)
	{
		skillRepo.deleteById(id);
	}
	@Override
	public void delete_all()
	{
		skillRepo.deleteAll();
	}
}
