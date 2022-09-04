package controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repo.ProductRepository;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") int id){
        return productRepository.findById(id).get();
    }

    @RequestMapping(value = "/product/{i}", method = RequestMethod.DELETE)
    public void removeProduct(@PathVariable("id") int id){
         productRepository.deleteById(id);
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public Product createProduct(Product product){
       return productRepository.save(product);
    }

    @RequestMapping(value = "/product", method = RequestMethod.PUT)
    public Product editProduct(Product product){
        return productRepository.save(product);
    }
}
