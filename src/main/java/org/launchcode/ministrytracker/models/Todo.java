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


    private String dueDate;

    @NotBlank(message ="Task detail is  required")
    private String taskDetails;

    //private List<Ministry>

    //private final List<Ministry>ministries = new ArrayList<>();


    public Todo(){};

    public Todo(String dueDate,String taskDetails) {

        this.dueDate = dueDate;
        this.taskDetails = taskDetails;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }
}
