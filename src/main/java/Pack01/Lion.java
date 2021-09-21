package Pack01;

import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lion {
	@RequestMapping("/t8") //앞으로 t1으로 부르면 되게면 함수 호출을 method01을 하겠다.
	public String method08(
			Model model,
			HttpServletRequest request			
			) {		
		String name = request.getParameter("name");
		String age = request.getParameter("age");		
		System.out.println("함수 콜8" + name + age);
		
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		
		return "LionView";		
	}
	@RequestMapping("/t9") 
	public ModelAndView method09() {
		ModelAndView mv = new ModelAndView("LionView");
		mv.addObject("name","고양이");
		mv.addObject("age","21");
		return mv;		
	}
	@RequestMapping("/t10") 
	public ModelAndView method10() {
		ModelAndView mv = new ModelAndView(3 > 2 ? "TigerView" : "LionView");
		mv.addObject("name","고양이");
		mv.addObject("age","21");
		return mv;		
		
	}
	
	@RequestMapping("/t12")
	public String method12(Model model,Person Person) {
		System.out.println(Person.getName());
		model.addAttribute("ppp", Person);
		
		LinkedList<String> mm = new LinkedList<String>();
		mm.add("까치1");
		mm.add("까치2");
		mm.add("까치3");
		return "TigerView";
	}
	//@RequestMapping("/t12") // Mapping주소 설정
		//   public ModelAndView method04(Person person) {
		//      ModelAndView mv = new ModelAndView("PersonView");
		//     mv.addObject("name", person.getName());
		//      System.out.println("method12() 함수콜");
		//      return mv;
		//   }
	   
}	
