package com.unitbv.module2.webcontrollers;


import com.unitbv.module2.repository.Equipment.*;
import com.unitbv.module2.service.items.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.net.*;

@RestController
@RequestMapping("/api/v1/equipments")
@RequiredArgsConstructor
public class EquipmentController {

    private final EquipmentService equipmentService;

    @GetMapping(value = "/{id}", params = "id")
    public ResponseEntity<Equipment> getEquipment (@PathVariable final Integer id) {

        return ResponseEntity.ok(equipmentService.getEquipmentById(id));
    }

    @GetMapping(value = "/{name}", params = "name")
    public Equipment getEquipment (@PathVariable final String name) {

        return equipmentService.getEquipmentByName(name);
    }

    @PostMapping
    public ResponseEntity createEquipment (@RequestBody Equipment equipment) {

        final Equipment addedEquipment = equipmentService.addEquipment(equipment);
        return ResponseEntity.created(URI.create("/api/v1/equipments" + addedEquipment.getId())).build();
    }

    @PutMapping(value = "/{id}")
    public Equipment updateEquipment (@PathVariable final Integer id, @RequestBody Equipment equipment) {

        return equipmentService.updateEquipmentById(id, equipment);
    }

    @PatchMapping(value = "/{id}")
    public Equipment patchEquipment (@PathVariable final Integer id, @RequestBody Equipment equipment) {

        return equipmentService.patchEquipmentById(id, equipment);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEquipment (@PathVariable final Integer id) {

        equipmentService.deleteEquipmentById(id);
    }
}
