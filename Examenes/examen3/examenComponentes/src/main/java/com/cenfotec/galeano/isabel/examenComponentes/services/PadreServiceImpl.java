package com.cenfotec.galeano.isabel.examenComponentes.services;

import com.cenfotec.galeano.isabel.examenComponentes.domain.Padre;
import com.cenfotec.galeano.isabel.examenComponentes.repositories.PadreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PadreServiceImpl implements PadreService {
    @Autowired
    PadreRepository padreRepository;

    @Override
    public List<Padre> getAll() {
        return padreRepository.findAll();
    }

    @Override
    public Optional<Padre> findById(long id) {
        return padreRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<Padre> findByNombreApellidos(String nombre, String apellido1, String apellido2) {
        return padreRepository.findPadreByNombreContainsOrApellido1ContainsOrAndApellido2Contains(nombre, apellido1, apellido2).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<Padre> save(Padre padre) {
        return Optional.of(padreRepository.save(padre));
    }

    @Override
    public Optional<Padre> update(Padre padre) {
        Optional<Padre> record = padreRepository.findById(padre.getId());
        if (record.isPresent()) {
            Padre data = record.get();
            data.setCedula(padre.getCedula());
            data.setNombre(padre.getNombre());
            data.setApellido1(padre.getApellido1());
            data.setApellido2(padre.getApellido2());
            data.setDireccion(padre.getDireccion());
            data.setTelefonoPrimario(padre.getTelefonoPrimario());
            data.setTelefonoSecundario(padre.getTelefonoSecundario());
            return Optional.of(padreRepository.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
