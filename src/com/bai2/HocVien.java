/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class HocVien {

    private String ten;
    private int tuoi;
    private Double diem;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên:");
        ten = sc.nextLine();
        System.out.println("Tuổi:");
        tuoi = sc.nextInt();
        System.out.println("Điểm:");
        diem = sc.nextDouble();
    }

    public void xuatThongTin() {
        System.out.println("Sinh vien -> " + getTen() + " - " + getTuoi() + " - " + getDiem());
    }

    public void hocLuc() {
        if (getDiem() < 3) {
            System.out.println("-> Học Lưc kém");
        } else if (getDiem() >= 3 && getDiem() < 5) {
            System.out.println("-> Học lực yếu");
        }else if(getDiem() >= 5 && getDiem() < 6.5){
            System.out.println("-> Học lực trung bình");
        }else if(getDiem() >= 6.5 && getDiem() < 7.5){
            System.out.println("-> Học lực trung khá");
        }else if(getDiem() >= 7.5 && getDiem() < 9){
            System.out.println("-> Học lực giỏi");
        }else{
            System.out.println("->Học lực xuất xắc");
        }
    }

    public HocVien() {
    }

    public HocVien(String ten, int tuoi, Double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

}
