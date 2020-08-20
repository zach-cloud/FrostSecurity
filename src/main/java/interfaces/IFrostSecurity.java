package interfaces;

import java.nio.ByteBuffer;

/**
 * Security interface. Provides encryption, decryption, and hashing methods.
 * Implemented by Frostsecurity.
 */
public interface IFrostSecurity {

    /**
     * Decrypts integer array using the Storm algorithm.
     * If input array is null, returns null;
     *
     * @param src   Integer source array
     * @param key   Key to encrypt with
     * @return      Decrypted integer array
     */
    int[] decrypt(int[] src, int key);

    /**
     * Decrypts the specified bytes array.
     * Uses the Storm algorithm
     * Byte array must be divisible by 4 and contain
     * integers in each four position (0-3, 4-7, etc)
     * If a null array is provided, returns a null array.
     *
     * @param src   Source bytes array
     * @param key   Key to decrypt with
     * @return      Decrypted bytes array
     */
    byte[] decryptBytes(byte[] src, int key);

    /**
     * Encrypts the specified integer array using the Storm frost algorithm
     * If input array is null, returns null
     *
     * @param src   Integer source array
     * @param key   Key to encrypt with
     * @return      Encrypted integer array
     */
    int[] encrypt(int[] src, int key);

    /**
     * Decrypts the specified byte buffer
     * Uses the Storm algorithm
     * Byte buffer size must be divisible by 4 and
     * contain integers in each four position (0-3, 4-6, etc)
     * If a null buffer is provided, returns a null buffer
     *
     * @param src   Source buffer
     * @param key   Key to decrypt with
     * @return      Decrypted buffer
     */
    ByteBuffer decryptBuffer(ByteBuffer src, int key);

    /**
     * Encrypts the specified byte buffer
     * Uses the Storm algorithm
     * Byte buffer size must be divisible by 4 and
     * contain integers in each four position (0-3, 4-6, etc)
     * If a null buffer is provided, returns a null buffer
     *
     * @param src Source buffer
     * @param key Key to encrypt with
     * @return Encrypted buffer
     */
    ByteBuffer encryptBuffer(ByteBuffer src, int key);


    /**
     * Encrypts the specified bytes array.
     * Uses the Storm algorithm
     * Byte array must be divisible by 4 and contain
     * integers in each four position (0-3, 4-7, etc)
     * If a null array is provided, returns a null array.
     *
     * @param src   Source bytes array
     * @param key   Key to encrypt with
     * @return      Encrypt bytes array
     */
    byte[] encryptBytes(byte[] src, int key);

    /**
     * Hashes the String using Storm algorithm and returns the key
     * as an long
     *
     * @param s        String to hash
     * @param hashType Hash type (see constants of this class; 0-3)
     * @return Hash value as long
     */
    long hashString(String s, int hashType);

    /**
     * Decrypts a single integer.
     *
     * @param src Source integer to decrypt
     * @param key Key to decrypt with
     * @return Decrypted integer
     */
    int decrypt(int src, int key);

    /**
     * Encrypts a single integer.
     *
     * @param src Source integer to encrypt
     * @param key Key to encrypt with
     * @return Encrypted integer
     */
    int encrypt(int src, int key);

    /**
     * Hashes the String using Storm algorithm and returns the key
     * as an integer (rather than long)
     *
     * @param s        String to hash
     * @param hashType Hash type (see constants of this class; 0-3)
     * @return Hash value as int
     */
    int hashAsInt(String s, int hashType);
}
