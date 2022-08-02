/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

/**
 * Class Tai Khoan
 * @author Tran Nguyen Quynh Anh
 */
public class TaiKhoan {
    //So tai khoan
    private long soTK;
    //Ten tai khoan
    private String tenTK;
    //So tien trong tai khoan
    private double soTien;

    /**
     * constructor ma dinh
     */
    public TaiKhoan() {
    }
    
    /**
     * Constructor co tham so
     * @param soTK
     * @param tenTK
     * @param soTien 
     */
    public TaiKhoan(long soTK, String tenTK, double soTien) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }
    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    
    /**
     * Ham in thong tin cua tai khoan
     */
    public void in() {
        System.out.print("\nSo tai khoan: " + this.soTK + "\nTen tai khoan: " + this.tenTK + "\nSo tien: " + this.soTien);
    }
    
    /**
     * Ham nap tien vao tai khoan
     * @param soTien
     * @return 
     */
    public boolean napTien(double soTien) {
        if (soTien > 0) {
            this.soTien = this.soTien + soTien;
            return true;
        }
        return false;
    }
    
    /**
     * Ham chuyen tien cho tai khoan khac
     * @param a
     * @param soTien
     * @return 
     */
    public boolean chuyenKhoan(TaiKhoan a, double soTien) {
        if (soTien <= 0) {
            return false;
        }
        if (a.soTK == this.soTK) {
            return false;
        }
        if (soTien > this.soTien) {
            return false;
        }
        
        this.soTien = this.soTien - soTien;
        a.soTien = a.soTien + soTien;

        return true;
    }

}
