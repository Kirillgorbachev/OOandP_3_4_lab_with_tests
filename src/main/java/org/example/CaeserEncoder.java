package org.example;

public class CaeserEncoder {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String DEFAULT_KEY = "zyxwvutsrqponmlkjihgfedcba";

    public static String encryptCaeser(String plaintext) {
        plaintext = plaintext.toLowerCase();
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);
            if (Character.isLetter(currentChar)) {
                int index = ALPHABET.indexOf(currentChar);
                if (index != -1) {
                    ciphertext.append(DEFAULT_KEY.charAt(index));
                }
            } else {
                ciphertext.append(currentChar); // Не буквенные символы остаются без изменений
            }
        }

        return ciphertext.toString();
    }

    public static String decryptCaeser(String ciphertext) {
        ciphertext = ciphertext.toLowerCase();
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            char currentChar = ciphertext.charAt(i);
            if (Character.isLetter(currentChar)) {
                int index = DEFAULT_KEY.indexOf(currentChar);
                if (index != -1) {
                    plaintext.append(ALPHABET.charAt(index));
                }
            } else {
                plaintext.append(currentChar); // Не буквенные символы остаются без изменений
            }
        }

        return plaintext.toString();
    }

}
