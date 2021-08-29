package entities;

import java.util.Scanner;

public class DonThuc {
    private String bienSo;
    private int heSo;

    public DonThuc(String bienSo, int heSo) {
        this.bienSo = bienSo;
        this.heSo = heSo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static boolean isDonThuc(String str1) {
        boolean flag;
        String usernamePattern = "\\w+";
        flag = str1.matches(usernamePattern);
        if (!flag)
            return false;
        return true;
    }


}
