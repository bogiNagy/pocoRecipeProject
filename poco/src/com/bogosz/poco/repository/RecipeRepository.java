package com.bogosz.poco.repository;

import com.bogosz.poco.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
    Recipe findRecipeByTitle(String title);
}
