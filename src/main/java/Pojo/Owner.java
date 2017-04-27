package Pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="owner_details")
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int ownerid;
	
	@Column(name="owner_name")
	String ownerName;
	
	@Column(name="owner_business")
	String ownerBusiness;
	
	@OneToMany
	@JoinTable(name="owner_servent",joinColumns=@JoinColumn(referencedColumnName="ownerid"),inverseJoinColumns=@JoinColumn(referencedColumnName="serventid"))
	@Cascade(CascadeType.SAVE_UPDATE)
	List<Servents> listServent;
	
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerBusiness() {
		return ownerBusiness;
	}
	public void setOwnerBusiness(String ownerBusiness) {
		this.ownerBusiness = ownerBusiness;
	}
	public List<Servents> getListServent() {
		return listServent;
	}
	public void setListServent(List<Servents> listServent) {
		this.listServent = listServent;
	}
	
	
	
}
