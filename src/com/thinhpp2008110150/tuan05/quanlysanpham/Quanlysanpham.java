package com.thinhpp2008110150.tuan05.quanlysanpham;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class QuanLySanPham {
    public static void main(String[] args) {
        menu();
    }

    //Tạo một ArrayList tên list kiểu String
    public static ArrayList <String> list = new ArrayList<String>();
    public static Scanner bienNhap = new Scanner(System.in);

    public static void menu(){
        System.out.println("------------------MENU------------------");
        System.out.println("=> 1)  Nhập DS sản phẩm                 |");
        System.out.println("=> 2)  Sắp xếp giảm dần theo giá        |");
        System.out.println("=> 3)  Xoá sản phẩm vừa nhập            |");
        System.out.println("=> 4)  Xuất giá trung bình của các SP   |");
        System.out.println("=> 5)  Kết thúc                         |");
        System.out.println("----------------------------------------");
        System.out.println("Chọn chức năng: ");
        int key = bienNhap.nextInt();
        switch(key){
            case 1:
                nhap();
            break;
            case 2:
            break;
            case 3:
                xoa();
            break;
            case 4:
            break;
            case 5:
            break;
        }
    }

    public static void nhap(){
        while(true){
            System.out.print("Nhập tên sản phẩm: ");
            String x = bienNhap.next();
            list.add(x);
            System.out.print("Nhập thêm (y/n)?: ");
            if(bienNhap.next().equals("n"))
            break;
        }
    }

    public static void xuat(){
        for(String a: list){
            System.out.println("Sản Phẩm: "+a);
            }
    }

    public static void sapxepgiamdan(){
        
    }

    public static void xoa(){
        System.out.println("Nhập tên cần xoá: ");
        String name = bienNhap.nextLine();
        for(String a: list){
            if(a.equals(name)){
                list.remove(a);
                System.out.println("Đã xoá");
            }
            break;
    }
}
}