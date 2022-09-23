package com.unitbv.module2.repository.Consumable;

import com.unitbv.module2.repository.Item.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface ConsumableRepository extends CrudRepository<Consumable, Integer> {

    Optional<Item> findByName(String name);
}
