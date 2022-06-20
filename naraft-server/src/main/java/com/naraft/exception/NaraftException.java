package com.naraft.exception;

/**
 * @author qingshan1993
 * @version 1.0
 * @date 2022/6/20
 * @desc NaraftException
 */
public class NaraftException extends RuntimeException {

    private final static long serialVersionUID = 1L;

    public NaraftException(String s) {
        super(s);
    }

    public NaraftException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NaraftException(Throwable throwable) {
        super(throwable);
    }
}
