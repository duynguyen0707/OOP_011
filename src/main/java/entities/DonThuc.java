package entities;

import java.util.Scanner;

public class DonThuc {

    public static String nhapDonThuc (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 đơn thức: ");
        String dt = sc.nextLine();
        return dt;
    }



}
