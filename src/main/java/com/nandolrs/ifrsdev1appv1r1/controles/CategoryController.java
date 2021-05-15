package com.nandolrs.ifrsdev1appv1r1.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;

//import com.nandolrs.ifrsdev1appv1r1.repositorios;

@RestController // This means that this class is a Controller
@RequestMapping(path="/category") // This means URL's start with /demo (after Application path)
public class CategoryController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private com.nandolrs.ifrsdev1appv1r1.repositorios.CategoryRepository categoryRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewCategory (@RequestParam String name) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        com.nandolrs.ifrsdev1appv1r1.dados.Category  n = new com.nandolrs.ifrsdev1appv1r1.dados.Category();
        n.setName(name);
        categoryRepository.save(n);
        return "Saved";
    }


    @PostMapping(
     value = "addp"
    ,consumes = {MediaType.APPLICATION_JSON_VALUE}
    ,produces = {MediaType.APPLICATION_JSON_VALUE}
    ) // Map ONLY POST Requests
    public @ResponseBody com.nandolrs.ifrsdev1appv1r1.dados.Category addNewCategory (@RequestBody  com.nandolrs.ifrsdev1appv1r1.dados.Category entidade) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

       categoryRepository.save(entidade);


        return entidade;
    }


    @GetMapping(path="/all")
    public @ResponseBody Iterable<com.nandolrs.ifrsdev1appv1r1.dados.Category> getAllCategories() {
        // This returns a JSON or XML with the users
        return categoryRepository.findAll();
    }



    @PostMapping(
            value = "teste"
            ,consumes = {MediaType.APPLICATION_JSON_VALUE}
            ,produces = {MediaType.APPLICATION_JSON_VALUE}
    ) // Map ONLY POST Requests
    public @ResponseBody com.nandolrs.ifrsdev1appv1r1.dados.Category Teste (@RequestBody  com.nandolrs.ifrsdev1appv1r1.dados.Category entidade) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request




        return entidade;
    }

}
