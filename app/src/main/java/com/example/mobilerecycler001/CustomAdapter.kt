package com.example.mobilerecycler001

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val array:ArrayList<MobileModle>):RecyclerView.Adapter<CustomAdapter.DataHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
        return DataHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_layout,parent,false))
    }

    override fun onBindViewHolder(holder:DataHolder, position: Int) {
    val mobileModle:MobileModle=array.get(position)
    holder.imView.setImageResource(mobileModle.img)
    holder.tvTitle.setText(mobileModle.title)
    holder.tvDescription.setText(mobileModle.Dec)
    }

    override fun getItemCount(): Int {
        return array.size
    }
    class DataHolder(view: View):RecyclerView.ViewHolder(view){
        val imView:ImageView=view.findViewById(R.id.imView)
        val tvTitle:TextView=view.findViewById(R.id.tvTitle)
        val tvDescription:TextView=view.findViewById(R.id.tvDescription)
    }
}