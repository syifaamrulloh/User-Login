/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k10118910.latihan33.user.login;

/**
 *
 * @author syifa
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program untuk proses Login User
 * dengan konsep Objek
 */
public class User {
    private final String username,password;
    private boolean statusAkun;
    
    public User(){
    username = "RizkiAdam";
    password = "terbaikselalu";
    }
    private boolean cekAkun(String UserName,String Password){
        if(username.equals(UserName) && password.equals(Password))
           statusAkun = true;
        else
           statusAkun = false;
        
        return statusAkun;
    }
    
    private void hasilLogin(boolean status,String UserName){
        if(status){
            System.out.println("\n******* HALLO " + UserName.toUpperCase() + " *******");
            System.out.println("Selamat Datang di Aplikasi Ini");
        }else{
            System.out.println("\nOoops, Username atau Password anda salah");
        }    
    }
    
    public void pengecekanLogin(String UserName,String Password){
        hasilLogin(cekAkun(UserName, Password), UserName);
    }
}
