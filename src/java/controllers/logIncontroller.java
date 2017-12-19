package controllers;

/**
 *
 * @author fetnat
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import dao.*;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("login")

public class logIncontroller {

    @Autowired
   public customer_DAO custdao;
    
    @Autowired
    public LogInForm_DAO logindao;


 
  @RequestMapping(value = "/loginpage")
  public String logInform(Map map) {
      login loginForm = new login();
		map.put("login", loginForm);
  return"loginpage";}

 @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public String processForm(@Valid login loginForm, BindingResult result,HttpSession session,
			Map model) {

		
		if (result.hasErrors()) {
			return "loginpage";
		}
		
		boolean userExists = logindao.checkLogin(loginForm.getUsername(),loginForm.getPassword());
		if(userExists){
			model.put("login", loginForm);
                        session.setAttribute("login", loginForm);
			return "redirect:/MainPage";
		}else{
			result.rejectValue("username","invaliduser");
			return "loginpage";
		}

  }


@RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        System.out.println("logout()");
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        return "redirect:/index";
    }


}

  
  
  
    
    
    
    
    
    
    
