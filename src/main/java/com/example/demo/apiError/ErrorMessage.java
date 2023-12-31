package com.example.demo.apiError;
import java.util.*;

public class ErrorMessage {
    private String message;
    private String uri;
    private Date timestamp;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public ErrorMessage(String message, String uri, Date timestamp) {
        this.message = message;
        this.uri = uri;
        this.timestamp = timestamp;
    }

    
}
