package com.elad;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "management/userId/{userId}/userName/{userName}/accountId/{accountId}", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public String postAccessToken(@PathVariable("userId") int userId, @PathVariable("userName") String userName,
                                  @PathVariable("accountId") String accountId) throws Exception {
        System.out.print("**** Parameters POST: userId:" + userId + " ,userName:" + userName
                + " accountid:" + accountId);

        return "elad";
    }

}
