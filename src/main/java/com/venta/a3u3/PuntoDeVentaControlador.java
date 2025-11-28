package com.venta.a3u3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PuntoDeVentaControlador {

    @GetMapping("/venta")
    public String venta() {
        return "venta";
    }

}
