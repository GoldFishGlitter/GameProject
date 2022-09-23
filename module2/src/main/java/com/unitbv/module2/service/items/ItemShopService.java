package com.unitbv.module2.service.items;

import com.unitbv.module2.repository.Consumable.*;
import com.unitbv.module2.repository.Equipment.*;
import com.unitbv.module2.repository.ItemShop.*;
import org.springframework.data.domain.*;

import javax.validation.*;
import javax.validation.constraints.*;

public interface ItemShopService {

    ItemShop addShop(@Valid ItemShop itemShop);

    ItemShop updateShopById(@NotNull Integer id, @Valid ItemShop itemShop);

    ItemShop patchShopById(@NotNull Integer id, ItemShop itemShop);

    void deleteShopById(@NotNull Integer id);

    ItemShop getShopById(@NotNull Integer id);

    ItemShop getShopByName(@NotNull String name);

    Page<ItemShop> getAllShops(com.unitbv.module2.model.PageRequest request);

    long getCountTotal();
}
