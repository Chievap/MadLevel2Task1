package com.example.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter (private val places: List<Place>) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){
    inner class ViewHolder(locationView: View) : RecyclerView.ViewHolder(locationView) {

        val binding = ItemPlaceBinding.bind(itemView)

        fun databind(place: Place) {
            binding.tvLocation.text = place.name
            binding.ivLocation.setImageResource(place.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return places.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(places[position])
    }


}