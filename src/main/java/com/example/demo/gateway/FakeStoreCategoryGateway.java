package com.example.demo.gateway;
import java.io.IOException;
import java.util.*;

import org.springframework.stereotype.Component;

import com.example.demo.DTO.*;
import  com.example.demo.gateway.api.*;

@Component
public class FakeStoreCategoryGateway  implements ICategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;
    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi)
    {
        this.fakeStoreCategoryApi=fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException
    {
        FakeStoreCategoryResponseDTO response= this.fakeStoreCategoryApi.getAllFakeCategores().execute().body();
        if(response==null)
        {
            throw new IOException("FAILED TO FETCH");
        }
       return response.getCategories()
               .stream()
               .map(category -> CategoryDTO.builder().name(category).build())
               .toList();
    }

}
