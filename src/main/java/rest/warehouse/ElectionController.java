package rest.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import rest.model.ElectionData;

@RestController
@RequestMapping("/election")
public class ElectionController {

    @Autowired
    private ElectionService service;

    @GetMapping(value = "/{regionID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ElectionData getElectionDataJson(@PathVariable String regionID) {
        return service.getElectionData(regionID);
    }

    @GetMapping(value = "/{regionID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ElectionData getElectionDataXml(@PathVariable String regionID) {
        return service.getElectionData(regionID);
    }
}
