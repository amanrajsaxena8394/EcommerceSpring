package com.example.demo.gateway;

import java.io.IOException;

import com.example.demo.DTO.ProductResponseDTO;

public interface IProductGateway {


    ProductResponseDTO getProductById(Long id) throws IOException;
}
