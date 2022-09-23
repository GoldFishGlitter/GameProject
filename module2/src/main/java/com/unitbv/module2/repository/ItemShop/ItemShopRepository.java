package com.unitbv.module2.repository.ItemShop;

import org.springframework.data.repository.*;

import java.util.*;

public interface ItemShopRepository extends PagingAndSortingRepository<ItemShop, Integer> {

    Optional<ItemShop> findByName(String string);
}
