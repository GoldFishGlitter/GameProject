package com.unitbv.module2.service.items.impl;

import com.unitbv.module2.repository.Consumable.*;
import com.unitbv.module2.service.items.*;
import lombok.*;
import org.springframework.stereotype.*;

import javax.validation.*;
import javax.validation.constraints.*;

@Service
@RequiredArgsConstructor
public class ConsumableServiceImpl implements ConsumableService {

    private final ConsumableRepository consumableRepository;

    @Override
    public Consumable getConsumableById(@NotNull Integer id) {

        return (Consumable)consumableRepository.findById(id).orElseThrow(() -> new RuntimeException("Consumable item not found."));
    }

    @Override
    public Consumable getConsumableByName(@NotNull String name) {

        return (Consumable)consumableRepository.findByName(name).orElseThrow(() -> new RuntimeException("Consumable item not found."));
    }

    @Override
    public Consumable addConsumable(@Valid Consumable consumable) {

        return consumableRepository.save(consumable);
    }

    @Override
    public Consumable updateConsumableById(@NotNull Integer id, @Valid Consumable consumable) {

        Consumable consumableToUpdate = consumableRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consumable item not found."));
        consumableToUpdate.setName(consumable.getName());
        consumableToUpdate.setPrice(consumable.getPrice());
        consumableToUpdate.setDescription(consumable.getDescription());
        consumableToUpdate.setRestriction(consumable.getRestriction());
        consumableToUpdate.setQuality(consumable.getQuality());
        consumableToUpdate.setReusabilty(consumable.getReusabilty());

        return consumableRepository.save(consumableToUpdate);
    }

    @Override
    public Consumable patchConsumableById(@NotNull Integer id, Consumable consumable) {

        Consumable consumableToUpdate = consumableRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consumable item not found."));

        if (consumable.getName() != null)
            consumableToUpdate.setName(consumable.getName());
        if (consumable.getPrice() != null)
            consumableToUpdate.setPrice(consumable.getPrice());
        if (consumable.getDescription() != null)
            consumableToUpdate.setDescription(consumable.getDescription());
        if (consumable.getQuality() != null)
            consumableToUpdate.setQuality(consumable.getQuality());

        return consumableRepository.save(consumableToUpdate);
    }

    @Override
    public void deleteConsumableById(@NotNull Integer id) {

        consumableRepository.deleteById(id);
    }
}
