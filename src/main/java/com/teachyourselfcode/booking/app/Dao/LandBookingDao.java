package com.teachyourselfcode.booking.app.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teachyourselfcode.booking.app.entity.Land;

@Repository
public interface LandBookingDao extends CrudRepository<Land, Integer> {
}
