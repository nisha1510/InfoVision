package com.hotel.service.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.entities.Hotel;
import com.hotel.service.exceptions.ResourceNotFoundException;
import com.hotel.service.repository.HotelRepository;
import com.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelrepo;
	
	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelrepo.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelrepo.findAll();
	}

	@Override
	public Hotel get(String id) {
		return hotelrepo.findById(id).orElseThrow(()->new ResourceNotFoundException
				("hotel with given id not found.."+id));
	}

}
