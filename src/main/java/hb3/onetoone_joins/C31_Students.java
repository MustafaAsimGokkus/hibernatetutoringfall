package hb3.onetoone_joins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class C31_Students {
    @Id
    private int std_id;
    @Column(name = "std_name")
    private String name;
    private int grade;
    
    @OneToOne(mappedBy = "student")
    private C32_Diary diary;
    
    
    public C31_Students() {
    }
    
    public C31_Students(int std_id, String name, int grade, C32_Diary diary) {
        
        this.std_id = std_id;
        this.name = name;
        this.grade = grade;
        this.diary = diary;
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
    public C32_Diary getDiary() {
        return diary;
    }
    public void setDiary(C32_Diary diary) {
        this.diary = diary;
    }
    @Override
    public String toString() {
        return "C31_Students [std_id=" + std_id + ", name=" + name + ", grade=" + grade + ", diary=" + diary + "]";
    }
    
    
    
}
