package com.example.apis

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context: Activity,val productArrayList :List<Product>):
RecyclerView.Adapter<MyAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val view = LayoutInflater.from(context).inflate(R.layout.each_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentItem = productArrayList[position]
        holder.title.text = currentItem.title

        //for imageView from url

        Picasso.get().load(currentItem.thumbnail).into(holder.image)
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title = itemView.findViewById<TextView>(R.id.productTitle)
        var image = itemView.findViewById<CircleImageView>(R.id.productImage)

    }
}