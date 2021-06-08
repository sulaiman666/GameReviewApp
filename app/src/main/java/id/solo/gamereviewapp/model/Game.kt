package id.solo.gamereviewapp.model

data class Game(
    var judul: String = "",
    var about: String = "",
    var logo: Int = 0,
    var banner: Int = 0,
    var link: String = "",
    var detail: String = "",
    var spec: Map<String, String> = mapOf("" to "")
)
