package com.categories.category.domain.usecases;

import com.categories.category.domain.exceptions.CategoryAlreadyExistsException;
import com.categories.category.domain.model.CategoryModel;
import com.categories.category.domain.ports.in.CategoryServicePort;
import com.categories.category.domain.ports.out.CategoryPersistencePort;

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
}
