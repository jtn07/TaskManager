package com.notyetdecided.taskmanager.notes;

import com.notyetdecided.taskmanager.tasks.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class NotesService {

    @Autowired
    private NotesRepository notesRepository;

    @Autowired
    private TaskRepository taskRepository;


    public List<NotesEntity> getAllNotesByTaskId(Long id) {
        List<NotesEntity> notesEntities = notesRepository.findNotesEntityByTaskEntity_Id(id);
        return notesEntities;
    }

    NotesEntity addNotesByTaskId(Long id,CreateNotesRequestBody requestBody){
        NotesEntity notesEntity=new NotesEntity();
        notesEntity.setTaskEntity(taskRepository.findById(id).get());
        System.out.println(notesEntity.getTaskEntity().toString());
        notesEntity.setBody(requestBody.getBody());
        NotesEntity savedNotesEntity =notesRepository.save(notesEntity);
        return savedNotesEntity;
    }

    List<NotesEntity> deleteAllNotesEntitiesByTaskId(Long id){
        List<NotesEntity> notesEntities=notesRepository.findNotesEntityByTaskEntity_Id(id);
        notesRepository.deleteNotesEntityByTaskEntity_Id(id);
        return notesEntities;
    }
}
