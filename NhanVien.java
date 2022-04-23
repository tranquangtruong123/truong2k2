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
public class NhanVien extends CanBo{
    public String congviec;

    public NhanVien() {
    }
    public NhanVien(String congviec) {
        this.congviec = congviec;
    }
    public NhanVien(String congviec, String hoten, int tuoi, String gioitinh, String diachi) {
        super(hoten, tuoi, gioitinh, diachi);
        this.congviec = congviec;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Cong Viec : ");
        congviec = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+ " congviec=" + congviec ;
    }
    

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }
    
    
}
