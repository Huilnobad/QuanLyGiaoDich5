package quanlygiaodichapp5.BCE;

import java.util.List;
import quanlygiaodichapp5.provider.GiaoDich;

public class XuatGDTren1TyControl {

    public List<quanlygiaodichapp5.BCE.GiaoDich> getDanhSach() {
        GiaoDichDAO dao = new GiaoDichDAO();
        return dao.findDonGiaTren1Ty();
    }
}