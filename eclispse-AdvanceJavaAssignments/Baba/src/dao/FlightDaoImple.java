package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import connect.MyConn;
import dto.Flight;

public class FlightDaoImple implements FlightDao {
	
	private MyConn myConn;
	
	public FlightDaoImple() {
		myConn = new MyConn();
	}

	@Override
	public ArrayList<Flight> getFlights() {
		ArrayList<Flight> l = new ArrayList<>();
		try {
		Connection con = myConn.getConn();
		PreparedStatement s = con.prepareStatement("select * from flight");
	
		ResultSet rs = s.executeQuery();
		while(rs.next()) {
			Flight flt = new Flight();
			flt.setFlightId(rs.getInt(1));
			flt.setSource(rs.getString(2));
			flt.setDestination(rs.getString(3));
			flt.setDate(rs.getString(4));
			flt.setTime(rs.getString(5));
			flt.setSeatsEconomy(rs.getInt(6));
			flt.setSeatsBuisness(rs.getInt(7));
			flt.setAmountEconomy(rs.getDouble(8));
			flt.setAmountBuisness(rs.getDouble(9));
			l.add(flt);
		}
		
		con.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public int updateFlight(Flight flight) {
		int i = 0;
		if(flight.getSource().toLowerCase().equals(flight.getDestination().toLowerCase())) {
			return i;
		}
		
		
		try {
			
		Connection con = myConn.getConn();
		PreparedStatement s = con.prepareStatement("UPDATE flight SET flight_source = ?, flight_destination = ?, flight_date = ?, flight_time = ?, flight_seats_economy = ?, flight_seats_buisness = ?, flight_amount_economy = ?, flight_amount_buisness = ? WHERE (flight_id = ?);");
		s.setString(1, flight.getSource());
		s.setString(2, flight.getDestination());
		s.setString(3, flight.getDate());
		s.setString(4, flight.getTime());
		s.setInt(5, flight.getSeatsEconomy());
		s.setInt(6, flight.getSeatsBuisness());
		s.setDouble(7, flight.getAmountEconomy());
		s.setDouble(8, flight.getAmountBuisness());
		s.setDouble(9, flight.getFlightId());
		//System.out.println(flight.getFlightId()+" "+flight.getSource());
		i = s.executeUpdate();
		con.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertFlight(Flight flight) {
		int i = 0;
		if(flight.getSource().toLowerCase().equals(flight.getDestination().toLowerCase())) {
			return i;
		}
		try {
		Connection con = myConn.getConn();
		PreparedStatement s = con.prepareStatement("INSERT INTO flight (flight_source, flight_destination, flight_date, flight_time, flight_seats_economy, flight_seats_buisness, flight_amount_economy, flight_amount_buisness) VALUES (?,?,?,?,?,?,?,?)");
		s.setString(1, flight.getSource());
		s.setString(2, flight.getDestination());
		s.setString(3, flight.getDate());
		s.setString(4, flight.getTime());
		s.setInt(5, flight.getSeatsEconomy());
		s.setInt(6, flight.getSeatsEconomy());
		s.setDouble(7, flight.getAmountEconomy());
		s.setDouble(8, flight.getAmountBuisness());
		
		i = s.executeUpdate();
		//System.out.println(flight);
		con.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteFlight(int flight_no) {
		int i = 0;
		try {
		Connection con = myConn.getConn();
		PreparedStatement s = con.prepareStatement("delete from flight where flight_id = ?;");
		s.setInt(1, flight_no);
		i = s.executeUpdate();
		con.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Flight showDetails(int flight_id) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from flight where flight_id = ? ");
			s.setInt(1, flight_id);
			
			ResultSet rs = s.executeQuery();
			Flight flt = new Flight();
			if(rs.next()) {
				
				flt.setFlightId(rs.getInt(1));
				flt.setSource(rs.getString(2));
				flt.setDestination(rs.getString(3));
				flt.setDate(rs.getString(4));
				flt.setTime(rs.getString(5));
				flt.setSeatsEconomy(rs.getInt(6));
				flt.setSeatsBuisness(rs.getInt(7));
				flt.setAmountEconomy(rs.getDouble(8));
				flt.setAmountBuisness(rs.getDouble(9));
			}
			con.close();
			return flt;
			}catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				return null;
			}
			
	}

}
