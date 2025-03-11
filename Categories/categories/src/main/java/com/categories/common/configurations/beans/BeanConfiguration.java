package com.categories.common.configurations.beans;

import com.categories.category.domain.ports.in.CategoryServicePort;
import com.categories.category.domain.ports.out.CategoryPersistencePort;
import com.categories.category.domain.usecases.CategoryUseCase;
import com.categories.category.infrastructure.adapters.persistence.mysql.CategoryPersistenceAdapter;
import com.categories.category.infrastructure.mappers.CategoryEntityMapper;
import com.categories.category.infrastructure.repositories.mysql.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final CategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Bean
    public CategoryServicePort categoryServicePort() {
        return new CategoryUseCase(categoryPersistencePort());
    }

    @Bean
    public CategoryPersistencePort categoryPersistencePort() {
        return new CategoryPersistenceAdapter(categoryRepository, categoryEntityMapper);
    }
}
