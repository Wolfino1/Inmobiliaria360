package com.casas.casas.application.mappers;

import com.casas.casas.application.dto.request.SaveHomeRequest;
import com.casas.casas.application.dto.response.HomeResponse;
import com.casas.casas.domain.model.HomeModel;
import com.casas.casas.infrastructure.entities.CategoryEntity;
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
public class HomeDtoMapperImpl implements HomeDtoMapper {

    @Override
    public HomeModel requestToModel(SaveHomeRequest homeCategoryRequest) {
        if ( homeCategoryRequest == null ) {
            return null;
        }

        String name = null;
        String description = null;

        name = homeCategoryRequest.name();
        description = homeCategoryRequest.description();

        Long id = null;
        CategoryEntity category = null;

        HomeModel homeModel = new HomeModel( id, name, description, category );

        return homeModel;
    }

    @Override
    public HomeResponse modelToResponse(HomeModel homeModel) {
        if ( homeModel == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;

        id = homeModel.getId();
        name = homeModel.getName();
        description = homeModel.getDescription();

        HomeResponse homeResponse = new HomeResponse( id, name, description );

        return homeResponse;
    }

    @Override
    public List<HomeResponse> modelListToResponseList(List<HomeModel> homes) {
        if ( homes == null ) {
            return null;
        }

        List<HomeResponse> list = new ArrayList<HomeResponse>( homes.size() );
        for ( HomeModel homeModel : homes ) {
            list.add( modelToResponse( homeModel ) );
        }

        return list;
    }
}
