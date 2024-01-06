package com.full_app.controllers;

import com.full_app.models.Country;
import com.full_app.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/Country")
    public String getCountries(Model model){

        List< Country> countryList = countryService.getCountries();

        model.addAttribute("countries", countryList);

        return "country";
    }

    @PostMapping("/Country/addNew")
    public String addNew(Country country){
        countryService.save(country);
        return "redirect:/Country";
    }

    @RequestMapping("/Country/findById/")
    @ResponseBody
    public Optional<Country> findById(int country_id){
        return countryService.findById(country_id);
    }

    @RequestMapping(value="/Country/edit", method={RequestMethod.GET, RequestMethod.PUT})
    public String edit(Country country){
        countryService.save(country);
        return "redirect:/Country";
    }
}
