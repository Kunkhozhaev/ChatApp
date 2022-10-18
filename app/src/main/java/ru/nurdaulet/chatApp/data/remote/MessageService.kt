package ru.nurdaulet.chatApp.data.remote

import ru.nurdaulet.chatApp.domain.model.Message

interface MessageService {

    suspend fun getAllMessages(): List<Message>

    companion object {
        // TODO: Change 'localhost' to your local ip address
        const val BASE_URL = "http://localhost:8080"
    }

    sealed class Endpoints(val url: String) {
        object GetAllMessages: Endpoints("$BASE_URL/messages")
    }
}