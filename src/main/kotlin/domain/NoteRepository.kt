package com.mutkuensert.domain

import org.springframework.stereotype.Repository

@Repository
interface NoteRepository {
    fun addNote(note: String)
    fun getAllNotes(): List<Note>
    fun findNote(id: String): Note?
    fun deleteNote(id: String): Boolean
}