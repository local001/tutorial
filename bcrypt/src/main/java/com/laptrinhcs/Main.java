package com.laptrinhcs;

import org.mindrot.jbcrypt.BCrypt;

public class Main {

    public static void main(String[] args) {
        /*encode password*/
        String encode = BCrypt.hashpw("123", BCrypt.gensalt(10));
        System.out.println("password encode: " + encode);
        /*check password*/
        System.out.println("check password: " + BCrypt.checkpw("123", encode));
    }
}
