package Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="vehicle_info")
public class Vehicle {
	
	@Id
	@GeneratedValue
	@Column(name="vechile_id")
	private Integer vehicleId;
	
	@Column(name="vechicle_name")
	private String vehicleName;
	
	@Column(name="vechile_price")
	private Double vechiclePrice;
	
	public Integer getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Double getVechiclePrice() {
		return vechiclePrice;
	}
	public void setVechiclePrice(Double vechiclePrice) {
		this.vechiclePrice = vechiclePrice;
	}
	
	
}
