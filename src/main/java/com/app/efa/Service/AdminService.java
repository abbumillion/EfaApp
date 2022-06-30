package com.app.efa.Service;
import com.app.efa.Entity.Admin;
import com.app.efa.Model.AdminModel;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    void add_admin(AdminModel adminModel);
    AdminModel get_admin(long id);
    List<AdminModel> all_admin();
    Admin update_admin(long id);
    void delete_admin(long id);
    void delete_all();
}
