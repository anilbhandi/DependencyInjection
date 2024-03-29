package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.SpeakerService#findAll()
	 */
	public List<Speaker> findAll(){
		return repository.findAll();
	}
	
}
