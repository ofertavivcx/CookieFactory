package com.checkmarx.cookiefactory.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
@Slf4j
public class InventoryController {

    @RequestMapping(path = "/ImmediateOrder", method = RequestMethod.GET)
    @ResponseBody
    public String getImmediateOrderCookies(@RequestParam("amount") int amount) {
        log.info("Cookie inventory got immediate order for {} cookies", amount);
        // Place your code here
        return "";
    }

    @RequestMapping(path = "/futureOrder", method = RequestMethod.GET)
    @ResponseBody
    public String getFutureOrderCookies(@RequestParam("amount") int amount) {
        log.info("Cookie inventory got future order for {} cookies", amount);
        // Place your code here
        return "";
    }
}
