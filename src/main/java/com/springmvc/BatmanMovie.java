package com.springmvc;

import org.springframework.stereotype.Component;

@Component
public class BatmanMovie implements Movie {

    public String title() {
        return "Batman: The Dark Knight";
    }

    public String maturity() {
        return "PG-13";
    }

    public String genre() {
        return "Action";
    }
}
