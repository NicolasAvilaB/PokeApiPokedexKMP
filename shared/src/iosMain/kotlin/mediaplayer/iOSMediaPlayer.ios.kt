package mediaplayer

import kotlinx.cinterop.ExperimentalForeignApi
import platform.AVFAudio.AVAudioPlayer
import platform.Foundation.NSData
import platform.Foundation.NSURL
import platform.Foundation.dataWithContentsOfURL

actual class MediaPlayerController {
    private var player: AVAudioPlayer? = null

    @OptIn(ExperimentalForeignApi::class)
    actual fun playSound(url: String) {
        val nsUrl = NSURL.URLWithString(url)
        val audioData = nsUrl?.let { NSData.dataWithContentsOfURL(it) }
        player = audioData?.let { it1 -> AVAudioPlayer(data = it1, error = null) }
        player?.prepareToPlay()
        player?.play()

    }

    actual fun release() {
        player?.stop()
        player = null
    }
}
