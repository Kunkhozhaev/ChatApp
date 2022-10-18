package ru.nurdaulet.chatApp.data.remote

import ru.nurdaulet.chatApp.domain.model.Message
import ru.nurdaulet.chatApp.util.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun initSession(
        username: String
    ): Resource<Unit>

    suspend fun sendMessage(message: String)

    fun observeMessages(): Flow<Message>

    suspend fun closeSession()

    companion object {
        // TODO: Change 'localhost' to your local ip address
        const val BASE_URL = "ws://localhost:8080"
    }

    sealed class Endpoints(val url: String) {
        object ChatSocket: Endpoints("$BASE_URL/chat-socket")
    }
}