package entities;

import java.util.Scanner;

public class Triangle {
    private int canhA; //1
    private int canhB; //2
    private int canhC; //3


    public int nhapCanhA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh A: ");
        int ca = Integer.parseInt(sc.next());
        this.canhA = ca;
        return ca;
    }

    public int nhapCanhB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh B: ");
        int cb = Integer.parseInt(sc.nextLine());
        this.canhB = cb;
        return cb;
    }

    public int nhapCanhC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh C: ");
        int cc = Integer.parseInt(sc.nextLine());
        this.canhC = cc;
        return cc;
    }

    public int getCanhA() {
        return this.canhA;
    }

    public int getCanhB() {
        return this.canhB;
    }

    public int getCanhC() {
        return this.canhC;
    }

    public void xuatTamGiac(){
        System.out.println("Cạnh a: " + this.canhA);
        System.out.println("Cạnh b: " + this.canhB);
        System.out.println("Cạnh c: " + this.canhC);
    }

    //Tạo 1 hàm tính chu vi: tinhChuVi
    // trả về integer, kiểu public

    public int tinhChuvi (){
        int chuvi=0;
        chuvi=this.canhA+ this.canhB+this.canhC;
        return chuvi;
    }


}
