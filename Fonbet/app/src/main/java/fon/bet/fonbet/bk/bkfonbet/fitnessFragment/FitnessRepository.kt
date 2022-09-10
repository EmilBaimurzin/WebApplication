package fon.bet.fonbet.bk.bkfonbet.fitnessFragment

import fon.bet.fonbet.bk.bkfonbet.fitnessFragment.recyclerView.Meal

class FitnessRepository {
    fun getMondayMeals(): MutableList<Meal> {
        return mutableListOf(
            Meal(mealType = "Breakfast",
                meal = "Oatmeal",
                PCF = "protein: 23 / carbs: 40 / fat: 10",
                totalCalories = "567 calories",
                image = "https://images.pexels.com/photos/543730/pexels-photo-543730.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Lunch",
                meal = "Turkey Sandwich",
                PCF = "protein: 20 / carbs: 38 / fat: 6",
                totalCalories = "480 calories",
                image = "https://media.istockphoto.com/photos/turkey-sandwich-picture-id157431311?b=1&k=20&m=157431311&s=612x612&w=0&h=gtFR_wmtZEnsd3rtwnGflmJ-NHglJm9yDXxqFW8euGc="),
            Meal(mealType = "Dinner",
                meal = "Beef with rice",
                PCF = "protein: 50 / carbs: 60 / fat: 25",
                totalCalories = "990 calories",
                image = "https://images.pexels.com/photos/9392998/pexels-photo-9392998.jpeg?auto=compress&cs=tinysrgb&w=600")
        )
    }

    fun getTuesdayMeals(): MutableList<Meal> {
        return mutableListOf(
            Meal(mealType = "Breakfast",
                meal = "Greek Yoghurt with fruits",
                PCF = "protein: 20 / carbs: 30 / fat: 15",
                totalCalories = "407 calories",
                image = "https://images.pexels.com/photos/4006347/pexels-photo-4006347.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Lunch",
                meal = "Salad",
                PCF = "protein: 10 / carbs: 50 / fat: 16",
                totalCalories = "340 calories",
                image = "https://images.pexels.com/photos/1059905/pexels-photo-1059905.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Dinner",
                meal = "Meet Soup",
                PCF = "protein: 45 / carbs: 50 / fat: 22",
                totalCalories = "760 calories",
                image = "https://images.pexels.com/photos/7455910/pexels-photo-7455910.png?auto=compress&cs=tinysrgb&w=600")
        )
    }

    fun getWednesdayMeals(): MutableList<Meal> {
        return mutableListOf(
            Meal(mealType = "Breakfast",
                meal = "Avocado Toast",
                PCF = "protein: 17 / carbs: 30 / fat: 20",
                totalCalories = "498 calories",
                image = "https://images.pexels.com/photos/1351238/pexels-photo-1351238.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Lunch",
                meal = "Vegan Soup",
                PCF = "protein: 10 / carbs: 48 / fat: 9",
                totalCalories = "470 calories",
                image = "https://images.pexels.com/photos/5605571/pexels-photo-5605571.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Dinner",
                meal = "Mozzarella Salad",
                PCF = "protein: 30 / carbs: 31 / fat: 19",
                totalCalories = "560 calories",
                image = "https://images.pexels.com/photos/7556002/pexels-photo-7556002.jpeg?auto=compress&cs=tinysrgb&w=600")
        )
    }

    fun getThursdayMeals(): MutableList<Meal> {
        return mutableListOf(
            Meal(mealType = "Breakfast",
                meal = "Scrambled eggs",
                PCF = "protein: 30 / carbs: 27 / fat: 20",
                totalCalories = "590 calories",
                image = "https://media.istockphoto.com/photos/cooking-scrambled-eggs-picture-id92259449?b=1&k=20&m=92259449&s=612x612&w=0&h=38RyyY9VRJtqvzpwSuV26WhpIStQmh6n8ocIzn0T5sI="),
            Meal(mealType = "Lunch",
                meal = "Pork steak",
                PCF = "protein: 50 / carbs: 34 / fat: 20",
                totalCalories = "680 calories",
                image = "https://images.pexels.com/photos/1251208/pexels-photo-1251208.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Dinner",
                meal = "Boiled Potatoes",
                PCF = "protein: 16 / carbs: 57 / fat: 11",
                totalCalories = "455 calories",
                image = "https://media.istockphoto.com/photos/boiled-young-potatoes-with-butter-and-dill-served-in-the-eco-coconut-picture-id1147508772?b=1&k=20&m=1147508772&s=612x612&w=0&h=jo9zvzElvshb5WJDSLUs3NAy36MJt0an2P8pPFUlk7A=")
        )
    }

