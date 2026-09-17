package inheritance;

public class Student extends User{
    private int rollNo;
    private String section;
    
    void changeSection(String newSection){
        section = newSection;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    
}
