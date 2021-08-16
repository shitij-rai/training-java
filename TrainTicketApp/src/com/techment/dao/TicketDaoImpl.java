package com.techment.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.techment.models.Passenger;
import com.techment.models.Train;
//import com.techment.util.TrainCollection;

public class TicketDaoImpl implements ITicketDao{

//	TrainCollection trainCollection = new TrainCollection();
//	Train train = new Train();
	HashMap<Passenger, Double> passengersMap = new HashMap<Passenger, Double>();
	
	public static int pnrCounter = 100;
	
	@Override
	public double calcPassengerFare(Passenger passenger , Train train) {
		double ticketFare = train.getTicketPrice();
		if(passenger.getAge() <= 12)
			ticketFare /= 2;
		else if(passenger.getAge() >= 60)
			ticketFare = (ticketFare)*(6/10);
		if(passenger.getGender() == 'F')
			return ticketFare*(0.75);
		else 
			return ticketFare;
	}
	@Override
	public String generatePNR(Train train , LocalDate travelDate) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String travelDateId = travelDate.format(formatter);
		String PNR = train.getSource().substring(0, 1) + train.getDestination().charAt(0) + "_" + travelDateId + "_" + pnrCounter ;
		pnrCounter++;
		return PNR;
	}
	
	@Override
	public HashMap<Passenger, Double> addPassenger(Passenger passenger , double passengerFare) {

		HashMap<Passenger, Double> passengersMap = new HashMap<Passenger, Double>();
		ArrayList<Passenger> passengers = new ArrayList<Passenger>();
//		Passenger passenger = new Passenger(name, age, gender);
		passengers.add(passenger);
		for(Passenger p : passengers)
			passengersMap.put(p, passengerFare);
		return passengersMap;
	}
	
	@Override
	public double calcTotalTicketPrice(HashMap<Passenger, Double> passengersMap) {

		double totalTicketPrice = 0;
		for(Double fare : passengersMap.values())
			totalTicketPrice += fare;
		return totalTicketPrice;
	}
	
	@Override
	public String generateTicket(Train train , String pnr , HashMap<Passenger, Double> passengersMap , LocalDate travelDate ) {

//			String pnr = generatePNR(train, travelDate);
//			String path = "C:\\Users\\Shitij Rai\\eclipse-workspace\\TrainTicketApp\\src\\com\\techment\\dao\\" + pnr ;
//			FileWriter fw = new FileWriter(path + ".txt");
//			BufferedWriter br = new BufferedWriter(fw);
				
		String passengerDetails = "\n\nPassengers : \nName\t\tAge\t\tGender\t\tFare\n";
			
		for(Entry<Passenger, Double> pm : passengersMap.entrySet()) {
			passengerDetails += pm.getKey().getName() + "\t\t" + pm.getKey().getAge() + "\t\t" + pm.getKey().getGender() + "\t\t" + pm.getValue() + "\n";
		}
			
		return passengerDetails;
		
	}
	
	@Override
	public void writeTicket(String pnr , String ticketString) {

//		String pnr = generatePNR(train, travelDate);
		String path = "C:\\Users\\Shitij Rai\\eclipse-workspace\\TrainTicketApp\\src\\com\\techment\\dao\\" + pnr ;

		FileWriter fw;
		try {
			fw = new FileWriter(path + ".txt");
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write(ticketString);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
