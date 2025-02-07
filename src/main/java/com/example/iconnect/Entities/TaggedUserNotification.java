package com.example.iconnect.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TaggedUserNotification extends Notification implements Serializable {
    public TaggedUserNotification(String message,User sender)
    {
        super(message,sender);
    }

    public String getMessage(){
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
