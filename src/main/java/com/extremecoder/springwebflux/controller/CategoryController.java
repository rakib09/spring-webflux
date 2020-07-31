package com.extremecoder.springwebflux.controller;

import com.extremecoder.springwebflux.model.Category;
import com.extremecoder.springwebflux.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController()
@RequestMapping(value = "/category")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("")
    public Flux<Category> all() {
        return this.categoryRepository.findAll();
    }

    @PostMapping("")
    public Mono<Category> create(@RequestBody Category category) {
        return this.categoryRepository.save(category);
    }

    @GetMapping("/{id}")
    public Mono<Category> get(@PathVariable("id") Integer id) {
        return this.categoryRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Mono<Category> update(@PathVariable("id") Integer id, @RequestBody Category category) {
        return this.categoryRepository.findById(id)
                .map(p -> {
                    p.setName(category.getName());
                    return p;
                })
                .flatMap(p -> this.categoryRepository.save(p));
    }
    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") Integer id) {
        return this.categoryRepository.deleteById(id);
    }
}
