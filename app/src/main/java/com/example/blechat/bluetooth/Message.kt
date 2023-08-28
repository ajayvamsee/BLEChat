package com.example.blechat.bluetooth

/**
 * Created by Ajay Vamsee on 7/21/2023.
 * Time : 19:40
 */
sealed class Message(val text: String) {

    class RemoteMessage(text: String) : Message(text)
    class LocalMessage(text: String) : Message(text)
}
