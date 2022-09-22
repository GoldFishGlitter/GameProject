package com.unitbv.module2.repository.Item;

import com.sun.istack.*;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer price;

    private String description;

    private String restriction;
}
