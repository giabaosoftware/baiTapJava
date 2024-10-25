public class Sach {
    private String tenSach;
    private int maSach;

    public Sach(String tenSach, int maSach) {
        this.tenSach = tenSach;
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenSach='" + tenSach + '\'' +
                ", maSach='" + maSach + '\'' +
                '}';
    }
}
