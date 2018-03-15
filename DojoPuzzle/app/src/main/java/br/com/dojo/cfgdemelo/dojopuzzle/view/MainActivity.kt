package br.com.dojo.cfgdemelo.dojopuzzle.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import br.com.dojo.cfgdemelo.dojopuzzle.R
import br.com.dojo.cfgdemelo.dojopuzzle.presenter.Presenter

class MainActivity : AppCompatActivity() {

    private var imgStatus: ImageView? = null
    private var txtStatus: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnFind = findViewById<Button>(R.id.btnFind)
        val editText = findViewById<EditText>(R.id.number)
        imgStatus = findViewById<ImageView>(R.id.imgStatus)
        txtStatus = findViewById<TextView>(R.id.status)
        val presenter = Presenter(this)

        btnFind.setOnClickListener {
            val numberString: String = editText.text.toString()
            if (numberString.length > 3 || numberString.contains(",") || numberString.contains(".")) {
                Toast.makeText(this,"", Toast.LENGTH_SHORT).show()
            } else {
                val number: Int = numberString.toInt()
                presenter.onButtonPressed(number)
            }
        }
    }

    fun changeImgHappy() {
        imgStatus?.setImageResource(R.drawable.happy)
        txtStatus?.setText(R.string.happy)
    }

    fun changeImgSad() {
        imgStatus?.setImageResource(R.drawable.sad)
        txtStatus?.setText(R.string.sad)
    }
}
