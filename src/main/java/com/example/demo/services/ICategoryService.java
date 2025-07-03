package com.example.demo.services;
import java.io.IOException;
import java.util.*;

import com.example.demo.DTO.CategoryDTO;

public interface ICategoryService {

      List<CategoryDTO> getAllCategories() throws IOException;
}
