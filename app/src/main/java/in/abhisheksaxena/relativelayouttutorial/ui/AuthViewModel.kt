package `in`.abhisheksaxena.relativelayouttutorial.ui

import `in`.abhisheksaxena.relativelayouttutorial.utils.Constants
import `in`.abhisheksaxena.relativelayouttutorial.utils.Util
import android.view.View
import androidx.lifecycle.ViewModel


/**
 * @author Abhishek Saxena
 * @since 18-05-2020 03:58
 */

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View) {
        authListener?.onStarted()
        Util.errorLog(javaClass.name, "Login Button Clicked!")
        if (email.isNullOrEmpty()) {
            authListener?.onFailure(Constants.ON_FAILURE_RESULT_CODE.EMAIL_EMPTY)
            Util.errorLog(javaClass.name, "Email is empty or null")
            return
        }

        if (password.isNullOrEmpty()) {
            authListener?.onFailure(Constants.ON_FAILURE_RESULT_CODE.PASSWORD_EMPTY)
            Util.errorLog(javaClass.name, "Password is empty or null")
            return
        }

        if (email == "test@sub.com" && password == "Test@1234") {
            authListener?.onSuccess()
            Util.errorLog(javaClass.name, "Credentials verified")
        }else
            authListener?.onFailure(Constants.ON_FAILURE_RESULT_CODE.INCORRECT_CREDENTIALS)

    }
}