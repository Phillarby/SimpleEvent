package org.larby.simpleevent.core;

import java.time.LocalDateTime;

/**
 * Basic structure of an event
 */
public class Event {
    private String subject;
    private String message;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
