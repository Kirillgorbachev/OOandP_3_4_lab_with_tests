import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.CaeserEncoder;

public class CaeserEncoderTest {

    @Test
    public void testEncrypt_WhenNormalText_ExpectedEncryption() {
        String plaintext = "hello world";
        String expectedCiphertext = "svool dliow";
        assertEquals(expectedCiphertext, CaeserEncoder.encryptCaeser(plaintext));
    }

    @Test
    public void testEncrypt_WhenPunctuationMarks_ExpectedEncryption(){
        String plaintext = "abc! 123";
        String expectedCiphertext = "zyx! 123";
        assertEquals(expectedCiphertext, CaeserEncoder.encryptCaeser(plaintext));
    }

    @Test
    public void testDecrypt_WhenEncryptedText_ExpectedDecryption() {
        String ciphertext = "svool dliow";
        String expectedPlaintext = "hello world";
        assertEquals(expectedPlaintext, CaeserEncoder.decryptCaeser(ciphertext));
    }

    @Test
    public void testDecrypt_WhenPunctuationMarks_ExpectedDecryption() {
        String ciphertext = "zyx! 123";
        String expectedPlaintext = "abc! 123";
        assertEquals(expectedPlaintext, CaeserEncoder.decryptCaeser(ciphertext));
    }

    @Test
    public void testEncryptDecryptConsistency_WhenNormalText_ExpectedConsistent() {
        String plaintext = "test message";
        String encrypted = CaeserEncoder.encryptCaeser(plaintext);
        String decrypted = CaeserEncoder.decryptCaeser(encrypted);
        assertEquals(plaintext, decrypted);
    }

    @Test
    public void testEncryptDecryptEmptyString_WhenEmptyString_ExpectedNoChange() {
        String plaintext = "";
        String encrypted = CaeserEncoder.encryptCaeser(plaintext);
        String decrypted = CaeserEncoder.decryptCaeser(encrypted);
        assertEquals(plaintext, decrypted);
    }

    @Test
    public void testEncryptDecryptNonAlphabetic_NonAlphabeticText_ExpectedNoChange() {
        String plaintext = "12345!@#";
        String encrypted = CaeserEncoder.encryptCaeser(plaintext);
        assertEquals(plaintext, encrypted);
    }
}
