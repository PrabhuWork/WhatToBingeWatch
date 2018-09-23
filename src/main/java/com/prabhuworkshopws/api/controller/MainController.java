/**
 * 
 */
package com.prabhuworkshopws.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PraBhu
 *
 */
@RestController
public class MainController {
	
	
	@RequestMapping(value="/getMovieData")
	public String getMovieData() {
		
		return "hello dude";
	}

}
