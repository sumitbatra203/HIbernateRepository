package Pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="art_table")
//@DiscriminatorValue("artstudent")
@AttributeOverrides({
			@AttributeOverride(name="id",column=@Column(name="id")),
			@AttributeOverride(name="age",column=@Column(name="age"))
})
public class ArtStudent extends Students {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
