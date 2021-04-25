package org.launchcode.ministrytracker.controllers;

import org.launchcode.ministrytracker.models.Members;
import org.launchcode.ministrytracker.data.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
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


    @GetMapping("add")
    public String displayAddMemberForm(Model model){
    model.addAttribute(new Members());
    return"members/add";
    }

    @GetMapping ("")
    public String index(Model model){


        //model.addAttribute("members",memberRepository.findAll());
        model.addAttribute("members",memberRepository.findAll());

        //model.addAttribute("members",
        //model.addAttribute("phoneNumber",memberRepository.equals("phoneNumber"));
        //model.addAttribute("phoneNumber",memberRepository.findAll());
        return "members/index";
        //return memberRepository.findAll();



    }

    @PostMapping("add")
    public String processAddMemberForm(@ModelAttribute @Valid Members newMember, Errors errors, Model model){

        if(errors.hasErrors()) {
            model.addAttribute("title", "Add Member");
            model.addAttribute("members", memberRepository.findAll());

            return "members/add";
        }

        memberRepository.save(newMember);
        //return "redirect";
        return "redirect:";


    }

//    @GetMapping("view/{memberId}")
//    public String displayViewMember(Model model, @PathVariable int memberId) {
//        //public String displayViewEmployer(Model model, @PathVariable )
//        //Optional optEmployer = null;
//        Optional optMembers = memberRepository.findById(memberId);
//        if (optMembers.isPresent()) {
//            Members member = (Members) optMembers.get();
//            model.addAttribute("members",member);
//
//            return "members/view";
//        } else {
//
//
//            return "redirect:../";
//
//        }

    //trying processtodoform on member controller

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




