package com.lee.petclinic.controller;


import com.lee.petclinic.model.Owners;
import com.lee.petclinic.service.OwnersService;
import com.lee.petclinic.service.VetsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

       //List<VetsDto> vets = vetsService.checkFindAll();
//
//       List<Vets> vetsList = new ArrayList<>();
//
//        for (VetsDto item : vets) {
//            vetsList.add(item.toVets());
//        }

        //System.out.println(vets);

        //model.addAttribute("vets", vets);

        return "owners/ownerFind";
    }


    @GetMapping("/add")
    public String addOwnerForm(){

        return  "owners/createOrUpdateOwnerForm";
    }


    @PostMapping("/add")
    public String addOwner(@RequestBody
                               Owners owner){

        ownersService.addService(owner);
        return "redirect:/owners/ownerList/" + owner.getId() ;
    }


}
