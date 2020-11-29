package service;

import java.util.ArrayList;

import dao.FlightDao;
import dao.FlightDaoImple;
import dto.Flight;

public class FlightServiceImple implements FlightService {

	private FlightDao flightDao;
	public FlightServiceImple() {
		flightDao = new FlightDaoImple();
	}
	@Override
	public ArrayList<Flight> showFlight() {
		
		return flightDao.getFlights();
	}

	@Override
	public int editFlight(Flight flight) {
		return flightDao.updateFlight(flight);
	}

	@Override
	public int addFlight(Flight flight) {
		return flightDao.insertFlight(flight);
	}

	@Override
	public int removeFlight(int flight_no) {
		return flightDao.deleteFlight(flight_no);
	}
	@Override
	public Flight getDetail(int flight_id) {
		
		return flightDao.showDetails(flight_id);
	}

}
