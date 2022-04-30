package com.cenfotec.galeano.isabel.examenComponentes.services;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Hijo;
import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;

import java.util.List;
import java.util.Optional;

public interface HijoService {
    public List<Hijo> getAll();
    public Optional<Hijo> findById(long id);
    public List<Hijo> findAllByPadre(Long id);
    public  Optional<Hijo> save(Hijo hijo);
    public  Optional<Hijo> update(Hijo hijo);
    public boolean delete(Long id);
}
