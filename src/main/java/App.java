import entities.Account;
import entities.ToaDoDiem;

public class App {
    public static void main(String[] args) {
        //==============Phân số===============
//        String str = PhanSo.inputPhanso();
//        PhanSo ps = PhanSo.fromString(str);
//        ps.print();
//        // kiểm tra phân số tối giản
//        if (ps.isToiGian()) {
//            System.out.println("Phân số " + ps.getTu() + "/" + ps.getMau() + " đã tối giản");
//        } else System.out.println("Phân số " + ps.getTu() + "/" + ps.getMau() + " chưa tối giản");
//        //Rút gọn phân số
//        ps.rutGonPhanSo();
//        System.out.println("Phân số sau khi rút gọn: " + ps.getTu() + "/" + ps.getMau());
//
//        //Nhập phân số thứ 2
//        String str1 = PhanSo.inputPhanso();
//        PhanSo ps1 = PhanSo.fromString(str1);
//        System.out.println("Phân số thứ hai: " + ps1.toString());
//
//        //So sánh hai phân số:
//        if (ps.compareTo(ps1) == 1) {
//            System.out.format("%s > %s", ps, ps1);
//        }
//        if (ps.compareTo(ps1) == 0) {
//            System.out.format("%s = %s", ps, ps1);
//        }
//        if (ps.compareTo(ps1) == -1) {
//            System.out.format("%s > %s\n", ps, ps1);
//        }
//        // tính tổng
//        ps.congPhanSo(ps1);
//        System.out.println("Tổng hai phân số: " + ps);

        //==============Tam Giacs===============
//        Triangle trg = new Triangle();
//        int c = trg.nhapCanhA();
//        int c1 = trg.nhapCanhB();
//        int c2 = trg.nhapCanhC();
//        trg.xuatTamGiac();
//       int chuvi= trg.tinhChuvi();
//       System.out.println("Chu vi của tam giác là: "+ chuvi);

     //   =========== toa diem diem=====
//        ToaDoDiem tdA = new ToaDoDiem();
//        tdA.nhapToaDo(); // x,y 1,2 cho A, gán
//
//        ToaDoDiem tdB = new ToaDoDiem();
//        tdB.nhapToaDo(); // x 3, y 4 cho B
//
//        double tong = tdA.khoangCachAB(tdB);
//        System.out.println("Tổng : "+ tong);

        Account A = new Account();
        A.init("0001", "Nguyen A");
        A.print();
        A.napTien();
        long n = A.laysodu();
        System.out.println(n);
        A.print();
        A.rutTien();
        A.print();

        Account B = new Account();
        B.init("0002", "Nguyen B");
        B.print();
        A.chuyenTien(B);
        System.out.println("Số tiền còn lại của A:" + A.laysodu());
        System.out.println("Số tiền còn lại của B:" + B.laysodu());
    }
}














