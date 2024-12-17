package rest.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ElectionData {
    private String regionID;
    private String regionName;
    private String regionAddress;
    private String regionPostalCode;
    private String federalState;
    private String timestamp;
    private List<PartyData> countingData;

    public ElectionData() {
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionPostalCode() {
        return regionPostalCode;
    }

    public void setRegionPostalCode(String regionPostalCode) {
        this.regionPostalCode = regionPostalCode;
    }

    public String getRegionAddress() {
        return regionAddress;
    }

    public void setRegionAddress(String regionAddress) {
        this.regionAddress = regionAddress;
    }

    public String getFederalState() {
        return federalState;
    }

    public void setFederalState(String federalState) {
        this.federalState = federalState;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public List<PartyData> getCountingData() {
        return countingData;
    }

    public void setCountingData(List<PartyData> countingData) {
        this.countingData = countingData;
    }

    public List<PreferenceVote> getPreferenceVotes() {
        return preferenceVotes;
    }

    public void setPreferenceVotes(List<PreferenceVote> preferenceVotes) {
        this.preferenceVotes = preferenceVotes;
    }

    private List<PreferenceVote> preferenceVotes;
}
