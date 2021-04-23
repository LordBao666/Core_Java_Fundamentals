package com.lordbao.book.p07encapsulation;

/**
 * @Author Lord_Bao
 * @Date 2021/4/23 20:05
 * @Version 1.0
 */
public class TestEncapsulation {

    public static void main(String[] args) {
//           var a  = new Employee("jack",1000.0,12);
//            System.out.println(a.totalSalary());
//        System.out.println(totalSalary(a));

        var a = new Employee("Jack", "123", "abc");
        var account = a.getLoginAccount();
        System.out.println(a);
        account.setAccountID("999");
        account.setAccountPassword("kkk");
        System.out.println(a);
    }

//    public  static double totalSalary(Employee a){
//        return  a.getSalary() * a.getWorkMonth();
//    }
}

class Employee {
    private String name;
    //    private long accountID;
//    private long accountPassword;
    // 这个好得多
    private LoginAccount account;
//    private double salary;
//    private int workMonth;
//
//    public Employee(String name, double salary, int workMonth) {
//        this.name = name;
//        this.salary = salary;
//        this.workMonth = workMonth;
//    }

    public Employee(String name, String accountID, String accountPassword) {
        this.name = name;
        this.account = new LoginAccount(accountID, accountPassword);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }

    public LoginAccount getLoginAccount() {
        return account;
    }

    //    public double totalSalary(){
//        return salary * workMonth;
//    }

//    public double getSalary(){
//        return salary;
//    }
//
//    public int getWorkMonth(){
//        return workMonth;
//    }

}

class LoginAccount {
    private String accountID;
    private String accountPassword;

    public LoginAccount(String accountID, String accountPassword) {
        this.accountID = accountID;
        this.accountPassword = accountPassword;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    @Override
    public String toString() {
        return "LoginAccount{" +
                "accountID=" + accountID +
                ", accountPassword=" + accountPassword +
                '}';
    }
}