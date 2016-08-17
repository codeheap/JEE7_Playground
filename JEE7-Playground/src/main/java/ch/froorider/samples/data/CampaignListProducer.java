package ch.froorider.samples.data;

import ch.froorider.samples.model.Account;
import ch.froorider.samples.model.Campaign;
import ch.froorider.samples.model.Donation;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by U114843 on 11.08.2016.
 */
@SessionScoped
@Named
public class CampaignListProducer implements Serializable{

    private static final long serialVersionUID = 8875948962653772425L;
    private List<Campaign> campaigns;

    public CampaignListProducer() {
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public List<Campaign> createMockCampaigns(){
        Donation donation1 = new Donation();
        donation1.setDonorName("Heinz Rühmann");
        donation1.setAmount(10000d);
        donation1.setReceiptRequested(true);
        donation1.setStatus(Donation.Status.TRANSFERRED);
        donation1.setAccount(new Account(donation1.getDonorName(),"UBS Zürich","CH11112345678"));

        Donation donation2 = new Donation();
        donation2.setDonorName("Kari Meyer");
        donation2.setAmount(100d);
        donation2.setReceiptRequested(false);
        donation2.setStatus(Donation.Status.IN_PROCESS);
        donation2.setAccount(new Account(donation2.getDonorName(),"Raiffeisen Lötschen","CH797872354970572"));

        List<Donation> donations = new LinkedList<>();
        donations.add(donation1);
        donations.add(donation2);

        Campaign campaign = new Campaign();
        campaign.setName("Brot für Brüder");
        campaign.setAmountDonatedSoFar(10100d);
        campaign.setDonationMinimum(20d);
        campaign.setIdentifier(666L);
        campaign.setTargetAmount(1000000d);
        campaign.setAccount(new Account("Thomas Hasler","WKB Oberwallis","CH7029587393754127"));
        campaign.setDonations(donations);

        List<Campaign> campaigns = new LinkedList<>();
        campaigns.add(campaign);
        return  campaigns;
    }
}
