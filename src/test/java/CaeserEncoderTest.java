import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.CaeserEncoder;

public class CaeserEncoderTest {

    @Test
    public void testEncrypt() {
        // Проверяем шифрование для обычного текста
        String plaintext = "hello world";
        String expectedCiphertext = "svool dliow";
        assertEquals(expectedCiphertext, CaeserEncoder.encrypt(plaintext));

        // Проверяем шифрование для текста с пробелами и знаками препинания
        plaintext = "abc! 123";
        expectedCiphertext = "zyx! 123";
        assertEquals(expectedCiphertext, CaeserEncoder.encrypt(plaintext));
    }

    @Test
    public void testDecrypt() {
        // Проверяем расшифровку для зашифрованного текста
        String ciphertext = "svool dliow";
        String expectedPlaintext = "hello world";
        assertEquals(expectedPlaintext, CaeserEncoder.decrypt(ciphertext));

        // Проверяем расшифровку для текста с пробелами и знаками препинания
        ciphertext = "zyx! 123";
        expectedPlaintext = "abc! 123";
        assertEquals(expectedPlaintext, CaeserEncoder.decrypt(ciphertext));
    }

    @Test
    public void testEncryptDecryptConsistency() {
        // Проверяем, что шифрование и расшифровка взаимно обратны
        String plaintext = "test message";
        String encrypted = CaeserEncoder.encrypt(plaintext);
        String decrypted = CaeserEncoder.decrypt(encrypted);
        assertEquals(plaintext, decrypted);
    }

    @Test
    public void testEncryptDecryptEmptyString() {
        // Проверяем работу с пустой строкой
        String plaintext = "";
        String encrypted = CaeserEncoder.encrypt(plaintext);
        String decrypted = CaeserEncoder.decrypt(encrypted);
        assertEquals(plaintext, decrypted);
    }

    @Test
    public void testEncryptDecryptNonAlphabetic() {
        // Проверяем работу с текстом, не содержащим букв
        String plaintext = "12345!@#";
        String encrypted = CaeserEncoder.encrypt(plaintext);
        String decrypted = CaeserEncoder.decrypt(encrypted);
        assertEquals(plaintext, decrypted);
    }
}
