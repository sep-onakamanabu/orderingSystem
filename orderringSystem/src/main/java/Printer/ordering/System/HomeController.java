package Printer.ordering.System;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
     /**
     * Simply selects the home view to render by returning its name.
     */
    /*
    @Autowired
    private JdbcTemplate jdbcTemplate;
*/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Frame(Locale locale, Model model) {

        return "Frame";
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menu(Locale locale, Model model) {

        return "menu";
    }

    @RequestMapping(value = "/toppage2", method = RequestMethod.GET)
    public String toppage2(Locale locale, Model model) {

        return "toppage2";
    }

    @RequestMapping(value = "/Dispatch", method = RequestMethod.POST)
    public String Dispatch(Locale locale, Model model) {

        return "Dispatch";
    }
    /*
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		List<Map<String, Object>> list = jdbcTemplate
				.queryForList("select * from ordertb inner join clienttb on ordertb.orderid = clienttb.orderid;");
		model.addAttribute("db", list);
		model.addAttribute("id", list.get(0).get("id"));
		return "list";
	}


    @RequestMapping(value = "/Frame", method = RequestMethod.GET)
    public String log(Locale locale, Model model) {
    return "Frame";
    }

    @RequestMapping(params = "inquiry", method = RequestMethod.POST)
    public String aa(@ModelAttribute FormModel fm, Model model, HttpSession session) {
        String quiry = fm.getUp();

        @RequestMapping(params = "list", method = RequestMethod.POST)
        public String bb(@ModelAttribute FormModel fm, Model model, SessionStatus sessionStatus, HttpSession session) {
        List<Map<String, Object>> list = jdbcTemplate
             .queryForList("select * from ordertb inner join clienttb on ordertb.orderid = clienttb.orderid;");
        model.addAttribute("db", list);
        model.addAttribute("id", list);
        List<Map<String, Object>> lista = jdbcTemplate.queryForList(
             "select * from ordertb inner join clienttb on ordertb.orderid = clienttb.orderid where ordertb.orderid = "
                     + "'" + quiry + "'");
        model.addAttribute("data", lista);
        session.setAttribute("Id", quiry);
        model.addAttribute("id", quiry);
        return "list";
        return "inquiry";
        }
        */
	}
