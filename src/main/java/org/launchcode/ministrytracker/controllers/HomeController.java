package org.launchcode.ministrytracker.controllers;


import org.launchcode.ministrytracker.models.Members;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


//    @RequestMapping(value="")
//    @ResponseBody
//    public String index() {
//        return "Welcome to the Spirit of Love's Ministry Leader Homepage";
//    }



    @GetMapping("login")
    public String displayLoginForm(Model model){
        //model.addAttribute(new Members());
        return"login";
    }

//    @RequestMapping("")
//    public String displayMembersIndexLink(Model model) {
//
//        model.addAttribute("")
//        return "index";
//    }

//    @RequestMapping("")
//    public String index(Model model){
//        model.addAttribute("title","Members");
//
//        return "index";
//    }



}
