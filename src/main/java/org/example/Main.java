package org.example;

public class Main {
    public static void main(String[] args) {
        String message = "MyPass#123";

        String sha256Hash = SHA256HashGenerator.getSHA256Hash(message);

        if (sha256Hash != null) {
            System.out.println(sha256Hash);
        } else {
            System.out.println("Error computing hash");
        }
    }
}
