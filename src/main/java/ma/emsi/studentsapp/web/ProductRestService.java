package ma.emsi.studentsapp.web;

import ma.emsi.studentsapp.entities.Product;
import ma.emsi.studentsapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductRestService {
   @Autowired
    private ProductRepository productRepository;

   @GetMapping("/products")
   public List<Product> products(){
    return productRepository.findAll();
   }

    @GetMapping("/products/{id}")
    public Product productbyid(@PathVariable long id){
        Product p= productRepository.findById(id).orElse(null);
        return  p;
    }
}
