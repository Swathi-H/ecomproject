package statge2.ecommerce.onlinemarketbackend.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Address implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
@NotEmpty(message="should not be empty")
private String houseNo;
@NotEmpty(message="should not be empty")
private String street;
@NotEmpty(message="should not be empty")
private String city;
@NotEmpty(message="should not be empty")
private String state;
@NotEmpty(message="should not be empty")
private String Country;
@NotEmpty(message="should not be empty")
private String pin;
@ManyToOne(cascade=CascadeType.ALL)
private Users users;

/**
 * @return the id
 */
public Integer getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Integer id) {
	this.id = id;
}
/**
 * @return the houseNo
 */
public String getHouseNo() {
	return houseNo;
}
/**
 * @param houseNo the houseNo to set
 */
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}
/**
 * @return the street
 */
public String getStreet() {
	return street;
}
/**
 * @param street the street to set
 */
public void setStreet(String street) {
	this.street = street;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the country
 */
public String getCountry() {
	return Country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	Country = country;
}
/**
 * @return the pin
 */
public String getPin() {
	return pin;
}
/**
 * @param pin the pin to set
 */
public void setPin(String pin) {
	this.pin = pin;
}
/**
 * @return the user
 */
public Users getUsers() {
	return users;
}
/**
 * @param user the user to set
 */
public void setUsers(Users users) {
	this.users = users;
}


}