package ca.centennialcollege.assign3.model;

import java.util.Date;

public class Ticket {
	private Integer PassengerId;
	private Integer FlightId;
	private Date DepartureDate;
	private Float AmountPaid;
	private String Status;

	public Integer getPassengerId() {
		return PassengerId;
	}

	public void setPassengerId(Integer passengerId) {
		PassengerId = passengerId;
	}

	public Integer getFlightId() {
		return FlightId;
	}

	public void setFlightId(Integer flightId) {
		FlightId = flightId;
	}

	public Date getDepartureDate() {
		return DepartureDate;
	}

	public void setDepartureDate(Date departureDate) {
		DepartureDate = departureDate;
	}

	public Float getAmountPaid() {
		return AmountPaid;
	}

	public void setAmountPaid(Float amountPaid) {
		AmountPaid = amountPaid;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
