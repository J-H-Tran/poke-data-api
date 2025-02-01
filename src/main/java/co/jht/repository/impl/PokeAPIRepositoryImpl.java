package co.jht.repository.impl;

import co.jht.model.mon.response.PocketMonster;
import co.jht.repository.PokeAPIRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Repository
public class PokeAPIRepositoryImpl implements PokeAPIRepository {

    @Value("${pokeapi.base.uri}")
    private String baseUri;

    private final HttpClient hc = HttpClient.newHttpClient();
    private final ObjectMapper om = new ObjectMapper();

    public PocketMonster getPocketMonsterById(Long id) throws IOException, InterruptedException {
        String urlString = baseUri + "/pokemon/" + id;

        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(URI.create(urlString))
                        .GET()
                        .build();

        HttpResponse<String> response = hc.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("HttpResponseCode: " + response.statusCode());
        }

        return om.readValue(response.body(), PocketMonster.class);
    }

}