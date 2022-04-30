package com.cenfotec.galeano.isabel.examenComponentes.query;

import com.cenfotec.galeano.isabel.examenComponentes.entities.LibroQL;
import com.cenfotec.galeano.isabel.examenComponentes.services.LibroQLService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class LibroQLQuery implements GraphQLQueryResolver {
    @Autowired
    private LibroQLService libroQLService;
    public List<LibroQL> getLibros(int count) {
        return this.libroQLService.getAllLibros(count);
    }
    public Optional<LibroQL> getLibro(int id) {
        return this.libroQLService.getLibro(id);
    }
}
