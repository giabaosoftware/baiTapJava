import java.util.ArrayList;
import java.util.Scanner;

public class BoSuuTap {
    static Scanner sc = new Scanner(System.in);
    private String tenBoSuuTap;
    private int maSoBoSuuTap;
    private ArrayList<Sach> danhSachSach;


    public BoSuuTap() {
        this.danhSachSach = new ArrayList<>();
    }

    public BoSuuTap(String tenBoSuuTap){
        this.tenBoSuuTap = tenBoSuuTap;
    }

    public BoSuuTap(String tenBoSuuTap, int maSoBoSuuTap){
        this.tenBoSuuTap = tenBoSuuTap;
        this.maSoBoSuuTap = maSoBoSuuTap;
    }

    public BoSuuTap(String tenBoSuuTap, ArrayList<Sach> danhSachSach) {
        this.tenBoSuuTap = tenBoSuuTap;
        this.danhSachSach = danhSachSach;
    }

    public BoSuuTap(String tenBoSuuTap, int maSoBoSuuTap, ArrayList<Sach> danhSachSach) {
        this.tenBoSuuTap = tenBoSuuTap;
        this.maSoBoSuuTap = maSoBoSuuTap;
        this.danhSachSach = danhSachSach;
    }

    public String getTenBoSuuTap() {
        return tenBoSuuTap;
    }

    public void setTenBoSuuTap(String tenBoSuuTap) {
        this.tenBoSuuTap = tenBoSuuTap;
    }

    public ArrayList<Sach> getDanhSachSach() {
        return danhSachSach;
    }

    public void setDanhSachSach(ArrayList<Sach> danhSachSach) {
        this.danhSachSach = danhSachSach;
    }

    public int getMaSoBoSuuTap() {
        return maSoBoSuuTap;
    }

    public void setMaSoBoSuuTap(int maSoBoSuuTap) {
        this.maSoBoSuuTap = maSoBoSuuTap;
    }

    @Override
    public String toString() {
        return "BoSuuTap{" +
                "tenBoSuuTap='" + tenBoSuuTap + '\'' +
                ", maSoBoSuuTap=" + maSoBoSuuTap +
                ", danhSachSach=" + danhSachSach +
                '}';
    }

    public void themSach(){
        System.out.println("Them ten sach");
        String tenSach = sc.nextLine();
        System.out.println("Them ma so sach");
        int maSach = sc.nextInt();
        Sach sach = new Sach(tenSach, maSach);
        danhSachSach.add(sach);
    }

    public void xoaSach(){
        System.out.println("Nhap ma so sach");
        int maSach = sc.nextInt();
        sc.nextLine();
        Sach sachCanXoa = null;
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach() == maSach) {
                sachCanXoa = sach;
                break;
            }
        }
        if(sachCanXoa != null){
            danhSachSach.remove(sachCanXoa);
        }else{
            System.out.println("Ma so khong ton tai");
        }
    }
}
