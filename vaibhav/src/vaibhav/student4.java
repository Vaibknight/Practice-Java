package vaibhav;

import java.util.*;

class ssdemo {

  public
  int RollNo;
  String Name;
  int java;
  int dsa;
  int os;
  int coa;
  int maths;

 public  void input() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your Name ");
    this.Name = sc.nextLine();

    System.out.println("Enter Your RollNO ");
    this.RollNo = sc.nextInt();

    System.out.println("Enter java marks ");
    this.java = sc.nextInt();

    System.out.println("Enter dsa marks ");
    this.dsa = sc.nextInt();

    System.out.println("Enter os marks ");
    this.os = sc.nextInt();

    System.out.println("Enter Coa marks ");
    this.coa = sc.nextInt();

    System.out.println("Enter Maths marks ");
    this.maths = sc.nextInt();

    sc.close();
  }

  int ctotal() {

    return this.java + this.dsa + this.os + this.coa + this.maths;
  }

 public void show() {
    System.out.println("Your Roll No = " + this.RollNo);
    System.out.println("Your Name is = " + this.Name);
    int total = ctotal();
    double avg = total / 5;
    System.out.println("Your total marks = " + total + " avg percentage  = " + avg);
  }


}

public class student4{
  public static void main(String[] args)throws exception e {

     ssdemo s = new ssdemo();
    s.input();
    s.show();

  }
}