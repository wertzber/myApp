package com.elad.myapp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by eladw on 3/14/17.
 * Sample spring boot with rest resource
 */
@Controller
public class RestContorler {


    @RequestMapping(value = "/elad", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public String getResources() throws Exception {

        System.out.print("Elad test get!!");
        return "Elad test get resources!!";
    }

    @RequestMapping(value = "/management/userId/{userId}/userName/{userName}/accountId/{accountId}", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public String postAccessToken(@PathVariable("userId") int userId, @PathVariable("userName") String userName,
                                  @PathVariable("accountId") String accountId) throws Exception {
        System.out.print("**** Parameters POST: userId:" + userId + " ,userName:" + userName
                + " accountid:" + accountId);

        return "elad";
    }

}
