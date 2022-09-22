package com.unitbv.module2.repository.Equipment;

import com.unitbv.module2.repository.Item.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface EquipmentRepository extends CrudRepository<Equipment, Integer> {

    Optional<Item> findByName(String string);
}
