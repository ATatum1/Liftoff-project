package org.launchcode.ministrytracker.controllers;

import org.launchcode.ministrytracker.models.Members;
import org.launchcode.ministrytracker.models.Todo;
import org.launchcode.ministrytracker.models.data.MemberRepository;
import org.launchcode.ministrytracker.models.data.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("todo")
@Controller
public class TodoController {

    @Autowired
    private TodoRepository memberRepository;

    @GetMapping("add")
    public String displayAddTodoForm(Model model){
        model.addAttribute(new Todo());
        return"todo/add";
    }





}
