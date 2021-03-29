package org.larby.simpleevent;

import org.larby.simpleevent.core.Event;

import java.util.UUID;

public interface iSimplePublisher {
    void publish(Event event);
}
