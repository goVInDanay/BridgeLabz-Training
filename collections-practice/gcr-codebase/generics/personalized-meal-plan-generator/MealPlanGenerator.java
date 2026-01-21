package collections.gcr_codebase.generics.personalized_meal_plan_generator;

class MealPlanGenerator {
	public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
		if (mealPlan.getMealType() == null || mealPlan.getMealType().length() == 0) {
			System.err.println("Invalid name");
			return null;
		}
		return new Meal<T>(mealPlan);
	}
}
