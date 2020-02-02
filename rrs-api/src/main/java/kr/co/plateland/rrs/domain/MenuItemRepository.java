package kr.co.plateland.rrs.domain;

import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllByRestaurantId(Long RestaurantId);
}
