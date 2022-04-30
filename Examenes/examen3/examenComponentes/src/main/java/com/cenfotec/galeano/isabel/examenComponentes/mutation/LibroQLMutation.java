package com.cenfotec.galeano.isabel.examenComponentes.mutation;

import com.cenfotec.galeano.isabel.examenComponentes.entities.LibroQL;
import com.cenfotec.galeano.isabel.examenComponentes.services.LibroQLService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class LibroQLMutation implements GraphQLMutationResolver {
    @Autowired
    private LibroQLService libroQLService;

    public LibroQL createLibro(String nombre, String
            autor, String precio, String estado) {
        return this.libroQLService.createLibro(nombre, autor,
                precio, estado);
    }

    public LibroQL updateLibro(int id, String nombre, String autor,
                                 String precio, String estado) {
        Optional<LibroQL> libro = this.libroQLService.getLibro(id);
        if (libro.isPresent()) {
            LibroQL libroEntity = libro.get();
            if (nombre!=null)
                libroEntity.setNombre(nombre);
            if (autor != null)
                libroEntity.setAutor(autor);
            if (precio != null)
                libroEntity.setPrecio(precio);
            if (estado != null)
                libroEntity.setEstado(estado);

            libroQLService.save(libroEntity);
            return libroEntity;
        }
        return null;
    }

    public LibroQL deleteLibro(int id, String estado) {
        Optional<LibroQL> libro = this.libroQLService.getLibro(id);
        if (libro.isPresent()) {
            LibroQL libroEntity = libro.get();
            if (estado!=null)
                libroEntity.setEstado(estado);

            libroQLService.save(libroEntity);
            return libroEntity;
        }
        return null;
    }
}
