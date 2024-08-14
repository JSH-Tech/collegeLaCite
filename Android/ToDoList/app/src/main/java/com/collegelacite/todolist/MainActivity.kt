package com.collegelacite.todolist

import android.content.DialogInterface
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var itemlist = ArrayList<String>()
    var todoList = ArrayList<String>()

    var fileHelper= FileHelper()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        itemlist=fileHelper.readData(this)

        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,itemlist)
        binding.list.adapter=arrayAdapter

        binding.button.setOnClickListener {
            val itemName=binding.editText.text.toString()
            itemlist.add(itemName)
            binding.editText.setText("")
            todoList.add(itemName)
            fileHelper.writeData(itemlist,applicationContext)
            arrayAdapter.notifyDataSetChanged()
        }

        binding.list.setOnItemClickListener { adapterView, view, position, l ->
            val alert=android.app.AlertDialog.Builder(this)
            alert.setTitle("Delete")
            alert.setMessage("Do you want to delete this item?")
            alert.setCancelable(false)
            alert.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface,i->
                dialogInterface.cancel()
            })
            alert.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface,i->
                todoList.removeAt(position)
                itemlist.removeAt(position)
                arrayAdapter.notifyDataSetChanged()
                fileHelper.writeData(itemlist,applicationContext)

            })
            alert.create().show()
        }
    }

}