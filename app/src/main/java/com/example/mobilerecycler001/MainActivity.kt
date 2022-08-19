package com.example.mobilerecycler001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectView()
        preparViews()
    }
    private fun connectView(){ recycler=findViewById(R.id.recycler) }
    private fun preparViews(){
        val arrayMobile:ArrayList<MobileModle> = ArrayList()
        arrayMobile.add(MobileModle("Axxxx","BBBBBB",R.drawable.img))
        arrayMobile.add(MobileModle("Axxxx","BBBBBB",R.drawable.img))
        arrayMobile.add(MobileModle("Axxxx","BBBBBB",R.drawable.img))
        arrayMobile.add(MobileModle("Axxxx","BBBBBB",R.drawable.img))
        arrayMobile.add(MobileModle("Axxxx","BBBBBB",R.drawable.img))
        arrayMobile.add(MobileModle("Axxxx","BBBBBB",R.drawable.img))
        arrayMobile.add(MobileModle("Axxxx","BBBBBB",R.drawable.img))
        val customAdapter:CustomAdapter= CustomAdapter(arrayMobile)
        recycler.adapter=customAdapter

    }
}