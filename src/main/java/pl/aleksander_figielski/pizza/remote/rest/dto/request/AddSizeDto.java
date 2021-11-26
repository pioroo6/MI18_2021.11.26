package pl.aleksander_figielski.pizza.remote.rest.dto.request;

import pl.aleksander_figielski.pizza.domain.model.SizeType;

import java.math.BigDecimal;

public class AddSizeDto {

    private SizeType size; // size to cecha, SizeType to nazwa klasy,
    private BigDecimal price;
}
