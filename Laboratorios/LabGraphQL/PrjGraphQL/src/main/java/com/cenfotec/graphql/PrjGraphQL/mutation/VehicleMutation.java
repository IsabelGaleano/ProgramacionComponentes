package com.cenfotec.graphql.PrjGraphQL.mutation;

import com.cenfotec.graphql.PrjGraphQL.entities.Vehicle;
import com.cenfotec.graphql.PrjGraphQL.services.VehicleService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation  implements GraphQLMutationResolver {
    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(String type, String
                                 modelCode, String brandName,
                                 String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode,
                brandName, launchDate);
    }
}
