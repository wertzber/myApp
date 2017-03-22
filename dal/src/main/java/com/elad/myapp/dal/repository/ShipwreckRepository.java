package com.elad.myapp.dal.repository;

import com.elad.myapp.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eladw on 3/15/17.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {


}
