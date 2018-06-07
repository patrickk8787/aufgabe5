package de.hsbochum.fbg.kswe.scrum.events;

import de.hsbochum.fbg.kswe.scrum.artifacts.ProductBacklog;

/**
 * This interface represents a Scrum Event.
 * 
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public interface Event {

    /**
     * Considering the Scrum Guide, events have to follow
     * a strict order. E.g., no Sprint Planning before the
     * Retrospective. This method allows an Event to
     * define the subsequent type of Event.
     * 
     * @return the Class of the following event
     */
    Class<? extends Event> followingEventType();
    
    /**
     * this method allows an Event to initialize itself, using
     * the previous event instance and the overall Product Backlog.
     * 
     * @param previous the previous event
     * @param productBacklog the product backlog instance
     * @throws InitializationException if the Event could not be initialized
     */
    void init(Event previous, ProductBacklog productBacklog) throws InitializationException;
    
}
