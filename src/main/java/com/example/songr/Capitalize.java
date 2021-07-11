package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class Capitalize {
    @GetMapping("/capitalize/{small}")
    String Capitalizer(@PathVariable("small") String small, Model model) {

        model.addAttribute("capitals", small.toUpperCase(Locale.ROOT));

        return "capitalize";
    }
}
