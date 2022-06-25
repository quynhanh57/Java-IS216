/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

/**
 * Class Pointer
 * @author Tran Nguyen Quynh Anh
 */
import java.util.Scanner;
import java.lang.Math;

public class Pointer {
    //Hoanh do
    private double x;
    //Tung do
    private double y;

    /**
     * constructor mac dinh
     */
    public Pointer() {
    }
    /**
     * constructor co tham so  
     */
    public Pointer(double x, double y) {        
        this.x = x;
        this.y = y;
    }
    
    /**
     * Ham nhap hoanh va tung do
     */
    public void Nhap() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap hoanh do x = ");
        this.x = in.nextDouble();
        System.out.print("Nhap tung do y = ");
        this.y = in.nextDouble();
    }
    /**
     * Ham xuat hoanh va tung do
     */
    public void Xuat() 
    {      
        System.out.println("(" + x + " , " + y + ")");
    }
    
    /**
     * Ham tinh KC
     */
    public void TinhKC(Pointer a) 
    {
        System.out.println("Khoang cach 2 diem la: " + Math.sqrt(Math.pow((a.x - this.x), 2) + Math.pow((a.y - this.y), 2)));
    }
}
