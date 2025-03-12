package com.casas.casas.infrastructure.mappers;

import com.casas.casas.domain.model.CategoryModel;
import com.casas.casas.infrastructure.entities.CategoryEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-12T01:19:26-0500",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.12.1.jar, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class CategoryEntityMapperImpl implements CategoryEntityMapper {

    @Override
    public CategoryEntity modelToEntity(CategoryModel categoryModel) {
        if ( categoryModel == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( categoryModel.getId() );
        categoryEntity.setName( categoryModel.getName() );
        categoryEntity.setDescription( categoryModel.getDescription() );

        return categoryEntity;
    }

    @Override
    public CategoryModel entityToModel(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;

        id = categoryEntity.getId();
        name = categoryEntity.getName();
        description = categoryEntity.getDescription();

        CategoryModel categoryModel = new CategoryModel( id, name, description );

        return categoryModel;
    }

    @Override
    public List<CategoryModel> entityListToModelList(List<CategoryEntity> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryModel> list = new ArrayList<CategoryModel>( categories.size() );
        for ( CategoryEntity categoryEntity : categories ) {
            list.add( entityToModel( categoryEntity ) );
        }

        return list;
    }
}
