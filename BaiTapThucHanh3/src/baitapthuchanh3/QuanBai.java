/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh3;

/**
 * Class Quân bài
 *
 * @author Tran Nguyen Quynh Anh
 */
public class QuanBai {

    private int type;
    private int value;

    public QuanBai() {
        this.type = (int) (Math.random() * 4);
        this.value = (int) (Math.random() * 13);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

   

    public boolean equals(Object obj) 
    {
        QuanBai c = (QuanBai) obj;
        return (this.type == c.getType() && this.value == c.getValue());
    }

    @Override
            
    public String toString() {
        String ret = "";
        switch (this.value) {
            case 0:
                ret = "Ach";
                break;
            case 1:
                ret = "Hai";
                break;
            case 2:
                ret = "Ba";
                break;
            case 3:
                ret = "Bon";
                break;
            case 4:
                ret = "Nam";
                break;
            case 5:
                ret = "Sau";
                break;
            case 6:
                ret = "Bay";
                break;
            case 7:
                ret = "Tam";
                break;
            case 8:
                ret = "Chin";
                break;
            case 9:
                ret = "Muoi";
                break;
            case 10:
                ret = "J";
                break;
            case 11:
                ret = "Q";
                break;
            case 12:
                ret = "K";
                break;
        }
        switch (this.type) {
            case 0:
                ret += " Co";
                break;
            case 1:
                ret += " Ro";
                break;
            case 2:
                ret += " Chuon";
                break;
            case 3:
                ret += " Bich";
                break;
        }
        return ret;
    }
}
