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

			repository.save(Fighter.builder()
			.name("Sakura Haruno")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(2)
			.health(2400)
			.resistance(new BigDecimal(0.5)).build());
			
			repository.save(Fighter.builder()
			.name("Kakashi Hatake")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(99)
			.health(2000)
			.resistance(new BigDecimal(0.5)).build());
			
			repository.save(Fighter.builder()
			.name("Boruto Uzumaki")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(1)
			.health(2300)
			.resistance(new BigDecimal(0.5)).build());
			
			repository.save(Fighter.builder()
			.name("Sarada Uchiha")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(8)
			.health(2300)
			.resistance(new BigDecimal(0.5)).build());
			
			repository.save(Fighter.builder()
			.name("Mitsuki")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(49)
			.health(2300)
			.resistance(new BigDecimal(0.5)).build());
			
			repository.save(Fighter.builder()
			.name("Hinata Hyuga")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(59)
			.health(2300)
			.resistance(new BigDecimal(0.5)).build());
			
			repository.save(Fighter.builder()
			.name("Kiba Inuzuka")
			.animeFrom(Anime.NARUTO)
			.damagePerHit(69)
			.health(2750)
			.resistance(new BigDecimal(0.5)).build());
		};

}}
