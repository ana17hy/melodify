package com.melodify.melodify.Service;

import com.melodify.melodify.Entity.Singer; // usamos la clase singer
import com.melodify.melodify.Repository.SingerRepository; // importamos el repositorio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // para la lista
import java.util.Optional; // para el Optional -> puede que exista o que no exista

@Service
public class SingerService { // creamos la clase
    @Autowired // conectar con el repositorio automaticamente
    private SingerRepository singerRepository; // creamos variable para guardar, buscar, eliminar, etc -> lo hace el repository

    public List<Singer> getAllSingers() {
        return singerRepository.findAll();
    }
    // List<>getAllSinger -> pide al repositorio que busque la lista de cantantes
    public Optional<Singer> getSingerById(Long id) {
    // Optional<>getSingerById -> busca un cantante por su Id, capaz no lo encuentra y devuelve vacio D:
        return singerRepository.findById(id);
    }

    public Singer createSinger(Singer singer) {
        return singerRepository.save(singer);
    }
    // recibe un cantante, lo guarda en el repositorio, te devuelve el cantante guardado
    public void deleteSinger(Long id) {
        singerRepository.deleteById(id);
    }
    // borra el cantante, lo elimina del repositorio y no devuelve nada -> void
}
