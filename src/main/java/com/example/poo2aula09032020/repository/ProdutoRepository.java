package com.example.poo2aula09032020.repository;

import java.util.HashMap;

import com.example.poo2aula09032020.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer, Produto> hm = new HashMap<Integer,Produto>();
    public ProdutoRepository()
    {
        hm.put(1,new Produto(1, "banana", 1.00, 50));
        hm.put(2,new Produto(2, "maca", 2.00, 40));
        hm.put(3,new Produto(3, "uva", 2.50, 30));
        hm.put(4,new Produto(4, "pera", 3.00, 20));
        hm.put(5,new Produto(5, "pao", 1.00, 50));
        hm.put(6,new Produto(6, "danone", 1.50, 50));
        hm.put(7,new Produto(7, "leite", 3.00, 50));
        hm.put(8,new Produto(8, "cenoura", 0.50, 50));
        hm.put(9,new Produto(9, "bala", 0.20, 90));
        hm.put(10,new Produto(10, "chiclete", 0.30, 80));
    }

    public Produto getProdutoById(int code)
    {
        return hm.get(code);
    }

    public HashMap<Integer,Produto> getProducts()
    {
        return hm;
    }
    
}