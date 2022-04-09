package com.cenfotec.examen.controller;

import com.cenfotec.examen.domain.Auditor;
import com.cenfotec.examen.domain.VisitaTrabajo;
import com.cenfotec.examen.service.AuditorService;
import com.cenfotec.examen.service.VisitaTrabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class VisitaTrabajoController {
    @Autowired
    VisitaTrabajoService visitaService;
    @Autowired
    AuditorService auditorService;

    @RequestMapping("/listadoVisitas")
    public String index(Model model){
        model.addAttribute("visita", visitaService.getAll());
        return "listadoVisitas";
    }

    @RequestMapping("/registroVisitas")
    public String getAuditores(Model model){
        model.addAttribute("auditores", auditorService.getAll());
        model.addAttribute(new VisitaTrabajo());
        return "registroVisitas";
    }

    @RequestMapping(value = "/registroVisitas", method = RequestMethod.POST)
    public String accionInsertar(VisitaTrabajo visitaTrabajo, BindingResult result, Model model){
        visitaService.saveVisita(visitaTrabajo);
        return "index";
    }
}
