package jp.techacademy.atsushi.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,TimePickerDialog.OnTimeSetListener{view, hourOfDay, minute ->
                if(hourOfDay >= 2 && hourOfDay < 10){
                    textView.text = "おはよう"
                }else if (hourOfDay >= 10 && hourOfDay < 18){
                    textView.text = "こんにちは"
                }else if (hourOfDay >=18 || hourOfDay < 2 ){
                    textView.text = "こんばんは"
                }
            },0,0,true)
        timePickerDialog.show()
    }
}
