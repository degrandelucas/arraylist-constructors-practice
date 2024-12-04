package com.constructors.application;

import com.constructors.model.ProdutoPerecivel;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        ProdutoPerecivel produto1 = new ProdutoPerecivel("alface", 2.25, 10, LocalDate.of(2024,12,05));
        ProdutoPerecivel produto2 = new ProdutoPerecivel("tomate", 8.25, 85, LocalDate.of(2024,12,05));
        System.out.println(produto1);
        System.out.println(produto2);
    }
}