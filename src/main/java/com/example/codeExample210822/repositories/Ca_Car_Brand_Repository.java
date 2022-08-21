package com.example.codeExample210822.repositories;

import com.example.codeExample210822.models.Ca_Car_Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Ca_Car_Brand_Repository extends JpaRepository<Ca_Car_Brand, Integer> {

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where t.ca_car_type=1 and t.name=:name and t.is_deleted=false order by name")
  public Ca_Car_Brand findByNameCars(@Param("name") String name);

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand where is_deleted=false order by name limit 6")
  public List<Ca_Car_Brand> pop_top_brands();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=2 and is_deleted=false order by t.name")
  public List<Ca_Car_Brand> get_all_mototech();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=2 and is_deleted=false order by name limit 5")
  public List<Ca_Car_Brand> get_pop_mototech();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=4 and is_deleted=false order by t.name")
  public List<Ca_Car_Brand> get_all_spare_parts_for_commercial();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=4 and is_deleted=false order by name limit 5")
  public List<Ca_Car_Brand> get_pop_spare_parts_for_commercial();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=6 and is_deleted=false order by t.name")
  public List<Ca_Car_Brand> get_all_trucks();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=6 and is_deleted=false order by name limit 5")
  public List<Ca_Car_Brand> get_pop_trucks();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=7 and is_deleted=false order by t.name")
  public List<Ca_Car_Brand> get_all_buses();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=7 and is_deleted=false order by name limit 5")
  public List<Ca_Car_Brand> get_pop_buses();

  @Query(nativeQuery = true, value = "select * from Ca_Car_Brand t where ca_car_type=8 and is_deleted=false order by t.name")
  public List<Ca_Car_Brand> get_all_sapecial_equipment();

}
