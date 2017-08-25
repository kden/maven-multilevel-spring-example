package org.myproject;

import org.example.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExampleController {

    @Autowired
    private Dog dog;

    @Autowired
    @Qualifier("someguy")
    private Person person;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(ModelMap model) {
        model.addAttribute("dog", dog);
        model.addAttribute("someguy", person);
        return "main";
    }
}
