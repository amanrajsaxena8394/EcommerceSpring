package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CategoryDTO;
import com.example.demo.DTO.ProductResponseDTO;
import com.example.demo.services.IProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private  IProductService productService;

   // final int x;
    
   
    //categpry service can be initiated by cintructor injection also 

  

   // @GetMapping("/{id}")
//public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable("id") Long id) throws IOException
   
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable("id") Long id) throws IOException
    {
        ProductResponseDTO response=this.productService.getProductById(id);
         return ResponseEntity.created(null).body(response);

     

        
    }
}
