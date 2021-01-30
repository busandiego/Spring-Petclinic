package com.lee.petclinic.controller;


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
    public String vets(Model model) {

       List<Vets> checkedVetsModel = vetsService.checkFindAll();
        System.out.println("checkedVetsModel: " + checkedVetsModel);
        System.out.println("데이터 찾기: " + checkedVetsModel.get(1).getName());

        model.addAttribute("vets", checkedVetsModel);
        return "vetLists";
    }







}
