/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;


import java.util.Date;

/**
 * Class Sinh hoat
 * @author Tran Nguyen Quynh Anh
 */
public class SinhHoat extends KhachHang {
    //Dinh muc
    private double dinhmuc;

    /**
     * constructor khong tham so 
     */
    public SinhHoat() {

    }
    
    /**
     * Constructor co tham so
     * @param makh
     * @param ten
     * @param ngay
     * @param sldien
     * @param dongia
     * @param dinhmuc 
     */
    public SinhHoat(String makh, String ten, Date ngay, double sldien, double dongia, double dinhmuc) {
        super(makh, ten, ngay, sldien, dongia);
        this.dinhmuc = dinhmuc;
    }
    
    
    /**
     * Ham tinh tien
     * @return 
     */
    @Override
    public double tinhTien()
    {
        if(super.getSldien() <= this.dinhmuc)
        {
            return (super.getSldien()*this.dinhmuc);
        }
        else{
            return (super.getSldien()*super.getDongia()*this.dinhmuc + ((super.getSldien()-this.dinhmuc)*super.getDongia()*2));
        }
    }
    
    /**
     * Ham xuat thong tin khach hang
     */
    @Override
    public void xuatThongtin(){
        super.xuatThongtin();
        
    }
    
}
