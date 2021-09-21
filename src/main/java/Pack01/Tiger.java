package Pack01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tiger {
	@RequestMapping("/t1") //앞으로 t1으로 부르면 되게면 함수 호출을 method01을 하겠다.
	public String method01() {		
		System.out.println("함수 콜");
		return null;		
	}
	@ResponseBody //view로 직접 연결하지 않고 바로 함수를 출력할 수 있다.
	@RequestMapping("/t2")
	public String method02() {		
		System.out.println("함수 콜2");
		return "Tiger call";		
	}
	@RequestMapping("/t3")
	public String method03() {		
		System.out.println("함수 콜3");
		return "TigerView";		
	}
	@RequestMapping("/t4")
	public String method04(
			@RequestParam(value="name")
			String name //저쪽에서 던지는 이름이 name이다.
			
			) {		
		System.out.println("함수 콜4" + name);
		return "TigerView";		
	}
	@RequestMapping("/t5")
	public String method05(
			@RequestParam(value="name")
			String name, //저쪽에서 던지는 이름이 name이다.
			@RequestParam(value="age")
			String age
			
			) {		
		System.out.println("함수 콜4" + name + age);
		return "TigerView";		
	}
	@RequestMapping("/t6")
	public String method06(
			HttpServletRequest request 			
			) {		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("함수 콜4" + name + age);
		return "TigerView";		
	}
	@RequestMapping("/t7") //model은 받을 용도가 아닌 보낼 용도이다. 
	public String method07(Model model) {
		model.addAttribute("name","앵무새"); //첫번째는 받아줄 이름 두번쨰는 던질 데이터
		model.addAttribute("age","100");
		System.out.println("함수 콜7");
		return "TigerView";		
	}//controller에서 데이터 설정법               컨트롤러에서 뷰로 데이터를 전송한 방법이다.
} 

// 던지는 view contrllor dest
