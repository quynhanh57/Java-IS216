/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_19521217;

/**
 *
 * @author Admin
 */
public class Sach {
    // Mã sach
    private long maSach;
    // Tên sách
    private String tenSach;
    // Đơn giá
    private double donGia;
    // Số lượng
    private int soLuong;
    //Nhà xuất bản
    private String nxb;
    
    /**
     * constructor mac dinh
     */
    public Sach() {
    }
    
    /**
     * Constructor co tham so
     * @param maSach
     * @param tenSach
     * @param donGia
     * @param soLuong
     * @param nxb 
     */
    public Sach(long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }

    public long getMaSach() {
        return maSach;
    }

    public void setMaSach(long maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    
    /**
     * Ham in thong tin sach
     */
    public void thongtinSach()
    {
        System.out.println("--------------------------------------------");
        System.out.println("Ma sach: " + this.maSach );
        System.out.println("Ten sach: " + this.tenSach);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Nha xuat ban: " + this.nxb);
    }
    /**
     * Ham tinh thanh tien
     * @return 
     */
    public double thanhTien()
    {
        return 0;
    }
}
