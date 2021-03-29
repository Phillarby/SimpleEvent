package org.larby.simpleevent;

import org.junit.jupiter.api.Test;
import org.larby.simpleevent.core.Event;
import org.larby.simpleevent.core.Orchestrator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.UUID;

public class PublisherTests {


    @Test
    public void subscribeToPublisher() {

        //ARRANGE
        UUID id;
        Orchestrator orchestrator = Orchestrator.getInstance();
        iSimplePublisher publisher = new iSimplePublisher() {
            @Override
            public void publish(Event event) {

            }
        };

        //ACT
        id = orchestrator.registerPublisher(publisher);

        //ASSERT
        assertThat(id, is(instanceOf(UUID.class)));
    }

    @Test
    public void PublishEvent() {

        //ARRANGE
        UUID id;
        Orchestrator orchestrator = Orchestrator.getInstance();
        iSimplePublisher publisher = new iSimplePublisher() {
            @Override
            public void publish(Event event) {

            }
        };

        //ACT
        id = orchestrator.registerPublisher(publisher);

        //ASSERT
        assertThat(id, is(instanceOf(UUID.class)));
    }

    @Test
    public void ListenerCanHear() {

    }
}
