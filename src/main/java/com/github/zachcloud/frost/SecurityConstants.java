package com.github.zachcloud.frost;

/**
 * Constants to use for hashing
 */
public interface SecurityConstants {

    /**
     * These constants represent values you can use as inputs
     * to the hash function.
     *
     * Each will provide a different hash result.
     *
     * MPQ_HASH_TABLE_OFFSET should be used when hashing a value to find
     * where in the hash table the file should exist
     *
     * MPQ_HASH_NAME_A is the hashA value of a hash table entry
     *
     * MPQ_HASH_NAME_B is the hashB value of a hash table entry
     *
     * MPQ_HASH_FILE_KEY is used for calculating the key for an encrypted
     * data entry
     */
    int MPQ_HASH_TABLE_OFFSET = 0;
    int MPQ_HASH_NAME_A = 1;
    int MPQ_HASH_NAME_B = 2;
    int MPQ_HASH_FILE_KEY = 3;

}
