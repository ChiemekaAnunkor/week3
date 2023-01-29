package com.springmvc;

import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements Movie {
    public String title() {
        return "Titanic";
    }

    public String maturity() {
        return "PG-13";
    }

    public String genre() {
        return "Romance";
    }
}