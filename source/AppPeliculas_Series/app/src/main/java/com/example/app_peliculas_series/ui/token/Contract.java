package com.example.app_peliculas_series.ui.token;

import com.example.app_peliculas_series.base.mvp.InterfacePresenter;
import com.example.app_peliculas_series.base.mvp.InterfaceView;
import com.example.app_peliculas_series.io.web.model.auth.RequestToken;
import com.example.app_peliculas_series.io.web.model.auth.ResponseCreateToken;
import com.google.gson.JsonObject;


public interface Contract
{
    interface ContractInterfaceView extends InterfaceView
    {
        void createRequestToken(ResponseCreateToken response);
//
//        void validarRespuestaAutenticarUsuario(ResponseOk responseOk);
//
//        void validarRespuestRecuperarPassword(ResponseRecuperarPassword response);
//
//        void isInTramite(boolean resutl, String date);
    }

    interface ContractInterfacePresenter<V extends ContractInterfaceView> extends InterfacePresenter<V>
    {
        void getRequestToken(RequestToken request);
//
//        void getAutenticarUsuario(RequestAutenticaUsuario request);
//
//        void getRecuperarPassword(RequestRecuperarPassword request);
//
//        void consultarEstausMD(JsonObject request);
    }
}
