package com.sda.postoffice;

public class PostOfficeApp {
    public static void main(String[] args) {

        Parcel socks = new Parcel("socks");




        System.out.println(socks);

        socks.changeStatus(ParcelStatus.DELIVERED);

        System.out.println(socks);

    }
}