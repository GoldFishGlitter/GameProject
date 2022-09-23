package com.unitbv.module2.thymeleaf;

import com.unitbv.module2.model.*;
import com.unitbv.module2.repository.ItemShop.*;
import com.unitbv.module2.service.items.*;
import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class ThymeLeafController {

    private final ItemShopService itemShopService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        PageRequest pageRequest = new PageRequest();
        pageRequest.setPage(1);
        pageRequest.setSize(20);
        model.addAttribute("allItemList", itemShopService.getAllShops(pageRequest));
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewShop(Model model) {
        ItemShop itemShopToCreate = new ItemShop();
        model.addAttribute("itemshop", itemShopToCreate);
        return "create";
    }

    @GetMapping(value = "/showFormForUpdateShop/{id}")
    public String showFormForUpdateShop (@PathVariable(value = "id") Integer id, Model model) {
        ItemShop shopToUpdate = itemShopService.getShopById(id);
        model.addAttribute("shop", shopToUpdate );
        return "update";
    }

    @PostMapping(value = "/save")
    public String updateShop (@ModelAttribute("shop") ItemShop shop) {
        if(shop.getId() != null) {
            itemShopService.updateShopById(shop.getId(), shop);
        }else{

            long countTotal = itemShopService.getCountTotal();
            int total = ((Long)countTotal).intValue();
            itemShopService.addShop(shop);
        }
        return "redirect:/";
    }

    @GetMapping(value = "/deleteShop/{id}")
    public String deleteShop (@PathVariable(value = "id") Integer id) {

        itemShopService.deleteShopById(id);

        return "redirect:/";
    }
}
