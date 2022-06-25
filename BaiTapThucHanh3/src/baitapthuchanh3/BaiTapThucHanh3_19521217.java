/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapthuchanh3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Bai thuc hanh 3
 *
 * @author Tran Nguyen Quynh Anh
 */
public class BaiTapThucHanh3_19521217 {

    /**
     * Ham nhap sach
     *
     * @param list
     */
    public static void nhapSach(ArrayList list) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ban muon nhap bao nhieu sach: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("1. Sach tieu thuyet");
            System.out.println("2. Sach trinh tham");
            System.out.print("Chon loai sach: ");
            int t = in.nextInt();
            if (t == 1) {
                Sach tthuyet = new SachTieuThuyet();
                tthuyet.Nhap();
                list.add(tthuyet);
            }
            if (t == 2) {
                Sach ttham = new SachTrinhTham();
                ttham.Nhap();
                list.add(ttham);
            }
        }
    }

    /**
     * Bai 2 (Tinh trung binh dung Generic)
     *
     * @param numList
     * @return
     */
    public static double tinhtrungbinhGeneric(List<? extends Number> numList) {
        double total = 0.0;
        for (Number num : numList) {
            total += num.doubleValue();
        }
        return total / numList.size();
    }

    /**
     * Bai 3
     *
     * @throws ArrayIndexOutOfBoundsException
     * @throws Exception
     */
    public static void exceptionThrows() throws ArrayIndexOutOfBoundsException, Exception {
        //Tao mang ngau nhien 10 phan tu
        int randomNums[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = rand.nextInt(100);
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vi tri phan tu ban muon in: ");
        int t = in.nextInt();
        if (t < 0) {
            throw new Exception();
        }
        System.out.println("Phan tu o vi tri " + t + " co gia tri la: " + randomNums[t]);
    }

    /**
     * Bai 4: Xuat mang
     *
     * @param <T>
     * @param arr
     */
    public static <T> void xuatGeneric(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        /**
         * @param args the command line arguments
         */
        //Bai 8: Tao Menu

        Scanner in = new Scanner(System.in);
        System.out.println("##################################");
        System.out.println("1. Quan ly sach su dung ArrayList");
        System.out.println("2. Tinh trung binh so su dung Generic");
        System.out.println("3. Exception cho mang 5 phan tu ");
        System.out.println("4. Xuat mang su dung Generic ");
        System.out.println("5. Mo ta la bai va chia bai");
        System.out.println("6. Thoat");
        System.out.println("##################################");
        System.out.print("Chon chuc nang: ");
        int x;
        x = in.nextInt();
        while (x < 1 || x > 6) {
            System.out.print("Khong tim thay. Moi chon lai chuc nang: ");
            x = in.nextInt();
        }
        switch (x) {
            case 1:
                System.out.println("Quan ly sach su dung ArrayList");

                //ArrayList chua sach
                ArrayList<Sach> book = new ArrayList();
                nhapSach(book);

                //Tong tien sach tieu thuyet
                int tongtieuthuyet = 0;
                //Tong tien sach trinh tham
                int tongtrinhtham = 0;

                //Tinh tong tien tung loai sach
                for (int i = 0; i < book.size(); i++) {
                    if (book.get(i).getClass() == SachTieuThuyet.class) {
                        tongtieuthuyet += book.get(i).thanhTien();
                    }
                    if (book.get(i).getClass() == SachTrinhTham.class) {
                        tongtrinhtham += book.get(i).thanhTien();
                    }
                }
                System.out.println("-------------------------------------------");
                System.out.println("Tong tien sach tieu thuyet: " + tongtieuthuyet);
                System.out.println("Tong tien sach trinh tham: " + tongtrinhtham);

                //Sach tieu thuyet co gia tien cao nhat
                double maxtieuthuyet = 0;
                //Luu index sach tieu thuyet co gia tien cao nhat
                int index1 = 0;
                //Sach trinh tham co gia tien cao nhat
                double maxtrinhtham = 0;
                //Luu index sach trinh tham co gia tien cao nhat
                int index2 = 0;

                //Tim sach co gia tien cao nhat theo tung loai
                for (int i = 0; i < book.size(); i++) {
                    if (book.get(i).getClass() == SachTieuThuyet.class) {
                        if (book.get(i).getDonGia() > maxtieuthuyet) {
                            maxtieuthuyet = book.get(i).getDonGia();
                            index1 = i;
                        }
                    }
                    if (book.get(i).getClass() == SachTrinhTham.class) {
                        if (book.get(i).getDonGia() > maxtrinhtham) {
                            maxtrinhtham = book.get(i).getDonGia();
                            index2 = i;
                        }
                    }
                }
                System.out.println("-------------------------------------------");
                System.out.println("Sach tieu thuyet co gia tien cao nhat: ");
                book.get(index1).thongtinSach();
                System.out.println("-------------------------------------------");
                System.out.println("Sach trinh tham co gia tien cao nhat: ");
                book.get(index2).thongtinSach();

            case 2:
                System.out.println("Tinh trung binh so su dung Generic");

                List<Integer> integerList = new ArrayList<Integer>();
                integerList.add(40);
                integerList.add(5);
                integerList.add(34);
                integerList.add(11);
                integerList.add(23);
                System.out.println("Trung binh cac gia tri cua mang: " + tinhtrungbinhGeneric(integerList));

                List<Double> doubleList = new ArrayList<>();
                doubleList.add(3.4);
                doubleList.add(23.1);
                doubleList.add(4.8);
                doubleList.add(17.2);
                System.out.println("Trung binh cac gia tri cua mang: " + tinhtrungbinhGeneric(doubleList));

                break;

            case 3:
                System.out.println("Exception cho mang 5 phan tu ");
                while (true) {
                    try {
                        exceptionThrows();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Ban da nhap qua chi so cua mang.");
                    } catch (Exception e) {
                        System.out.println("Vi tri vua nhap phai lon hon 0.");
                    }
                    break;
                }

            case 4:
                System.out.println("Xuat mang su dung Generic ");

                Integer[] arrInt = {3, 6, 7, 14, 46};
                Double[] arrDouble = {2.3, 4.7, 8.1, 9.3};
                String[] arrString = {"Output", "Why", "What"};
                xuatGeneric(arrInt);
                xuatGeneric(arrDouble);
                xuatGeneric(arrString);
                break;

            case 5:
                BoBai cp = new BoBai();
                System.out.println(cp);
                System.out.print("\nBAI SAU KHI XAO: \n");
                cp.shuffleBai();                           
                break;
                
            case 6:
                System.out.println("Thoat");
                break;

        }
    }

}
