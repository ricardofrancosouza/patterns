package org.example.patterns.observer.composite

class Element {
    private var next: Element? = null
    infix fun setNext(next: Element){
        this.next = next
    }

    fun count(): Int {
        if(next == null){
            return 1
        }
        return 1 + next!!.count()
    }
}