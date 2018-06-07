
package de.hsbochum.fbg.kswe.scrum.artifacts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Abstract class representing a Backlog. ProdcutBacklog and SprintBacklog
 * inherit from this class.
 * 
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public abstract class Backlog {
    
    private final List<BacklogItem> items = new ArrayList<>();
    
    public void addItem(BacklogItem item) {
        this.items.add(item);
        Collections.sort(this.items);
    }
    
    public List<BacklogItem> getItems() {
        return Collections.unmodifiableList(this.items);
    }
    
    public BacklogItem getAndRemoveHeadItem() throws NoBacklogItemsAvailableException {
        try {
            BacklogItem item = this.items.get(0);
            
            this.items.remove(item);
            return item;
        }
        catch (IndexOutOfBoundsException e) {
            throw new NoBacklogItemsAvailableException("Backlog is empty!", e);
        }
    }
    
}
