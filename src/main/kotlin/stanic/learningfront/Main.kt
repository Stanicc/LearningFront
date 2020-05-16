package stanic.learningfront

import kotlinx.css.*
import react.dom.h1
import react.dom.render
import styled.css
import styled.styledDiv
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        styledDiv {
            css {
                justifyContent = JustifyContent.center
                textAlign = TextAlign.center
            }

            h1 {
                +"Hello"
            }
        }
    }
}