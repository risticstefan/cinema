package com.ftninformatika.jwd.modul3.cinema.repository;

import com.ftninformatika.jwd.modul3.cinema.model.Projekcija;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProjekcijaRepository extends JpaRepository<Projekcija,Long> {

    Projekcija findOneById(Long id);

    Page<Projekcija> findByDatumIVremeBetweenAndCenaKarteBetweenAndTipLike(LocalDateTime datumIVremeOd,LocalDateTime datumIVremeDo,
                                                                           Double cenaKarteOd,Double cenaKarteDo,String tip, Pageable pageable);

    Page<Projekcija> findByDatumIVremeBetweenAndCenaKarteBetweenAndTipLikeAndFilmId(LocalDateTime datumIVremeOd,LocalDateTime datumIVremeDo,
                                                                           Double cenaKarteOd,Double cenaKarteDo,String tip,Long filmId, Pageable pageable);

    Page<Projekcija> findByDatumIVremeBetweenAndCenaKarteBetweenAndTipLikeAndSala(LocalDateTime datumIVremeOd,LocalDateTime datumIVremeDo,
                                                                                    Double cenaKarteOd,Double cenaKarteDo,String tip,Integer sala, Pageable pageable);

    Page<Projekcija> findByDatumIVremeBetweenAndCenaKarteBetweenAndTipLikeAndFilmIdAndSala(LocalDateTime datumIVremeOd,LocalDateTime datumIVremeDo,
                                                                                    Double cenaKarteOd,Double cenaKarteDo,String tip,Long filmId,Integer sala, Pageable pageable);
    List<Projekcija> findByFilmId(Long filmId);
}
