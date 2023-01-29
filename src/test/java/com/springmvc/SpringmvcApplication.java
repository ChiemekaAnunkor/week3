package com.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcApplication.class, args);
    }

    @RequestMapping("/")
    public String getIndexPage() {

        System.out.println("http://localhost:8080");
        return "index";

    }

    @RequestMapping("/bestMovie")
    public String getBestMoviePage(Model model) {
        BestMovieService bestMovieService = null;
        model.addAttribute("BestMovie", bestMovieService.getBestMovie().title());
        return "bestMovie";
    }

   
}
