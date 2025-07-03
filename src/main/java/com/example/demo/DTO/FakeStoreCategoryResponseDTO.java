package com.example.demo.DTO;

import java.util.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreCategoryResponseDTO {
    
    private String status;
    private String message;
    private List<String> categories;
}
