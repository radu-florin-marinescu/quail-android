package com.radumarinescu.quail.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Immutable
data class ApplicationStyles(
        val h1: TextStyle = TextStyle(
                fontSize = 26.sp,
                fontWeight = FontWeight.Normal
        )
)

fun TextStyle.textAlignCenter() = this.copy(textAlign = TextAlign.Center)
fun TextStyle.textAlignEnd() = this.copy(textAlign = TextAlign.End)
fun TextStyle.textAlignStart() = this.copy(textAlign = TextAlign.Start)
fun TextStyle.light() = this.copy(fontWeight = FontWeight.Light)
fun TextStyle.normal() = this.copy(fontWeight = FontWeight.Normal)
fun TextStyle.medium() = this.copy(fontWeight = FontWeight.Medium)
fun TextStyle.semiBold() = this.copy(fontWeight = FontWeight.SemiBold)
fun TextStyle.bold() = this.copy(fontWeight = FontWeight.Bold)

fun TextStyle.disableFontPadding() = this.copy(
        platformStyle = PlatformTextStyle(
                includeFontPadding = false
        )
)

fun TextStyle.color(color: Color) = this.copy(color = color)

internal
val LocalTypography = compositionLocalOf { ApplicationStyles() }

val Typography: ApplicationStyles
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current