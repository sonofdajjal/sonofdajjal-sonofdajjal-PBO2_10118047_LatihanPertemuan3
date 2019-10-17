/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboIF2.pkg10118047.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan33Login {

    private static String usName, passWord;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        
        user.pengecekkanLogin(usName, passWord);
    }
    
}
