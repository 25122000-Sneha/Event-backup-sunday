package com.wecp.eventmanagementsystem.service;


import com.wecp.eventmanagementsystem.entity.Allocation;
import com.wecp.eventmanagementsystem.entity.Event;
import com.wecp.eventmanagementsystem.repository.AllocationRepository;
import com.wecp.eventmanagementsystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private AllocationRepository allocationRepository;
    public List<Allocation> getAllocationsByEventId(Long eventId){
        return allocationRepository.findByEvent(eventId);
    }
    public Event createEvent(Event event) {
       // save event in databse
       return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        // get all events
        return eventRepository.findAll();
    }

    public Event getEventDetails(Long eventId) {
        // get event by eventId
        return eventRepository.findById(eventId).get();
    }
  // update event
    public Event updateEventSetup(Long eventId, Event updatedEvent) {
     
       return eventRepository.save(updatedEvent);
    }

    // get all events sorted by status
    public List<Event> getAllEventsSorted() {
       
        return eventRepository.findAllByOrderByStatusDesc().get();
    }

}
