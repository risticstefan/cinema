package com.ftninformatika.jwd.modul3.cinema.service;

import com.ftninformatika.jwd.modul3.cinema.model.Projekcija;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;

public interface ProjekcijaService {

    Projekcija findOne(Long id);

    Page<Projekcija> findAll(Integer pageNo);

    Projekcija save(Projekcija projekcija);

    Projekcija update(Projekcija projekcija);

    Projekcija delete(Long id);

    Page<Projekcija> find(LocalDateTime datumIVremeOd, LocalDateTime datumIVremeDo, Long filmId, String tip, Integer sala, Double cenaKarteOd, Double cenaKarteDo, Integer pageNo);

    List<Projekcija> findByFilmId(Long filmId);
}
