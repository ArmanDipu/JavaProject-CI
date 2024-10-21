package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class SHA256HashGeneratorTest {

    @Test
    public void testGetSHA256Hash_validInput() {
        String message = "Hello, World!";
        String expectedHash = "dffd6021bb2bd5b0af676290809ec3a53191dd81c7f70a4b28688a362182986f";

        String actualHash = SHA256HashGenerator.getSHA256Hash(message);

        assertNotNull(actualHash, "Hash should not be null");
        assertEquals(expectedHash, actualHash, "Hash does not match the expected value");
    }

    @Test
    public void testGetSHA256Hash_emptyInput() {
        String message = "";
        String expectedHash = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";

        String actualHash = SHA256HashGenerator.getSHA256Hash(message);

        assertNotNull(actualHash, "Hash should not be null");
        assertEquals(expectedHash, actualHash, "Hash does not match the expected value for an empty string");
    }}

