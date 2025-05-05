package com.melodify.melodify.Service;

import com.melodify.melodify.Entity.Singer; // usamos la clase singer
import com.melodify.melodify.Repository.SingerRepository; // importamos el repositorio
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SingerService {
    @Autowired
    private SingerRepository singerRepository;

    public List<Singer> getAllSingers() {
        return singerRepository.findAll();
    }

    public Optional<Singer> getSingerById(Long id) {
        return singerRepository.findById(id);
    }

    public Singer createSinger(Singer singer) {
        return singerRepository.save(singer);
    }
    public void deleteSinger(Long id) {
        singerRepository.deleteById(id);
    }
}
