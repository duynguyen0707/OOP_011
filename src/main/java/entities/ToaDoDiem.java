package entities;

// tạo 1 class Toadodiem

import java.util.Scanner;

public class ToaDoDiem {
    //khai báo hai toa độ điểm x và y, kiểu int, phạm vi private;
    private int x = 0;
    private int y = 0;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Tạo hàm nhập tọa độ điểm kiểu void, phạm vi public để người dùng nhập tọa độ từ bàn phím
    public void nhapToaDo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tọa độ x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tọa độ y: ");
        int y = Integer.parseInt(sc.nextLine());

        this.x = x;
        this.y = y;
    }

    // tạo hàm xuất tọa độ điểm kiểu void, phạm vi là public, in ra điểm x, và y
    public void xuatToaDo() {
        System.out.print("Tọa độ x: " + this.x);
        System.out.print("Tọa độ x: " + this.y);
    }

    public double khoangCachAB(ToaDoDiem tdB) {

        double ds = 0;

        int diemA = (int) Math.pow(tdB.getX() - this.getX(), 2);
        System.out.println("diem A: " + diemA);
        int diemB = (int) Math.pow((tdB.getY() - this.getY()), 2);
        System.out.println("diem B: " + diemB);
        System.out.println("diem B: " + (int) Math.sqrt(diemA + diemB));
        double n = Math.sqrt(21);
        System.out.println(n);
        return ds = Math.floor(Math.sqrt((double) diemA + (double) diemB));

    }


}
