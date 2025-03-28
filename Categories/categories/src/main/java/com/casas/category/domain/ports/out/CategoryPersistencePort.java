package com.casas.category.domain.ports.out;

import com.casas.category.domain.model.CategoryModel;

import java.util.List;

public interface CategoryPersistencePort {
    void save(CategoryModel categoryModel);
    CategoryModel getByName(String categoryName);
    List<CategoryModel> get(Integer page, Integer size, boolean orderAsc);
    List<CategoryModel> getFilters(Integer page, Integer size, String name, String description, boolean orderAsc);
}

