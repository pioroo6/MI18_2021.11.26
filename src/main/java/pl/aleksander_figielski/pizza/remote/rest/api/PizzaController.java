package pl.aleksander_figielski.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.aleksander_figielski.pizza.domain.model.OrderStatusType;
import pl.aleksander_figielski.pizza.remote.rest.dto.request.AddOrderDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.request.UpdateOrderDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.response.OrderCollectionDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.response.OrderDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.response.OrderStatusDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.response.TokenDto;

public class PizzaController {

    @PostMapping
    public ResponseEntity<PizzaDto> addPizza (@RequestBody AddPizzaDto addPizzaDto){

        return ResponseEntity.ok(PizzaDto);
    }

}
