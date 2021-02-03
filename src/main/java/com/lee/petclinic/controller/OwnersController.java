package com.lee.petclinic.controller;


import com.lee.petclinic.model.Owners;
import com.lee.petclinic.service.OwnersService;
import com.lee.petclinic.service.VetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Vue나 React 였으면 RestController
@Controller
@RequestMapping("/owner")
public class OwnersController {

    private final OwnersService ownersService;

    public OwnersController(OwnersService ownersService){
        this.ownersService = ownersService;
    }


    @GetMapping("/find")
    public String ownersFind() {

        return "owners/ownerFind";
    }


    @GetMapping("/add")
    public String addOwnerForm(Model model){

        List<Owners> owner = ownersService.findAll();

        model.addAttribute("owner", owner);


        return  "owners/createOrUpdateOwnerForm";
    }


    @PostMapping("/add")
    public String addOwner(@ModelAttribute Owners owner){

        ownersService.addService(owner);
        return "redirect:/owner/ownerDetail/" + owner.getId() ;
    }


}
