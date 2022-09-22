package com.unitbv.module2.repository.Equipment;

import com.unitbv.module2.model.*;
import com.unitbv.module2.repository.Item.*;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Data
@Accessors(chain = true)
@Entity
public class Equipment extends Item {

    private Integer itemPower;

    @Enumerated(EnumType.STRING)
    private EquipmentType equipmentType;
}
