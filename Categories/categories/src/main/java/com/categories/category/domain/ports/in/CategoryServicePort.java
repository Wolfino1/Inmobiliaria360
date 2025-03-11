package com.categories.category.domain.ports.in;

import com.categories.category.domain.model.CategoryModel;

import java.util.List;

    public interface CategoryServicePort {
        void save(CategoryModel categoryModel);
        List<CategoryModel> get(Integer page, Integer size, boolean orderAsc);
    }
