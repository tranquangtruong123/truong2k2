/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlcanbo;

import java.util.Scanner;

/**
 *
 * @author TRUONG
 */
public class KySu extends CanBo{
    public String nDT;
    static int count = 0;
    public KySu(String nDT) {
        this.nDT = nDT;
    }
    public KySu(String nDT, String hoten, int tuoi, String gioitinh, String diachi) {
        super(hoten, tuoi, gioitinh, diachi);
        this.nDT = nDT;
    }
    public KySu() {
    }
    public void nhap(){
       super.nhap(); 
       count ++;
       Scanner sc = new Scanner(System.in);
       System.out.print("Nganh Dao Tao : ");
       nDT = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " nDT=" + nDT ;
    }

    public String getnDT() {
        return nDT;
    }

    public void setnDT(String nDT) {
        this.nDT = nDT;
    }
    
    
    
}
