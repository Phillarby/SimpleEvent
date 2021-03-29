package org.larby.simpleevent;

import org.larby.simpleevent.core.Event;

/**
 * A simple notifier interface required to subscribe to simpe events
 */
public interface iSimpleListener {

    /**
     * This method is called to notify the listener of an event
     * @param event the event being notified
     */
    void simpleNotify (Event event);

}
