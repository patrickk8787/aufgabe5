
package de.hsbochum.fbg.kswe.scrum.events;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class UnexpectedNextEventException extends Exception {

    public UnexpectedNextEventException(String message) {
        super(message);
    }

    public UnexpectedNextEventException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
