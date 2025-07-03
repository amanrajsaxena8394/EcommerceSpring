package com.example.demo.gateway;

import java.io.IOException;


//import com.example.demo.DTO.CategoryDTO;
//import com.example.demo.DTO.FakeStoreCategoryResponseDTO;
import com.example.demo.DTO.FakeStoreProductResponseDTO;
import com.example.demo.DTO.ProductResponseDTO;
//import com.example.demo.gateway.api.FakeStoreCategoryApi;
import com.example.demo.gateway.api.FakeStoreProductApi;

import org.springframework.stereotype.Component;

@Component
public class FakeStoreProductGateway implements IProductGateway{

    private final FakeStoreProductApi fakeStoreProductApi;
    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi)
    {
        this.fakeStoreProductApi=fakeStoreProductApi;
    }
    @Override
    public ProductResponseDTO getProductById(Long id) throws IOException
    {
        FakeStoreProductResponseDTO response= this.fakeStoreProductApi.getProductById(id).execute().body();
        if(response==null)
        {
            throw new IOException("FAILED TO FETCH");
        }
       return response.getProduct();
    }
}
