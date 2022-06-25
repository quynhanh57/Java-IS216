/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

import java.util.Date;



/**
 * Class Kinh doanh
 * @author Tran Nguyen Quynh Anh
 */
public class KinhDoanh extends KhachHang {

    public KinhDoanh() {
    }

    public KinhDoanh(String makh, String ten, Date ngay, double sldien, double dongia) {
        super(makh, ten, ngay, sldien, dongia);
    }
    
    /**
     * Ham tinh tien
     * @return 
     */
    @Override
    public double tinhTien()
    {
        if(super.getSldien() > 400)
        {
            return (super.getSldien()*super.getDongia()*0.05);
        }
        else{
            return (super.getSldien()*super.getDongia());
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
