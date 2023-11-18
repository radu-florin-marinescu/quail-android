package com.radumarinescu.quail.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class ApplicationDimensions(
    val sideMargin: Dp = 32.dp,
)

internal val LocalDimensions = compositionLocalOf { ApplicationDimensions() }

val Dimensions: ApplicationDimensions
    @Composable
    @ReadOnlyComposable
    get() = LocalDimensions.current