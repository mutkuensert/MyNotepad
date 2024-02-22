package com.mutkuensert.presentation

import com.mutkuensert.domain.Note
import com.mutkuensert.domain.NoteService
import com.mutkuensert.domain.exception.NoteNotFoundException
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/notes")
class NoteController(private val noteService: NoteService) {

    @PostMapping("/")
    fun addNote(@RequestParam("note") note: String) {
        noteService.addNote(note)
    }

    @GetMapping("/{id}")
    fun findNote(@PathVariable id: String): Note? {
        return noteService.findNoteById(id) ?: throw NoteNotFoundException()
    }

    @DeleteMapping("/{id}")
    fun deleteNote(@PathVariable id: String) {
        val isDeleted = noteService.deleteNote(id)

        if (!isDeleted) throw NoteNotFoundException()
    }

    @GetMapping("/")
    fun getAllNotes(): List<Note> {
        return noteService.getAllNotes()
    }
}