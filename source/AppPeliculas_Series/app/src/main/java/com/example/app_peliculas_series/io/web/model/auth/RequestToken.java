package com.example.app_peliculas_series.io.web.model.auth;

public class RequestToken {

    private String redirectTo;

    public RequestToken(String redirectTo) {
        this.redirectTo = redirectTo;
    }

    public String getRedirectTo() {
        return redirectTo;
    }

}