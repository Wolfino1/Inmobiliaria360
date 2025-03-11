package com.casas.category.application.services.impl;

import com.casas.category.application.dto.request.SaveCategoryRequest;
import com.casas.category.application.dto.response.CategoryResponse;
import com.casas.category.application.dto.response.SaveCategoryResponse;
import com.casas.category.application.mappers.CategoryDtoMapper;
import com.casas.category.application.services.CategoryService;
import com.casas.category.domain.ports.in.CategoryServicePort;
import com.casas.common.configurations.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryServicePort categoryServicePort;
    private final CategoryDtoMapper categoryDtoMapper;

    @Override
    public SaveCategoryResponse save(SaveCategoryRequest request) {
        categoryServicePort.save(categoryDtoMapper.requestToModel(request));
        return new SaveCategoryResponse(Constants.SAVE_CATEGORY_RESPONSE_MESSAGE, LocalDateTime.now());
    }

    @Override
    public List<CategoryResponse> getCategories(Integer page, Integer size, boolean orderAsc) {
        return categoryDtoMapper.modelListToResponseList(categoryServicePort.get(page, size, orderAsc));
    }
    @Override
    public List<CategoryResponse> getAllCategoriesFilters(Integer page, Integer size, String name, String description, boolean orderAsc) {
        return categoryDtoMapper.modelListToResponseList(categoryServicePort.getFilters(page, size, name, description, orderAsc));
    }
}
