package com.example.demo.services;
import java.io.IOException;
import com.example.demo.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ProductResponseDTO;
import com.example.demo.gateway.ICategoryGateway;
import com.example.demo.gateway.IProductGateway;

import com.example.demo.DTO.ProductResponseDTO;


@Service 
public class FakeStoreProductService implements IProductService{


    private final IProductGateway productGateway;
    public FakeStoreProductService(IProductGateway productGateway)
    {
        this.productGateway = productGateway;
        
    }

    
    @Override
    public ProductResponseDTO getProductById(Long id) throws IOException
    {
        return (this.productGateway).getProductById(id);
    }
}
