package models;

import Employee.Employee;
import src.Rooms;

public class Accounting implements Employee {

    private String nameOfDepartment;
    private String nameOfEmployee;
    private String login;
    private int password;

    public Accounting() {

    }

    public Accounting(String nameOfDepartment, String nameOfEmployee, String login, int password, int numberOfRoom) {
        this.nameOfDepartment = nameOfDepartment;
        this.nameOfEmployee = nameOfEmployee;
        this.login = login;
        this.password = password;
    }

    public String getOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String namePosition) {
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public Rooms accessLevel(boolean level) {

        if (level) {
            return Rooms.ACCOUNTING_HEAD_ROOM;
        } else {
            return Rooms.ACCOUNTING_OPENSPACE;
        }
    }
}
