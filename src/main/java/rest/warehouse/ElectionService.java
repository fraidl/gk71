package rest.warehouse;

import org.springframework.stereotype.Service;
import rest.model.ElectionData;

@Service
public class ElectionService {

    public ElectionData getElectionData(String regionID) {
        ElectionSimulation simulation = new ElectionSimulation();
        return simulation.generateElectionData(regionID);
    }
}
