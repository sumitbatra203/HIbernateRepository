package Pojo;

import java.util.Set;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="catgory_info_2")
public class Categories {
	
	@Id
	@Column(name="cat_id")
	private int catid;
	
	@Column(name="cat_name")
	private String catname;
	
	@ManyToMany(targetEntity=Items.class,cascade=CascadeType.ALL)
	@JoinTable(name="categories_items_2",joinColumns=@JoinColumn(name="cat_id_fk",referencedColumnName="cat_id"),inverseJoinColumns=@JoinColumn(name="item_id_fk",referencedColumnName="item_id"))
	//@Cascade(value = {CascadeType.ALL})
	private Set itemSet;

	public Set getItemSet() {
		return itemSet;
	}

	public void setItemSet(Set itemSet) {
		this.itemSet = itemSet;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}
	
	

}
