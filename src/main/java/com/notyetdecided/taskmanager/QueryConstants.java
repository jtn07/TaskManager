package com.notyetdecided.taskmanager;

public interface QueryConstants {
    public static final String DELETE_ALL_NOTES_OF_A_TASK="delete from NotesEntity notes where notes.taskEntity.id   =:id";
}
