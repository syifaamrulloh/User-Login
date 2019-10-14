/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k10118910.latihan33.user.login;
import java.util.*;
/**
 *
 * @author syifa
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program untuk Proses Login User
 * dengan konsep Objek
 */
public class Latihan33Login {

    private String usName,passWord;
    
    public static void main(String[] args) {
        //inisiasi Objek
        Latihan33Login inp = new Latihan33Login();
        User usr = new User();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username\t= ");
        inp.usName = input.nextLine();
        System.out.print("Masukan Password\t= ");
        inp.passWord = input.nextLine();
        
        usr.pengecekanLogin(inp.usName, inp.passWord);
    }
    
}
