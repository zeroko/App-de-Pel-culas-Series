package com.example.app_peliculas_series.io.web.api;

import com.example.app_peliculas_series.io.web.End_Points;
import com.example.app_peliculas_series.io.web.model.auth.ResponseCreateToken;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;


/**
 * Interface para consumo de servicios de ApiLogin
 *
 * @auth =  tipo de autorización
 * @content_type = especificación de tipos de datos
 * @user = usuario
 * @pass = password
 * @grant = tipo de concesión
 */
public interface ApiAuth {
    @POST(End_Points.POST.CREATE_REQUEST_TOKEN)
    Call<ResponseCreateToken> sendRequestToken(@Header("Authorization") String auth,
                                               @Header("Content-Type") String content_type

    );
}