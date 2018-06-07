
package de.hsbochum.fbg.kswe.scrum.artifacts;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class NoBacklogItemsAvailableException extends Exception {

    public NoBacklogItemsAvailableException(String message) {
        super(message);
    }

    public NoBacklogItemsAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

}
