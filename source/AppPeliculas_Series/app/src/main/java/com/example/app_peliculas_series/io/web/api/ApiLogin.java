//package com.example.app_peliculas_series.io.web.api;
//
//import com.example.app_peliculas_series.io.web.model.login.TokenResponse;
//
//import retrofit2.Call;
//import retrofit2.http.Field;
//import retrofit2.http.FormUrlEncoded;
//import retrofit2.http.Header;
//import retrofit2.http.POST;
//
///**
// * Interface para consumo de servicios de ApiLogin
// *
// * @auth =  tipo de autorización
// * @content_type = especificación de tipos de datos
// * @user = usuario
// * @pass = password
// * @grant = tipo de concesión
// */
//public interface ApiLogin {
//    @FormUrlEncoded
//    @POST("oauth2/token")
//    Call<TokenResponse> sendRequestLogin(@Header("Authorization") String auth,
//                                         @Header("Content-Type") String content_type,
//                                         @Field("username") String user,
//                                         @Field("password") String pass,
//                                         @Field("grant_type") String grant
//    );
//}
