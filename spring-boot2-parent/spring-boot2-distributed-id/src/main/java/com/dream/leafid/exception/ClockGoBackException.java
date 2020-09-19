package com.dream.leafid.exception;

public class ClockGoBackException extends RuntimeException {
	private static final long serialVersionUID = -2021330616975162738L;

	public ClockGoBackException(String message) {
        super(message);
    }
}
