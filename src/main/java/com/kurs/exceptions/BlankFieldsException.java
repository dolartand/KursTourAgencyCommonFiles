package com.kurs.exceptions;

public class BlankFieldsException extends RuntimeException{
    public BlankFieldsException(){
        super("Все поля должны быть заполнены");
    }

    public BlankFieldsException(String message){
        super(message);
    }
}
