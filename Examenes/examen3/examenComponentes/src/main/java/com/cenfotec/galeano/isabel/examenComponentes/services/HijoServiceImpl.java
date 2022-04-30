package com.cenfotec.galeano.isabel.examenComponentes.services;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Hijo;
import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;
import com.cenfotec.galeano.isabel.examenComponentes.repositories.HijoRepository;
import com.cenfotec.galeano.isabel.examenComponentes.repositories.PadreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HijoServiceImpl implements HijoService {

    @Autowired
    HijoRepository hijoRepository;

    @Override
    public List<Hijo> getAll() {
        return hijoRepository.findAll();
    }

    @Override
    public Optional<Hijo> findById(long id) {
        return hijoRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public List<Hijo> findAllByPadre(Long id) {
        return hijoRepository.findAllByPadreId(id);
    }

    @Override
    public Optional<Hijo> save(Hijo hijo) {
        return Optional.of(hijoRepository.save(hijo));
    }

    @Override
    public Optional<Hijo> update(Hijo hijo) {
        Optional<Hijo> record = hijoRepository.findById(hijo.getId());
        if (record.isPresent()) {
            Hijo data = record.get();
            data.setNombre(hijo.getNombre());
            data.setApellido1(hijo.getApellido1());
            data.setApellido2(hijo.getApellido2());
            data.setTipoPlan(hijo.getTipoPlan());
            data.setAlergias(hijo.getAlergias());
            data.setPadre(hijo.getPadre());

            return Optional.of(hijoRepository.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
