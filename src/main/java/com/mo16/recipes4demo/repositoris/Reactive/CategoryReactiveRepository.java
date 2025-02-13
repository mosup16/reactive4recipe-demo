package com.mo16.recipes4demo.repositoris.Reactive;

import com.mo16.recipes4demo.model.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {
    Mono<Category> findByDescription(String desc);
}
