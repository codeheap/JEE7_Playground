package ch.froorider.cheesecakefactory_jeeservice.boundary;

import javax.annotation.*;
import javax.inject.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;
import ch.froorider.cheesecakefactory_jeeservice.controller.*;
import ch.froorider.cheesecakefactory_jeeservice.entity.*;

@Path("/meals")
public class MealResource{

@Inject
private MealService service;

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Meal> getMenuList(){
    return service.getMenus();
}


}
