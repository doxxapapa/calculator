/*
To reach the site, run this project then enter to your browser: localhost:8080/calculator
 */
package calc.train.controller;
import calc.train.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {

	Calculator cal = new Calculator();

	@Autowired
    private calc.train.service.CalculateSimple CalculateSimple;

	@RequestMapping("/calculator")
    public String getCalculatorPage(Model model){
        model.addAttribute("cal",cal);
        return "calculator";
    }
	
	
	//összeadás
	@RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result", CalculateSimple.add(cal));
        return "calculator";
    }
    //kivonás
	@RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result", CalculateSimple.subtract(cal));
        return "calculator";
    }
    //szorzás
    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result", CalculateSimple.multiply(cal));
        return "calculator";
    }
    //osztás
    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result", CalculateSimple.divide(cal));
        return "calculator";
    }
    //clear
    @RequestMapping(value="/calculator", params="power", method = RequestMethod.POST)
    public String power(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("result",  CalculateSimple.power(cal));
        return "calculator";
    }
    //clear
    @RequestMapping(value="/calculator", params="clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("cal")  Calculator cal, Model model ){
        model.addAttribute("cal",  CalculateSimple.clearSimple(cal));
        model.addAttribute("result", 0);
        return "calculator";
    }


}


