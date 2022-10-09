package mikepopup.com.shoppingappui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CategoryData(
    @StringRes
    val StringResourceId: Int,
    @DrawableRes
    val imageResourceId: Int
)
