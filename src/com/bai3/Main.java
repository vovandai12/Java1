/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai3;

import com.bai2.HocVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        List<HocVien> ls = new ArrayList<>();
        System.out.println("->Nhập thông tin:");
        for (int i = 0; i < 4; i++) {
            HocVien hv = new HocVien();
            hv.nhapThongTin();
            ls.add(hv);
        }
        System.out.println("->Xuất thông tin:");
        for (HocVien l : ls) {
            l.xuatThongTin();
            l.hocLuc();
        }
    }
}
