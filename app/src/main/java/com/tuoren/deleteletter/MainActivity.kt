package com.tuoren.deleteletter

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivDeleteText.setOnClickListener {
            this@MainActivity.etSearch.setText("")
        }
        //提交
        this.etSearch.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(
                s: CharSequence,
                start: Int,
                before: Int,
                count: Int
            ) {
            }

            override fun beforeTextChanged(
                s: CharSequence,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun afterTextChanged(s: Editable) {
                if (s.length == 0) {
                    this@MainActivity.ivDeleteText.visibility = View.INVISIBLE
                } else {
                    this@MainActivity.ivDeleteText.visibility = View.VISIBLE
                }
            }
        })
    }
}
