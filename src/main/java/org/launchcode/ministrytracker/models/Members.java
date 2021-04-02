package org.launchcode.ministrytracker.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Members extends AbstractEntity{

    @NotBlank(message ="Phone number is required")
    private String phoneNumber;

    //private List<Ministry>

    private final List<Ministry>ministries = new ArrayList<>();


    public Members(){};

    public Members(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Ministry> getMinistries() {
        return ministries;
    }
}
