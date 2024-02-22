package com.mutkuensert.domain

import org.springframework.stereotype.Service

@Service
class NoteService(private val noteRepository: NoteRepository) {

    fun addNote(note: String) {
        noteRepository.addNote(note)
    }

    fun getAllNotes(): List<Note> {
        return noteRepository.getAllNotes()
    }

    fun findNoteById(id: String): Note? {
        return noteRepository.findNote(id)
    }

    fun deleteNote(id: String): Boolean {
        return noteRepository.deleteNote(id)
    }
}