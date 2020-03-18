package com.example.poo2aula09032020.service;

import java.util.Collection;
import java.util.HashMap;

import com.example.poo2aula09032020.model.Produto;
import com.example.poo2aula09032020.repository.ProdutoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductServices
 */
@Service
public class ProductServices 
{
    
    @Autowired
    private ProdutoRepository pr;

    public Produto GetProdbyOrder(Integer code)
    {
        return pr.getProdutoById(code);
    }
        

    /*public Collection<Product>GetAllProducts()
    {
        HashMap<Integer,Product> aux = new HashMap<Integer,Product>();
        HashMap<Integer,Product> stock = new HashMap<Integer,Product>();

        aux = pr.getProducts();

        for(Product p : aux.values())
        {
            if(p.getStock()>0)
            {
                stock.put(p.getCode(),p);
            }
        }
        return stock.values();
    }*/
    public Collection<Produto> getProd()
    {
        
        HashMap<Integer, Produto> aux = new HashMap<Integer, Produto>();
        HashMap<Integer, Produto> Stock = new HashMap<Integer, Produto>();

        aux = pr.getProducts();
        for(Produto p:aux.values())
        {
            if(p.getEstoque() > 0)
            Stock.put(p.getCodigo(),p);
        }
        return Stock.values();
    } 
    public Collection<Produto> GetProductsAbove(double valor)
    {
        HashMap<Integer,Produto> aux = new HashMap<Integer,Produto>();
        HashMap<Integer, Produto> AboveStock = new HashMap<Integer,Produto>();

        aux = pr.getProducts();

        for(Produto p : aux.values())
        {
            if(p.getValor() > valor)
            {
                AboveStock.put(p.getCodigo(), p);
            }
        }
        return AboveStock.values();
    }
    public Collection<Produto> GetProductsBellow(double valor)
    {
        HashMap<Integer,Produto> aux = new HashMap<Integer,Produto>();
        HashMap<Integer, Produto> AboveBellow = new HashMap<Integer, Produto>();

        aux = pr.getProducts();

        for(Produto p : aux.values())
        {
            if(p.getValor() < valor)
            {
                AboveBellow.put(p.getCodigo(), p);
            }
        }
        return AboveBellow.values();
    }

    
    


    
}