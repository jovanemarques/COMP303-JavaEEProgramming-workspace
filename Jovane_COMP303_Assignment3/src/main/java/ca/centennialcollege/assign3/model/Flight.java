package ca.centennialcollege.assign3.model;

import java.util.Date;

public class Flight {
	private Integer FlightId;
	private String AirlineName;
	private String DepartAirport;
	private String ArrivalAirport;
	private Date DepartTime;
	private Date ArrivalTime;
	private String Duration;
	private Integer TotalSeats;

	public Flight(Integer id, String airlineName, String departAirport, String arrivalAirport, Date departTime,
			Date arrivalTime, String duration, Integer totalSeats) {
		this.FlightId = id;
		this.AirlineName = airlineName;
		this.DepartAirport = departAirport;
		this.ArrivalAirport = arrivalAirport;
		this.DepartTime = departTime;
		this.ArrivalTime = arrivalTime;
		this.Duration = duration;
		this.TotalSeats = totalSeats;
	}

	public String getAirlineName() {
		return AirlineName;
	}

	public void setAirlineName(String airlineName) {
		AirlineName = airlineName;
	}

	public String getDepartAirport() {
		return DepartAirport;
	}

	public void setDepartAirport(String departAirport) {
		DepartAirport = departAirport;
	}

	public String getArrivalAirport() {
		return ArrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		ArrivalAirport = arrivalAirport;
	}

	public Date getDepartTime() {
		return DepartTime;
	}

	public void setDepartTime(Date departTime) {
		DepartTime = departTime;
	}

	public Date getArrivalTime() {
		return ArrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		ArrivalTime = arrivalTime;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public Integer getTotalSeats() {
		return TotalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		TotalSeats = totalSeats;
	}

	public Integer getFlightId() {
		return FlightId;
	}

	public void setFlightId(Integer flightId) {
		FlightId = flightId;
	}
}
