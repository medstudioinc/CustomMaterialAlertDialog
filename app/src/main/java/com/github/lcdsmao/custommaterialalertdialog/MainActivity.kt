package com.github.lcdsmao.custommaterialalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    button_show_dialog.setOnClickListener {
      CustomAlertDialog().show(supportFragmentManager, null)
    }
    button_show_dialog_center.setOnClickListener {
      CustomAlertDialogCenter().show(supportFragmentManager, null)
    }
  }
}
