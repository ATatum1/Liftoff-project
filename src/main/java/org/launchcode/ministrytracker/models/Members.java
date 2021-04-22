package org.launchcode.ministrytracker.models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
//import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Members extends AbstractEntity{

    @NotBlank(message ="Phone number is required")
    //@Size(min=7,message = "Phone number must have at least 7 digits")
    private String phoneNumber;

    //@Email (message= "must be an email")
    @NotBlank(message ="Email is required")
    //@Email(message="Not a valid email")
    private String email;

    //private List<Ministry>

    //private final List<Ministry>ministries = new ArrayList<>();


    public Members(){};

    public Members(String phoneNumber,String email) {

        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
