package br.com.dojo.cfgdemelo.dojopuzzle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFind = findViewById<Button>(R.id.btnFind)
        val editText = findViewById<EditText>(R.id.number)
        val imgStatus = findViewById<ImageView>(R.id.imgStatus)

        btnFind.setOnClickListener {
            val text = editText.text
            if (text.equals("1")) {
                imgStatus.setImageResource(R.drawable.happy)
            } else {
                imgStatus.setImageResource(R.drawable.sad)
            }
        }

    }
}
