package com.techment.dao;

import java.time.LocalDate;
import java.util.HashMap;

import com.techment.models.Passenger;
import com.techment.models.Train;

public interface ITicketDao {

	String generatePNR(Train train , LocalDate travelDate);
	double calcPassengerFare(Passenger passenger , Train train);
	HashMap<Passenger, Double> addPassenger(Passenger passenger , double passengerFare);
	double calcTotalTicketPrice(HashMap<Passenger, Double> passengersMap);
	String generateTicket(Train train , String pnr , HashMap<Passenger, Double> passengersMap , LocalDate travelDate);
	void writeTicket(String pnr , String ticketString);
	
}
