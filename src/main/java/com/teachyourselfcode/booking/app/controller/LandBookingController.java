package com.teachyourselfcode.booking.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teachyourselfcode.booking.app.Service.LandBookingService;
import com.teachyourselfcode.booking.app.entity.Land;
@RestController
@RequestMapping(value="/api/landbooking")
public class LandBookingController {

    @Autowired
    LandBookingService landBookingService;

    @PostMapping(value="/createbooking")
    public Land createBooking(@RequestBody Land land) {
        return landBookingService.createBooking(land);
    }

}
