package patterns.observer

import org.example.patterns.observer.ActionWallet
import org.example.patterns.observer.impls.ActionsLogger
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class ActionsLoggerTest {
    @Test
    fun `should notify logger`(){
        val actionsLogger = ActionsLogger()
        val actionWallet = ActionWallet()
        actionWallet.addObserver(actionsLogger)
        assertDoesNotThrow {
            actionWallet.addActions("COMP02", 200)
            Thread.sleep(2000)
            actionWallet.addActions("EMP34", 400)
        }
    }
}