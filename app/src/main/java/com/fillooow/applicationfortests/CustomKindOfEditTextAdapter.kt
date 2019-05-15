package com.fillooow.applicationfortests

import android.databinding.BindingAdapter
import android.widget.EditText

@BindingAdapter("customText")
fun EditText.setCustomText(editText: EditText, mText: String){

    editText.setText(mText)
}