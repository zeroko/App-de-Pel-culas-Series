//package com.example.app_peliculas_series.io.web.api;
//
//import com.example.app_peliculas_series.io.web.RequestObject;
//import com.example.app_peliculas_series.io.web.model.autEmpleado.AutEmpleadoResponse;
//
//import retrofit2.Call;
//import retrofit2.http.Body;
//import retrofit2.http.Header;
//import retrofit2.http.POST;
//
///**
// * Interface para consumo de servicios de AutenticaciónEmpleado
// *
// * @token =  Token necesario para llevar a cabo las transacciones
// * @content_type = especificación de tipos de datos
// * @requestObject =  Mapeo del objeto
// */
//public interface ApiAutenticacionEmpleado {
//    @POST("1/empleados/autenticacionUsuario")
//    Call<AutEmpleadoResponse> sendRequest(@Header("Authorization") String token,
//                                          @Header("Content-Type") String content_type,
//                                          @Body RequestObject requestObject
//    );
//
//}
