package ru.pavel2107.arch.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.pavel2107.arch.order.domain.Brand;
import ru.pavel2107.arch.order.domain.Category;
import ru.pavel2107.arch.order.domain.WareHouse;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodDto {
    private Long id;
    private Long skud;
    private String name;
    private String description;
    private Category category;
    private Brand brand;
    private Set<WareHouse> wareHouses = new HashSet<>();
}
