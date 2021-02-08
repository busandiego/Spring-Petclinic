package com.lee.petclinic.controller;


import com.lee.petclinic.model.Owners;
import com.lee.petclinic.service.OwnersService;
import com.lee.petclinic.service.VetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


// Vue나 React 였으면 RestController
@Controller
@RequestMapping("/owners")
public class OwnersController {

    private final OwnersService ownersService;

    public OwnersController(OwnersService ownersService){
        this.ownersService = ownersService;
    }


    @GetMapping("/find")
    public String ownersFind(Map<String, Object> model) {
        // 찾기부분에서 그냥 view 띄워주면 될거라 생각했는데 Owner 객체생성을 해준다.

        model.put("owner", new Owners());

        return "owners/ownerFind";
    }

    @GetMapping("/ownerslist")
    public String ownerList(@ModelAttribute Owners owners, Model model){
       List<Owners> ownersList = ownersService.lastNameSearch(owners);
        // Map<String, Object> model -> model.put
        // Model model -> model.addAttribute

        model.addAttribute("ownerList", ownersList);
        System.out.println("ownerList: " + ownersList );
        return  "owners/ownersList";
    }

    @GetMapping("/add")
    public String addOwnerForm(Model model){

        return  "owners/createOrUpdateOwnerForm";
    }


    @PostMapping("/add")
    public String addOwner(@ModelAttribute Owners owner){

        ownersService.addService(owner);
        return "redirect:/owners/ownerDetail/" + owner.getId() ;
    }


    @GetMapping("/onwerDetail/{id}")
    public String ownerDetail(){

        return "";
    }

}
