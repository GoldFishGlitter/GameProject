package com.unitbv.module2.service.items.impl;

import com.unitbv.module2.repository.ItemShop.*;
import com.unitbv.module2.service.items.*;
import lombok.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;
import org.springframework.validation.annotation.*;

import javax.validation.*;
import javax.validation.constraints.*;

@Service
@RequiredArgsConstructor
@Validated
public class ItemShopServiceImpl implements ItemShopService {

    private final ItemShopRepository itemShopRepository;

    @Override
    public ItemShop addShop(@Valid ItemShop itemShop) {

        return itemShopRepository.save(itemShop);
    }

    @Override
    public ItemShop updateShopById(@NotNull Integer id, @Valid ItemShop itemShop) {

        ItemShop itemShopToUpdate = itemShopRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Shop not found."));
        itemShopToUpdate.setName(itemShop.getName());
        itemShopToUpdate.setShopSpecialty(itemShop.getShopSpecialty());

        return itemShopRepository.save(itemShopToUpdate);
    }

    @Override
    public ItemShop patchShopById(@NotNull Integer id, ItemShop itemShop) {

        ItemShop itemShopToUpdate = itemShopRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Shop not found."));
        if (itemShop.getName() != null)
            itemShopToUpdate.setName(itemShop.getName());
        if (itemShop.getShopSpecialty() != null)
            itemShopToUpdate.setShopSpecialty(itemShop.getShopSpecialty());

        return itemShopRepository.save(itemShopToUpdate);
    }

    @Override
    public void deleteShopById(@NotNull Integer id) {

        itemShopRepository.deleteById(id);
    }

    @Override
    public ItemShop getShopById(@NotNull Integer id) {

        return itemShopRepository.findById(id).orElseThrow(() -> new RuntimeException("Shop not found."));
    }

    @Override
    public ItemShop getShopByName(@NotNull String name) {

        return itemShopRepository.findByName(name).orElseThrow(() -> new RuntimeException("Shop not found."));
    }

    @Override
    public Page<ItemShop> getAllShops(com.unitbv.module2.model.PageRequest request) {

        final var pageable = PageRequest.of(request.getPage(), request.getSize(), Sort.by("id"));

        return itemShopRepository.findAll(pageable);
    }

    @Override
    public long getCountTotal(){

        return itemShopRepository.count();
    }
}
