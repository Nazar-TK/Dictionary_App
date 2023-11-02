package com.example.dictionary.core.util

sealed class UIEvent {
    data class ShowSnackBar(
        val message: String,
    ) : UIEvent()
}