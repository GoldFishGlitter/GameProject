package com.unitbv.module2.repository.Consumable;

import com.unitbv.module2.model.*;
import com.unitbv.module2.repository.Item.*;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@Entity
public class Consumable extends Item {

    @Enumerated(EnumType.STRING)
    private Quality quality;

    @Enumerated(EnumType.STRING)
    private Reusabilty reusabilty;
}
