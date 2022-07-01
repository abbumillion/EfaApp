package com.app.efa.Helpers;

import com.app.efa.Entity.Address;
import com.app.efa.Entity.Admin;
import com.app.efa.Entity.User;
import com.app.efa.Model.AdminModel;
import com.app.efa.Model.UserModel;

public class ModelToEntityConverter {

    public  static Admin AdminModelToAdminEntity(AdminModel adminModel)
    {
        Admin admin = Admin.builder()
                .level(adminModel.getLevel())
                .user(UserModelToUserEntity(adminModel))
                .build();
        return admin;
    }
    public static User UserModelToUserEntity(UserModel userModel)
    {
        User user=User.builder()
                .gender(userModel.getGender())
                .password(userModel.getPassword())
                .dateOfBirth(userModel.getDateOfBirth())
                .lastName(userModel.getLastName())
                .firstName(userModel.getFirstName())
                .registrationDate(userModel.getRegistrationDate())
                .userAddress(UserAddressConverter(userModel))
                .phoneNumber(userModel.getPhoneNumber())
                .profilePicture(userModel.getProfilePicture())
                .email(userModel.getEmail())
                .build();
        return user;
    }
    public static Address UserAddressConverter(UserModel userModel)
    {
        Address address = Address.builder()
                .city(userModel.getCity())
                .state(userModel.getState())
                .country(userModel.getCountry())
                .build();
        return address;
    }
}
