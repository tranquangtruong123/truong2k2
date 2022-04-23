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
public class CongNhan extends CanBo{
    public int level;

    public CongNhan() {
    }

    public CongNhan(int level) {
        this.level = level;
    }

    public CongNhan(int level, String hoten, int tuoi, String gioitinh, String diachi) {
        super(hoten, tuoi, gioitinh, diachi);
        this.level = level;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap level : ");
        level = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + " level=" + level;
    }

    
    

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
}
