package com.bogosz.poco.utils;

import com.bogosz.poco.model.Recipe;
import com.bogosz.poco.services.RecipeService;
import org.springframework.stereotype.Component;

@Component
public class InitializerBean {
    public InitializerBean(RecipeService recipeService){
        Recipe recipe = new Recipe("lecsó", "paprika, paradicsom, hagyma, virsli");
        recipeService.saveRecipe(recipe);
    }
}
