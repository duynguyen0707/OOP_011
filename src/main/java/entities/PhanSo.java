package entities;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public int getTu() {
        return this.tuSo;
    }

    public int getMau() {
        return this.mauSo;
    }

    //    public String getDisplayString(){
//        return String.format("%d/%d\n", this.tuSo, this.mauSo);
//    }
    @Override
    public String toString() {
        return String.format("%d/%d", this.tuSo, this.mauSo);
    }

    // static operation: dùng hàm ko cần tạo object/instance ko thuộc lớp: Hậu quả: Hàm này ko sử dụng các field/data cua phanso
    //operation: dùng hàm bắt buộc tạo object/instance thuộc lớp- có thể sử dụng được các field/data thông qua từ khóa this

    public void print() {
        if (this.mauSo == 1) {

            System.out.format("%d\n", this.tuSo);
        } else
            System.out.format("%d/%d\n", this.tuSo, this.mauSo);

    }

    public void init(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static String inputPhanso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phân số a/b: ");
        String abc = sc.nextLine();
        return abc;

    }

    public static PhanSo fromString(String str) {
        PhanSo ps = new PhanSo();

        String[] parts = str.split("/");
        ps.tuSo = Integer.parseInt(parts[0]);
        ps.mauSo = Integer.parseInt(parts[1]);
        return ps;

    }

//    public static PhanSo fromString(String str) {
//        String[] parts= str.split("/");
//        this.tuSo=Integer.parseInt(parts[0]);
//        this.mauSo=Integer.parseInt(parts[1]);
//
//    }


    private static int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else b -= a;
        }
        return a;
    }


    public void rutGonPhanSo() {
        int ucsln = timUSCLN(Math.abs(tuSo), Math.abs(mauSo));
        this.tuSo = tuSo / ucsln;
        this.mauSo = mauSo / ucsln;
    }

    public boolean isToiGian() {
        int ucsln = timUSCLN(tuSo, mauSo);
        if (ucsln == 1) {
            return true;
        }
        return false;
    }

    public PhanSo congPhanSo(PhanSo ps) {
        this.tuSo = (this.tuSo * ps.mauSo) + (this.mauSo * ps.tuSo);
        this.mauSo = this.mauSo * ps.mauSo;
        rutGonPhanSo();

        return ps;
    }

    public PhanSo truPhanSo(PhanSo ps) {
        this.tuSo = (this.tuSo * ps.mauSo) - (this.mauSo * ps.tuSo);
        this.mauSo = this.mauSo * ps.mauSo;
        rutGonPhanSo();
        return ps;
    }

    public PhanSo tichPhanSo(PhanSo ps) {
        this.tuSo = (this.tuSo * ps.tuSo);

        this.mauSo = this.mauSo * ps.mauSo;

        rutGonPhanSo();
        // System.out.println(ps.tuSo+"/" + ps.mauSo);
        return ps;


    }
    //So sánh hai phân số

    public int compareTo(PhanSo another) {
        int t1 = this.tuSo * another.mauSo;
        int t2 = this.mauSo * another.tuSo;

        if (t1 > t2)
            return 1;
        if (t1 < t2)
            return -1;
        return 0;
    }

}
