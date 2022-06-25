/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh3;

/**
 * Class Bộ bài
 *
 * @author Tran Nguyen Quynh Anh
 */
import java.util.ArrayList;
import java.util.Collections;

public class BoBai {

    private ArrayList<QuanBai> bobai;

    /**
     * Them quan bai vao List
     */
    public BoBai() {
        bobai = new ArrayList<QuanBai>();
        int count = 0;
        do {
            QuanBai c = new QuanBai();
            if (!bobai.contains(c)) {
                bobai.add(c);
                count++;
            }
        } while (count < 52);
    }

    /**
     * Ham xao bai va chia bai cho 4 nguoi
     */
    public void shuffleBai() {
        Collections.shuffle(bobai);
        for (int i = 0; i < 4; i++) {
            System.out.println("\nBai cua nguoi thu " + (i + 1));
            for (int j = i * 13 + 1; j <= i * 13 + 13; j++) {
                System.out.println(bobai.get(j - 1));
            }
        }
    }

    /**
     * Ham in cac quan bai
     * @return 
     */
    @Override
    public String toString() {
        String ret = "";

        for (QuanBai c : bobai) {

            ret += c.toString() + "\n";

        }
        return ret;
    }
}
