package ru.auction.exception;

public class LotWrongStatusException extends RuntimeException{

    public LotWrongStatusException(String message) {
        super(message);
    }
}