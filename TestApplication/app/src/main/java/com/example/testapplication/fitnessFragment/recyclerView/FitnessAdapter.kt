package com.example.testapplication.fitnessFragment.recyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testapplication.databinding.ItemBinding

class FitnessAdapter : RecyclerView.Adapter<ViewHolder>() {
    var items = mutableListOf<Meal>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ), parent.context
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}

class ViewHolder(private val binding: ItemBinding, private val context: Context) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Meal) {
        binding.apply {
            mealTypeTextView.text = item.mealType
            mealTextView.text = item.meal
            caloriesTextView.text = item.PCF
            totalCaloriesTextView.text = item.totalCalories

            Glide.with(context)
                .load(item.image)
                .placeholder(null)
                .into(binding.mealImageView)

        }
    }
}
