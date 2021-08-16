package com.techment.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

import com.techment.dao.ITicketDao;
import com.techment.dao.ITrainDao;
import com.techment.dao.TicketDaoImpl;
import com.techment.dao.TrainDaoImpl;
import com.techment.models.Passenger;
import com.techment.models.Train;

public class TicketApplication {

	public static void main(String[] args) {

		System.out.println("---------- Train Ticket Application ----------");
		Scanner scanner = new Scanner(System.in);
		
		ITrainDao trainObj = new TrainDaoImpl();
		ITicketDao ticketObj = new TicketDaoImpl();
		
		System.out.println("Enter the Train No. : ");
		int trainNo = scanner.nextInt();
		Train train = trainObj.findTrain(trainNo);
		if(train == null)
			System.out.println("Train with given train number does not exist.");
		else 
		{	
			System.out.println("Enter the travel date : ");
			String inputDate = scanner.next();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate travelDate = LocalDate.parse(inputDate, formatter);
			
			LocalDate today = LocalDate.now();

			if(!travelDate.isAfter(today))
				System.out.println("Travel Date is before Current Date.");
			else
			{
				HashMap<Passenger, Double> passengersMap = new HashMap<Passenger, Double>();
				
				System.out.println("Enter the no. of Passengers : ");
				int noOfPassengers = scanner.nextInt();
				
				String PNR = ticketObj.generatePNR(train, travelDate);
				
				for(int i=0;i<noOfPassengers;i++) {
					System.out.println("Enter Passenger Name : ");
					String passengerName = scanner.nextLine();
					passengerName += scanner.nextLine();
					
					System.out.println("Enter Age : ");
					int age = scanner.nextInt();
					
					System.out.println("Enter Gender (M/F) : ");
					String gender = scanner.next();
					
					Passenger passenger = new Passenger(passengerName, age, gender.charAt(0));
					double passengerFare = ticketObj.calcPassengerFare(passenger , train);
					passengersMap.putAll(ticketObj.addPassenger(passenger , passengerFare));
					
				}
				scanner.close();
				double totalTicketPrice = ticketObj.calcTotalTicketPrice(passengersMap);
				
				String trainDetails = "PNR\t\t: "+ PNR + "\n" + "Train No.\t\t: " + train.getTrainNo() + "\n" + 
						"Train Name\t\t: " + train.getTrainName() + "\n" + "From\t\t: " + train.getSource() + "\n" + "To\t\t: " + train.getDestination() + "\n"
						+ "Travel Date\t\t: " + travelDate ;
				String passengerDetails = ticketObj.generateTicket(train, PNR, passengersMap, travelDate);
				String ticketDetails = trainDetails + passengerDetails + "\nTotal Price : " + totalTicketPrice;;
				System.out.println(ticketDetails);
				ticketObj.writeTicket(PNR, ticketDetails);
			}
			
		}
		
	}

}
