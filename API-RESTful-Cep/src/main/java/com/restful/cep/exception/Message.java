package com.restful.cep.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message extends Exception{
	

	private static final long serialVersionUID = 6887040633821804859L;
	

	public Message(String message) {
		super(message);

	}

}
