import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class CryptoManagerTestStudent 
{
    @Test    
    public void testStringInBounds()
    {
        // Arrange
        String insideBound = "HELLO WORLD!";
        String outsideBounds = "alien";

        // Act
        boolean result1 = CryptoManager.isStringInBounds(insideBound);
        boolean result2 = CryptoManager.isStringInBounds(outsideBounds);

        // Assert
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
	public void testEncryptCaesar()
    {
        // Arrange
        String notInsideBounds = "adios";
        String originalText = "HELLO";
        int keyNumber = 5;
        String expectedEncryptedText = "MJQQT"; 

        // Act
        String result1 = CryptoManager.caesarEncryption(originalText, keyNumber);
        String result2 = CryptoManager.caesarEncryption(notInsideBounds, keyNumber);

        // Assert
        assertEquals(expectedEncryptedText, result1);
        assertEquals("The selected string is not in bounds, Try again.", result2);
    }

    @Test
	public void testDecryptCaesar()
    {
        // Arrange
        String encryptedText = "Q\\OK^";
        int keyNumber = 10;
        String expectedDecryptedText = "GREAT";

        // Act
        String result = CryptoManager.caesarDecryption(encryptedText, keyNumber);
      
        // Assert
        assertEquals(expectedDecryptedText, result);
    }

    @Test
	public void testEncryptBellaso()
    {
        // Arrange
        String originalText = "PURPLE";
        String keyText = "ABC";
        String expectedEncryptedText = "QWUQNH"; 

        // Act
        String result = CryptoManager.bellasoEncryption(originalText, keyText);

        // Assert
        assertEquals(expectedEncryptedText, result);
    }

    @Test
	public void testDecryptBellaso()
    {
         // Arrange
         String encryptedText = "]SHF\"P!S";
         String keyText = "GREEN";
         String expectedDecryptedText = "VACATION";
 
         // Act
         String result = CryptoManager.bellasoDecryption(encryptedText, keyText);
       
         // Assert
         assertEquals(expectedDecryptedText, result);
    }


}
