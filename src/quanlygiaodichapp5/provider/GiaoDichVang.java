package quanlygiaodichapp5.provider;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Loai vang: ");
        loaiVang = in.next();
        thanhTien = donGia * soLuong;
    }

    @Override
    public String toString() {
        return "GD Vang [" + super.toString() +
               ", LoaiVang=" + loaiVang + "]";
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

}
