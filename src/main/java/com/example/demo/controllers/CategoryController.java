package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

//import com.example.demo.services.FakeStoreCategoryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.DTO.CategoryDTO;
import com.example.demo.services.ICategoryService;

import java.io.IOException;
import java.util.*;


@RestController
@RequestMapping("api/categories")
public class CategoryController {

    @Autowired
    private  ICategoryService categoryService;

   // final int x;
    
   
    //categpry service can be initiated by cintructor injection also 

    public String getMethodName(@RequestParam String param) {
        return new String();
    }

   
    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() throws IOException
    {
         List<CategoryDTO> response=this.categoryService.getAllCategories();
         return ResponseEntity.created(null)
                              .body(response);
    }

    
}
