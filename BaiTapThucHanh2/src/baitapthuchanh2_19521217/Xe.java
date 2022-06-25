/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

/**
 * Class Xe
 *
 * @author Tran Nguyen Quynh Anh
 */
import java.util.Scanner;

public class Xe {

    //Ten chu xe
    private String tenchu;
    //Ten loai xe
    private String loaixe;
    //Tri gia xe
    private double trigia;
    //Dung tich xe
    private double dungtich;

    /**
     * Constructor khong tham so
     */
    public Xe() {
    }

    /**
     * Constructor co tham so
     *
     * @param tenchu
     * @param loaixe
     * @param trigia
     * @param dungtich
     */
    public Xe(String tenchu, String loaixe, double trigia, double dungtich) {
        this.tenchu = tenchu;
        this.loaixe = loaixe;
        this.trigia = trigia;
        this.dungtich = dungtich;
    }

    public String getTenchu() {
        return tenchu;
    }

    public void setTenchu(String tenchu) {
        this.tenchu = tenchu;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public double getTrigia() {
        return trigia;
    }

    public void setTrigia(double trigia) {
        this.trigia = trigia;
    }

    public double getDungtich() {
        return dungtich;
    }

    public void setDungtich(double dungtich) {
        this.dungtich = dungtich;
    }

    /**
     * Hàm lặp để nhập thông tin xe vào mảng
     */
    int index = 0;
    Xe[] vehicle = new Xe[50];

    public void input() 
    {
        Scanner in = new Scanner(System.in);
        do {
            Xe abcd = new Xe();
            System.out.print("Nhap ten chu xe: ");
            abcd.setTenchu(in.nextLine());
            if (abcd.getTenchu().isEmpty() || abcd.getTenchu() == null ) 
            {
                break;
            }
            abcd.Nhap();
            vehicle[index] = abcd;
            index++;
        } while (true);
    }

    /**
     * Ham nhập thông tin xe
     */
    public void Nhap() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap loai xe: ");       
        this.loaixe = in.nextLine();
        System.out.print("Nhap tri gia xe: ");      
        this.trigia = in.nextDouble();
        do {
            System.out.print("Tri gia xe phai lon hon 0. Nhap lai tri gia xe: ");
            this.trigia = in.nextDouble();
        } while(this.trigia <= 0);
        System.out.print("Nhap dung tich xe: ");
        this.dungtich = in.nextDouble();
        do {
            System.out.print("Dung tich xe phai lon hon 0. Nhap lai dung tich xe: ");
            this.dungtich = in.nextDouble();
        } while(this.dungtich <= 0);
        
    }

    /**
     * Hàm tính thuế
     *
     * @return
     */
    public double tinhThue() 
    {
        if (this.dungtich < 100) {
            return 0.01 * this.trigia;
        }
        if (this.dungtich >= 100 && this.dungtich <= 175) {
            return 0.03 * this.trigia;
        }
        if (this.dungtich > 175) {
            return 0.05 * this.trigia;
        }
        return 0;
    }

    /**
     * Hàm in thông tin xe
     */
    public void inThongtin() 
    {
        System.out.printf("\n%10s %15s %15d %10.2f %20.2f", this.tenchu, this.loaixe, this.trigia, this.dungtich, tinhThue());
    }

    /**
     * Hàm xuất bản kê khai tiền thuế của các xe trong mảng
     */
    public void output() 
    {
        for (int i = 0; i < index; i++) {
            Xe abcd = vehicle[i];
            abcd.inThongtin();
        }
    }

    public void timKim() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: ");
        String t = in.nextLine();
        System.out.print("Nhap loai xe: ");
        String l = in.nextLine();
        for (int i = 0; i < index; i++) 
        {
            Xe abcd = vehicle[i];
            if ((t.equals(abcd.getTenchu())==true) && (l.equals(abcd.loaixe)==true))
            {
                System.out.print("\nThue phai dong:" + abcd.tinhThue());
            }
        }
    }

}
