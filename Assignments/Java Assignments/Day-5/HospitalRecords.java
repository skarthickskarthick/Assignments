package org.example.Day_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;

class MedicalRecord
{
    int recordId;
    String patientName;
    LocalDate dateOfVisit;
    String diagnosis;
    public void inputRecordDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the record id");
         recordId=sc.nextInt();
         sc.nextLine();
        System.out.println("enter the patient name");
        patientName=sc.nextLine();
        System.out.println("enter the dateofvisit in dd-mm-yyyy format");
        String dat=sc.nextLine();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        dateOfVisit=LocalDate.parse(dat,dateTimeFormatter);
        System.out.println("enter the diagnosis");
        diagnosis=sc.nextLine();
    }
        public void displayRecord()
        {
            System.out.println("record id: "+recordId+"  patient name: "+patientName+"  dateofvisit: "+dateOfVisit+"  diagnosis: "+diagnosis);
        }
}
class InPatientRecord extends MedicalRecord
{
   int roomNumber;
   int numberOfDaysAdmitted;
   double roomCharges;
   double calc;
void calculateTotalCharges()
{
    calc= numberOfDaysAdmitted*roomCharges;
}
    public void inputRecordDetails()
    {
        super.inputRecordDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the room no.");
        roomNumber=sc.nextInt();
        System.out.println("enter the number of days admitted");
        numberOfDaysAdmitted=sc.nextInt();
        System.out.println("enter the room charges");
        roomCharges= sc.nextDouble();

    }
public void displayRecord()
{
    super.displayRecord();
    System.out.println("room no: "+roomNumber+"  number of days admitted: "+numberOfDaysAdmitted+"  room charges: "+roomCharges+"  calculated charges: "+calc);
}//to include all details, including total charges.


}
class OutPatientRecord extends MedicalRecord
{
   String doctorName;
   double consultationFee;
    public void inputRecordDetails()
    {
        super.inputRecordDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the doctor name");
        doctorName=sc.nextLine();
        System.out.println("enter the consultancy fee");
        consultationFee=sc.nextDouble();
    }
public void  displayRecord()
{
    super.displayRecord();
    System.out.println("doctor name: "+doctorName+"  fees: "+consultationFee);
}
}
public class HospitalRecords {
    public static void main(String args[])
    {
        System.out.println("In Patient Details");
        InPatientRecord inPatientRecord=new InPatientRecord();
        inPatientRecord.inputRecordDetails();
        inPatientRecord.calculateTotalCharges();
        inPatientRecord.displayRecord();

        System.out.println("Out Patient Details");
        MedicalRecord medicalRecordout=new OutPatientRecord();
        medicalRecordout.inputRecordDetails();
        medicalRecordout.displayRecord();

    }
}
