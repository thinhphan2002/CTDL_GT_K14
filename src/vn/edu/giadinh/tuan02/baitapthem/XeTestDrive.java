package vn.edu.giadinh.tuan02.baitapthem;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe();
        xe.tenChuXe = "Nguyễn Hồ Hải Anh";
        xe.hangSanXuat = "Honda";
        xe.dong = "Vision";
        xe.giayPhep = "Hạng A1";
        xe.dungTichXang = "5.2 lít";

        xe.inXe();
    }
    
}
