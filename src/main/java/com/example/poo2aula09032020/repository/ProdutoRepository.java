package com.example.poo2aula09032020.repository;

import java.util.HashMap;

import com.example.poo2aula09032020.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<String, Produto> hm = new HashMap<String,Produto>();
    public ProdutoRepository()
    {
        hm.put("banana",new Produto(1, "banana", 1.00, 50));
        hm.put("maca",new Produto(2, "maca", 2.00, 40));
        hm.put("uva",new Produto(3, "uva", 2.50, 30));
        hm.put("pera",new Produto(4, "pera", 3.00, 20));
        hm.put("pao",new Produto(5, "pao", 1.00, 50));
        hm.put("danone",new Produto(6, "danone", 1.50, 50));
        hm.put("leite",new Produto(7, "leite", 3.00, 50));
        hm.put("cenoura",new Produto(8, "cenoura", 0.50, 50));
        hm.put("bala",new Produto(9, "bala", 0.20, 90));
        hm.put("chiclete",new Produto(10, "chiclete", 0.30, 80));
    }

    public Produto getProdutoById(int codigo)
    {
        return hm.get(codigo);
    }

    /*public Produto getProdutos()
    {

    }*/
    
}