package Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servent_details")
public class Servents {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int serventid;
	
	@Column(name="servent_name")
	String serventName;
	
	@Column(name="servent_sal")
	String serventSal;
	
	public int getServentid() {
		return serventid;
	}
	public void setServentid(int serventid) {
		this.serventid = serventid;
	}
	public String getServentName() {
		return serventName;
	}
	public void setServentName(String serventName) {
		this.serventName = serventName;
	}
	public String getServentSal() {
		return serventSal;
	}
	public void setServentSal(String serventSal) {
		this.serventSal = serventSal;
	}
	
}
