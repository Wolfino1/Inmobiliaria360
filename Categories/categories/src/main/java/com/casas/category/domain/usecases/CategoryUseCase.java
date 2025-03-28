package com.casas.category.domain.usecases;

import com.casas.category.domain.exceptions.CategoryAlreadyExistsException;
import com.casas.category.domain.model.CategoryModel;
import com.casas.category.domain.ports.in.CategoryServicePort;
import com.casas.category.domain.ports.out.CategoryPersistencePort;

import java.util.List;

public class CategoryUseCase implements CategoryServicePort {
    private final CategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(CategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }

    @Override
    public void save(CategoryModel categoryModel) {
        CategoryModel category = categoryPersistencePort.getByName(categoryModel.getName());
        if (category != null) {
            throw new CategoryAlreadyExistsException();
        }
        categoryPersistencePort.save(categoryModel);
    }

    @Override
    public List<CategoryModel> get(Integer page, Integer size, boolean orderAsc) {
        return categoryPersistencePort.get(page, size, orderAsc);
    }
    @Override
    public List<CategoryModel> getFilters(Integer page, Integer size, String name, String description, boolean orderAsc) {
        return categoryPersistencePort.getFilters(page, size, name, description, orderAsc);
    }
}
