package com.example.postgresql.exception;

public class ResorceNotFoundException extends Exception {
	private static final long serialVersionUID =1L;
	public ResorceNotFoundException(String message)
	{
		super(message);
	}
}
