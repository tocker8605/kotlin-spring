package my.tocker.kotlinspring.model

import org.springframework.util.StringUtils

class SomeModel(x: Int, y: Int) {

    var x: Int = x
    var y: Int = y

    var description: String? = null

    constructor(x: Int, y: Int, description: String) : this(x, y) {
        this.description = description
    }

    var processedDescription: String
        get() = "this is : " + this.description
        set(value: String) {
            this.description = value
        }
}