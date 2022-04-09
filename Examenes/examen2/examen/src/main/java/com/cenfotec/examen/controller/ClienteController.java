package com.cenfotec.examen.controller;

import com.cenfotec.examen.domain.Cliente;
import com.cenfotec.examen.domain.Persona;
import com.cenfotec.examen.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @RequestMapping("/listadoClientes")
    public String index(Model model) {
        model.addAttribute("cliente", clienteService.getAll());
        return "listadoClientes";
    }
    @RequestMapping(value = "/listarPorId/{id}")
    public String listarPorId(Model model, @PathVariable int id) {
        Optional<Cliente> clientePorID = clienteService.getById(id);
        if (clientePorID.isPresent()){
            model.addAttribute("cliente", clientePorID);
            return "listadoPersonas";
        } else {
            return "listadoPersonas";
        }
    }
    @RequestMapping(value = "/registroClientes", method = RequestMethod.GET)
    public String navegarPaginaInsertar(Model model) {
        model.addAttribute(new Cliente());
        return "registroClientes";
    }

    @RequestMapping(value = "/registroClientes", method = RequestMethod.POST)
    public String accionInsertar(Cliente cliente, BindingResult result, Model model) {
        clienteService.saveCliente(cliente);
        return "index";
    }
}
