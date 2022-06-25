/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

/**
 * Class sach trinh tham
 * @author Tran Nguyen Quynh Anh
 */
public class SachTrinhTham extends Sach {
    //Thue
    private float thue;

    public SachTrinhTham(float thue) {
        this.thue = thue;
    }

    public SachTrinhTham(long maSach, String tenSach, double donGia, int soLuong, String nxb, float thue) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.thue = thue;
    }
    
    /**
     * Ham in thong tin sach
     */
    @Override
    public void thongtinSach()
    {
        super.thongtinSach();
        System.out.println("Thue: " + this.thue);
    }
    
    /**
     * Ham tinh tien sach
     */
    @Override
    public double thanhTien()
    {
       return (super.getSoLuong() * super.getDonGia() + this.thue);
    }
}
