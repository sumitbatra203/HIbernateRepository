package Pojo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
//@Table(name="students_table_1")
//@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("baseclass")
@Table(name="student_table_pc")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Students {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	private String name;
	private String age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	
}
