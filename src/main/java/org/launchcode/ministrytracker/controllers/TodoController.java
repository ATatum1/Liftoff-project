package org.launchcode.ministrytracker.controllers;

import org.launchcode.ministrytracker.models.Members;
import org.launchcode.ministrytracker.models.Todo;
import org.launchcode.ministrytracker.models.data.MemberRepository;
import org.launchcode.ministrytracker.models.data.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("add")
    public String displayAddTodoForm(Model model){
        model.addAttribute(new Todo());
        return"todo/add";
    }



    //trying in membercontroller
//    @PostMapping("add")
//    public String processTodoForm(@ModelAttribute @Valid Todo newTodo, Errors errors, Model model){
//
//        if(errors.hasErrors()) {
//            model.addAttribute("title", "Add Todo Item");
//            model.addAttribute("todo", todoRepository.findAll());
//
//            return "members/add";
//        }
//
//       todoRepository.save(newTodo);
//        //return "redirect";
//        return "redirect:";
//
//
//    }





}
