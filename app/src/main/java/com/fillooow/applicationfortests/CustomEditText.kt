package com.fillooow.applicationfortests

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import android.widget.Toast

class CustomEditText @JvmOverloads constructor(

    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0


) : EditText(context, attrs, defStyleAttr) {

    init {

        isClickable = true
    }

    var someShit: String = ""
        set(value) {

            if (value == "тест"){

                field = "мммммм"
                return
            }
            field = value
        }

    override fun setOnClickListener(l: OnClickListener?) {
        super.setOnClickListener(l)
        Toast.makeText(context, "Jopa", Toast.LENGTH_LONG).show()
    }
}