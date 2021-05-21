package com.prueba.prueba.controllers;

import com.prueba.prueba.models.CompareModel;
import com.prueba.prueba.models.ResultModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompareController {

    @PostMapping("/compare")
    public ResultModel compare(@RequestBody CompareModel compareModel){
        ResultModel r = new ResultModel();
        compareModel.getReceta1().retainAll(compareModel.getReceta2());
        r.setCoicidentes(compareModel.getReceta1());
        return r;
    }
}
