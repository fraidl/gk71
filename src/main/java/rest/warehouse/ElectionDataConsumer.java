package rest.warehouse;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rest.model.ElectionData;

@Service
public class ElectionDataConsumer {

    private static final String API_URL = "http://localhost:8080/election/{regionID}";

    public ElectionData fetchElectionData(String regionID) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, ElectionData.class, regionID);
    }
}
