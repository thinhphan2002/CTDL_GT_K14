package com.thinhpp2008110150.tuan07.quanlysanpham;

public class Node {
    
    //Nội Dung
    int data;

    //Liên Kết đến nút tiếp theo
    //Tham chiếu

    Node next; // Biến tham chiếu kiểu Node

    public Node(){}
    
    public Node(int d){
        data = d;
    }

    public Node(int d, Node n){
        data = d;
        next = n;
    }
}
