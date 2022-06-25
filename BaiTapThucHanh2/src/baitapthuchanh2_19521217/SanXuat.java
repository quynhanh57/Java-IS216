/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;


import java.util.Date;

/**
 * Class San xuat
 * @author Tran Nguyen Quynh Anh
 */
public class SanXuat extends KhachHang {
    //Loai dien
    //loaidien = 2 la dien 2 pha
    //loai dien = 3 la dien 3 pha
    private int loaidien;

    /**
     * Constructor khong tham so
     */
    public SanXuat() {

    }
    
    /**
     * Constructor co tham so
     * @param makh
     * @param ten
     * @param ngay
     * @param sldien
     * @param dongia
     * @param loaidien 
     */
    public SanXuat(String makh, String ten, Date ngay, double sldien, double dongia, int loaidien) {
        super(makh, ten, ngay, sldien, dongia);
        this.loaidien = loaidien;
    }
    
    /**
     * Ham tinh tien
     * @return 
     */
    @Override
    public double tinhTien()
    {
        if(this.loaidien == 2)
        {
            if (super.getSldien() > 200)
            {
                return (super.getSldien()*super.getDongia()*0.98);
            }
            else
            {
               return (super.getSldien()*super.getDongia());
            }
        }
        else{
            if (super.getSldien() > 150)
            {
                return (super.getSldien()*super.getDongia()*0.97);
            }
            else
            {
                return (super.getSldien()*super.getDongia());
            }
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
