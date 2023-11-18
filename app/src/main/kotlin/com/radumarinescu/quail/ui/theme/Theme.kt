package com.radumarinescu.quail.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
fun QuailTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    val ripple = object : RippleTheme {
        @Composable
        override fun defaultColor() =
            RippleTheme.defaultRippleColor(
                colors.light,
                lightTheme = !isSystemInDarkTheme()
            )

        @Composable
        override fun rippleAlpha(): RippleAlpha =
            RippleTheme.defaultRippleAlpha(
                colors.light,
                lightTheme = !isSystemInDarkTheme()
            )
    }

    val dimensions = ApplicationDimensions()
    val styles = ApplicationStyles()
    val shapes = ApplicationShapes()

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colors.light.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    CompositionLocalProvider(
        LocalColors provides colors,
        LocalShapes provides shapes,
        LocalTypography provides styles,
        LocalRippleTheme provides ripple,
        LocalDimensions provides dimensions,
    ) {
        content()
    }
}