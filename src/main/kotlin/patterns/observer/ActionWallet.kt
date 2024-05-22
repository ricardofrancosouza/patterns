package org.example.patterns.observer.impls

import org.example.patterns.observer.Observer

class ActionWallet {
    private val actions = mutableMapOf<String, Int>()
    private val observers = mutableListOf<Observer>()

    fun addActions(action: String, quantity: Int){
        var quantitySum = quantity
        if(actions.containsKey(action)){
            quantitySum += actions[action]!!
        }
        actions[action] = quantitySum

    }
    private fun notify(action: String, quantity: Int){
        observers.forEach {
            it.changeQuantity(action, quantity)
        }
    }

    private fun addObserver(newObserver: Observer){
        observers.add(newObserver)
    }
}