    fun getFridayMeals(): MutableList<Meal> {
        return mutableListOf(
            Meal(mealType = "Breakfast",
                meal = "Greek Yoghurt with fruits",
                PCF = "protein: 20 / carbs: 30 / fat: 15",
                totalCalories = "407 calories",
                image = "https://images.pexels.com/photos/414262/pexels-photo-414262.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Lunch",
                meal = "Boiled eggs",
                PCF = "protein: 27 / carbs: 34 / fat: 11",
                totalCalories = "521 calories",
                image = "https://images.pexels.com/photos/7936650/pexels-photo-7936650.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Dinner",
                meal = "Chicken with rice",
                PCF = "protein: 51 / carbs: 34 / fat: 18",
                totalCalories = "560 calories",
                image = "https://images.pexels.com/photos/11743998/pexels-photo-11743998.jpeg?auto=compress&cs=tinysrgb&w=600")
        )
    }

    fun getSaturdayMeals(): MutableList<Meal> {
        return mutableListOf(
            Meal(mealType = "Breakfast",
                meal = "Porridge with fruits",
                PCF = "protein: 19 / carbs: 45 / fat: 19",
                totalCalories = "445 calories",
                image = "https://images.pexels.com/photos/10597631/pexels-photo-10597631.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Lunch",
                meal = "Soup",
                PCF = "protein: 17 / carbs: 38 / fat: 19",
                totalCalories = "467 calories",
                image = "https://images.pexels.com/photos/209540/pexels-photo-209540.jpeg?auto=compress&cs=tinysrgb&w=600"),
            Meal(mealType = "Dinner",
                meal = "Bowl of fruits",
                PCF = "protein: 11 / carbs: 56 / fat: 5",
                totalCalories = "398 calories",
                image = "https://images.pexels.com/photos/1092730/pexels-photo-1092730.jpeg?auto=compress&cs=tinysrgb&w=600")
        )
    }

    fun getSundayMeals(): MutableList<Meal> {
        return mutableListOf(
            Meal(mealType = "Breakfast",
                meal = "Protein Waffles",
                PCF = "protein: 29 / carbs: 25 / fat: 11",
                totalCalories = "480 calories",
                image = "https://media.istockphoto.com/photos/waffles-with-fruit-and-maple-syrup-on-a-marble-counter-picture-id185266029?b=1&k=20&m=185266029&s=612x612&w=0&h=xtxHsTncyIqm0sjUdkHeIX7TdAzANID0MDM0zitFoMw="),
            Meal(mealType = "Lunch",
                meal = "Fish",
                PCF = "protein: 25 / carbs: 40 / fat: 30",
                totalCalories = "609 calories",
                image = "https://media.istockphoto.com/photos/roasted-sea-bream-fish-with-lemon-slices-picture-id855749956?b=1&k=20&m=855749956&s=612x612&w=0&h=YMkZ7-95dWgRWiPIAcQa6JR2vH_NN3-Wd-ixwVd4VQU="),
            Meal(mealType = "Dinner",
                meal = "Baked beans with eggs",
                PCF = "protein: 43 / carbs: 46 / fat: 25",
                totalCalories = "790 calories",
                image = "https://media.istockphoto.com/photos/english-breakfast-picture-id687016590?b=1&k=20&m=687016590&s=612x612&w=0&h=GL4aQ-4X7HgcUbsoYcdyfTi1JjqvF26wTtjAYcPwcCY=")
        )
    }
}