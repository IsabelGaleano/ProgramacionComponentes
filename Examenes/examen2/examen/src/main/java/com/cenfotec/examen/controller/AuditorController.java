package com.cenfotec.examen.controller;

import com.cenfotec.examen.domain.Auditor;
import com.cenfotec.examen.service.AuditorService;
import com.cenfotec.examen.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AuditorController {
    @Autowired
    AuditorService auditorService;
    @RequestMapping("/listadoAuditores")
    public String index(Model model){
        model.addAttribute("auditor", auditorService.getAll());
        return "listadoAuditores";
    }
}
