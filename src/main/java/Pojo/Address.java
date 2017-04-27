package Pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Embeddable
//@Table(name="user_address")
public class Address implements Serializable {
	

//	@Column(name="address_id")
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	int id;
	
	@Column(name="city")
	String city;
	
	@Column(name="zipcode")
	String zipcode;
	
	@Column(name="state")
	String state;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
