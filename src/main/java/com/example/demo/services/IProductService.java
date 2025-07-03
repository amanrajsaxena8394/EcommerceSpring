package com.example.demo.services;
import java.io.IOException;
//import java.util.*;

//import com.example.demo.DTO.CategoryDTO;
import com.example.demo.DTO.ProductResponseDTO;

public interface IProductService {

      ProductResponseDTO getProductById(Long id) throws IOException;
}