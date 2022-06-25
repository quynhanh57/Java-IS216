/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh3;

import java.util.Scanner;

/**
 * Class sach tieu thuyet
 * @author Tran Nguyen Quynh Anh
 */
public class SachTieuThuyet extends Sach {
    //Tinh trang sach
    //true la tinh trang moi
    //false la tinh trang cu
    private boolean tinhTrang;
    
    public SachTieuThuyet() {
    }
    
    public SachTieuThuyet(long maSach, String tenSach, double donGia, int soLuong, String nxb, boolean tinhTrang)
    {
        super(maSach,tenSach,donGia,soLuong,nxb);
        this.tinhTrang = tinhTrang;
    }
    
    
    
    /**
     * Ham nhap thong tin sach
     */
    @Override
    public void Nhap()
    {
        Scanner in = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhap tinh trang (Moi: true , Cu: false) : ");
        this.tinhTrang = in.nextBoolean();
    }
    
    /**
     * Ham in thong tin sach
     */
    @Override
    public void thongtinSach()
    {
        super.thongtinSach();
        if(this.tinhTrang == true){
            System.out.println("Tinh trang: Moi");
        } 
        else{
            System.out.println("Tinh trang: Cu");
        }
    }
    /**
     * Ham tinh tien sach
     * @return 
     */
    @Override
    public double thanhTien()
    {      
        if(this.tinhTrang == true)
        {
            return (super.getSoLuong() * super.getDonGia());
        }
        else
        {
            return (super.getSoLuong() * super.getDonGia() * 0.2);
        }
    }
}
