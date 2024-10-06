package mediaplayer

import android.media.MediaPlayer

actual class MediaPlayerController actual constructor() {
    private var player: MediaPlayer? = null

    actual fun playSound(url: String) {
        player?.release()

        player = MediaPlayer().apply {
            runCatching {
                reset()
                setDataSource(url)
                prepare()
                start()
                setOnCompletionListener {
                    release()
                }
            }.onFailure { e ->
                e.printStackTrace()
            }
        }
    }

    actual fun release() {
        player?.release()
        player = null
    }
}