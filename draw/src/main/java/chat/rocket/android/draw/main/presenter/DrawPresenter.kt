package chat.rocket.android.draw.main.presenter

import android.graphics.Bitmap
import chat.rocket.android.util.extension.compressImageAndGetByteArray
import chat.rocket.android.util.extension.launchUI
import chat.rocket.core.lifecycle.CancelStrategy
import javax.inject.Inject

class DrawPresenter @Inject constructor(
    private val view: DrawView,
    private val strategy: CancelStrategy
) {

    fun processDrawingImage(bitmap: Bitmap) {
        launchUI(strategy) {
            val byteArray = bitmap.compressImageAndGetByteArray("image/png")
            if (byteArray != null) {
                view.sendByteArray(byteArray)
            } else {
                view.showWrongProcessingMessage()
            }
        }
    }
}