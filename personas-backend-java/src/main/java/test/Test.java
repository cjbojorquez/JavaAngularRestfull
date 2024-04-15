/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author cjbojorquez
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Proporcionar titulo:");
        Scanner consola = new Scanner(System.in);
        String titulo = consola.nextLine();
        System.out.println("Proporcionar autor:");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
