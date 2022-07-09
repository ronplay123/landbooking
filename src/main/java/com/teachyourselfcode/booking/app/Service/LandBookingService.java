package com.teachyourselfcode.booking.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Service;
import com.teachyourselfcode.booking.app.Dao.LandBookingDao;
import com.teachyourselfcode.booking.app.entity.Land;


@Service
public class LandBookingService {

    @Autowired
    LandBookingDao landBookingDao;
    public Land createBooking(Land land) {
        return landBookingDao.save(land);
    }
}
