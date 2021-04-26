package org.launchcode.ministrytracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("landingScreen")
public class HomeController {

    @GetMapping("")
    public String index(Model model){



        return "landingScreen";

    }


//    @RequestMapping(value="")
//    @ResponseBody
//    public String index() {
//        return "Welcome to the Spirit of Love's Ministry Leader Homepage";
//    }


    //comment out sun 4//25/2021 438p  to test without login code below
//    @GetMapping("login")
//    public String displayLoginForm(Model model){
//        //model.addAttribute(new Members());
//        return"login";
//    }

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
