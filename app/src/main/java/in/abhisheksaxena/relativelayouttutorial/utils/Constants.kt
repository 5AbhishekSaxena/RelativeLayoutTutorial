package `in`.abhisheksaxena.relativelayouttutorial.utils


/**
 * @author Abhishek Saxena
 * @since 18-05-2020 04:11
 */

object Constants {
    interface ON_FAILURE_RESULT_CODE {
        companion object {
            const val NO_CODE = -1
            const val INCORRECT_CREDENTIALS = 0
            const val EMAIL_EMPTY = 1
            const val EMAIL_INVALID = 2
            const val PASSWORD_EMPTY = 3

        }
    }
}