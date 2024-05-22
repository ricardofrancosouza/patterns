package org.example.patterns.observer

interface Observer {
    fun changeQuantity(action: String, quantity: Int)
}