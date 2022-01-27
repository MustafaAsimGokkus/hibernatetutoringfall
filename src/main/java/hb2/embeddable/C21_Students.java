package hb2.embeddable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class C21_Students {
    @Id
    private int std_id;
    @Column(name="std_name")
    private String name;
    private int grade;
    
    private C22_Courses courses;
    
    
    public C21_Students() {
    
    }
    public C21_Students(int std_id, String name, int grade, C22_Courses courses) {
    super();
    this.std_id = std_id;
    this.name = name;
    this.grade = grade;
    this.courses = courses;
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
    public C22_Courses getCourses() {
        return courses;
    }
    public void setCourses(C22_Courses courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "C21_Students [std_id=" + std_id + ", name=" + name + ", grade=" + grade + ", courses=" + courses + "]";
    }
    
    
    
    
    
    
}
