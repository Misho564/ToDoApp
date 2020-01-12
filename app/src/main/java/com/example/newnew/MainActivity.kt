package com.example.newnew



import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*
import com.example.list.Model
import com.example.list.MyAdapter


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()
        add_button.setOnClickListener {
            list.add(Model(item_edit_text.text.toString()))
            listview.adapter = MyAdapter(this,R.layout.row,list)
            listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->}


    }

}}
