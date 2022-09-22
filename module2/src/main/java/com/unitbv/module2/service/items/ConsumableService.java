package com.unitbv.module2.service.items;

import com.sun.istack.*;
import com.unitbv.module2.repository.Consumable.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface ConsumableService {

    Consumable getConsumableById(@NotNull Integer id);

    Consumable getConsumableByName(@NotNull String name);

    Consumable addConsumable(@Valid Consumable consumable);

    Consumable updateConsumableById(@NotNull Integer id, @Valid Consumable consumable);

    Consumable patchConsumableById(@NotNull Integer id, Consumable consumable);

    void deleteConsumableById(@NotNull Integer id);
}
