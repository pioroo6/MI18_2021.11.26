package pl.aleksander_figielski.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.aleksander_figielski.pizza.domain.model.OrderStatusType;
import pl.aleksander_figielski.pizza.remote.rest.dto.request.AddOrderDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.request.UpdateOrderDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.request.UpdatePizzaDto;
import pl.aleksander_figielski.pizza.remote.rest.dto.response.*;

@RequestMapping(value= "/api/v1/pizzas", produces = APPLICATION_JSON_VALUE)
@RestController

public class PizzaController {

        private final PizzaService pizzaService;
        public PizzaController(PizzaService pizzaService) {

            this.pizzaService = pizzaService;
        }


    @PostMapping
    public ResponseEntity<PizzaDto> addPizza (@RequestBody AddPizzaDto addPizzaDto,
                                              @RequestHeader("Access-Token") String token){
        PizzaDto pizzaDto = pizzaService.addPizza(addPizzaDto, token);
        return ResponseEntity.ok(PizzaDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PizzaDto> updatePizza(@RequestBody UpdatePizzaDto updatePizzaDto,
                                                @RequestHeader("Access-Toke") String token,
                                                @PathVariable("id")Integer pizzaId) {
            return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePizza(@PathVariable("id") Integer pizzaId,
                                            @RequestHeader("Access-Token") String token){
            return ResponseEntity.ok().build();
    }

}
