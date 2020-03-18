package com.example.poo2aula09032020.controller;

import java.util.Collection;

import com.example.poo2aula09032020.model.Produto;
import com.example.poo2aula09032020.service.ProductServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController
 */
@Controller
@RequestMapping("/app")
public class ProductController 
{
    @Autowired
    private ProductServices ps;

    @GetMapping("/product/{code}")
    public ModelAndView getProd(@PathVariable("codigo")int code)
    {
        ModelAndView mv = new ModelAndView("prodbyorder");

        Produto prod = ps.GetProdbyOrder(code);
        mv.addObject("prods", prod);
        return mv;
    }
    @GetMapping("/productsinstock")
    public ModelAndView GetAllProds()
    {
        ModelAndView pr = new ModelAndView("allprods");
        Collection<Produto> prod = ps.getProd();
        pr.addObject("prods", prod);
        return pr;
    }

    @GetMapping("/productsabove/{valor}")
    public ModelAndView GetProdsAbove(@PathVariable("valor")double valor)
    {
        ModelAndView pr = new ModelAndView("above");
        Collection<Produto> prod = ps.GetProductsAbove(valor);
        pr.addObject("prods",prod);
        return pr;
    }
    @GetMapping("/productsbellow/{valor}")
    public ModelAndView GetProdsBellow(@PathVariable("valor")double valor)
    {
        ModelAndView pr = new ModelAndView("bellow");
        Collection<Produto> prod = ps.GetProductsBellow(valor);
        pr.addObject("prods",prod);
        return pr;
    }
    

   
    

    
}