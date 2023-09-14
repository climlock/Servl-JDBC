package com.dmdev.http.pac1.dto;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
//@Data // Заменяет аннотации ниже
//@AllArgsConstructor
//@Getter
//@EqualsAndHashCode
//@ToString
public class FlightDto {

    Long id;
    String description;

}
