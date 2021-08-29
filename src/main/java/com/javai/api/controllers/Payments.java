package com.javai.api.controllers;

import com.javai.api.requests.PixMapper;
import com.javai.api.requests.TedDto;
import com.javai.api.services.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("payments")
@Validated
public class Payments {
    private PaymentsService paymentsService;

    @Autowired
    public Payments(PaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }

    @PostMapping("/pix/{id}")
    public String pix(@PathVariable @Size(min = 10, max = 10) String id) {
        PixMapper pixMapper = new PixMapper(id);

        return "Qualquer coisa do gênero";
    }

    @PostMapping("/boleto")
    public String boleto(@RequestParam @Size(min = 47, max = 47) String id) {
        // [0-1] números do id identificam quem está pagando
        // [2-3] números identificam quem está recebendo
        // [6-9] números identificam o valor da operação
        return null;
    }

    @PostMapping("/ted")
    public String ted(@RequestBody @Valid TedDto data) {
        return null;
    }

}
