package com.app.efa.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract  class UserModel {
	// user's first name
	private String firstName;
	// user's last name
	private String lastName;
	// user's date of birth for age calculation
	private Date dateOfBirth;
	// user's gender
	private char gender;
	// user's email
	private String email;
	// user's phone number
	private String phoneNumber;
	// user registration date initialized from the moment of creation of this particular
	//user model object wit java date util class Date registrationDate = new Date();
	private Date registrationDate = new Date();
	// user profile picture
	private String profilePicture;
	// user password
	private String password;
    //	//user address
    //	private AddressModel addressModel;
    // city name
	private String city;
	// state name
	private String state;
	// country name
	private String country;
	//user feedback
	private List<FeedbackModel> userFeedback;
	//
}
