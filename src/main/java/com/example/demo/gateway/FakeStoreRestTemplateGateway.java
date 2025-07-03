package com.example.demo.gateway;

import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.DTO.CategoryDTO;
import com.example.demo.DTO.FakeStoreCategoryResponseDTO;
import com.example.demo.gateway.api.FakeStoreCategoryApi;

@Component
public class FakeStoreRestTemplateGateway implements ICategoryGateway {

      private final FakeStoreCategoryApi fakeStoreCategoryApi;
    public FakeStoreRestTemplateGateway(FakeStoreCategoryApi fakeStoreCategoryApi)
    {
        this.fakeStoreCategoryApi=fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException
    {

        return List.of();
    //     FakeStoreCategoryResponseDTO response= this.fakeStoreCategoryApi.getAllFakeCategores().execute().body();
    //     if(response==null)
    //     {
    //         throw new IOException("FAILED TO FETCH");
    //     }
    //    return response.getCategories()
    //            .stream()
    //            .map(category -> CategoryDTO.builder().name(category).build())
    //            .toList();
    }
}
