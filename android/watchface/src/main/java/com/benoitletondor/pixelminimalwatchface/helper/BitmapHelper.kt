/*
 *   Copyright 2022 Benoit LETONDOR
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.benoitletondor.pixelminimalwatchface.helper

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.toBitmap

fun Drawable.toBitmap(
    desiredWidth: Int = -1,
    desiredHeight: Int = -1,
): Bitmap {
    val width = if( desiredWidth > 0 ) { desiredWidth } else { intrinsicWidth }
    val height = if( desiredHeight > 0 ) { desiredHeight } else { intrinsicHeight }

    return toBitmap(width, height)
}