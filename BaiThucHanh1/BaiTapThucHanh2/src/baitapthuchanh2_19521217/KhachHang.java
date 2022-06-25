/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

import java.util.Date;

/**
 * Class Khach hang
 *
 * @author Tran Nguyen Quynh Anh
 */
public class KhachHang {

    //Ma khach hang
    private String makh;
    //Ten khach hang
    private String ten;
    //Ngay hoa don
    private Date ngay;
    //So luong dien
    private double sldien;
    //Dơn gia
    private double dongia;

    /**
     * Constructor khong tham so
     */
    public KhachHang() {
    }

    /**
     * Constructor co tham so
     *
     * @param makh
     * @param ten
     * @param ngay
     * @param sldien
     * @param dongia
     */
    public KhachHang(String makh, String ten, Date ngay, double sldien, double dongia) {
        this.makh = makh;
        this.ten = ten;
        this.ngay = ngay;
        this.sldien = sldien;
        this.dongia = dongia;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public double getSldien() {
        return sldien;
    }

    public void setSldien(double sldien) {
        this.sldien = sldien;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }


    /**
     * Ham tinh tien
     * @return 
     */
    public double tinhTien()
    {
        return 0;
    }

    /**
     * Ham xuat thong tin khach hang
     */
    public void xuatThongtin() {
        System.out.printf("\n%10d %-15s %10.2f %10.2f", this.makh, this.ten, this.sldien, tinhTien());
    }

}
