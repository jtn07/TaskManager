package com.notyetdecided.taskmanager.notes;

import com.notyetdecided.taskmanager.QueryConstants;
import com.notyetdecided.taskmanager.tasks.TaskEntity;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends JpaRepository<NotesEntity,Long> {

    List<NotesEntity> findNotesEntityByTaskEntity_Id(Long taskId);

    @Query(QueryConstants.DELETE_ALL_NOTES_OF_A_TASK)
     void deleteNotesEntityByTaskEntity_Id(@Param("id") Long taskId);

    //List<NotesEntity> deleteNotesEntityByTaskEntity_Id(Long id);



}
