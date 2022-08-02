/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

/**
 * Class Hinh chu nhat
 * @author Tran Nguyen Quynh Anh
 */
public class HinhChuNhat {
    // Chieu dai
    private double dai;
    // Chieu ronh
    private double rong;
    
    /**
     * Constructor khong tham so
     */
    public HinhChuNhat() {
    }
    
    /**
     * Constructor co tham so
     * @param dai
     * @param rong 
     */
    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    
    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    
    /**
     * Ham tinh chu vi
     * @return 
     */
    public double ChuVi() {
        return ((dai + rong) * 2);
    }
    
    /**
     * Ham tinh dien tich
     * @return 
     */
    public double DienTich() {
        return (dai * rong);
    }
    
    /**
     * Ham toString de in thong tin hinh chu nhat
     * @return 
     */
    @Override
    public String toString() {
        return "Dai: " + dai + " Rong: " + rong + " Chu vi: " + ChuVi() + " Dien tich: " + DienTich();
    }
}
