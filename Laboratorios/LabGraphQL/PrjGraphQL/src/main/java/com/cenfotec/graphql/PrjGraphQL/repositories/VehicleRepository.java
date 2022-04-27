package com.cenfotec.graphql.PrjGraphQL.repositories;

import com.cenfotec.graphql.PrjGraphQL.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
