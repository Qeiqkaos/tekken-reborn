package com.cpan252.tekkenreborn.controller;

import java.util.EnumSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.model.FighterPool;
import com.cpan252.tekkenreborn.model.Fighter.Anime;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
@RequestMapping("/design")
@SessionAttributes("fighterPool")
public class DesignController{

    @GetMapping
    public String design() {
        return "design";
    }

    @ModelAttribute
    public void animes(Model model) {
        var animes = EnumSet.allOf(Anime.class);
        model.addAttribute("animes", animes);
        log.info("animes converted to string:  {}", animes);
    }

    @ModelAttribute(name = "fighterPool")
    public FighterPool fighterPool() {
        return new FighterPool();
    }

   
    @ModelAttribute
    public Fighter fighter() {
        return Fighter
                .builder()
                .build();
    }

    @PostMapping
    public String processFighterAddition(@Valid Fighter fighter,
            @ModelAttribute FighterPool pool, Errors errors) {
        if (errors.hasErrors()) {
            return "design";
        }
        else{
            pool.add(fighter);
            return "redirect:/design";}
    }

}