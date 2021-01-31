package com.lee.petclinic.controller;


import com.lee.petclinic.dto.VetsDto;
import com.lee.petclinic.model.Vets;
import com.lee.petclinic.service.VetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


// Vue나 React 였으면 RestController
@Controller
public class VetsController {

    private final VetsService vetsService;

    public VetsController(VetsService vetsService){
        this.vetsService = vetsService;
    }


    @GetMapping("/vets")
    public String vets( Model model) {

       List<VetsDto> vets = vetsService.checkFindAll();
//
//       List<Vets> vetsList = new ArrayList<>();
//
//        for (VetsDto item : vets) {
//            vetsList.add(item.toVets());
//        }

        System.out.println(vets);

        model.addAttribute("vets", vets);

        return "vetLists";
    }







}
