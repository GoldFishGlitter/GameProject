package com.unitbv.module2.thymeleaf;

import com.unitbv.module2.model.*;
import com.unitbv.module2.model.PageRequest;
import com.unitbv.module2.repository.ItemShop.*;
import com.unitbv.module2.service.items.impl.*;
import lombok.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class ThymeLeafController {

    private final ItemShopServiceImpl itemShopService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        PageRequest pageRequest = new PageRequest();
        pageRequest.setPage(0);
        pageRequest.setSize(20);
        Page<ItemShop> allShops = itemShopService.getAllShops(pageRequest);
        model.addAttribute("allShops", allShops);
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewShop(Model model) {
        ItemShop itemShopToCreate = new ItemShop();
        model.addAttribute("ItemShop", itemShopToCreate);
        return "create";
    }

    @PostMapping("/save")
    public String saveShop(@ModelAttribute ItemShop itemShop) {
        itemShopService.addShop(itemShop);
        return "redirect:/";
    }

    @GetMapping(value = "/updateShopById/{id}")
    public String showFormForUpdateShop (@PathVariable(value = "id") Integer id, Model model) {
        ItemShop shopToUpdate = itemShopService.getShopById(id);
        model.addAttribute("ItemShop", shopToUpdate );
        return "update";
    }

    @GetMapping(value = "/deleteShopById/{id}")
    public String deleteShop (@PathVariable(value = "id") Integer id) {

        itemShopService.deleteShopById(id);

        return "redirect:/";
    }
}
