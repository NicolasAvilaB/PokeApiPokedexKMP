package mediaplayer

expect class MediaPlayerController() {
    fun playSound(url: String)
    fun release()
}