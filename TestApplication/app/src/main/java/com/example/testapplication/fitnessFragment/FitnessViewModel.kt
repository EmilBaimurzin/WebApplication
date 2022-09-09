package com.example.testapplication.fitnessFragment

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.testapplication.fitnessFragment.recyclerView.Meal

class FitnessViewModel(savedStateHandle: SavedStateHandle): ViewModel() {
    private val state = savedStateHandle
    private val repository = FitnessRepository()

    fun getMondayMeals(): MutableList<Meal> {
        return repository.getMondayMeals()
    }

    fun getTuesdayMeals(): MutableList<Meal> {
        return repository.getTuesdayMeals()
    }

    fun getWednesdayMeals(): MutableList<Meal> {
        return repository.getWednesdayMeals()
    }

    fun getThursdayMeals(): MutableList<Meal> {
        return repository.getThursdayMeals()
    }

    fun getFridayMeals(): MutableList<Meal> {
        return repository.getFridayMeals()
    }

    fun getWeekendsMeals(): MutableList<Meal> {
        return repository.getWeekendsMeals()
    }

    fun setTabState(value: Int) {
        state["TAB"] = value
    }

    fun getTabState(): Int = state["TAB"] ?: 0
}