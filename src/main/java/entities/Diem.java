package entities;

// tạo 1 class Toadodiem

import java.util.Scanner;

public class Diem {
    //khai báo hai toa độ điểm x và y, kiểu int, phạm vi private;
    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
// Constructor

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Diem generate() {
        final int max = 10;
        final int min = -10;
        int x = (int) Math.floor(Math.random() * (max - min) + min);
        int y = (int) Math.floor(Math.random() * (max - min) + min);
//        Diem d = new Diem();
//        d.x= x;
//        d.y=y;
//  return d;
        return new Diem(x, y);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diem {");
        sb
                .append("x= ")
                .append(x)
                .append(" , ")
                .append("y = ")
                .append(y)
                .append('}');
        return sb.toString();
    }

    // Tạo hàm nhập tọa độ điểm kiểu void, phạm vi public để người dùng nhập tọa độ từ bàn phím
    public static String nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tọa độ x,y: ");
        String str = sc.nextLine();
        return str;
    }

    //Hàm part from strings
    public static Diem parseFromString(String str) {
        Diem ds = new Diem();
        String[] parst = str.split(",");
        int x = Integer.parseInt(parst[0]);
        int y = Integer.parseInt(parst[1]);
        ds.x = x;
        ds.y = y;
        return ds;

    }

    public double khoangCachAB(Diem another) {
        double ds = 0;
        double diemA = Math.pow(another.x - this.x, 2);
        double diemB = Math.pow(another.y - this.y, 2);
//        System.out.println("diem A: " + diemB);
//        System.out.println("diem B: " + (int) Math.sqrt(diemA + diemB));
        return ds = Math.sqrt((double) diemA + (double) diemB);

    }

    // viết hàm tìm điểm đối xứng của A, phạm vi public, trả về điểm đối xứng
    public Diem diemDoiXung() {
        Diem ds = new Diem();
        ds.x = -this.x;
        ds.y = -this.y;

        return ds;
    }

    // Điểm thuộc phần tư nào
    public int thuocPhantu() {
              if (this.x > 0 & this.y > 0) return 1;
        if (this.x > 0 & this.y < 0)
            return 2;
        if (this.x < 0 & this.y > 0)
            return 4;
        return 3;
    }
}

