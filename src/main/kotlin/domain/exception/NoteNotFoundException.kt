package com.mutkuensert.domain.exception

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class NoteNotFoundException : ResponseStatusException(
    HttpStatus.BAD_REQUEST,
    "Note couldn't be found."
)