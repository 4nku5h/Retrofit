package com.ankush.hackerstudios.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL="https://www.simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<DataModel>> getHeros();

}
