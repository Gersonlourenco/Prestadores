package com.gerson.teste.proximidade;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gerson.teste.proximidade.model.Matrix;

public class DistanciaClient {

	private final String HOST;
	private final CloseableHttpClient HTTP_CLIENT;
	private final String YOUR_API_KEY;

	public DistanciaClient() {
		HTTP_CLIENT = HttpClients.createDefault();
		HOST = "https://maps.googleapis.com/maps/api/distancematrix/";
		YOUR_API_KEY = "#YOUR_API_KEY#";
	}

	public Matrix sendGet(Double latitudeOrigem, Double longitudeOrigem,
			Double latitudeDestino, Double longitudeDestino) throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(HOST)
			.append("json?")
			.append("origins=").append(latitudeOrigem).append(",").append(longitudeOrigem)
			.append("&destination=").append(latitudeDestino).append(",").append(longitudeDestino)
			.append("&key=").append(YOUR_API_KEY);
		
		HttpGet request = new HttpGet(stringBuilder.toString());
		request.addHeader("Content-Type", "application/json");

		try (CloseableHttpResponse response = HTTP_CLIENT.execute(request)) {
			System.out.println(response.getStatusLine().toString());

			HttpEntity entity = response.getEntity();									
			if (entity != null) {
				ObjectMapper objectMapper = new ObjectMapper();
				return objectMapper.readValue(entity.getContent(), Matrix.class);
			}
		}
		
		return null;
	}
}
