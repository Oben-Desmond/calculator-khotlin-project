package com.example.khotlinpractice

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(findViewById(R.id.toolbar))
//        val binding = MainActivity.inflate(layoutInflater)


//        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        val button:Button=findViewById(R.id.button2)
        val output:TextView=findViewById(R.id.output)
        val input1:EditText=findViewById(R.id.input1)
        val input2:EditText=findViewById(R.id.input2)
        button2.text= "add"
          button.setOnClickListener(){
             val text=   output.text ;
              val i1=input1.text.toString().toInt()
              val i2 = input2.text.toString().toInt()
              val result =  i1+i2
                output.text=  "${result}"

          }
    }


}