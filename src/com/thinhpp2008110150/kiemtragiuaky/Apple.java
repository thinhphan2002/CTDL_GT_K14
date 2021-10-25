package com.thinhpp2008110150.kiemtragiuaky;


public class Apple {
  int ma, khoiluong;
  string mauSac;

  public Apple(int a, int b, String c){
ma = a;
khoiluong = b;
mauSac = c;
  }
public Apple(){}
void nhap(){
    System.out.println("Nhập mã Apple:" + ma);
    System.out.println("Nhập khối lượng Apple" + khoiluong);
    System.out.println("Nhập màu sắc Apple " + mauSac);
}
void inthongtin(){
    System.out.println("Mã Apple: " + ma);
    System.out.println("Khối Lượng: " + khoiluong);
    System.out.println("Màu Sắc: "+ mauSac);
}
public void Contructor(){

}