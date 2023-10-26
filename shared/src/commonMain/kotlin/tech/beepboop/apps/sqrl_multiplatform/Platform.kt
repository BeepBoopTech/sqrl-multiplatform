package tech.beepboop.apps.sqrl_multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform