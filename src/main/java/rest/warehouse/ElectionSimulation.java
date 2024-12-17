package rest.warehouse;

import java.util.ArrayList;
import java.util.List;
import rest.model.*;

public class ElectionSimulation {

    private int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public ElectionData generateElectionData(String regionID) {
        ElectionData data = new ElectionData();
        data.setRegionID(regionID);
        data.setRegionName("Linz Bahnhof");
        data.setRegionAddress("Bahnhofsstrasse 27/9");
        data.setRegionPostalCode("4020");
        data.setFederalState("Austria");

        List<PartyData> countingData = new ArrayList<>();
        countingData.add(new PartyData("OEVP", getRandomInt(300, 500)));
        countingData.add(new PartyData("SPOE", getRandomInt(250, 400)));
        countingData.add(new PartyData("FPOE", getRandomInt(200, 350)));
        countingData.add(new PartyData("GRUENE", getRandomInt(150, 300)));
        countingData.add(new PartyData("NEOS", getRandomInt(100, 250)));
        data.setCountingData(countingData);

        List<PreferenceVote> preferenceVotes = new ArrayList<>();
        preferenceVotes.add(new PreferenceVote(1, "Candidate 1", getRandomInt(50, 150)));
        preferenceVotes.add(new PreferenceVote(2, "Candidate 2", getRandomInt(30, 100)));
        preferenceVotes.add(new PreferenceVote(3, "Candidate 3", getRandomInt(20, 80)));
        data.setPreferenceVotes(preferenceVotes);

        return data;
    }
}
