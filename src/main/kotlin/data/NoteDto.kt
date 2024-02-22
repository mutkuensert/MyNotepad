package com.mutkuensert.data

import java.util.UUID

data class NoteDto(val note: String) {
    val id: String = UUID.randomUUID().toString()
}
