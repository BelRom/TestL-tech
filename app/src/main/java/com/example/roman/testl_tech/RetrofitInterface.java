package com.example.roman.testl_tech;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by roman on 25.10.17.
 */

public interface RetrofitInterface {
    @GET("/")
    Call<List<Item>> getItem();
}
