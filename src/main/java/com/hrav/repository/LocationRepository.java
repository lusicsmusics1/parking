package com.hrav.repository;


import com.hrav.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Morteza Vesal
 */

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {

}
