package com.flintmatch.service;

public class MatchSearchException extends Exception {

    public MatchSearchException() {
    }

    public MatchSearchException(String message) {
        super(message);
    }

    public MatchSearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public MatchSearchException(Throwable cause) {
        super(cause);
    }

    public MatchSearchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
