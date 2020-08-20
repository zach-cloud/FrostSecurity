# Frost Security

This is an implementation of the security algorithms written by Blizzard Entertainment, for their file format (MPQ)

Hashing and encryption is used internally to make the MPQ File Format more secure.

As such, these algorithms are intended only to be used to interface with the MPQ File Format. I discourage using FrostSecurity for any actual security use case outside of MPQ Files. These algorithms were written originally by Blizzard and are not industry standard encryption/hashing, and may have security flaws.

# Maven Import

Import FrostSecurity as such:

```
    <dependency>
        <groupId>com.github.zach-cloud</groupId>
        <artifactId>FrostSecurity</artifactId>
        <version>1.1</version>
    </dependency>
```

# Usage

To use, first create an instance of FrostSecurity:

```
    IFrostSecurity security = new FrostSecurity();
```

It will assume LITTLE_ENDIAN byte order. You can change this.

The base algorithm takes an integer array and key as such:
```
    int[] encrypt(int[] src, int key)
```

Additional methods have been written to encrypt and return byte arrays:
```
    byte[] encryptBytes(byte[] src, int key)
```

If the byte array is a size multiple of 4, it just encrypts all the integers available. If not, it will encrypt as many as possible and then append the un-encrypted bytes onto the end (for example with a size of 10 bytes, it would encrypt 2 integers and add 2 bytes onto the end. The result array would still be 10 bytes, 8 encrypted and 2 un-encrypted)

Each encrypt method has a corresponding decrypt method.

You can also one-way hash a value as such:

```
    int hashAsInt(String s, int hashType)
```

As a hash, this cannot be reversed; it simply provides a 32-bit integer representation of the provided String.

The hashType here should be one of the constants from the SecurityConstants class.

MPQ_HASH_TABLE_OFFSET should be used when hashing a value to find where in the hash table the file should exist

MPQ_HASH_NAME_A is the hashA value of a hash table entry

MPQ_HASH_NAME_B is the hashB value of a hash table entry

MPQ_HASH_FILE_KEY is used for calculating the key for an encrypted data entry

Anything else will be rejected with an exception.

# Exceptions

The methods written here can throw EncryptionException and HashingException. They are unchecked, so you can choose to catch them or not.