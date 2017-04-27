package Pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="user_details")
public class UserDetails implements Serializable {

	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name="user_name")
	String username;
	
	@ElementCollection(fetch=FetchType.LAZY)	
	@JoinTable(name="user_address",joinColumns=@JoinColumn(name="user_id"))
//	@GenericGenerator(strategy="sequence" ,name="seq_gen")
	@GenericGenerator(strategy="hilo", name = "hilo-gen")
    @CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type="long"))
//	@CollectionTable(name="user_address",joinColumns=@JoinColumn(name="address_id"))
	Collection<Address> listOfAddress=new ArrayList<Address>();;
	
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}
	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
