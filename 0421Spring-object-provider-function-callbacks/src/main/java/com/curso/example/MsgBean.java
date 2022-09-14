package com.curso.example;

public class MsgBean {
    private String msg;

    public MsgBean(String msg) {
        this.msg = msg;
    }

    public void showMessage() {
        System.out.println("msg: " + msg);
    }
}