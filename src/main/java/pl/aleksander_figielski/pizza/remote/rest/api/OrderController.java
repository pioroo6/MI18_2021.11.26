package pl.aleksander_figielski.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.aleksander_figielski.pizza.domain.model.OrderStatusType;
import pl.aleksander_figielski.pizza.remote.rest.dto.request.AddOrderDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.request.UpdateOrderDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.response.*;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController

public class OrderController {

    @PostMapping
    public ResponseEntity<TokenDto> addOrder (@RequestBody AddOrderDto addOrderDto){

        return ResponseEntity.ok(orderStatusDto);
    }

    @GetMapping
    public ResponseEntity<OrderStatusDto> getStatus(@PathVariable("token")String token)

        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrders(@RequestParam("status") OrderStatusType orderStatus,
                                                        @RequestHeader("Access-Token") String token){

        return ResponseEntity.ok(null);
    }

    @DeleteMapping(/"{order-id}")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token,
                                            @PathVariable("order-id") Integer orderId) {

    return ResponseEntity.ok().build();
    }

    @PutMapping(/"{order-id}")
    public ResponseEntity<OrderDto> updateOrder(@RequestBody UpdateOrderDto updateOrderDto,
                                                @RequestHeader("Access-Token") String token,
                                                @PathVariable("order-id") Integer orderId) {

        return ResponseEntity.ok(null);
    }

}


















