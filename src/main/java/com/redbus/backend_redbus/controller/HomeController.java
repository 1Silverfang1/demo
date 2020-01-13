package com.redbus.backend_redbus.controller;

import com.redbus.backend_redbus.database.LoadData;
import com.redbus.backend_redbus.model.*;
import com.redbus.backend_redbus.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private LoadData loadData;
    @Autowired
    private BusDriverRepository busDriverRepository;
    @Autowired
    private BusTypeRepository busTypeRepository;
    @Autowired
    private TimingRepository timingRepository;
    @Autowired
    private SeatFareRepository seatFareRepository;
    @Autowired
    private  SeatRepository seatRepository;
    @GetMapping("/")
    public void loadData()
    {
    Bus bus = new Bus();
    BusDriver busDriver= new BusDriver();
    BusType busType= new BusType();
    Timing timing= new Timing();
    Seat seat= new Seat();
    seat.setTotalSeat(30);
    seat.setSeatTypes("17,8,5");
    seatRepository.save(seat);
    List<SeatFare> seatFareListSmall= seatFareRepository.findBySeatType("Small");
    List<SeatFare> seatFareListMedium= seatFareRepository.findBySeatType("Medium");
    List<SeatFare> seatFareListLarge= seatFareRepository.findBySeatType("Large");
    busDriver.setDriverName("Thakur Bhanu Pratab");
    String[] seatTypes= seat.getSeatTypes().split(",");
    int smallSeats= Integer.parseInt(seatTypes[0]);
    int LargeSeats= Integer.parseInt(seatTypes[2]);
    int MediumSeats= Integer.parseInt(seatTypes[1]);
    busDriverRepository.save(busDriver);
    busType.setBusFactor(1);
    busType.setBusType("Volvo");
    busTypeRepository.save(busType);
    timing.setFinalSource("Lakeland County");
    timing.setFinalDestination("Geest");
    timing.setArrivalTime(new Date());
    timing.setDepartureTime(new Date());
    timingRepository.save(timing);
    bus.setBusName("Bhanu Pratab Travels");
    bus.setBusDriver(busDriver);
    bus.setBusNumber("Ak-07-1998");
    bus.setBusType(busType);
    bus.setBusTiming(timing);



    }
}
