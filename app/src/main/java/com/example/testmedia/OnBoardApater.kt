package com.example.testmedia

import android.content.Context
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.testmedia.databinding.FirstOnBoardVpBinding

class OnBoardApater(private val context: Context, private val dataList: ArrayList<DataModel>) :
    Adapter<OnBoardApater.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.first_on_board_vp, parent, false)  )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val binding = FirstOnBoardVpBinding.bind(holder.itemView)


        binding.firstTitle.text = dataList[position].firstTitle
        binding.secondTitle.text = dataList[position].secondTitle
        binding.imgOnBoard.setImageResource(dataList[position].imgOnBoard)



    }

    override fun getItemCount(): Int = 3

}