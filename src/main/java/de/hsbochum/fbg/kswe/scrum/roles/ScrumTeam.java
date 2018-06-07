
package de.hsbochum.fbg.kswe.scrum.roles;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class ScrumTeam {

    private final ProductOwner productOwner;
    private final ScrumMaster scrumMaster;
    private final DevelopmentTeam developmentTeam;

    public ScrumTeam() {
        this.productOwner = new ProductOwner();
        this.scrumMaster = new ScrumMaster();
        this.developmentTeam = new DevelopmentTeam();
    }

    public ProductOwner getProductOwner() {
        return productOwner;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public DevelopmentTeam getDevelopmentTeam() {
        return developmentTeam;
    }
    
}
