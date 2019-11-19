package ca.centennialcollege.assign3.model;

public class Passenger {
	private Integer PassengerId;
	private String FirstName;
	private String LastName;
	private String Address;
	private String City;
	private String Country;
	private String Telephone;
	private String Email;

	public Passenger() {
	}

	public Passenger(Integer id, String fisrtName, String lastName, String address, String city, String country,
			String telephone, String email) {
		this.PassengerId = id;
		this.FirstName = fisrtName;
		this.LastName = lastName;
		this.Address = address;
		this.City = city;
		this.Country = country;
		this.Telephone = telephone;
		this.Email = email;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getPassengerId() {
		return PassengerId;
	}

	public void setPassengerId(Integer passengerId) {
		PassengerId = passengerId;
	}
}
