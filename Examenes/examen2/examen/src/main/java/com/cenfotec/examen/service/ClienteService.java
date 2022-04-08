package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Cliente;
import com.cenfotec.examen.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    public Optional<Cliente> getById(int id) {
        return clienteRepository.findById(Long.valueOf(id));
    }
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }
}
