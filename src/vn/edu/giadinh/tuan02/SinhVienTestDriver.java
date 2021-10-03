package vn.edu.giadinh.tuan02;

import jdk.tools.jaotc.collect.ClassSearch;

public class SinhVienTestDriver {
    public static void main(String[] args) {
        SinhVien sinhVien;
        sinhVien = new SinhVien();
        sinhVien.mssv = "2008110150";
        sinhVien.hovaten = "Phan Phúc Thịnh";
        sinhVien.quequan = "Bình Thuận";
        sinhVien.tuoi = 19;
        sinhVien.inThongTinSV();
    
    }
}
