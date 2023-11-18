package com.radumarinescu.quail.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class GlobalColors(
    val light: Color = Color.Unspecified
)

val LightColors = GlobalColors(
    light = Color(0xFFFFFFFF)
)

val DarkColors = GlobalColors(
    light = Color.Unspecified
)

internal val LocalColors = compositionLocalOf { LightColors }

val Colors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current