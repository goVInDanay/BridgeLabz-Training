package collections.gcr_codebase.generics.personalized_meal_plan_generator;

class Meal<T extends MealPlan> {
	private T mealPlan;

	Meal(T mealPlan) {
		this.mealPlan = mealPlan;
	}

	public T getMealPlan() {
		return mealPlan;
	}

	public void displayMeal() {
		System.out.println("Meal Type: " + mealPlan.getMealType());
	}
}
