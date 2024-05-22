package org.example.patterns.observer

class ActionWallet {
    private val actions = mutableMapOf<String, Int>()
    private val observers = mutableListOf<Observer>()

    fun addActions(action: String, quantity: Int){
        var quantitySum = quantity
        if(actions.containsKey(action)){
            quantitySum += actions[action]!!
        }
        actions[action] = quantitySum
        notify(action, quantitySum)

    }
    private fun notify(action: String, quantity: Int){
        observers.forEach {
            it.changeQuantity(action, quantity)
        }
    }

     fun addObserver(newObserver: Observer){
        observers.add(newObserver)
    }
}