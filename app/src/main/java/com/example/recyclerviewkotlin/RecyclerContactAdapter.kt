package com.example.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerContactAdapter internal constructor(var context: Context, var arrContacts: ArrayList<ContactModel>) : RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgContact.setImageResource(arrContacts[position].img)
        holder.txtName.text = arrContacts[position].name
        holder.txtNumber.text = arrContacts[position].number
    }

    override fun getItemCount(): Int {
        return arrContacts.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView
        var txtNumber: TextView
        var imgContact: ImageView

        init {
            txtName = itemView.findViewById<View>(R.id.txtName) as TextView
            txtNumber = itemView.findViewById<View>(R.id.txtNumber) as TextView
            imgContact = itemView.findViewById<View>(R.id.imgContact) as ImageView
        }
    }
}
