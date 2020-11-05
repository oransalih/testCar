package com.example.demo;

import com.example.demo.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/rest")
public class CarController {

    @RequestMapping(method= RequestMethod.POST,value="/getCarType")
    @ResponseBody
    public String getOtomobilSahipler(@RequestBody String carTypes){

        String response = null;
        Car car = null;

        String carType  = validateRequest(carTypes);
        switch (carType) {
            case "CABRIO":
                car = new Cabrio();
                break;
            case "SEDAN":
                car = new Sedan();
                break;
            case "HATCHBACK":
                car = new Hatchback();
                break;
            default:
                response = "Uyumsuz Araba Tipi";
                break;

        }

        return car != null ? car.getType() : response;

    }

    private String validateRequest(String request) {
        String response="BOS";
        if (!StringUtils.isEmpty(request) && !"".equals(request)){
                response = request.toUpperCase();
        }

        return response;
    }
}
