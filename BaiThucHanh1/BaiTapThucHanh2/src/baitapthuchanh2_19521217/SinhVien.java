/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

/**
 * Class Sinh vien
 * @author Tran Nguyen Quynh Anh
 */
public class SinhVien {
    
    //Ma so sinh vien
    private int mssv;
    //Ho ten sinh vien
    private String hoten;
    //LT: diem ly thuyet
    //TH: diem thuc hanh
    private float LT;
    private float TH;
    
    /**
     * Constructor khong tham so
     */
    public SinhVien() {
        this(0,"",0.0f,0.0f);
    }
    
    /**
     * Constructor co tham so
     * @param 
     */
    public SinhVien(int mssv, String hoten, float LT, float TH) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.LT = LT;
        this.TH = TH;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getLT() {
        return LT;
    }

    public void setLT(float LT) {
        this.LT = LT;
    }

    public float getTH() {
        return TH;
    }

    public void setTH(float TH) {
        this.TH = TH;
    }

    /**
     * Ham tinh diem trung binh
     * @return 
     */
    public float TinhDiemTB() {
        return (this.TH + this.LT) / 2;
    }
    
    /**
     * Ham soString de dien ta thong tinh sinh vien
     * @return 
     */
    @Override
    public String toString() {
        return "\nMSSV: " + this.mssv + "\nHo ten: " + this.hoten + "\nDiem ly thuyet: " + this.LT + "\nDiem thuc hanh: " + this.TH + "\nDiem trung binh:" + TinhDiemTB();
    }
    
    /**
     * Ham in danh sach sinh vien 
     */
    public void inThongtin()
    {
        System.out.printf("%6d %-20s %8.2f %12.2f %15.2f \n", this.mssv, this.hoten, this.LT, this.TH, TinhDiemTB());
    }
    
}

