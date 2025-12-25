package com.spotify.oauth2.utils;

import com.github.javafaker.Faker;

public class FakerUtils {

    public static String generateName(){
        Faker faker = new Faker();
       return "Playlist " + faker.regexify("[A-Za-z0-9 ,_-]{10}");
        //return "Playlist " + faker.regexify("[A-Za-z0-9 ]{10}");
    }

    public static String generateDescription(){
        Faker faker = new Faker();
        return "Description " + faker.regexify("[ A-Za-z0-9_@./#&+-]{50}");
    }
    public static void main(String[] args) {
         Faker faker = new Faker();
       String PlaylistName = "Playlist " + faker.regexify("[A-Za-z0-9 ,_-]{10}");
       System.out.println(" PL:"+PlaylistName);
       String Description = "Description " + faker.regexify("[ A-Za-z0-9_@./#&+-]{50}");
        System.out.println("DESC:"+Description);
    }
}
