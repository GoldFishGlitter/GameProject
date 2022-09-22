package com.unitbv.module2.service.items.impl;

import com.unitbv.module2.repository.Equipment.*;
import com.unitbv.module2.service.items.*;
import lombok.*;
import org.springframework.stereotype.*;

import javax.validation.*;
import javax.validation.constraints.*;

@Service
@RequiredArgsConstructor
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository equipmentRepository;

    @Override
    public Equipment getEquipmentById(@NotNull Integer id) {

        return equipmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Equipment item not found."));
    }

    @Override
    public Equipment getEquipmentByName(@NotNull String name) {

        return (Equipment)equipmentRepository.findByName(name).orElseThrow(() -> new RuntimeException("Equipment item not found."));
    }

    @Override
    public Equipment addEquipment(@Valid Equipment equipment) {

        return equipmentRepository.save(equipment);
    }

    @Override
    public Equipment updateEquipmentById(@NotNull Integer id, @Valid Equipment equipment) {

        Equipment equipmentToUpdate = equipmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipment item not found."));
        equipmentToUpdate.setName(equipment.getName());
        equipmentToUpdate.setPrice(equipment.getPrice());
        equipmentToUpdate.setDescription(equipment.getDescription());
        equipmentToUpdate.setRestriction(equipment.getRestriction());
        equipmentToUpdate.setItemPower(equipment.getItemPower());
        equipmentToUpdate.setEquipmentType(equipment.getEquipmentType());

        return equipmentRepository.save(equipmentToUpdate);
    }

    @Override
    public Equipment patchEquipmentById(@NotNull Integer id, Equipment equipment) {

        Equipment equipmentToUpdate = equipmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipment item not found."));
        if (equipment.getName() != null)
            equipmentToUpdate.setName(equipment.getName());
        if(equipment.getPrice() != null)
            equipmentToUpdate.setPrice(equipment.getPrice());
        if(equipment.getDescription() != null)
            equipmentToUpdate.setDescription(equipment.getDescription());
        if(equipment.getItemPower() != null)
            equipmentToUpdate.setItemPower(equipment.getItemPower());

        return equipmentRepository.save(equipmentToUpdate);
    }

    @Override
    public void deleteEquipmentById(@NotNull Integer id) {

        equipmentRepository.deleteById(id);
    }
}
