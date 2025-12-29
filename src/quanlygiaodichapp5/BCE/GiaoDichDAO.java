package quanlygiaodichapp5.BCE;

import java.util.ArrayList;
import java.util.List;
import quanlygiaodichapp5.provider.*;

public class GiaoDichDAO {

    private final ListGD listGD;

    public GiaoDichDAO() {
        listGD = new ListGD();

        GiaoDichVang g1 = new GiaoDichVang();
        g1.setMaGD(1);
        g1.setDonGia(1_200_000_000);
        g1.setSoLuong(2);
        listGD.them(g1);

        GiaoDichTienTe g2 = new GiaoDichTienTe();
        g2.setMaGD(2);
        g2.setDonGia(900_000_000);
        g2.setSoLuong(1);
        listGD.them(g2);
    }

     
    public List<GiaoDich> findDonGiaTren1Ty() {
        List<GiaoDich> result = new ArrayList<>();
        final double MOT_TY = 1_000_000_000;

        for (int i = 0; i < listGD.getCountGD(); i++) {
            GiaoDich gd = listGD.GiaoDich(i);
            if (gd != null && gd.getDonGia() > MOT_TY) {
                result.add(gd);
            }
        }
        return result;
    }
}