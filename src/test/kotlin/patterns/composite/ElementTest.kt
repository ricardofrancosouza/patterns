package patterns.composite

import org.example.patterns.observer.composite.Element
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ElementTest {
    @Test
    fun `should return 5 when execute count five times`() {
        val element1 = Element()
        val element2 = Element()
        val element3 = Element()
        val element4 = Element()
        val element5 = Element()
        element1.setNext(element2)
        element2.setNext(element3)
        element3.setNext(element4)
        element4.setNext(element5)

        val sum = element1.count()

        assertEquals(5, sum)
    }
}