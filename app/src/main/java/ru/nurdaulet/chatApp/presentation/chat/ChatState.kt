package ru.nurdaulet.chatApp.presentation.chat

import ru.nurdaulet.chatApp.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
