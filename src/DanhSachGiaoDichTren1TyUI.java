/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
import quanlygiaodichapp5.provider.GiaoDich;
/**
 *
 * @author caochien
 */

public class DanhSachGiaoDichTren1TyUI {
    public void hienThiDanhSach(List<GiaoDich> ds) {
        if (ds.isEmpty()) {
            System.out.println("Khong co giao dich nao co don gia > 1 ty");
            return;
        }

        System.out.println("Danh sach giao dich co don gia > 1 ty:");
        for (GiaoDich gd : ds) {
            System.out.println(gd.toString());
        }
    }
}
