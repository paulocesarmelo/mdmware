package br.inf.ufg.mddsm.broker.adapter.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpRequest.BodyPublishers;

import com.google.gson.Gson;


public class RestAPI extends CommAPI{

	private static int HTTP_COD_SUCCESS = 200;
	private URL url;
	private HttpURLConnection con;
	//private JSONObject data;
	
	public void setup(String urlStr) {
		try {
			url = new URL(urlStr);
			con = (HttpURLConnection) url.openConnection();		 
			con.setRequestMethod("GET");
	        			
			if(con.getResponseCode()!= HTTP_COD_SUCCESS) {
				throw new RuntimeException("Failed : HTTP error code: "+con.getResponseCode());
			}
			
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Accept", "application/json");
			
			
			InputStreamReader in = new InputStreamReader(con.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            con.disconnect();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void send(FormatedData data) throws URISyntaxException, IOException, InterruptedException {
	
		Gson gson = new Gson();
		String jsonRequest = gson.toJson(data);
		
		HttpRequest postRequest = HttpRequest.newBuilder()
				.uri(new URI(""))
				.header("Authorization", "")
				.POST(BodyPublishers.ofString(jsonRequest))
				.build();
		
		HttpClient httpClient = HttpClient.newHttpClient();
		
		HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
		
		System.out.println(postResponse.body());
		
		data = gson.fromJson(postResponse.body(), FormatedData.class);
		
	}
	
}
