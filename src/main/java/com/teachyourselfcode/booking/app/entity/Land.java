package com.teachyourselfcode.booking.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="landbooking")
public class Land {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="land_bookingId")
    private Integer landBookingId;

    @Column(name="customer_name")
    private String CustomerName;

    @Column(name="customer_num")
    private Integer customerNumber;

    @Column(name="customer_email")
    private String customerEmail;

    public Integer getLandBookingId() {
        return landBookingId;
    }

    public void setLandBookingId(Integer landBooking) {
        this.landBookingId = landBooking;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

}
