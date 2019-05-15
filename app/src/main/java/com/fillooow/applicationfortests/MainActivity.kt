package com.fillooow.applicationfortests

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.kind_of_custom_edit_text.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_test_kind_of_button.visibility = View.GONE

        my_kind_of_edit_text.addTextChangedListener(object : TextWatcher{

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                when(s.isNullOrEmpty()){

                    true -> my_test_kind_of_button.visibility = View.GONE
                    false -> my_test_kind_of_button.visibility = View.VISIBLE
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        my_test_kind_of_button.setOnClickListener {

            my_kind_of_edit_text.text.clear()
        }
    }
}
