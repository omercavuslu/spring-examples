package com.omercavuslu.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.omercavuslu.graphql.dto.VehicleDto;
import com.omercavuslu.graphql.entity.Vehicle;
import com.omercavuslu.graphql.repo.VehicleRepository;
import java.util.Date;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDto vehicleDto) {
        return vehicleRepository.save(dtoToEntity(vehicleDto));
    }

    private Vehicle dtoToEntity(VehicleDto vehicleDto){
        Vehicle vehicle=new Vehicle();
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setLaunchDate(new Date());
        vehicle.setModelCode(vehicleDto.getModelCode());
        vehicle.setType(vehicleDto.getType());
        return vehicle;
    }
}