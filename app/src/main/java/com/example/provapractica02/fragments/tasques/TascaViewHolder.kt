package com.example.provapractica02.fragments.tasques

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.provapractica02.R
import com.example.provapractica02.models.Estat
import com.example.provapractica02.models.Tasca

class TascaViewHolder(
    itemView: View, private val onTascaClick: (Tasca) -> Unit
) : RecyclerView.ViewHolder(itemView) {
    private val tvNom = itemView.findViewById<TextView>(R.id.tvNom)
    private val tvCategoria = itemView.findViewById<TextView>(R.id.tvCategoria)
    private val tvData = itemView.findViewById<TextView>(R.id.tvData)
    private val tvEstat = itemView.findViewById<TextView>(R.id.tvEstat)

    fun renderitza(tasca: Tasca) {
        tvNom.text = tasca.nom
        tvCategoria.text = tasca.categoria.nom
        tvData.text = tasca.data
        tvEstat.text = tasca.estat.nom

        tvEstat.setTextColor(
            when (tasca.estat) {
                Estat.EnCurs -> Color.parseColor("#2196F3")
                Estat.NoComencada -> Color.parseColor("#FF9800")
                Estat.Finalitzada -> Color.parseColor("#4CAF50")
            }
        )

        itemView.setOnClickListener { onTascaClick(tasca) }
    }
}