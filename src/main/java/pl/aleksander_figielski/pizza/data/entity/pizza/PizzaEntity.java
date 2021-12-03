package pl.aleksander_figielski.pizza.data.entity.pizza;

import pl.aleksander_figielski.pizza.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "pizza")
    private Set<SizeEntity> sizes;
}
