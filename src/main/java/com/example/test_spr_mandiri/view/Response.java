package com.example.test_spr_mandiri.view;

import org.springframework.http.HttpStatus;

/**
 * @author Muhammad Iqbal Fadillah on 12/11/2022
 */
public class Response {

    private HttpStatus status;
    private String messages;
    private String data;


    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
