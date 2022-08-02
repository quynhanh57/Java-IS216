/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class BaiTapThucHanh1_19521217 {
    
    public static void Bai1()
    {
        double r;      
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron r = ");
        r = in.nextDouble();
        while(r<=0)
        {  
            System.out.print("r phai lon hon 0. Nhap lai ban kinh r = ");
            r = in.nextDouble(); 
        }
        System.out.println("Chu vi hinh tron la: " + (2*r*Math.PI));
        System.out.println("Dien tich hinh tron la: " + (Math.pow(r,2)*Math.PI));
    }
    
    public static void Bai2()
    {
        Scanner in = new Scanner(System.in);    
        String x,y;
        System.out.println("Nhap vao chuoi x: ");
        x = in.nextLine();
        System.out.println("Nhap vao chuoi y: ");
        y = in.nextLine();
        System.out.println("Chuoi x: " + x);
        System.out.println("Chuoi y: " + y);
        
        //Chieu dai chuoi x
        System.out.println("Tong chieu dai cua chuoi x la: " + x.length());
        
        // 3 ki tự dau tien cua chuoi x
        if (x.length()>=3)      
            System.out.println("3 ki tu dau tien cua chuoi x la: " + x.substring(0,3));     
        else
            System.out.println("x khong co du 3 ki tu ");
        
        //3 ki tu cuoi cua chuoi x
        if (x.length()>=3)      
            System.out.println("3 ki tu cuoi cua chuoi x la: " + x.substring(x.length()-3,x.length()));     
        else
            System.out.println("x khong co du 3 ki tu");
        
        //ky tu thu 6 cua chuoi x
        if (x.length()>=6)      
            System.out.println("ki tu thu 6 cua chuoi x la: " + x.charAt(5));     
        else
            System.out.println("x khong co ki tu thu 6");
        
        // Tao chuoi moi gom 3 ki tu dau tien cua x va 3 ki tu cuoi cua y
        if (x.length() < 3 && y.length() >= 3 )
        {
           String chuoimoi = x.concat(y.substring(y.length()-3, y.length()));
           System.out.println("Chuoi moi: " + chuoimoi);            
        }    
        
        if (x.length() >= 3 && y.length() < 3)
        {
            String chuoimoi = x.substring(0,3).concat(y);
            System.out.println("Chuoi moi: " + chuoimoi);   
        }
        
        if ((x.length() < 3) && (y.length() < 3))
        {
            String chuoimoi = x.concat(y);
            System.out.println("Chuoi moi: " + chuoimoi);   
        }
                
        if ((x.length() >= 3) && (y.length() >= 3))
        {
            String chuoimoi = x.substring(0,3).concat(y.substring(y.length()-3, y.length()));
            System.out.println("Chuoi moi: " + chuoimoi);
        }
        
        //Kiểm tra 2 chuỗi x, y có bằng nhau hay không (phân biệt chữ hoa, thường)
        if(x.equals(y))
        {
             System.out.println("Hai chuoi vua nhap bang nhau (Phan biet chu hoa, thuong)");           
        }
        else {
            System.out.println("Hai chuoi vua nhap khong bang nhau (Phan biet chu hoa, thuong)");   
        }
        
        // Kiểm tra 2 chuỗi x, y có bằng nhau hay không (không phân biệt chữ hoa,chữ thường)
        if(x.equalsIgnoreCase(y))
        {
             System.out.println("Hai chuoi vua nhap bang nhau (Khong phan biet chu hoa, thuong)");           
        }
        else 
        {
            System.out.println("Hai chuoi vua nhap khong bang nhau (Khong phan biet chu hoa, thuong)");   
        }
        
        //Cho biết y có xuất hiện trong x hay không? Nếu có, tại vị trí nào?
        if (x.indexOf(y) == -1)
        {
            System.out.println("Chuoi y khong xuat hien trong x");  
        }
        else
        {
            System.out.println("Chuoi y xuat hien trong x tai vi tri: " + (x.indexOf(y) + 1));  
        }
        
        //Cho biết tất cả các vị trí xuất hiện của y trong x
        int count = 0;
        int tempt = 0;
        String z = x;
        while(true)
        {
            if(z.indexOf(y) != -1)
            {
                ++ count;
                tempt = z.indexOf(y) + 1;
                System.out.println("Chuoi y xuat hien lan thu " + count + " tai vi tri: " + tempt);         
                try 
                {
                    z = x.substring(tempt);
                
                }
                catch (java.lang.StringIndexOutOfBoundsException e)
                {
                    break;
                }
            }
            else
            {
                break;
            }
        }
        if (count == 0)
        {
            System.out.println("Chuoi y khong xuat hien trong x");          
        }
        else
        {
        System.out.println("Chuoi y xuat hien " + count + " lan trong x");   
        }
    }
    
    public static void Bai3()
    {
        Scanner in = new Scanner(System.in);    
        double x;
        System.out.print("Nhap so dien su dung: ");
        x = in.nextDouble();
        while(x<0)
        {
            System.out.print("So dien su dung khong duoc nho hon 0. Nhap lai so dien su dung: ");
            x = in.nextDouble();
        }
               
        if (x <= 50)
        {
            System.out.print("So tien dien la: " + (x*2000));           
        }
        else if(x>50 && x<=100)
        {
            System.out.print("So tien dien la: " + ((50*2000)+((x-50)*2500))); 
        }
        else if(x>100)
        {
            System.out.print("So tien dien la: " + ((50*2000)+((x-50)*3500))); 
        }     
    }
    
    public static void Bai4()
    {
        Scanner in = new Scanner(System.in);    
        double n;
        System.out.print("Nhap so nguyen N (N<20) : ");
        n = in.nextDouble();
        while(Math.ceil(n) != Math.floor(n))
        {
            System.out.print("N PHAI LA SO NGUYEN. Nhap lai so N = ");
            n = in.nextDouble();
        }
        while(n>=20)
        {
            System.out.print("N NHO HON 20. Nhap lai so N = ");
            n = in.nextDouble();
        }
        
        //Hang dau tien
        for(int i=0; i<=n; i++)
        {
            if(i==0)
            {
                System.out.printf("%-2s%-3s", "X", "|");
            }
            else
            {              
                System.out.printf("%-5d", i );
                
            }          
        }
        //Khoang cach ---
        System.out.println();
        for(int i=0; i<=n; i++)
        {
            System.out.printf("%-5s", " _ ");
        }
        System.out.println();
        //Cac hang con lai
        for(int i=1; i<=n; i++)
        {            
            System.out.printf("%-2d%-3s", i, "|");
            for (int j=1; j<=n ; j++)
            {                         
                System.out.printf("%-5d", i*j , "|");
            }  
            System.out.println();
        }      
    }
    
    public static void Bai5()
    {
        Scanner in = new Scanner(System.in);    
        double a,b;
        //Nhap a
        System.out.print("Nhap so nguyen dau tien a = ");
        a = in.nextDouble();
        while(Math.ceil(a) != Math.floor(a))
        {
            System.out.print("PHAI LA SO NGUYEN. Nhap lai so dau tien a = ");
            a = in.nextDouble();
        }
        System.out.print("Nhap so nguyen thu hai b = ");
        //Nhap b
        b = in.nextDouble();
        while(Math.ceil(b) != Math.floor(b))
        {
            System.out.print("PHAI LA SO NGUYEN. Nhap lai so thu hai b = ");
            b = in.nextDouble();
        }
        
        if(a==0 && b==0)
        {
            System.out.print("Khong co uoc chung lon nhat");
        }
        if(a==0 && b!=0)
        {
            System.out.printf("Uoc chung lon nhat la: %.0f", b);
        }
        if(a!=0 && b==0)
        {
            System.out.printf("Uoc chung lon nhat la: %.0f", a);
        }
        if (a!=0 && b!=0)
        {
            double temp1 = a;
            double temp2 = b;
            while (temp1 != temp2) 
            {
                if (temp1 > temp2) 
                {
                    temp1 -= temp2;
                } else 
                {
                    temp2 -= temp1;
                }
            }
            double ucln = temp1;
        System.out.printf("Uoc chung lon nhat la: %.0f", ucln);
        }     
    }
        
    public static void Bai6()
    {
        Scanner in = new Scanner(System.in);    
        double n;
        System.out.print("Nhap SO NGUYEN DUONG n = ");
        n = in.nextDouble();
        while(Math.ceil(n) != Math.floor(n))
        {
            System.out.print("PHAI LA SO NGUYEN DUONG. Nhap lai SO NGUYEN DUONG n = ");
            n = in.nextDouble();
        }
        while(n<=0)
        {
            System.out.print("PHAI LA SO NGUYEN DUONG. Nhap lai SO NGUYEN DUONG n = ");
            n = in.nextDouble();
        }
        System.out.printf("Tat ca uoc cua %.0f", n );
        System.out.println(" :");
        for(int i = 1; i <= n; i++) 
        {
            if(n%i == 0) 
            {
                System.out.println(i);
            }
        }   
    }
    
    public static void Bai7()
    //Bai 1 trong phan cuoi cung
    {
        //Tao mang A
        double[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang A: ");
        int n = in.nextInt();     
        a = new double[n];
        for( int i=0; i<n ;i++)
        {
            System.out.print("Nhap phan tu A[" + i + "]: ");
            double t = in.nextDouble();
            while(Math.ceil(t) != Math.floor(t))
            {
                System.out.print("PHAI NHAP SO NGUYEN DUONG. Nhap lai phan tu A[" + i + "]: ");
                t = in.nextDouble();
            }
            a[i] = t;
        }
        System.out.print("\nMang A: ");
        for( int i=0; i< n ; i++)
        {
            System.out.printf(" %.0f" , a[i]);
        }
               
        // Tao mang B
        double[] b;
        System.out.print("\nNhap so phan tu cua mang B: ");
        int m = in.nextInt(); 
        b = new double[m];
        //In mang B
        System.out.print("\nMang B: ");
        for( int j=0; j<m ; j++)
        {          
            b[j] = Math.floor(Math.random() * 100) + 1;
            System.out.printf(" %.0f" , b[j]);
        }
        
        //Tao mang C     
        double [] c = Arrays.copyOf(a, n);       
        //Thay the phan tu thu 1->3 cua mang C bang 3 phan ta cuoi cua mang B 
        System.arraycopy(b, m - 3, c , 0, 3);      
        //In mang C
        System.out.print("\nMang C: ");
        for( int i=0; i< n ; i++)
        {
            System.out.printf(" %.0f" , c[i]);
        }
  
        
        //Sap xep mang C tang dan va xuat ra man hinh
        Arrays.sort(c);
        System.out.print("\nMang C da sap xep tang dan : ");
        for( int i=0; i< n ; i++)
        {
            System.out.printf(" %.0f" , c[i]);
        }
        
    }
   
  
   
    public static void main(String[] args)   
    {
       //Bai8: Tao Menu
        Scanner in = new Scanner(System.in);
        System.out.println("##################################");
        for(int i=1; i<8 ; i++)
        {      
            System.out.println(i + ". Bài" + i);       
        }       
        System.out.println("8. Thoát");
        System.out.println("##################################");
        System.out.print("Chọn chức năng: ");
        int x;
        x = in.nextInt();
        while(x<1 || x>8)
        {           
            System.out.print("Khong tim thay. Moi chon lai chuc nang: ");             
            x = in.nextInt();           
        }
        switch(x)
        {
            case 1:   
                System.out.println("Bài 1");
                Bai1();
                break;
            case 2:  
                System.out.println("Bài 2");
                Bai2();
                break;
            case 3:
                System.out.println("Bài 3");
                Bai3();
                break;
            case 4:
                System.out.println("Bài 4");
                Bai4();
                break;
            case 5:
                System.out.println("Bài 5");
                Bai5();
                break;
            case 6:
                System.out.println("Bài 6");
                Bai6();
                break;
            case 7:
                System.out.println("Bài 7");
                Bai7();
                break;
            case 8:    
                System.out.println("Thoát");
                break;            
        }       
    } 
}
