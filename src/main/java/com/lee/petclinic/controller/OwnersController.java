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
        // 찾기부분에서 그냥 view 띄워주면 될거라 생각했는데 Owner 객체를 가지고
        // /find 페이지에다 객체를 전송해줘야한다. 그 이유는
        // 찾기 페이지인데 뷰에다가 객체를 가지고 찾기 버튼을 눌렸을 때 출력되야 하기 때문이다
        // 만약에 찾기를 눌렀을 때 새로운 페이지로 가는거면

        model.put("owner", new Owners());

        return "owners/ownerFind";
    }

    @GetMapping("/ownerslist")
    public String ownerList(){


        ownersService.findAll();

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
