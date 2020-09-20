package com.caparepa.companionfou.ui.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.caparepa.companionfou.R

class LoadingDialog(context : Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_loading_dialog)
        window?.setBackgroundDrawableResource(android.R.color.transparent);
    }

}