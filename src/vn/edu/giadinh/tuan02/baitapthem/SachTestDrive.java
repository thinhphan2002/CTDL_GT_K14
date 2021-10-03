package vn.edu.giadinh.tuan02.baitapthem;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach();
        sach.giaBan = "18000";
        sach.nhaXuatBan= "Kim Đồng";
        sach.namXuatBan= "2002";
        sach.soLuong = 19;
        sach.loai = "Thiếu Nhi";

        sach.inSach();

    }
    
}
