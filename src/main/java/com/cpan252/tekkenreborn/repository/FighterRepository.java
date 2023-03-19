package com.cpan252.tekkenreborn.repository;

import org.springframework.data.repository.CrudRepository;

import com.cpan252.tekkenreborn.model.Fighter.Anime;
import com.cpan252.tekkenreborn.model.Fighter;
import java.time.LocalDate;
import java.util.List;
public interface FighterRepository extends CrudRepository<Fighter, Long> {
    List<Fighter> findByAnimeFrom(Anime anime);

    List<Fighter> findByNameStartsWithAndCreatedAtBetween(String name, LocalDate startDate, LocalDate endDate);
}