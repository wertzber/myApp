package com.elad;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by eladw on 3/14/17.
 * Sample spring boot with rest resource
 */
@Controller
@RequestMapping("/rest")
public class RestContorller {


    @RequestMapping(value = "/resources", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public String getResources() throws Exception {

        System.out.print("Elad test get!!");
        return "Elad test get!!";
    }

}
