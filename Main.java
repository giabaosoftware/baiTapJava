import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sach sach1 = new Sach("Design 101", 201);
        Sach sach2 = new Sach("Design Theory", 202);
        Sach sach3 = new Sach("Java 101", 100);

        ArrayList<Sach> danhSachSachThietKe = new ArrayList<>();
        danhSachSachThietKe.add(sach1);
        danhSachSachThietKe.add(sach2);

        ArrayList<Sach> danhSachSachLapTrinh = new ArrayList<>();
        danhSachSachLapTrinh.add(sach3);
        BoSuuTap boSuuTap1 = new BoSuuTap("Thiet ke",1, danhSachSachThietKe);
        BoSuuTap boSuuTap2 = new BoSuuTap("Lap Trinh",2, danhSachSachLapTrinh);

        ArrayList<BoSuuTap> danhSachBoSuuTap = new ArrayList<>();
        danhSachBoSuuTap.add(boSuuTap1);
        danhSachBoSuuTap.add(boSuuTap2);
        Library danhSachBoSuuTap1 = new Library(danhSachBoSuuTap);
        System.out.println(danhSachBoSuuTap1.toString());
        danhSachBoSuuTap1.xoaBoSuuTap();
        System.out.println(danhSachBoSuuTap1.toString());
    }
}