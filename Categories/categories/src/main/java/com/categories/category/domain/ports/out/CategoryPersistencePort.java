package com.categories.category.domain.ports.out;

import com.categories.category.domain.model.CategoryModel;

import java.util.List;

public interface CategoryPersistencePort {
    void save(CategoryModel categoryModel);
    CategoryModel getByName(String categoryName);
    List<CategoryModel> get(Integer page, Integer size, boolean orderAsc);
}

