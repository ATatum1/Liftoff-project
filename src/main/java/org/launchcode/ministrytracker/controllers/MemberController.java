package org.launchcode.ministrytracker.controllers;

import org.launchcode.ministrytracker.models.data.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import java.lang.reflect.Member;

@Controller
//@RequestMapping("templates/templates")
@RequestMapping("members")
public class MemberController {

//    @RequestMapping(value="")
//    @ResponseBody
//    public String index() {
//        //return "Welcome to the Spirit of Love's Members Homepage";
//        return members/index;
//    }

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping ("")
    public String index(Model model){
        model.addAttribute("members",memberRepository.findAll());
        return "members/index";


    }











//    @GetMapping ("add")
//    @ResponseBody
//    public String addMember(){
//        String html = "<html>"+
//                "<body>" +
//                "<form method = 'post' action = '/hello>"+
//                "<input type = 'text' name ='name' />"+
//                "<input type = 'submit' value = 'Greet Me!' />"+
//                "</form>"+
//                "</body>"+
//                "</html>";
//        return html;
//    }



//    @ResponseBody
//    public String index() {
//        return "Add Member Homepage";
//    }


//
//    @GetMapping("add")
//    public String displayAddMemberForm(Model model) {
//        model.addAttribute("templates/templates", memberRepository.findAll());
//        return "templates/templates/index";
//    }
//
//    @PostMapping("add")
//    public String processAddMemberForm(@ModelAttribute @Valid Members newMembers, Errors errors, Model model){
//
//        if (errors.hasErrors()){
//        model.addAttribute("title", "Add Member");
//        model.addAttribute("member", memberRepository.findAll());
//        return "member/add";
//    }
//
//       memberRepository.save(newMembers);
//
//        return"redirect:";
//
//    }


}


