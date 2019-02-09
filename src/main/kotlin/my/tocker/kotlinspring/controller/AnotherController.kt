package my.tocker.kotlinspring.controller

import my.tocker.kotlinspring.model.SomeModel
import org.springframework.util.StringUtils
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/another")
class AnotherController {

    fun SomeModel?.isNull(): Boolean {
        return this == null || StringUtils.isEmpty(this.description)
    }

    @GetMapping
    fun get(): Any {
        var a = SomeModel(10, 20)
        var b = SomeModel(30, 40, "what the hell")
        var c = SomeModel(50, 60, "")
        var d: SomeModel? = null

        println(b.isNull())
        println(c.isNull())
        println(d.isNull())

        return listOf(a, b)
    }

}