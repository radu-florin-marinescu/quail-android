package com.radumarinescu.quail.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

data class ApplicationShapes(
    val buttonShape: RoundedCornerShape = RoundedCornerShape(12.dp)
)

val LocalShapes = compositionLocalOf { ApplicationShapes() }

val Shapes: ApplicationShapes
    @Composable
    @ReadOnlyComposable
    get() = LocalShapes.current