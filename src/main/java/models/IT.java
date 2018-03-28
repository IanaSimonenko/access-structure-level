package models;

import Employee.Employee;
import src.Rooms;

public class IT implements Employee{

    private String nameOfDepartment;
    private String nameOfEmployee;
    private String login;
    private String password;

    public IT() {

    }

    public IT(String nameOfDepartment, String nameOfEmployee, String login, String password, int numberOfRoom) {
        this.nameOfDepartment = nameOfDepartment;
        this.nameOfEmployee = nameOfEmployee;
        this.login = login;
        this.password = password;
    }

    public String getNamePosition() {
        return nameOfDepartment;
    }

    public void setNamePosition(String namePosition) {
        this.nameOfDepartment = namePosition;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Rooms accessLevel(boolean level) {
        if (level) {
            return Rooms.IT_SERVERS;
        } else {
            return Rooms.IT_OPENSPACE;
        }
    }
}
