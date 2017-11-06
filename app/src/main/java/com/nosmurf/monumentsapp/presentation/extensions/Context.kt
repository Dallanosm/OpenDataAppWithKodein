package com.nosmurf.monumentsapp.extensions

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun Context.showToast(message: Int, duration: Int = Toast.LENGTH_SHORT) {
    showToast(getString(message), duration)
}
