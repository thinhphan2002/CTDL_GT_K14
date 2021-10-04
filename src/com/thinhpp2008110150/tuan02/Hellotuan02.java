package vn.edu.giadinh.tuan02;

import javax.swing.plaf.DimensionUIResource;

import jdk.jshell.Diag;

public class Hellotuan02 {
  public static void main(String[] args) {
      float diemMonCTDLGT = 5.5f;

diemMonCTDLGT = 10.0f;
float diemTrungBinh;
diemTrungBinh = diemMonCTDLGT*2;
System.out.println("Điểm Các Môn Học:");
System.out.println("Điểm Môn Cáu Trúc Dữ Liệu Và Giải Thuật " + diemMonCTDLGT);
System.out.println("Điểm Trung Bình " + diemTrungBinh);
System.out.print("Gia Định ");
System.out.println("Đào tạo");
System.out.printf("%d nghề", 12);
  }  
}
