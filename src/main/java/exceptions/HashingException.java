package exceptions;

/**
 * An exception that is thrown when an encrypt/decrypt exception fails.
 */
public final class HashingException extends RuntimeException {

    public HashingException(Exception other) {
        super(other);
    }

    public HashingException(String message) {
        super(message);
    }

    public HashingException() {
        super();
    }
}
