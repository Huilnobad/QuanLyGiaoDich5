package quanlygiaodichapp5.provider;

public class ListGD {
    protected GiaoDich[] gd = new GiaoDich[100];
    protected int countGD = 0;

    public void them(GiaoDich g) {
        gd[countGD++] = g;
    }

    public int getCountGD() {
        return countGD;
    }

    public GiaoDich getGiaoDich(int i) {
        return gd[i];
    }

    public quanlygiaodichapp5.BCE.GiaoDich GiaoDich(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
