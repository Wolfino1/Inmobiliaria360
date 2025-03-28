package com.casas.category.application.services;

import com.casas.category.application.dto.request.SaveCategoryRequest;
import com.casas.category.application.dto.response.CategoryResponse;
import com.casas.category.application.dto.response.SaveCategoryResponse;

import java.util.List;

public interface CategoryService {
    SaveCategoryResponse save(SaveCategoryRequest request);
    List<CategoryResponse> getCategories(Integer page, Integer size, boolean orderAsc);
    List<CategoryResponse> getAllCategoriesFilters(Integer page, Integer size, String name, String description, boolean orderAsc);
}

