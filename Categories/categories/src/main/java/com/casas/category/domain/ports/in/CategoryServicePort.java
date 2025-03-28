package com.casas.category.domain.ports.in;

import com.casas.category.domain.model.CategoryModel;

import java.util.List;

    public interface CategoryServicePort {
        void save(CategoryModel categoryModel);
        List<CategoryModel> get(Integer page, Integer size, boolean orderAsc);
        List<CategoryModel> getFilters(Integer page, Integer size,String name, String description, boolean orderAsc);
    }
