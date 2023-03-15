package com.example.shopping_list2.presentation

import androidx.databinding.BindingAdapter
import com.example.shopping_list2.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("errorInputName")
fun bindErrorInputName(textInputLayout: TextInputLayout, errorInputName: Boolean) {
    if (errorInputName) textInputLayout.error =
        textInputLayout.context.getString(R.string.error_input_name)
    else textInputLayout.error = null
}

@BindingAdapter("errorInputCount")
fun bindErrorInputCount(textInputLayout: TextInputLayout, errorInputCount: Boolean) {
    if (errorInputCount) textInputLayout.error =
        textInputLayout.context.getString(R.string.error_input_count)
    else textInputLayout.error = null
}

@BindingAdapter("etCount")
fun bindEtCount(textInputEditText: TextInputEditText, count: Int) {
    if (count != 0)
        textInputEditText.setText(count.toString())
}
