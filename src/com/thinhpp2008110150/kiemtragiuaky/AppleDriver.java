package com.thinhpp2008110150.kiemtragiuaky;

import java.security.PublicKey;

public class AppleDriver {
    public static void main(String[] args) {
        int chucNang;
        Scanner sacnner = new Scanner (System.in);
        
    do{
        System.out.println("=======Menu=======");
        System.out.println("1. Thêm táo vô kho");
        System.out.println("2. Tìm theo màu in ra màn hình");
        System.out.println("3. In ra danh sách ")
        System.out.println("4. Đóng");
        System.out.println("=======Menu=======");
        System.out.println("Chọn 1 Chức Năng");
        switch(chungNang){
            case 1: ChuViDienTichHCN(); break;
            case 2: theTichLapPhuong(); break;
            case 3: giaiPhuongTrinhBacNhat(); break;
            case 4: System.out.println("Đóng!!!"); break;
        }
    }while(chucNang >= 1) && chucNang <= 3);
   
}
static void nhap(){
    while(true){
     Apple apple = mew Apple();
     apple.nhap();
     scanner.nextline();
     list.add(apple);
     System.out.print("Nhập thêm (Y/N)?");
     if(scanner.nextline(.equals("N")){
         break;
     }
    }
}
static void tim(){
    System.out.println("Nhập màu táo cần tìm");
    for(Apple apple : list){
        if(scanner.nextline().equals(apple.mau)){
        apple.inthongtin();
        }
    }
}
static void inDanhSach(){
    for( Apple apple: list){
        apple.inthongtin();
}
