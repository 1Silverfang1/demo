package com.redbus.backend_redbus.controller;


import com.redbus.backend_redbus.ResponseBody;
import com.redbus.backend_redbus.model.PointsTable;
import com.redbus.backend_redbus.model.RouteTable;
import com.redbus.backend_redbus.model.SeatFare;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
public class HomeController {
//    @Autowired
//    private BusTicketRepository busTicketRepository;
//    @Autowired
//    private LoadData loadData;
//    @Autowired
//    private BusDriverRepository busDriverRepository;
//    @Autowired
//    private BusTypeRepository busTypeRepository;
//    @Autowired
//    private TimingRepository timingRepository;
//    @Autowired
//    private SeatFareRepository seatFareRepository;
////    @Autowired
////    private  SeatRepository seatRepository;
//    @Autowired
//    private LocationRepository locationRepository;
//    @Autowired
//    private BusRepository busRepository;
//    @GetMapping("/getData")
//    public void getData()
//    {
//    Bus bus = new Bus();
//    BusDriver busDriver= new BusDriver();
//    BusType busType= new BusType();
//    Timing timing= new Timing();
////    Seat seat= new Seat();
////    seat.setTotalSeat(30);
////    seat.setSeatTypes("17,8,5");
////    seatRepository.save(seat);
//    List<SeatFare> seatFareListSmall= seatFareRepository.findBySeatType("Small");
//    List<SeatFare> seatFareListMedium= seatFareRepository.findBySeatType("Medium");
//    List<SeatFare> seatFareListLarge= seatFareRepository.findBySeatType("Large");
//    busDriver.setDriverName("Thakur Bhanu Pratab");
////    String[] seatTypes= seat.getSeatTypes().split(",");
////    int smallSeats= Integer.parseInt(seatTypes[0]);
////    int LargeSeats= Integer.parseInt(seatTypes[2]);
////    int MediumSeats= Integer.parseInt(seatTypes[1]);
//    busDriverRepository.save(busDriver);
//    busType.setBusFactor(1);
//    busType.setBusType("Volvo");
//    busTypeRepository.save(busType);
//    timing.setFinalSource("Lakeland County");
//    timing.setFinalDestination("Geest");
//    timing.setArrivalTime(new Date());
//    timing.setDepartureTime(new Date());
//    timingRepository.save(timing);
//    bus.setBusName("Bhanu Pratab Travels");
//    bus.setBusDriver(busDriver);
//    bus.setBusNumber("Ak-07-1998");
//    bus.setBusType(busType);
//    bus.setBusTiming(timing);
//
//
//    List<Location> locationList= locationRepository.findAll();
//    List<Location> subloc=locationList.subList(0,7);
////    bus.setLocationList(subloc);
////        bus.getLocationList().add(locationList.get(0));
////        bus.getLocationList().add(locationList.get(1));
////        bus.getLocationList().add(locationList.get(2));
////        bus.getLocationList().add(locationList.get(3));
////        bus.setSeat(seat);
//        BusTicket busTicket = new BusTicket();
//
////        for(int i=0;i<smallSeats;i++)
////        {
////            busTicket.getBusTickets().put(seatFareListSmall.get(i).getSeatName(),true);
////            bus.getSeatFaresList().add(seatFareListSmall.get(i));
////        }
////        for(int i=0;i<MediumSeats;i++)
////        {
////            busTicket.getBusTickets().put(seatFareListMedium.get(i).getSeatName(),true);
////            bus.getSeatFaresList().add(seatFareListMedium.get(i));
////
////        }
////        for(int i=0;i<LargeSeats;i++)
////        {
////            busTicket.getBusTickets().put(seatFareListLarge.get(i).getSeatName(),true);
////            bus.getSeatFaresList().add(seatFareListLarge.get(i));
////        }
//        busTicketRepository.save(busTicket);
//        bus.setBusTicket(busTicket);
//        busRepository.save(bus);
//        busTicket.setBusToTicket(bus);
//        busTicketRepository.save(busTicket);
////        seat.getBusSeatId().add(bus);
//        busDriver.setBusId(bus);
//        busType.setBusTypeId(bus);
//        timing.setBusTimingId(bus);
////        seatRepository.save(seat);
//        busDriverRepository.save(busDriver);
//        busTypeRepository.save(busType);
//        timingRepository.save(timing);
//    }
//    @GetMapping("/")
//    public ResponseEntity<?> getAllData()
//    {
//        List<Bus> busList = busRepository.findAll();
//        return ResponseEntity.ok(busList);
//    }
//@GetMapping("/load")
//    public void loadData()
//    {
//    loadData.loadDataInDatabase();
//    }

