package com.prueba.prueba.controllers;

import com.prueba.prueba.models.CompareModel;
import com.prueba.prueba.models.ResultModel;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class CompareController {

    @PostMapping("/compare")
    public ResultModel compare(@RequestBody CompareModel compareModel){
        ResultModel r = new ResultModel();
        List<String> lista1 = compareModel.getReceta1();
        List<String> lista2 = compareModel.getReceta2();
        lista1.retainAll(lista2);
        r.setCoicidentes(lista1);
        return r;
    }
}
