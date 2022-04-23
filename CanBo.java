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
public class CanBo {
    public String hoten;
    public int tuoi;
    public String gioitinh;
    public String diachi;
    public CanBo() {
    }
    public CanBo(String hoten, int tuoi, String gioitinh, String diachi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        hoten = sc.nextLine();
        System.out.print("Nhap Tuoi : ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap Gioi Tinh : ");  
        gioitinh = sc.nextLine();
        System.out.print("Nhap Dia Chi : ");
        diachi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "CanBo{" + "hoten=" + hoten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", diachi=" + diachi + '}';
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
}
