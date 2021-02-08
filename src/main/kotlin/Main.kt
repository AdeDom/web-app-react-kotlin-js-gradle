import kotlinx.browser.document
import kotlinx.browser.window
import react.dom.render

data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(App::class) {}
        }
    }
}
