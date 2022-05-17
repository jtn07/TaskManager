package com.notyetdecided.taskmanager.notes;

import com.notyetdecided.taskmanager.tasks.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<NotesEntity,Long> {
}
