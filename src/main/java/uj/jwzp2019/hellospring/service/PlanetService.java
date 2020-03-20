package uj.jwzp2019.hellospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uj.jwzp2019.hellospring.model.Planet;

@Service
public class PlanetService {

    private final String starWarsApiUrl;
    private final RestTemplate restTemplate;

    @Autowired
    public PlanetService(@Value("${starwars.api.url}") String starWarsApiUrl, RestTemplate restTemplate) {
        this.starWarsApiUrl = starWarsApiUrl;
        this.restTemplate = restTemplate;
    }

    public Planet getPlanetById(int id) {
        return null;
    }

    public Planet getPlanetByUrl(String url) {
        return null;
    }

    public Planet getSmallestPlanetInRange(int fromId, int toId) {
        return null;
    }
}
