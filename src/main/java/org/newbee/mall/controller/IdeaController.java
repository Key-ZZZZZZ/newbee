package org.newbee.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IdeaController {

    @GetMapping("/info")
    @ResponseBody
    public String info() {
        return "info";
    }


}
