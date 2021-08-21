package com.khubaib;

import java.util.Scanner;

public class Employee{

    String firstName;
    String lastName;
    double mSalary;

    //class for each employee
    Employee(String fN, String lN, double mS){

        firstName = fN;
        lastName = lN;

        if (mSalary < 0){
            mSalary = 0;
        }
        else{
            mSalary = mS;
        }

    }

    //yearly salary
    double yearSal(){

        return  12*mSalary;
    }

    //yearly salary with 10% increase
    double raisedYearSal(){
        return 12*mSalary*1.1;
    }
}



class EmployeeTesting {

    //main
    public static void main(String[] args) {

        //input variable
        Scanner input = new Scanner(System.in);

        //input for employee 1
        System.out.println("FOR EMPLOYEE 1");
        System.out.print("First Name: ");
        String firstName1 = input.next();
        System.out.print("Last name: ");
        String lastName1 = input.next();
        System.out.print("monthly salary: ");
        double monthSal1 = input.nextDouble();

        System.out.println();

        //input for employee 2
        System.out.println("FOR EMPLOYEE 2");
        System.out.print("First Name: ");
        String firstName2 = input.next();
        System.out.print("Last name: ");
        String lastName2 = input.next();
        System.out.print("monthly salary: ");
        double monthSal2 = input.nextDouble();

        //calling the class
        Employee employee_1 = new Employee(firstName1, lastName1, monthSal1);
        Employee employee_2 = new Employee(firstName2, lastName2, monthSal2);

        //info of employee 1
        System.out.println("FOR EMPLOYEE 1\n First Name: "+employee_1.firstName+"\n Last Name: "+employee_1.lastName+"\n Yearly Salary: Rs. "
                +employee_1.yearSal());

        System.out.println();
        //info of employee 2
        System.out.println("FOR EMPLOYEE 2\n First Name: "+employee_2.firstName+"\n Last Name: "+employee_2.lastName+"\n Yearly Salary: Rs. "
                +employee_2.yearSal());

        System.out.println();

        //salary after 10% increase
        System.out.println("AFTER GIVING THEM TWO A 10% RAISE:");

        System.out.println("Yearly salary of employee 1: Rs. "+employee_1.raisedYearSal());
        System.out.println("Yearly salary of employee 2: Rs. "+employee_2.raisedYearSal());
    }
}
