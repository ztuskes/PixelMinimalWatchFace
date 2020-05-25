package com.benoitletondor.pixelminimalwatchface.helper

import android.content.Context
import android.content.pm.PackageManager
import android.util.DisplayMetrics
import kotlin.math.roundToInt

fun Context.dpToPx(dp: Int): Int {
    val displayMetrics = resources.displayMetrics
    return (dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
}

fun Context.isScreenRound() = resources.configuration.isScreenRound

fun Context.isServiceAvailable(packageName: String, serviceName: String): Boolean {
    return try {
        val packageInfo = packageManager.getPackageInfo(packageName, PackageManager.GET_SERVICES)
        val services = packageInfo.services ?: return false

        services.firstOrNull { it.name == serviceName } != null
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }
}