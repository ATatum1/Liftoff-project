package org.launchcode.ministrytracker.models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
//import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Todo extends AbstractEntity{


    private String date;

    @NotBlank(message ="Task detail is  required")
    private String taskDetails;

    //private List<Ministry>

    //private final List<Ministry>ministries = new ArrayList<>();


    public Todo(){};

    public Todo(String date,String taskDetails) {

        this.date = date;
        this.taskDetails = taskDetails;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }
}
