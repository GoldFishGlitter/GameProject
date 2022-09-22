package com.unitbv.module2.service.items;

import com.unitbv.module2.repository.Equipment.*;

import javax.validation.*;
import javax.validation.constraints.*;

public interface EquipmentService {

    Equipment getEquipmentById(@NotNull Integer id);

    Equipment getEquipmentByName(@NotNull String name);

    Equipment addEquipment(@Valid Equipment equipment);

    Equipment updateEquipmentById(@NotNull Integer id, @Valid Equipment equipment);

    Equipment patchEquipmentById(@NotNull Integer id, Equipment equipment);

    void deleteEquipmentById(@NotNull Integer id);
}
