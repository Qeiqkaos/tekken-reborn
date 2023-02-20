package com.cpan252.tekkenreborn;
import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.model.Fighter.Anime;
import com.cpan252.tekkenreborn.repository.FighterRepository;


@SpringBootApplication
public class TekkenrebornApplication {

	public static void main(String[] args) {
		SpringApplication.run(TekkenrebornApplication.class, args);
	}
	@Bean
	public CommandLineRunner dataLoader(FighterRepository repository) {
		return args -> {
			repository.save(Fighter.builder()
			.name("King")
			.animeFrom(Anime.TEKKEN)
			.damagePerHit(99)
			.health(2000)
			.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
			.name("Kazuya Mishima")
			.animeFrom(Anime.TEKKEN)
			.damagePerHit(86)
			.health(2100)
			.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
			.name("Naruto Uzumaki")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(90)
			.health(2400)
			.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
			.name("Sasuke Uchiha")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(89)
			.health(2300)
			.resistance(new BigDecimal(0.5)).build());
		};

}}
