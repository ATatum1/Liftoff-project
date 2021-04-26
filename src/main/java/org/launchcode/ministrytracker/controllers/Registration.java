package org.launchcode.ministrytracker.controllers;

import org.launchcode.ministrytracker.models.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class Registration {

    @GetMapping("/user/registration")
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }


//    public ModelAndView registerUserAccount(@ModelAttribute("user") @Valid UserDto userDto,
//                                            HttpServletRequest request, Errors errors) {
//        //...
//    }
}
