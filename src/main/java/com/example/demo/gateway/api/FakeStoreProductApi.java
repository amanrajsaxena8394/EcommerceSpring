package com.example.demo.gateway.api;

import retrofit2.http.Path;
import retrofit2.http.GET;
import com.example.demo.DTO.*;
import retrofit2.Call;
import java.io.IOException;

public interface FakeStoreProductApi {
 

     @GET("products/{id}")
    Call<FakeStoreProductResponseDTO> getProductById(@Path("id") Long id) throws IOException;
}
