package com.example.demo.DTO;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductResponseDTO {

    private ProductResponseDTO product;
    private String message;
    private String status;
}
