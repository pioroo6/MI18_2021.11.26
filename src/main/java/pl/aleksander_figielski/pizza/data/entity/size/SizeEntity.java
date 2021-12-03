package pl.aleksander_figielski.pizza.data.entity.size;

import pl.aleksander_figielski.pizza.data.entity.ordersize.OrderSizeEntity;
import pl.aleksander_figielski.pizza.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="sizes")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "price_base")
    private String priceBase;

    @Column(name = "size_type")
    private String sizeType;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSizes;

    @ManyToOne
    @JoinColumn(name="pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;
}
