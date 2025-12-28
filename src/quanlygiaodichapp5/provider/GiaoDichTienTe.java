package quanlygiaodichapp5.provider;

public class GiaoDichTienTe extends GiaoDich {
    private float tiGia;
    private int loaiTienTe; // 1-VND, 2-USD, 3-EURO

    public GiaoDichTienTe() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Ti gia: ");
        tiGia = in.nextFloat();
        System.out.print("Loai tien te (1-VND,2-USD,3-EURO): ");
        loaiTienTe = in.nextInt();

        if (loaiTienTe == 1)
            thanhTien = donGia * soLuong;
        else
            thanhTien = donGia * soLuong * tiGia;
    }

    @Override
    public String toString() {
        String loai = (loaiTienTe == 1) ? "VND"
                     : (loaiTienTe == 2) ? "USD" : "EURO";
        return "GD Tien Te [" + super.toString() +
               ", TiGia=" + tiGia +
               ", LoaiTienTe=" + loai + "]";
    }

    public void setMaGD(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDonGia(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setSoLuong(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDonGia(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}