package com.javai.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TedDto {

    @Min(1)
    @Max(99)
    Long idPagador;

    @Min(1)
    @Max(99)
    Long idRecebedor;

    @Min(1)
    Double valor;

}
