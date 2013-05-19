package org.motechproject.spike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    private TestService service;

    @ResponseBody
    @RequestMapping("/create")
    private String create() {
        return service.create();
    }

    @ResponseBody
    @RequestMapping("/count")
    private String count() {
        return service.count();
    }
}
