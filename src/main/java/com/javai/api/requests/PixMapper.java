package com.javai.api.requests;

import java.math.BigDecimal;

public class PixMapper {
    private Long idPagador;

    private Long idRecebedor;

    private BigDecimal valor;

    public PixMapper(String id) {
        this.idPagador = Long.parseLong(id.substring(0, 2));
        this.idRecebedor = Long.parseLong(id.substring(2, 4));
        this.valor = BigDecimal.valueOf(Long.parseLong(id.substring(6, 10)));
    }

}
