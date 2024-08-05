package one.volod.kanjikmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform