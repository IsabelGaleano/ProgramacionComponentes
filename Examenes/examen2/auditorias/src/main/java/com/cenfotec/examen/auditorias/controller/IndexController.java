package com.cenfotec.examen.auditorias.controller;

import com.cenfotec.examen.auditorias.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    JournalService journalService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("journal", journalService.getAll());
        return "index";
    }

}
