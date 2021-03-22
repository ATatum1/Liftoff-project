package org.launchcode.ministrytracker.controllers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

@Controller
@RequestMapping("members")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("add")
    public String displayAddMemberForm(Model model) {
        model.addAttribute("members", memberRepository.findAll());
        return "members/index";
    }

    @PostMapping("add")
    public String processAddMemberForm(@ModelAttribute @Valid Member newMember, Errors errors, Model model);

        if(errors.hasErrors()){
        model.addAttribute("title", "Add Member");
        model.addAttribute("member", memberRepository.findAll());
        return "member/add";
    }

       memberRepository.save(newMember);

        return"redirect:";

    }


}


