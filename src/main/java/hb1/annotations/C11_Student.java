package hb1.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
/*Entity create a table in database and class instance will be rows in table
  Entity with name="" it will change table name in java and in db.


*/

@Entity
public class C11_Student {
	
	@Id  //makes this variable PK
	private int std_id;
	@Column(name="std_name")
	private String name;
	
	@Transient // used not to add in db as a field
	private int grade;
	
	
	public C11_Student() {
		super();
	}


	public C11_Student(int std_id, String name, int grade) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.grade = grade;
	}


	
	public int getStd_id() {
		return std_id;
	}


	
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}


	
	public String getName() {
		return name;
	}


	
	public void setName(String name) {
		this.name = name;
	}


	
	public int getGrade() {
		return grade;
	}


	
	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "C11_Student [std_id=" + std_id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	

}
