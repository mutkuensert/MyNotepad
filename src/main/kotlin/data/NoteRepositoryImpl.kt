package com.mutkuensert.data

import com.mutkuensert.domain.Note
import com.mutkuensert.domain.NoteRepository

class NoteRepositoryImpl : NoteRepository {
    private val notes: MutableList<NoteDto> = mutableListOf()
    override fun addNote(note: String) {
        notes.add(NoteDto(note))
    }

    override fun getAllNotes(): List<Note> {
        return notes.map { Note(it.id, it.note) }
    }

    override fun findNote(id: String): Note? {
        val noteDto = notes.find { it.id == id }
        return if (noteDto != null) {
            Note(noteDto.id, noteDto.note)
        } else {
            null
        }
    }

    override fun deleteNote(id: String): Boolean {
        val index = notes.indexOfLast { it.id == id }

        if (index != -1) {
            notes.removeAt(index)
            return true
        }

        return false
    }
}