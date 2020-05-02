package com.springguru.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Profile({"CN","default"})
@Service
public class JokesServiceFromChukNorris implements JokesService {

	private ChuckNorrisQuotes chuckNorrisQuotes =  new ChuckNorrisQuotes();
	
	@Override
	public String getSomejoke() {
		
		return this.chuckNorrisQuotes.getRandomQuote();
	}

}
