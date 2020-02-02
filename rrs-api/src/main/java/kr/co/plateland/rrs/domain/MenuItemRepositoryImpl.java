package kr.co.plateland.rrs.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository {

    private List<MenuItem> menuItems = new ArrayList<>();

    public MenuItemRepositoryImpl() {
        menuItems.add(new MenuItem("JJajangmen"));
    }

    @Override
    public List<MenuItem> findAllByRestaurantId(Long RestaurantId) {
        return menuItems;
    }
}
