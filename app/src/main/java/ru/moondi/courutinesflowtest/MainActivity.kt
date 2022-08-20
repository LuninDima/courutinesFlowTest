package ru.moondi.courutinesflowtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.message)
        ViewModelProvider(this)[MainViewModel::class.java].liveData
            .observe(this) { dataFromDataBase ->
                textView.text = dataFromDataBase.data
            }
    }
}