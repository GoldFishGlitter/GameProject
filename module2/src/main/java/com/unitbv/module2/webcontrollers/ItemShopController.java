package com.unitbv.module2.webcontrollers;

import com.unitbv.module2.model.*;
import com.unitbv.module2.model.PageRequest;
import com.unitbv.module2.repository.ItemShop.*;
import com.unitbv.module2.service.items.*;
import lombok.*;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.net.*;

@RestController
@RequestMapping("/api/v1/shops")
@RequiredArgsConstructor
public class ItemShopController {

    private final ItemShopService shopService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ItemShop> getShop (@PathVariable final Integer id) {

        return  ResponseEntity.ok(shopService.getShopById(id));
    }

    @GetMapping(value = "/{name}")
    public ItemShop getShop (@PathVariable final String name) {

        return  shopService.getShopByName(name);
    }

    @GetMapping()
    public Page<ItemShop> getShop (PageRequest pageRequest) {

        return shopService.getAllShops(pageRequest);
    }

    @PostMapping
    public ResponseEntity createShop (@RequestBody ItemShop itemShop) {

        final ItemShop addedShop = shopService.addShop(itemShop);
        return ResponseEntity.created(URI.create("/api/v1/shops" + addedShop.getId())).build();
    }

    @PutMapping(value = "/{id}")
    public ItemShop updateShop (@PathVariable final Integer id, @RequestBody ItemShop itemShop) {

        return shopService.updateShopById(id, itemShop);
    }

    @PatchMapping(value = "/{id}")
    public ItemShop patchShop (@PathVariable final Integer id, @RequestBody ItemShop itemShop) {

        return shopService.patchShopById(id, itemShop);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteShop (@PathVariable final Integer id) {

        shopService.deleteShopById(id);
    }
}
