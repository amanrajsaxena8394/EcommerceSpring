package com.example.demo.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CategoryDTO;
import com.example.demo.gateway.ICategoryGateway;

@Service
public class FakeStoreCategoryService implements ICategoryService {
 
   
    private final ICategoryGateway categoryGateway;
    public FakeStoreCategoryService(  @Qualifier("fakeStoreRestTemplateGateway") ICategoryGateway categoryGateway)
    {
        this.categoryGateway=categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException
    {
        return this.categoryGateway.getAllCategories();
    }

}
