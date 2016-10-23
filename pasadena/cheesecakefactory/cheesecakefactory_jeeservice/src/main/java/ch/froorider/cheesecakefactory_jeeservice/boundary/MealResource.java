package ch.froorider.cheesecakefactory_jeeservice.boundary;

import javax.annotation.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;
import ch.froorider.cheesecakefactory_jeeservice.entity.*;

@Path("/meals")
public class MealResource{

private List<Meal> meals = Arrays.asList(
    new Meal("Pizza","Ham and Mushrooms",10),
    new Meal("Burger","with a lot of beacon",11),
    new Meal("Kebab","very spicy",12)
);

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Meal> getMenuList(){
    return meals;
}


}
