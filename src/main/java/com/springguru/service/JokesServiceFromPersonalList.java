package com.springguru.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PL")
@Service
public class JokesServiceFromPersonalList implements JokesService {

	private List<String> jokes;
	private Random rand = new Random();
	
	public JokesServiceFromPersonalList() {
		jokes = new ArrayList<String>();
		jokes.add("Oumayma Lhbila msetya");
		jokes.add("wa siri ya zay7a ya lfa3la");
		jokes.add("soooofiiii mahdiyaaaa wach ntiya labas");
		jokes.add("ana kanblikk ba3daya anaya");
		jokes.add("wa siri ya l7em9a siri fin tla3bi");
		jokes.add("ya dayraa ya lfa3laaa");
		jokes.add("ntiya hiya toba ya begla ");
	}
	
	@Override
	public String getSomejoke() {
				
		return jokes.get(rand.nextInt(jokes.size()));
	}

}
