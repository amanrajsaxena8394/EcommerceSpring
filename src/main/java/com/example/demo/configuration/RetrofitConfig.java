package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.gateway.api.FakeStoreCategoryApi;
import com.example.demo.gateway.api.FakeStoreProductApi;

import io.github.cdimascio.dotenv.Dotenv;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {
  
    @Bean
    public Retrofit retrofit()
    {
        Dotenv dotenv=Dotenv.configure().load();
        String baseURL=dotenv.get("BASE_URL");
        return new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
    }
    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryAp(Retrofit retrofit)
    {
            return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit)
    {
            return retrofit.create(FakeStoreProductApi.class);
    }
}
