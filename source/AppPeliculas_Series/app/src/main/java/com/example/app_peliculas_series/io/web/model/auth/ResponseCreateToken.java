package com.example.app_peliculas_series.io.web.model.auth;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

public class ResponseCreateToken {
    /**
     * {
     * "status_message": "Success.",
     * "request_token": "eyJhbGciOiJIfsISNiIaInR5cCI6IkpXVCJ9.eyJuYmYiOjE0NzIwNTQ1ODEsInZlcnNpb24iOjEsImV4zCI6MTQ3MjA1NTQ4MSwiYXXkIjoiM2Y4Nzg1N2JlMjA5ZDM1MTk4MzNiMzAwYTEzZDBlMqIiLCJzY29wZXMiOlsicGVuZGluZ19yZXF1ZXN0X3Rva2VuIl0sImp0aSI6Nd0.e0t83AUvwywXPBb-hSAY_J_y4TjcwA0w98GhCCQM1dA",
     * "success": true,
     * "status_code": 1
     * }
     */

    @SerializedName("status_message")
    @Getter
    @Setter
    private String statusMessage;

    @SerializedName("status_code")
    @Getter
    @Setter
    private int statusCode;

    @SerializedName("request_token")
    @Getter
    @Setter
    private String requestToken;

    @SerializedName("success")
    @Getter
    @Setter
    private boolean success;

}