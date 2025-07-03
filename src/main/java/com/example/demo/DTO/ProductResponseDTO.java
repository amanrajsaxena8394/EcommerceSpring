package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDTO {


@JsonProperty("id")
private Integer id;
@JsonProperty("title")
private String title;
@JsonProperty("image")
private String image;
@JsonProperty("price")
private Integer price;
@JsonProperty("description")
private String description;
@JsonProperty("brand")
private String brand;
@JsonProperty("model")
private String model;
@JsonProperty("color")
private String color;
@JsonProperty("category")
private String category;
@JsonProperty("popular")
private Boolean popular;
@JsonProperty("discount")
private Integer discount;
}
