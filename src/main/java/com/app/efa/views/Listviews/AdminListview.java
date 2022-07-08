package com.app.efa.views.Listviews;

import com.app.efa.Model.AdminModel;
import com.app.efa.TestRepo.TestRepo;
import com.app.efa.views.MainView.MainView;
import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.Route;
import java.util.List;

@Route(value = "Admins", layout = MainView.class)
public class AdminListview extends View {
        Grid<AdminModel> grid;
        List<AdminModel> adminModels;
        TestRepo testRepo ;

    @Override
    public void init() {
        //
        testRepo = new TestRepo();
        //
        grid = new Grid<>(AdminModel.class, false);
        grid.addColumn(AdminModel::getId).setHeader("Id");
        grid.addColumn(AdminModel::getFirstName).setHeader("First name");
        grid.addColumn(AdminModel::getLastName).setHeader("Last name");
        grid.addColumn(AdminModel::getEmail).setHeader("Email");
        grid.addColumn(AdminModel::getPhoneNumber).setHeader("Phone Number");
        grid.addColumn(AdminModel::getProfilePicture).setHeader("profile picture");
        grid.addColumn(AdminModel::getCity).setHeader("City");
        grid.addColumn(AdminModel::getState).setHeader("State");
        grid.addColumn(AdminModel::getCountry).setHeader("Country");
        adminModels = testRepo.getAdminModels();
        grid.setItems(adminModels);


         //
    }

    @Override
    public void addStyle() {

    }
    @Override
    public void constructUI() {
        //
        add(grid);
        //
    }

    @Override
    public void bindingOperations() {
    }

    @Override
    public void alignElements() {
        setSizeFull();
        grid.scrollToIndex(20);
//        grid.appendHeaderRow();
//        grid.appendFooterRow();
        grid.getColumns().get(0).setWidth("50px");
        grid.getColumns().get(1).setWidth("80px");
        grid.getColumns().get(2).setWidth("80px");
        grid.getColumns().get(2).setFrozenToEnd(true);
        grid.getColumns().get(3).setWidth("250px");
        grid.getColumns().get(4).setWidth("80px");
        grid.getColumns().get(5).setWidth("250px");
        grid.getColumns().get(6).setWidth("80px");
        grid.getColumns().get(7).setWidth("80px");
        grid.getColumns().get(8).setWidth("80px");
        //
        //
    }

    @Override
    public void addEvents() {

    }
}
