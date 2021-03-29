package org.larby.simpleevent.core;

import org.larby.simpleevent.iSimpleListener;
import org.larby.simpleevent.iSimplePublisher;

import java.util.HashMap;
import java.util.UUID;

public class Orchestrator {

    private static HashMap<UUID, iSimpleListener> listeners;
    private static HashMap<UUID, iSimplePublisher> publishers;
    private static Orchestrator orchestrator;

    static {
        orchestrator = new Orchestrator();
        listeners = new HashMap<UUID, iSimpleListener>();
        publishers = new HashMap<UUID, iSimplePublisher>();
    }

    public static Orchestrator getInstance() {
        return orchestrator;
    }

    public UUID registerListener(iSimpleListener listener) {
        //Generate a random identifier for the subscription
        UUID id = UUID.randomUUID();

        //Add the listener using the generated id
        listeners.put(id, listener);

        //Send the id back to the listener for them to manage
        return id;
    }

    public UUID registerPublisher(iSimplePublisher publisher) {
        //Generate a random identifier for the subscription
        UUID id = UUID.randomUUID();

        //Add the listener using the generated id
        publishers.put(id, publisher);

        //Send the id back to the listener for them to manage
        return id;
    }

    /**
     * publish an event
     * @param id the ID of the publisher
     * @param event
     */
    public void publish(UUID id, Event event) throws Exception {
        //Verify that the publishing source is a valid
        if (!publishers.containsKey(id)) {
            throw new Exception(); //TODO:  Properify the exception
        }

        //Notify each registered listener of the event
        listeners.values().forEach(x -> x.simpleNotify(event));
    }


}
