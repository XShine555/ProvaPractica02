package com.example.provapractica02.fragments.tasques

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.provapractica02.R
import com.example.provapractica02.models.Tasca

class TasquesAdapter : RecyclerView.Adapter<TascaViewHolder>() {

    private var tasques = listOf<Tasca>()

    fun setTasques(novesTasques: List<Tasca>) {
        tasques = novesTasques
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TascaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tasca, parent, false)
        return TascaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TascaViewHolder, position: Int) {
        holder.renderitza(tasques[position])
    }

    override fun getItemCount(): Int {
        return tasques.size
    }

}