package family.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import family.repository.EventRepository;
import family.model.Event;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void createEvent(Event event) {
        eventRepository.createEvent(event);
    }
}