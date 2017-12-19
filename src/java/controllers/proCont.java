package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import dao.*;
import java.util.List;
import model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fetnat
 */

@Controller
public class proCont {

    @Autowired
    public ProductDAO pro;

    @RequestMapping("getProductById/{productId}")
    public ModelAndView getProductById(@PathVariable(value = "proID") int productId) {
        Product product = pro.findProduct(productId);
        return new ModelAndView("ProductPage", "productObj", product);
    }

    @RequestMapping(value = "/listpro")
    public ModelAndView getAllProducts() {
        List<Product> products = pro.getAllProducts();
        return new ModelAndView("listpro", "product", products);
    }

    @RequestMapping(value = "/Products/1")
    public ModelAndView getProduct() {

        List<Product> products = pro.getProduct(1);
        return new ModelAndView("Products", "product", products);
    }

    @RequestMapping(value = "/Products/2")
    public ModelAndView getsunglasses() {

        List<Product> products = pro.getProduct(2);
        return new ModelAndView("Products", "product", products);
    }

    @RequestMapping(value = "/Products/4")
    public ModelAndView getElectronics() {

        List<Product> products = pro.getProduct(4);
        return new ModelAndView("Products", "product", products);
    }

    @RequestMapping(value = "/Products/6")
    public ModelAndView getwathches() {

        List<Product> products = pro.getProduct(6);
        return new ModelAndView("Products", "product", products);
    }
    
    @RequestMapping(value = "/Products/5")
    public ModelAndView getToys() {

        List<Product> products = pro.getProduct(5);
        return new ModelAndView("Products", "product", products);
    }
}
