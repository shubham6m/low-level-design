package inheritance;

public class Mentor extends User{
    private String userName;
    private String password;
    private int salary;

    void changeUsername(String newUsername){
        userName = newUsername;
    }

    void changePassword(String newPassword){
        password = newPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
