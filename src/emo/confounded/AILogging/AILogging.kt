package emo.confounded.AILogging

import com.google.appinventor.components.annotations.SimpleFunction
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent
import com.google.appinventor.components.runtime.ComponentContainer
import com.google.appinventor.components.runtime.util.YailList

class AILogging(container: ComponentContainer) : AndroidNonvisibleComponent(container.`$form`()) {

    @SimpleFunction(description = "Returns the sum of the given list of integers.")
    fun SumAll(integers: YailList): Int {
        return integers.sumOf {
          it.toString().toIntOrNull() ?: 0
        }
    }
}
