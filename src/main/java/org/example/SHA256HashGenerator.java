package org.example;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256HashGenerator {
    public static String getSHA256Hash(String input) {
        try {
            // Get an instance of the SHA-256 algorithm
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Compute the hash and get the byte array
            byte[] encodedHash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array into a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