    @GetMapping("/")
    public ResponseEntity<?> getData()
    {
        ResponseBody responseBody= new ResponseBody();
        List<ResponseBody> responseBodyList= new ArrayList<>();
        responseBody.setBusDriver("Bus Driver Name");
        responseBody.setBusName("Bhanu Pratab Travels");
        responseBody.setBusNumber("AK-9-1232");
        List<HashMap<String,String>> list= new ArrayList<>();
        List<SeatFare> seatFareList = new ArrayList<>();
        SeatFare seatFare= new SeatFare();
        seatFare.setSeatType("Sleeper");
        seatFare.setSeatPrice(500);
        seatFare.setSeatName("AB12");
        seatFare.setId(1);
        seatFare.setIsWindowSeat("Yes");
        seatFare.setBookingGender("NA");
        seatFare.setIsBooked("No");
        seatFareList.add(seatFare);
        SeatFare seatFare1= new SeatFare();
        seatFare1.setSeatType("Sitting");
        seatFare1.setSeatPrice(400);
        seatFare1.setSeatName("AB13");
        seatFare1.setId(2);
        seatFare1.setIsWindowSeat("No");
        seatFare1.setBookingGender("NA");
        seatFare1.setIsBooked("No");
        seatFareList.add(seatFare1);
        responseBody.setSeatFareList(seatFareList);
//        HashMap<String, String> ticketDetails = new HashMap<>();
//        ticketDetails.put("SeatName","AB12");
//        ticketDetails.put("IsWindowSeat","Yes");
//        ticketDetails.put("isBooked","No");
//        ticketDetails.put("bookingGender","NA");
//        ticketDetails.put("SeatType","Sleeper");
//        ticketDetails.put("price","500");
//        list.add(ticketDetails);
//        HashMap<String, String> ticketDetails1 = new HashMap<>();
//        ticketDetails1.put("SeatName","AB13");
//        ticketDetails1.put("IsWindowSeat","No");
//        ticketDetails1.put("isBooked","No");
//        ticketDetails1.put("bookingGender","NA");
//        ticketDetails1.put("SeatType","Sleeper");
//        ticketDetails1.put("price","400");
//        list.add(ticketDetails1);
//        HashMap<String, String> ticketDetails2 = new HashMap<>();
//        ticketDetails2.put("SeatName","AB14");
//        ticketDetails2.put("IsWindowSeat","Yes");
//        ticketDetails2.put("isBooked","No");
//        ticketDetails2.put("bookingGender","NA");
//        ticketDetails2.put("SeatType","Sitting");
//        ticketDetails2.put("price","400");
//        list.add(ticketDetails2);
//        HashMap<String, String> ticketDetails3 = new HashMap<>();
//        ticketDetails3.put("SeatName","AB14");
//        ticketDetails3.put("IsWindowSeat","Yes");
//        ticketDetails3.put("isBooked","Yes");
//        ticketDetails3.put("bookingGender","F");
//        ticketDetails3.put("SeatType","Sitting");
//        ticketDetails3.put("price","400");
//        list.add(ticketDetails3);
        RouteTable routeTable= new RouteTable();
        routeTable.setId(1);
        routeTable.setStartingPoint("ABC");
        routeTable.setEndingPoint("DEF");
        routeTable.setRouteName("Highway");
        List<PointsTable> pointsTables= new ArrayList<>();
        PointsTable pointsTable= new PointsTable();
        pointsTable.setId(1);
        pointsTable.setLandMark("Near Kormangla");
        pointsTable.setPointName("BUS STOP-41");
        pointsTable.setDepartureTime(new Date());
        pointsTable.setBoardingTime(new Date());
        pointsTables.add(pointsTable);
        PointsTable pointsTable1= new PointsTable();
        pointsTable1.setId(2);
        pointsTable1.setLandMark("Near BTM");
        pointsTable1.setPointName("BUS STOP-40");
        pointsTable1.setDepartureTime( new Date());
        pointsTable1.setBoardingTime(new Date());
        pointsTables.add(pointsTable1);
        routeTable.setRoutePoint(pointsTables);
        HashMap<String,Boolean> booleanHashMap= new HashMap<>();
        booleanHashMap.put("Monday",true);
        booleanHashMap.put("Tuesday",false);
        booleanHashMap.put("Wednesday",true);
        booleanHashMap.put("Thursday",true);
        booleanHashMap.put("Friday",false);
        booleanHashMap.put("Saturday",true);
        routeTable.setRouteAvailability(booleanHashMap);
        responseBody.setRouteTable(routeTable);
        responseBody.setBusType("AC");
        responseBody.setDeparture(new Date());
        responseBody.setArrival(new Date());
        responseBody.setDuration("10hr");
        responseBody.setStartingPrice("210");
        responseBody.setTotalSeats(seatFareList.size());
        responseBodyList.add(responseBody);
        return ResponseEntity.ok(responseBodyList);
    }
}
