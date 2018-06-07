
package de.hsbochum.fbg.kswe.scrum.artifacts;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class BacklogItem implements Comparable {

    public enum Priority {
        HIGH,
        MEDIUM,
        LOW
    }
    
    private final String title;
    private final String description;
    private final Priority priority;
    private boolean done = false;
    
    public BacklogItem(String title, String description, Priority priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }
    
    public Priority getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public BacklogItem done() {
        this.done = true;
        return this;
    }
    
    @Override
    public int compareTo(Object o) {
        if (o == null || !(o instanceof BacklogItem)) {
            return 1;
        }
        
        BacklogItem bi = (BacklogItem) o;
        
        // if we are not done, but the other is, we are higher
        if (bi.done && !this.done) {
            return 1;
        }
        
        // default: compare by priority
        return this.getPriority().compareTo(bi.getPriority());
    }
    
}
