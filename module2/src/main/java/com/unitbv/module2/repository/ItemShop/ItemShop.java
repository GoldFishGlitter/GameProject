package com.unitbv.module2.repository.ItemShop;

import com.unitbv.module2.model.*;
import com.unitbv.module2.repository.Consumable.*;
import com.unitbv.module2.repository.Equipment.*;
import com.unitbv.module2.repository.Item.*;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Accessors(chain = true)
@Entity
public class ItemShop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    @Column(unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private ShopSpecialty shopSpecialty;
}
