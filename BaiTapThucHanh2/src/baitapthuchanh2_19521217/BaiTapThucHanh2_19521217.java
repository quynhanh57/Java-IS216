/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapthuchanh2_19521217;

/**
 *
 * @author Tran Nguyen Quynh Anh
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BaiTapThucHanh2_19521217 {

    public static void main(String[] args) throws ParseException {
        //Bai8: Tao Menu
        Scanner in = new Scanner(System.in);
        System.out.println("##################################");
        System.out.println("1. Bai Tai khoan");
        System.out.println("2. Bai Sach");
        System.out.println("3. Bai Toa do");
        System.out.println("4. Bai Hinh Chu Nhat");
        System.out.println("5. Bai Sinh vien");
        System.out.println("6. Bai Xe");
        System.out.println("7. Bai Dien luc");
        System.out.println("8. Thoat");
        System.out.println("##################################");
        System.out.print("Chon chuc nang: ");
        int x;
        x = in.nextInt();
        while (x < 1 || x > 8) {
            System.out.print("Khong tim thay. Moi chon lai chuc nang: ");
            x = in.nextInt();
        }
        switch (x) {
            case 1:
                System.out.println("Bai Tai khoan");
                TaiKhoan tk = new TaiKhoan(12345, "Quynh Anh", 1000000);
                tk.in();
                System.out.print("\n------Nap tien vao tai khoan------");
                tk.napTien(10000);
                tk.in();
                System.out.print("\n-----------Chuyen tien-------------");
                TaiKhoan tk1 = new TaiKhoan(67890, "Nguyen Van B", 50000);
                tk1.in();
                tk.chuyenKhoan(tk1, 2000);
                tk1.in();
                break;

            case 2:
                System.out.println("Bai Sach");
                Sach abc = new SachTieuThuyet(10001, "Cuon theo chieu gio", 105000, 23, "Van hoc", true);
                Sach bcd = new SachTieuThuyet(10031, "Ong gia va bien ca", 55000, 11, "Van hoc", false);
                Sach xyz = new SachTrinhTham(20056, "Su im lang cua bay cuu", 250000, 45, "Van hoc", 0.1f);
                abc.thongtinSach();
                System.out.println("Thanh tien: " + abc.thanhTien());
                bcd.thongtinSach();
                System.out.println("Thanh tien: " + bcd.thanhTien());
                xyz.thongtinSach();
                System.out.println("Thanh tien: " + xyz.thanhTien());
                break;

            case 3:
                System.out.println("Bai Toa do");
                Pointer a = new Pointer();
                Pointer b = new Pointer();
                a.Nhap();
                b.Nhap();
                a.Xuat();
                b.Xuat();
                a.TinhKC(b);
                break;

            case 4:
                System.out.println("Bai Hinh chu nhat");
                HinhChuNhat hcn = new HinhChuNhat();
                System.out.print("Nhap chieu dai = ");
                hcn.setDai(in.nextDouble());
                System.out.print("Nhap chieu rong = ");
                hcn.setRong(in.nextDouble());
                while (hcn.getDai() <= hcn.getRong()) {
                    System.out.println("Chieu dai phai dai hon chieu rong. Moi nhap lai chieu dai va chieu rong");
                    System.out.print("Nhap chieu dai = ");
                    hcn.setDai(in.nextDouble());
                    System.out.print("Nhap chieu rong = ");
                    hcn.setRong(in.nextDouble());
                }
                System.out.println("Thong tinh hinh chu nhat: " + hcn.toString());
                break;

            case 5:
                System.out.println("Bai Sinh vien");
                SinhVien sv1 = new SinhVien(19521113, "Tran C", 7, 8.8f);
                SinhVien sv2 = new SinhVien(19521154, "Tran Thi H", 8.5f, 7.8f);
                SinhVien sv3 = new SinhVien(19521412, "Nguyen D", 9.3f, 10);
                System.out.println("-----------------------------------------");
                System.out.println("Thong tin sinh vien:" + sv1.toString());
                System.out.println("Thong tin sinh vien:" + sv2.toString());
                System.out.println("Thong tin sinh vien:" + sv3.toString());
                System.out.println("----------------------------------------------------------------------------");
                System.out.printf("%5s %12s %20s %15s %20s \n", "MSSV", "Ho ten", "Diem ly thuyet", "Diem thuc hanh", "Diem trung binh");
                sv1.inThongtin();
                sv2.inThongtin();
                sv3.inThongtin();
                break;

            case 6:
                System.out.println("Bai Xe");
                Xe m = new Xe();
                m.input();
                System.out.println("\n----------------------------------------------------------------");
                System.out.println("BANG KE KHAI TIEN THUE PHAI DONG");
                System.out.printf("%10s %15s %15s %20s %20s", "Ten chu xe", "Loai xe", "Tri gia", "Dung tich xylanh", "Thue phai dong");
                m.output();
                System.out.println("\n----------------------------------------------------------------");
                m.timKim();
                break;

            case 7:
                System.out.println("Bai Dien luc");
                //loai dien su dung               
                int t;
                String ma;
                String ten;
                String ngay;
                double sldien;
                double dongia;
                double dinhmuc;
                int loaidien;
                KhachHang[][] dskh = new KhachHang[100][3];
                int indexsh = 0;
                int indexkd = 0;
                int indexsx = 0;
                do {
                    System.out.println("Bai Dien luc");
                    System.out.println("1. Sinh hoat");
                    System.out.println("2. Kinh doanh");
                    System.out.println("3. San xuat");
                    System.out.print("Moi chon loai dien: ");
                    t = in.nextInt();
                    if (t == 1) {
                        System.out.print("Ma khach hang: ");
                        in.nextLine();
                        ma = in.nextLine();
                        if (ma.isEmpty()) {
                            break;
                        }
                        System.out.print("Ten khach hang: ");
                        ten = in.nextLine();
                        System.out.print("Ngay hoa don (dd/MM/yyyy): ");
                        ngay = in.nextLine();
                        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                        df.setLenient(false);
                        try {
                            df.parse(ngay);
                        } catch (ParseException e) {
                            System.out.println("Ngay nhap vao loi. Moi nhap lai ngay hoa don (dd/MM/yyyy): ");
                            ngay = in.nextLine();
                        }
                        Date ngayhd = df.parse(ngay);
                        df.format(ngayhd);  
                        
                        System.out.print("So luong dien: ");
                        sldien = in.nextDouble();
                        while (sldien < 0)
                        {
                            System.out.print("So luong dien khong am. Moi nhap lai so luong dien: ");
                            sldien = in.nextDouble();
                        } 
                        
                        System.out.print("Don gia: ");
                        dongia = in.nextDouble();
                        while (dongia <= 0)
                        {
                            System.out.print("Don gia phai lon hon 0. Moi nhap lai don gia: ");
                            dongia = in.nextDouble();
                        } 
                        
                        System.out.print("Dinh muc: ");
                        dinhmuc = in.nextDouble();
                        while (dinhmuc <= 0)
                        {
                            System.out.print("Dinh muc phai lon hon 0. Moi nhap lai dinh muc: ");
                            dinhmuc = in.nextDouble();
                        } 
                        KhachHang sh = new SinhHoat(ma, ten, ngayhd, sldien, dongia, dinhmuc);
                        dskh[indexsh][0] = sh;
                        indexsh++;
                        
                    }
                    if (t == 2) {
                        System.out.print("Ma khach hang: ");
                        in.nextLine();
                        ma = in.nextLine();
                        if (ma.isEmpty()) {
                            break;
                        }
                        System.out.print("Ten khach hang: ");
                        ten = in.nextLine();
                        
                        System.out.print("Ngay hoa don (dd/MM/yyyy): ");
                        ngay = in.nextLine();
                        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                        df.setLenient(false);
                        try {
                            df.parse(ngay);
                        } catch (ParseException e) {
                            System.out.println("Ngay nhap vao loi. Moi nhap lai ngay hoa don (dd/MM/yyyy): ");
                            ngay = in.nextLine();
                        }
                        Date ngayhd = df.parse(ngay);
                        df.format(ngayhd);  
                        
                        System.out.print("So luong dien: ");
                        sldien = in.nextDouble();
                        while (sldien < 0)
                        {
                            System.out.print("So luong dien khong am. Moi nhap lai so luong dien: ");
                            sldien = in.nextDouble();
                        } 
                        
                        System.out.print("Don gia: ");
                        dongia = in.nextDouble();
                        while (dongia <= 0)
                        {
                            System.out.print("Don gia phai lon hon 0. Moi nhap lai don gia: ");
                            dongia = in.nextDouble();
                        }
                        KhachHang kd = new KinhDoanh(ma, ten, ngayhd, sldien, dongia);

                        dskh[indexkd][1] = kd;
                        indexkd++;
                    }
                    if (t == 3) {
                        System.out.print("Ma khach hang: ");
                        in.nextLine();
                        ma = in.nextLine();
                        if (ma.isEmpty()) {
                            break;
                        }
                        System.out.print("Ten khach hang: ");
                        ten = in.nextLine();
                        
                        System.out.print("Ngay hoa don (dd/MM/yyyy): ");
                        ngay = in.nextLine();
                        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                        df.setLenient(false);
                        try {
                            df.parse(ngay);
                        } catch (ParseException e) {
                            System.out.println("Ngay nhap vao loi. Moi nhap lai ngay hoa don (dd/MM/yyyy): ");
                            ngay = in.nextLine();
                        }
                        Date ngayhd = df.parse(ngay);
                        df.format(ngayhd);  
                        
                        System.out.print("So luong dien: ");
                        sldien = in.nextDouble();
                        while (sldien < 0)
                        {
                            System.out.print("So luong dien khong am. Moi nhap lai so luong dien: ");
                            sldien = in.nextDouble();
                        } 
                        
                        System.out.print("Don gia: ");
                        dongia = in.nextDouble();
                        while (dongia <= 0){
                            System.out.print("Don gia phai lon hon 0. Moi nhap lai don gia: ");
                            dongia = in.nextDouble();
                        } 
                        
                        System.out.print("(Nhap 2 neu la dien '2' pha / Nhap '3' neu la dien 3 pha).Nhap loai dien: ");
                        loaidien = in.nextInt();
                        while ((loaidien !=2) && (loaidien)!=3){
                            System.out.print("(Nhap '2' neu la dien 2 pha / Nhap '3' neu la dien 3 pha).Nhap loai dien: ");
                            loaidien = in.nextInt();
                        } 
                        
                        KhachHang sx = new SinhHoat(ma, ten, ngayhd, sldien, dongia, loaidien);
                        dskh[indexsx][2] = sx;
                        indexsx++;
                    }
                } while (true);
                
                //Nhap thang de xuat hoa don
                System.out.println("\nNhap thang: ");
                int thang = in.nextInt();
                while(thang < 1 || thang > 12){
                    System.out.println("\nNhap lai thang: ");
                    thang = in.nextInt();
                } 
                //Nhap nam de xuat hoa don
                System.out.println("Nhap nam: ");
                int nam = in.nextInt();                          
                
                System.out.println("\nHOA DON TIEN DIEN CUA KHACH HANG");
                System.out.printf("%10s %15s %20s %15s", "Ma khach hang", "Ten khach hang", "So luong dien", "Thanh tien");
                
                for( int i =0; i<indexsh ; i++)
                {
                    KhachHang sh = dskh[i][0];
                    if ((sh.getNgay().getMonth() == thang) && (sh.getNgay().getYear() == nam)){
                        sh.xuatThongtin();
                    }
                }
                
                for( int i =0; i<indexkd ; i++)
                {
                    KhachHang kd = dskh[i][1];
                    if ((kd.getNgay().getMonth() == thang) && (kd.getNgay().getYear() == nam)){
                        kd.xuatThongtin();
                    }
                }
                
                for( int i =0; i<indexsx ; i++)
                {
                    KhachHang sx = dskh[i][0];
                    if ((sx.getNgay().getMonth() == thang) && (sx.getNgay().getYear() == nam)){
                        sx.xuatThongtin();
                    }
                }         
                break;

            case 8:
                System.out.println("Thoat");
                break;
        }
    }

}
