
package de.hsbochum.fbg.kswe.scrum.events;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class InvalidSprintPeriodException extends Exception {

    public InvalidSprintPeriodException(String message) {
        super(message);
    }

    public InvalidSprintPeriodException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
