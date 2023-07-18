package ru.auction.exception;

public class LotIdException extends IllegalArgumentException{

    public LotIdException(String s) {
        super(s);
    }
}