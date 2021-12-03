package pl.aleksander_figielski.pizza.data.entity.order;

import pl.aleksander_figielski.pizza.data.entity.ordersize.OrderSizeEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "floor")
    private String floor;

    @Column(name = "status")
    private String status;

    @Column(name = "create_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP) /* oznaczenie czasu i stefry czasowej */
    @Column(name = "update_at")
    private Date updatedAt;

    @Column(name = "expected_at")
    private Date expectedAt;

    @Column(name = "token")
    private String token;

    @OneToMany(mappedBy = "order")
    private Set<OrderSizeEntity> sizes;
}

