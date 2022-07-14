package com.ftninformatika.jwd.modul3.cinema.service;

import com.ftninformatika.jwd.modul3.cinema.model.Film;

import java.util.List;

public interface FilmService {

    Film findOne(Long id);

    List<Film> findAll();

    Film save(Film film);

    Film update(Film film);

    Film delete(Long id);

    List<Film> find(String naziv, Long zanrId, Integer trajanjeOd, Integer trajanjeDo);

    List<Film> findByZanrId(Long zanrId);
}
