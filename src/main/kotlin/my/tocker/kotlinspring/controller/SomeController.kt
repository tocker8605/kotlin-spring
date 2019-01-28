package my.tocker.kotlinspring.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/home")
class SomeController {

    @GetMapping
    fun get(): String {
        return "hello"
    }

    @PostMapping("/post")
    fun post(): String {
        return "hello"
    }

    @DeleteMapping("/delete")
    fun delete(): String {
        return "hello"
    }
}