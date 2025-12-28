package quanlygiaodichapp5.BCE;

import java.util.List;
import quanlygiaodichapp5.provider.GiaoDich;

public class XuatGDTren1TyUI {

    public void xuat() {
        XuatGDTren1TyControl control = new XuatGDTren1TyControl();
        List<quanlygiaodichapp5.BCE.GiaoDich> ds = control.getDanhSach();

        if (ds.isEmpty()) {
            System.out.println("Khong co giao dich nao > 1 ty");
            return;
        }

        System.out.println("Danh sach giao dich > 1 ty:");
        for (quanlygiaodichapp5.BCE.GiaoDich gd : ds) {
            System.out.println(gd);
        }
    }
}
