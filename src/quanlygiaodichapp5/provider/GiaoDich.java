package quanlygiaodichapp5.provider;

import java.util.Scanner;

public class GiaoDich {
    public int maGD;
    public String ngayGD;
    public double donGia;
    public int soLuong;
    public double thanhTien;

    protected Scanner in = new Scanner(System.in);

    public GiaoDich() {}

    public int getMaGD() {
        return maGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void nhap() {
        System.out.print("Ma GD: ");
        maGD = in.nextInt();
        System.out.print("Ngay GD: ");
        ngayGD = in.next();
        System.out.print("Don gia: ");
        donGia = in.nextDouble();
        System.out.print("So luong: ");
        soLuong = in.nextInt();
    }

    @Override
    public String toString() {
        return "MaGD=" + maGD +
               ", NgayGD=" + ngayGD +
               ", DonGia=" + donGia +
               ", SoLuong=" + soLuong +
               ", ThanhTien=" + thanhTien;
    }
}
