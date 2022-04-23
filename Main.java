/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlcanbo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author TRUONG
 */
public class Main {
     public static void main(String[] args) {
         ArrayList<CanBo> danhsach = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         CanBo cb = new CanBo();
         System.out.print("Nhap n : ");
         int n = Integer.parseInt(sc.nextLine());
         int s = 0 ;
         
         for(int i = 0 ; i < n ; i++){
             System.out.print("Nhap 1.Ky Su | 2.Nhan Vien | 3.Cong Nhan : ");
             int k = Integer.parseInt(sc.nextLine());
             if(k == 1){
                 CongNhan cn = new CongNhan();
                 cn.nhap();
                 danhsach.add(cn);
                 
             }
             else if(k == 2){
                 NhanVien nv = new NhanVien();
                 nv.nhap();
                 danhsach.add(nv);
             }
              else{
                  KySu ks = new KySu();
                  ks.nhap();
                   danhsach.add(ks);
              }
             
         }
         System.out.print("Xuat Phan Tu ");
         danhsach.forEach(o-> System.out.println(o.toString()));
         Collections.sort(danhsach, new Comparator<CanBo>(){

             @Override
             public int compare(CanBo o1, CanBo o2) {
              if(o1.getTuoi() == o2.getTuoi()) return 0;
              return o1.getTuoi() > o2.getTuoi() ? 1 : -1;
             }
         });
         System.out.print("Xuat Phan Tu ");
         danhsach.forEach(o-> System.out.println(o.toString()));
          Collections.sort(danhsach, new Comparator<CanBo>(){

             @Override
             public int compare(CanBo o1, CanBo o2) {
              if(o1.getHoten() == o2.getHoten()) return 0;
              String[] s1 = o1.getHoten().split(" ");
              String[] s2 = o2.getHoten().split(" ");
             return s1[s1.length-1].compareTo(s2[s2.length-2]);
             }
         });
         System.out.println("Xuat Phan Tu ");
        for(int i = danhsach.size() -1 ; i >= 0 ; i--){
            System.out.println(danhsach.get(i).toString());
        }
        System.out.print("Nhap Ho Ten Tim Kiem : ");
        String ss = sc.nextLine();
        int dem = 0;
        for(int i = 0 ; i < n ; i++){
            if(danhsach.get(i).getHoten().equalsIgnoreCase(ss)){
            System.out.println(danhsach.get(i).toString()); 
            dem++;
            }
        }
        if(dem == 0){
            System.out.println("Khong co trong ds");
        }
         
         
         
                 
         
     }
}
