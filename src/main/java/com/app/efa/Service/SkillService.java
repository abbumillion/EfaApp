package com.app.efa.Service;

import com.app.efa.Entity.Skill;
import com.app.efa.Model.SkillModel;

import java.util.List;
import java.util.Optional;

public interface SkillService {
    void add_skill(SkillModel skillModel);
    SkillModel get_skill(long id);
    List<SkillModel> all_skill();
    void update_skill(long id);
    void delete_skill(long id);
    void delete_all();
}
