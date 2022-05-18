package com.notyetdecided.taskmanager.notes;

import com.notyetdecided.taskmanager.Constants;
import com.notyetdecided.taskmanager.tasks.DTO.CreateTaskRequestBody;
import com.notyetdecided.taskmanager.tasks.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/tasks/{id}/notes")
public class NotesController {

    @Autowired
    private NotesService notesService;


    @RequestMapping(value = "",method = RequestMethod.GET)
    private ResponseEntity<List<NotesEntity>> getAllNotesByTaskId(@PathVariable Long id){
       List<NotesEntity> notesEntities=  notesService.getAllNotesByTaskId(id);
        return notesEntities != null ? ResponseEntity.ok().body(notesEntities): ResponseEntity.notFound().build();
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    private ResponseEntity<NotesEntity> addNotesToTask(@PathVariable Long id,@RequestBody CreateNotesRequestBody requestBody){
        NotesEntity notesEntity = notesService.addNotesByTaskId(id, requestBody);
        return notesEntity != null ? ResponseEntity.created(
                URI.create(Constants.BASE_URL+"/tasks/"+id+"/notes")
        ).body(notesEntity): ResponseEntity.notFound().build();
    }

    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ResponseEntity<NotesEntity> deleteAllNotesByTaskId(@PathVariable Long id){
        List<NotesEntity> deletedEntities =notesService.getAllNotesByTaskId(id);
        notesService.deleteAllNotesEntitiesByTaskId(id);
        return deletedEntities !=null ? ResponseEntity.accepted().build() : ResponseEntity.notFound().build();
    }

}
