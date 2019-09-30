package test.todolistservce.restful

import org.jetbrains.kotlin.demo.Greeting
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class GreetingDatabase {
    private val greetingList = mutableListOf<Greeting>()
    @PostConstruct
    private fun init() {
        greetingList.add(Greeting(1,"Aanand Shekhar Roy"))
        greetingList.add(Greeting(2,"Rashi Karanpuria"))
    }
    fun getGreetings()=greetingList

}
