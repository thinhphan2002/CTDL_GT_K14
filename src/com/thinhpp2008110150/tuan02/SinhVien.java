package vn.edu.giadinh.tuan02;

import java.util.Date;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class SinhVien {
    
        String mssv;
        String hovaten;
        int tuoi;
        String quequan;
        Date ngaysinh;
        void inThongTinSV(){

        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Tên sinh viên: " + hovaten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Quê quán: " + quequan);
    }
}
