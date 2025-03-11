package com.casas.common.configurations.beans;

import com.casas.category.domain.ports.in.CategoryServicePort;
import com.casas.category.domain.ports.out.CategoryPersistencePort;
import com.casas.category.domain.usecases.CategoryUseCase;
import com.casas.category.infrastructure.adapters.persistence.mysql.CategoryPersistenceAdapter;
import com.casas.category.infrastructure.mappers.CategoryEntityMapper;
import com.casas.category.infrastructure.repositories.mysql.CategoryRepository;
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
