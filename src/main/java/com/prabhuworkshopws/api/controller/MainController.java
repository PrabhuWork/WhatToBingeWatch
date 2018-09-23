/**
 * 
 */
package com.prabhuworkshopws.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author PraBhu
 *
 */
@RestController
public class MainController {

	@RequestMapping(value = "/getMovieData/{pageId}")
	public String getMovieData(@PathVariable(value="pageId") Integer pageId) {

		RestTemplate restTemplate = new RestTemplate();
        String quote = restTemplate.getForObject("https://api.themoviedb.org/3/discover/movie?page="+pageId+"&include_video=false&include_adult=false&sort_by=popularity.desc&language=en-US&api_key=366a57c52697a800b7778f5aa0bb3841", String.class);
		
        return quote;
	}

}
