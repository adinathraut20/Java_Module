package service;

import java.util.ArrayList;

import dto.Flight;

public interface FlightService {
	ArrayList<Flight> showFlight(); 
	int editFlight(Flight flight); 
	int addFlight(Flight flight);
	int removeFlight(int flight_no);
	Flight getDetail(int flight_id);
	
}
