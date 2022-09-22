package com.unitbv.module2.repository.Item;

import org.springframework.data.repository.*;

import java.util.*;

public interface ItemRepository extends CrudRepository<Item, Integer> {

    Optional<Item> findByName(String string);
}
