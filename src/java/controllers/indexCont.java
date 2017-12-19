package controllers;

import org.springframework.web.bind.annotation.*;

/**
 *
 * @author fetnat
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import dao.*;
import model.*;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
public class indexCont {

    @RequestMapping(value = "*")
    public String defaultPage() {
        return "index";

    }

    @RequestMapping(value = "/returnres")
    public String resultpage() {
        return "returnres";
    }

    @Autowired
    ContactUs_DAO condao;

    @RequestMapping(value = "/contactUs")
    public ModelAndView getQuery() {
        ContactUs query = new ContactUs();
        return new ModelAndView("contactUs", "contact", query);
    }

    @RequestMapping(value = "/contactus", method = RequestMethod.POST)
    public String addQuery(@Valid @ModelAttribute(value = "contact") ContactUs query, BindingResult result,
            Map<String, Object> map) {
        ContactUs con = new ContactUs();
        if (result.hasErrors()) {
            return "contactUs";
        }

        condao.addQuery(query);
        map.put("querySuccess",
                "Thank you, Your Message stored in our Server we will contact through corresponding Mail");
        return "returnres";

    }
    
    @RequestMapping(value="/MainPage")
    public String homepage(){
        return "MainPage";
    }
}
