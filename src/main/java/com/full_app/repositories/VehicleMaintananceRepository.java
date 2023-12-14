package com.full_app.repositories;

import com.full_app.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintananceRepository extends JpaRepository<VehicleMaintenance, Integer> {
}
