package entities;

import java.util.Scanner;

// tạo class account
public class Account {
    // khai báo 3 biến mã TK TênTK, Số Tiền
    private String maTK;
    private String tenTK;
    private long soDu;

    // Hàm gửi tạo tài khoảng A: phạm vi public, kiểu void cho phép khởi tạo TK

    public void init(String stk, String name) {
        this.maTK = stk;
        this.tenTK = name;
        this.soDu = 0;
    }

    // Hàm print ra gia trị của STK
    public void print() {
        System.out.println("Tên: " + this.tenTK);
        System.out.println("STK: " + this.maTK);
        System.out.println("Số dư: " + this.soDu);
    }

    // Hàm lấy số dư - phạm vi public , trả về số dư của số tài khoản
    public long laysodu() {
        return this.soDu;
    }

    // Hàm nạp tiền, kiểu void, phạm vi public, so phép user nạp tiền
    public void napTien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào sô tiền cần nạp: ");
        long st = Long.parseLong(sc.nextLine());
        long sodu = this.laysodu();
        long newsodu = st + sodu;
        this.soDu = newsodu;

    }

    public void rutTien() {
        long sodu = this.laysodu();
        System.out.println("Nhập vào sô tiền cần rút: ");
        Scanner sc = new Scanner(System.in);
        //  String str = sc.nextLine();
        long st = Long.parseLong(sc.nextLine());
        System.out.println(st);
        if (st > sodu) {
            System.out.println("Vượt quá số dư cho phép ");
        } else
            sodu = sodu - st;
        this.soDu = sodu;

    }

    public void chuyenTien (Account another){
        long sodu = this.laysodu();
        System.out.println("Nhập vào sô tiền cần chuyển: ");
        Scanner sc = new Scanner(System.in);
             long st = Long.parseLong(sc.nextLine());
        if(sodu<st){
            System.out.println("Nhập vào sô tiền cho phép: ");
        }
        else {
            another.soDu= another.laysodu()+st;
            this.soDu=sodu-st;
        }
    }

}
