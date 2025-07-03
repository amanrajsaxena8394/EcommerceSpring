package com.example.demo.gateway;
import java.io.IOException;
import java.util.List;
import com.example.demo.DTO.*;

public interface ICategoryGateway {

   List<CategoryDTO> getAllCategories() throws IOException;
}
