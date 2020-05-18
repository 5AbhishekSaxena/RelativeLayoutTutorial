package `in`.abhisheksaxena.relativelayouttutorial.ui

import `in`.abhisheksaxena.relativelayouttutorial.R
import `in`.abhisheksaxena.relativelayouttutorial.databinding.ActivityMainBinding
import `in`.abhisheksaxena.relativelayouttutorial.utils.Constants
import `in`.abhisheksaxena.relativelayouttutorial.utils.Util.errorLog
import `in`.abhisheksaxena.relativelayouttutorial.utils.Util.makeToast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.vm = viewModel

        viewModel.authListener = this

    }

    override fun onStarted() {
        makeToast("onStarted Triggered")
        errorLog(javaClass.name, "onStarted called")
    }

    override fun onSuccess() {
        makeToast("Credentials verified Successfully")
        errorLog(javaClass.name, "Details verified")
    }

    override fun onFailure(code: Int, message: String?) {
        errorLog(javaClass.name, "onFailure called")
        when (code) {
            Constants.ON_FAILURE_RESULT_CODE.NO_CODE -> makeToast(message ?: "Unknown")
            Constants.ON_FAILURE_RESULT_CODE.EMAIL_EMPTY -> makeToast("Email field is empty.")
            Constants.ON_FAILURE_RESULT_CODE.EMAIL_INVALID -> makeToast("Please enter a valid email.")
            Constants.ON_FAILURE_RESULT_CODE.PASSWORD_EMPTY -> makeToast("Password field is empty.")
            Constants.ON_FAILURE_RESULT_CODE.INCORRECT_CREDENTIALS -> makeToast("Email or password is incorrect.")
        }
    }
}
