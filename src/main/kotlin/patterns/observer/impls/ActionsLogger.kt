package org.example.patterns.observer.impls

import org.example.patterns.observer.Observer

class ActionsLogger(): Observer {
    override fun changeQuantity(action: String, quantity: Int) {
        println("Alterada a quantidade da ação $action para $quantity")
    }
}