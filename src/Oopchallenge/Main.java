package Oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("raj",24,new Eye("left Eye","short sighted","blue",true),
                new Eye("Right Eye","normal","blue",false),
                new Heart("Heart","normal",65),
                new Stomach("Stomach","PUD",false),
                new Skin("Skin","Burned","White",40));
        System.out.println("Name "+ patient.getName());
        System.out.println("Age "+ patient.getAge());
        Scanner scan = new Scanner(System.in);

        boolean shouldFinish = false;
        while(!shouldFinish){
            System.out.println("Choose an organ: "+ "\n\t1.Left Eye"+ "\n\t2.Right Eye"+"\n\t3.Heart" +
                    "\n\t4.Stomach" +
                    "\n\t5.Skin" +
                    "\n\t6.Quit");
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpened()){
                        System.out.println("\n\t1.Close the Eye");
                        if(scan.nextInt()==1){
                            patient.getLeftEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1.Open the Eye");
                        if (scan.nextInt()==1){
                            patient.getLeftEye().open();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpened()){
                        System.out.println("\n\t1.Close the Eye");
                        if(scan.nextInt()==1){
                            patient.getRightEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1.Open the Eye");
                        if (scan.nextInt()==1){
                            patient.getRightEye().open();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if(scan.nextInt()==1){
                        System.out.println("Enter the new Heart rate");
                        int newHeartRate = scan.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to: "+ patient.getHeart().getRate());
                    }else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1.Digest");
                    if(scan.nextInt()==1){
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
            }

        }
    }
}
