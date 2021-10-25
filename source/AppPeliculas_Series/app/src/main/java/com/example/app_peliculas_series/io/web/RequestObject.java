package com.example.app_peliculas_series.io.web;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestObject<T> {
    @SerializedName("rqt")
    @Expose
    private T request;

    public RequestObject(T requestBody){
        this.request = requestBody;
    }

    public T getRequest() {
        return request;
    }

    public void setRequest(T requestBody) {
        this.request = requestBody;
    }
}
