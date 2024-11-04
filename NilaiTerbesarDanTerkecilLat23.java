/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.percobaan1;

import java.util.Scanner;

/**
 * Nama     : Agshar Daffaa Shidqii
 * NIM      : 23176030
 * Prodi    : Sistem Informasi
 */
public class NilaiTerbesarDanTerkecilLat23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("===== Program nilai terbesar dan terkecil mahasiswa =====");
        System.out.print("Masukan nama petugas : ");
        String petugas = inputan.nextLine();
        System.out.print("Masukan banyaknya mahasiswa : ");
        int jumlahMahasiswa = inputan.nextInt();
        double nilaiTerbesar = Double.MIN_VALUE;
        double nilaiTerkecil = Double.MAX_VALUE;
        
        for(int i=1; i<=jumlahMahasiswa; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+i+" = ");
            double nilai = inputan.nextDouble();            
            if(nilai > nilaiTerbesar){
                nilaiTerbesar = nilai;
            }
            
            if(nilai < nilaiTerkecil){
                nilaiTerkecil = nilai;
            }
        }               
        
        
        
        System.out.println("\nNilai terbesar adalah : " +nilaiTerbesar);
        System.out.println("Nilai terkecil adalah : " +nilaiTerkecil);
        System.out.println("Petugas : " +petugas);
    }
    
}