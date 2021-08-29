package entities;

import java.util.Scanner;

public class Triangle {
    private Diem d1;
    private Diem d2;
    private Diem d3;

    // Hàm khởi tạo tam giác


    public Triangle() {
        // this.d1= new Diem(1,3);
        this.d1 = Diem.generate();
        this.d2 = Diem.generate();
        this.d3 = Diem.generate();
    }

    public Triangle(Diem d1, Diem d2, Diem d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle {\n");
        sb
                .append("\t d1= ").append("{").append(d1.getX()).append(",").append(d1.getY()).append("}").append("\n")
                .append("\t d2= ").append("{").append(d2.getX()).append(",").append(d2.getY()).append("}").append("\n")
                .append("\t d3= ").append("{").append(d3.getX()).append(",").append(d3.getY()).append("}").append("\n")

                .append('}');
        return sb.toString();
    }

    public double chuVi (){
        double n1 = this.d1.khoangCachAB(d2);
        System.out.println("n1: " + n1);
        double n2 = this.d2.khoangCachAB(d3);
        System.out.println("n2: " + n2);
        double n3 = this.d1.khoangCachAB(d3);
        System.out.println("n3: " + n3);
       double c= n1+n2+n3;
        return c;
    }
}
