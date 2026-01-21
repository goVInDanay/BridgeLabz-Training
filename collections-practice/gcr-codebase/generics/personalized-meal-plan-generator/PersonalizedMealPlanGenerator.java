package collections.gcr_codebase.generics.personalized_meal_plan_generator;

public class PersonalizedMealPlanGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meal<VegetarianMeal> vegetarianMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
		Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMealPlan(new VeganMeal());
		Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMealPlan(new KetoMeal());
		Meal<HighProteinMeal> highProteinMeal = MealPlanGenerator.generateMealPlan(new HighProteinMeal());
		
		vegetarianMeal.displayMeal();
		veganMeal.displayMeal();
		ketoMeal.displayMeal();
		highProteinMeal.displayMeal();
	}

}
