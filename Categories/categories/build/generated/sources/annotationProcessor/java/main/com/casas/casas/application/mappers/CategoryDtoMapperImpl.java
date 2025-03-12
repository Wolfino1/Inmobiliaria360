package com.casas.casas.application.mappers;

import com.casas.casas.application.dto.request.SaveCategoryRequest;
import com.casas.casas.application.dto.response.CategoryResponse;
import com.casas.casas.domain.model.CategoryModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-12T01:19:27-0500",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.12.1.jar, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class CategoryDtoMapperImpl implements CategoryDtoMapper {

    @Override
    public CategoryModel requestToModel(SaveCategoryRequest saveCategoryRequest) {
        if ( saveCategoryRequest == null ) {
            return null;
        }

        String name = null;
        String description = null;

        name = saveCategoryRequest.name();
        description = saveCategoryRequest.description();

        Long id = null;

        CategoryModel categoryModel = new CategoryModel( id, name, description );

        return categoryModel;
    }

    @Override
    public CategoryResponse modelToResponse(CategoryModel categoryModel) {
        if ( categoryModel == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;

        id = categoryModel.getId();
        name = categoryModel.getName();
        description = categoryModel.getDescription();

        CategoryResponse categoryResponse = new CategoryResponse( id, name, description );

        return categoryResponse;
    }

    @Override
    public List<CategoryResponse> modelListToResponseList(List<CategoryModel> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryResponse> list = new ArrayList<CategoryResponse>( categories.size() );
        for ( CategoryModel categoryModel : categories ) {
            list.add( modelToResponse( categoryModel ) );
        }

        return list;
    }
}
