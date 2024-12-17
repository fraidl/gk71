package rest.model;

public class PartyData {
    private String partyID;
    private int amountVotes;

    public PartyData(String partyID, int amountVotes) {
        this.partyID = partyID;
        this.amountVotes = amountVotes;
    }

    public String getPartyID() {
        return partyID;
    }

    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    public int getAmountVotes() {
        return amountVotes;
    }

    public void setAmountVotes(int amountVotes) {
        this.amountVotes = amountVotes;
    }
}
