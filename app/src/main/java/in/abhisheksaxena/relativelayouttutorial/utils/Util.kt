package `in`.abhisheksaxena.relativelayouttutorial.utils

import android.content.Context
import android.util.Log
import android.util.Log.e
import android.widget.Toast


/**
 * @author Abhishek Saxena
 * @since 18-05-2020 04:31
 */

object Util {

    fun Context.makeToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun errorLog(tag: String, message: String) {
        Log.e(tag, message)
    }
}
