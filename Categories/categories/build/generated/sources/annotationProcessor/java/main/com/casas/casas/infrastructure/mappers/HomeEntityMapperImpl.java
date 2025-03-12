package com.casas.casas.infrastructure.mappers;

import com.casas.casas.domain.model.HomeModel;
import com.casas.casas.infrastructure.entities.CategoryEntity;
import com.casas.casas.infrastructure.entities.HomeEntity;
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
public class HomeEntityMapperImpl implements HomeEntityMapper {

    @Override
    public HomeEntity modelToEntity(HomeModel homeModel) {
        if ( homeModel == null ) {
            return null;
        }

        HomeEntity homeEntity = new HomeEntity();

        homeEntity.setId( homeModel.getId() );
        homeEntity.setName( homeModel.getName() );
        homeEntity.setDescription( homeModel.getDescription() );
        homeEntity.setCategory( homeModel.getCategory() );

        return homeEntity;
    }

    @Override
    public HomeModel entityToModel(HomeEntity homeEntity) {
        if ( homeEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;
        CategoryEntity category = null;

        id = homeEntity.getId();
        name = homeEntity.getName();
        description = homeEntity.getDescription();
        category = homeEntity.getCategory();

        HomeModel homeModel = new HomeModel( id, name, description, category );

        return homeModel;
    }

    @Override
    public List<HomeModel> entityListToModelList(List<HomeEntity> homes) {
        if ( homes == null ) {
            return null;
        }

        List<HomeModel> list = new ArrayList<HomeModel>( homes.size() );
        for ( HomeEntity homeEntity : homes ) {
            list.add( entityToModel( homeEntity ) );
        }

        return list;
    }
}
