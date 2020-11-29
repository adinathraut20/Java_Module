package dao;

import java.util.ArrayList;

import dto.Flight;

public interface FlightDao {
	ArrayList<Flight> getFlights(); 
	int updateFlight(Flight flight); 
	int insertFlight(Flight flight);
	int deleteFlight(int flight_no);
	Flight showDetails(int flight_id);
}
