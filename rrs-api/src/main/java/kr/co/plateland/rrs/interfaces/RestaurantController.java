package kr.co.plateland.rrs.interfaces;

import kr.co.plateland.rrs.domain.Restaurant;
import kr.co.plateland.rrs.domain.RestaurantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    private RestaurantRepository repository = new RestaurantRepository();

    @GetMapping("/restaurants")
    public List<Restaurant> list() {

/*      중복코드를 repository 안에 밀어넣었다.
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(1004L, "Bob Jip", "Seoul"));
        restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));
*/

        List<Restaurant> restaurants = repository.findAll();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {
        Restaurant restaurant = repository.findById(id);
/*      중복코드를 Repository에 밀어넣었다.
        Restaurant restaurant = restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);*/

/*      Restaurant restaurant = null;

        if(id == 1004L) {
            restaurant = new Restaurant(1004L, "Bob Jip", "Seoul");
        }
        if(id == 2020L) {
            restaurant = new Restaurant(2020L, "Cyber Food", "Seoul");
        }*/
        return restaurant;
    }

}
