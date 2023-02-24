/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bai1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Nhập vào bàn phím");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Các số lẻ");
         for (int i = 0; i < 5; i++) {
             if (arr[i] % 2 != 0) {
                 System.out.println(arr[i]);
             }
        }
         
         int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        System.out.println("Xắp xếp giảm dần");
        for (int i = 0; i < 5; i++) {
            
                 System.out.println(arr[i]);
             
        }

    }
}
