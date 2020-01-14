package com.redbus.backend_redbus.database;


import com.redbus.backend_redbus.model.Location;
import com.redbus.backend_redbus.model.SeatFare;
import com.redbus.backend_redbus.repository.LocationRepository;
import com.redbus.backend_redbus.repository.SeatFareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
    public class LoadData {
        @Autowired
        private LocationRepository locationRepository;
        @Autowired
        private SeatFareRepository seatFareRepository;
        public void loadDataInDatabase() {
            String csvFile = "seat.csv";
            String line = "";
            String cvsSplitBy = ",";

            try (
                    BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

                while ((line = br.readLine()) != null) {
                    String[] firstRow = line.split(cvsSplitBy);
                    SeatFare seatFare= new SeatFare();
                    seatFare.setSeatName(firstRow[0]);
                    seatFare.setSeatPrice(Integer.parseInt(firstRow[2]));
                    seatFare.setSeatType(firstRow[1]);
                    seatFareRepository.save(seatFare);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            csvFile = "location.csv";
            try (
                    BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

                while ((line = br.readLine()) != null) {
                    String[] firstRow = line.split(cvsSplitBy);
                    Location location= new Location();
//                    location.setStopPoints(firstRow[0]);
                    locationRepository.save(location);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

