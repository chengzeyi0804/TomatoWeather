package com.tomato.weather.view.plugin

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import com.tomato.lib.utils.IconUtils
import com.tomato.plugin_lib.SkinViewSupport

class PluginImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr), SkinViewSupport {

    private var iconCode: String? = null

    override fun applySkin() {
        iconCode?.let {
            setImageDrawable(IconUtils.getDayIcon(context, it))
        }
    }

    fun setImageResourceName(iconDay: String) {
        iconCode = iconDay
        setImageDrawable(IconUtils.getDayIcon(context, iconDay))
    }
}