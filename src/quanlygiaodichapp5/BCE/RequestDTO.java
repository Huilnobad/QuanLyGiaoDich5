/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlygiaodichapp5.BCE;

/**
 *
 * @author caochien
 */
public class RequestDTO {
    public int maGD;
    public String ngayGD;
    public double donGia;
    public int soLuong;

    public Float tiGia;        // có thể null nếu không dùng
    public Integer loaiTienTe; // 1-VND,2-USD,3-EURO, null nếu không dùng
    
    public String loaiVang;
}
