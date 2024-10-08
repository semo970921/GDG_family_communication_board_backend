package family.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import family.model.Event;
import family.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/create")
    public ResponseEntity<String> createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return ResponseEntity.ok("일정이 생성되었습니다. ");
    }
}
