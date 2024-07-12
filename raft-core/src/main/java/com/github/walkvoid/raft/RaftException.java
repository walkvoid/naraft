package com.github.walkvoid.raft;

/**
 * @author qingshan1993
 * @version 1.0
 * @date 2022/6/20
 * @desc NaraftException
 */
public class RaftException extends RuntimeException {

    private final static long serialVersionUID = 1L;

    public RaftException(String s) {
        super(s);
    }

    public RaftException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public RaftException(Throwable throwable) {
        super(throwable);
    }
}
