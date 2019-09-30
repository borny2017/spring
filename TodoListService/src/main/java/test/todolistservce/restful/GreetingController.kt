package test.todolistservce.restful

import org.jetbrains.kotlin.demo.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController(@Autowired private val greetingDatabase : GreetingDatabase) {

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping("/journals")
    fun getAllJournals() : List<Greeting> = greetingDatabase.getGreetings()

}