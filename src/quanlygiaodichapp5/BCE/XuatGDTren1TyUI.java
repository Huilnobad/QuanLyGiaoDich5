package quanlygiaodichapp5.BCE;

import java.util.List;
import quanlygiaodichapp5.provider.GiaoDich;

public class XuatGDTren1TyUI {

    public void xuat() {
        XuatGDTren1TyControl control = new XuatGDTren1TyControl();
        List<quanlygiaodichapp5.BCE.GiaoDich> ds = control.getDanhSach();

        if (ds.isEmpty()) {
            System.out.println("KHONG CO GIAO DICH NAO > 1 TY :");
            return;
        }

        System.out.println("DANH SACH GIAO DICH >1 TY :");
        for (quanlygiaodichapp5.BCE.GiaoDich gd : ds) {
            System.out.println(gd);
        }
    }
}