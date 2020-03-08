package com.omercavuslu.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.omercavuslu.graphql.entity.Vehicle;
import com.omercavuslu.graphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(String type){
       return vehicleRepository.getByTypeLike(type);
    }

    public Optional<Vehicle> getBId(Long id){
        return vehicleRepository.findById(id);
    }
}
