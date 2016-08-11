package ch.froorider.samples.controller;

import ch.froorider.samples.model.Campaign;
import org.apache.commons.lang3.StringUtils;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

import static ch.froorider.samples.controller.Pages.EDIT_CAMPAIGN;

/**
 * Created by U114843 on 11.08.2016.
 */
@SessionScoped
@Named
public class ListCampaignsController implements Serializable{

    private static final long serialVersionUID = 975451757265702984L;

    public String doAddCampaign(){
        System.out.println("Add Campaign");
        return EDIT_CAMPAIGN;
    }

    public String doEditCampaign(Campaign campaign){
        System.out.println("Edit campaign "+campaign);
        return Pages.EDIT_CAMPAIGN;
    }

    public String doEditDonationForm(Campaign campaign){
        System.out.println("Edit Donation Form of campaign "+campaign);
        return Pages.EDIT_DONATION_FORM;
    }

    public String doListDonations(Campaign campaign){
        System.out.println("List donations of campaign "+ campaign);
        return Pages.LIST_DONATIONS;
    }

    public String doDeleteCampaign(Campaign campaign){
        System.out.println("Not yet implemented!");
        return StringUtils.EMPTY;
    }
}
