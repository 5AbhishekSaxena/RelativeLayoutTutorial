package `in`.abhisheksaxena.relativelayouttutorial.ui

import `in`.abhisheksaxena.relativelayouttutorial.utils.Constants


/**
 * @author Abhishek Saxena
 * @since 18-05-2020 04:03
 */

interface AuthListener {

    fun onStarted()
    fun onSuccess()
    fun onFailure(code : Int = Constants.ON_FAILURE_RESULT_CODE.NO_CODE, message : String? = null)
}