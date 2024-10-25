import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    static Scanner scanner = new Scanner(System.in);
    private ArrayList<BoSuuTap> danhSachBoSuuTap;

    public Library() {
        this.danhSachBoSuuTap = new ArrayList<>();
    }

    public Library(ArrayList<BoSuuTap> danhSachBoSuuTap) {
        this.danhSachBoSuuTap = danhSachBoSuuTap;
    }

    public ArrayList<BoSuuTap> getDanhSachBoSuuTap() {
        return danhSachBoSuuTap;
    }

    public void setDanhSachBoSuuTap(ArrayList<BoSuuTap> danhSachBoSuuTap) {
        this.danhSachBoSuuTap = danhSachBoSuuTap;
    }

    public void xoaBoSuuTap() {
        System.out.println("Nhap ma so bo suu tap can xoa");
        int maSoBST = scanner.nextInt();
        BoSuuTap boSuuTapCanXoa = null;
        for(BoSuuTap boSuuTap : danhSachBoSuuTap){
            if(boSuuTap.getMaSoBoSuuTap() == maSoBST){
                boSuuTapCanXoa = boSuuTap;
                break;
            }
        }
        if(boSuuTapCanXoa == null){
            System.out.println("Khong co ten bo suu tap can xoa");
        }else {
            danhSachBoSuuTap.remove(boSuuTapCanXoa);
            System.out.println("Da xoa bo suu tap " + boSuuTapCanXoa.getTenBoSuuTap().toString());
        }
    }

    public void themBoSuuTap(){
        System.out.println("Nhap ten bo suu tap");
        String tenBoSuuTapMoi = scanner.nextLine();
        System.out.println("Them ma so bo suu tap");
        int maSoBoSuuTapMoi = scanner.nextInt();
        System.out.println("Them so luong sach vo bo suu tap");
        int soLuongSach = scanner.nextInt();
        ArrayList<Sach> danhSachSachMoi = new ArrayList<>();
        for(int i = 1; i <= soLuongSach; i++){
            System.out.println("Them sach thu" + i);
            System.out.println("Ten sach ");
            scanner.nextLine();
            String tenSachMoi = scanner.nextLine();
            System.out.println("Ma sach");
            int maSachMoi = scanner.nextInt();
            Sach sachMoi = new Sach(tenSachMoi, maSachMoi);
            danhSachSachMoi.add(sachMoi);
        }
        BoSuuTap boSuuTapMoi = new BoSuuTap(tenBoSuuTapMoi, maSoBoSuuTapMoi, danhSachSachMoi);
        danhSachBoSuuTap.add(boSuuTapMoi);
    }

    @Override
    public String toString() {
        return "Library{" +
                "danhSachBoSuuTap=" + danhSachBoSuuTap +
                '}';
    }
}
