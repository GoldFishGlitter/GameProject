package com.unitbv.module2.webcontrollers;

import com.unitbv.module2.repository.Consumable.*;
import com.unitbv.module2.service.items.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.net.*;

@RestController
@RequestMapping("/api/v1/consumables")
@RequiredArgsConstructor
public class ConsumableController {

    private final ConsumableService consumableService;

    @GetMapping(value = "/{id}", params = "id")
    public ResponseEntity<Consumable> getConsumable (@PathVariable final Integer id) {

        return ResponseEntity.ok(consumableService.getConsumableById(id));
    }

    @GetMapping(value = "/{name}", params = "name")
    public Consumable getConsumable (@PathVariable final String name) {

        return consumableService.getConsumableByName(name);
    }

    @PostMapping
    public ResponseEntity createConsumable (@RequestBody Consumable consumable) {

        final Consumable addedConsumable = consumableService.addConsumable(consumable);
        return ResponseEntity.created(URI.create("/api/v1/consumables" + addedConsumable.getId())).build();
    }

    @PutMapping(value = "/{id}")
    public Consumable updateConsumable (@PathVariable final Integer id, @RequestBody Consumable consumable) {

        return consumableService.updateConsumableById(id, consumable);
    }

    @PatchMapping(value = "/{id}")
    public Consumable patchConsumable (@PathVariable final Integer id, @RequestBody Consumable consumable) {

        return consumableService.patchConsumableById(id, consumable);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteConsumable (@PathVariable final Integer id) {

        consumableService.deleteConsumableById(id);
    }
}
