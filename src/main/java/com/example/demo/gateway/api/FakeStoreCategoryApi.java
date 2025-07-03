package com.example.demo.gateway.api;
//import com.example.demo.DTO.CategoryDTO;

import retrofit2.Call;
import retrofit2.http.GET;

//import java.io.IOError;
import java.io.IOException;

//import org.springframework.stereotype.Component;

import com.example.demo.DTO.*;

public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllFakeCategores() throws IOException;
}
