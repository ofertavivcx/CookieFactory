package com.checkmarx.cookiefactory.controllers;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.checkmarx.cookiefactory.service.BakeService;

@RestController
@RequestMapping("/inventory")
@Slf4j
public class InventoryController {
	@Autowired
	private BakeService bakeService;

    @RequestMapping(path = "/immediateOrder", method = RequestMethod.GET)
    @ResponseBody
    public String getImmediateOrderCookies(@RequestParam("amount") int amount) {
//        log.info("Cookie inventory got immediate order for {} cookies", amount);
    	
        return bakeService.takeCookies(amount);
    }

    @RequestMapping(path = "/futureOrder", method = RequestMethod.GET)
    @ResponseBody
    public String getFutureOrderCookies(@RequestParam("amount") int amount) {
//        log.info("Cookie inventory got future order for {} cookies", amount);
    	return bakeService.bakeCookies(amount);
    }
}
