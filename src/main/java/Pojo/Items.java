package Pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="item_info_2")
public class Items {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemid;
	
	@Column(name="item_name")
	private String itemname;
	
	
	@ManyToMany(targetEntity=Categories.class,mappedBy="itemSet")
	//@JoinColumn(name="cat_id",referencedColumnName="cat_id")
	//@Cascade(value = {CascadeType.ALL})
	private Set catset;
	
	public Set getCatset() {
		return catset;
	}
	public void setCatset(Set catset) {
		this.catset = catset;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
}
