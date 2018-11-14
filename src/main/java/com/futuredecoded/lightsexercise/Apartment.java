/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futuredecoded.lightsexercise;

import java.util.Scanner;

/**
 *
 * @author Andrei
 */
public class Apartment {

    static boolean kitchen;
    static boolean bathroom;
    static boolean livingroom;
    static boolean bedroom;

    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static Scanner sc3 = new Scanner(System.in);

    public static void main(String[] args) {
        createRoom("kitchen", kitchen, sc1);
        createRoom("bathroom", bathroom, sc2);
        createRoom("livingroom", livingroom, sc3);
        createRoom("bedroom", bedroom, sc);
        show();
        close();
    }

    private static void createRoom(String x, boolean room, Scanner scnew) {

        System.out.println(x + " bec aprins scrie True, stins scrie False");
        room = scnew.nextBoolean();
        if (room == true) {
            System.out.println("Bec Aprins in " + x);

        } else {
            System.out.println("Bec Stins in " + x);

        }
    }

    private static void show() {
        System.out.println("kitchen " + kitchen + "\n bathroom " + bathroom + "\n livingroom " + livingroom + "\n bedroom " + bedroom);

    }

    private static void close() {
        System.out.println(!kitchen ? "ON" : " ");
        System.out.println(!bathroom ? "ON" : " ");
        System.out.println(!livingroom ? "ON" : " ");
        System.out.println(!bedroom ? "ON" : " ");

    }
}
