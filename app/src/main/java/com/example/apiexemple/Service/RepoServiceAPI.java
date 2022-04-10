package com.example.apiexemple.Service;


import com.example.apiexemple.Models.Produit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface RepoServiceAPI {
    String BASE_URL = "http://10.20.55.53:8686/";

    @GET("produits/listes/")
    Call<List<Produit>> Affichage();


}
