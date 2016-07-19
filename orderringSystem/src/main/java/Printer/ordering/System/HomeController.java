package Printer.ordering.System;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String log(Locale locale, Model model) {

        return "Frame";
    }

    @RequestMapping(value = "/toppage2", method = RequestMethod.GET)
    public String toppage2(Locale locale, Model model) {

        return "toppage2";
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menu(Locale locale, Model model) {

        return "menu";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

   @RequestMapping(value = "/List Updates", method = RequestMethod.GET)
   public String ListUpdates(Locale locale, Model model) {
       List<Map<String, Object>> list = jdbcTemplate
               .queryForList("select * from ordertb ");
       model.addAttribute("db", list);
       model.addAttribute("id", list.get(0).get("id"));
       return "List Updates";
   }

   @RequestMapping(value = "/List Updates", method = RequestMethod.POST)
   public String ListUpdate(@ModelAttribute FormModel fm, Model model, HttpSession session) {
       String quiry = fm.getUp();
       List<Map<String, Object>> lista = jdbcTemplate.queryForList(
             "select * from ordertb where ordertb.orderid = "
                     + "'" + quiry + "'");
     model.addAttribute("data", lista);
      session.setAttribute("Id", quiry);
      model.addAttribute("id", quiry);
       return "Dispatch";
   }

   @RequestMapping(value = "Registrationupdate",params="conf" , method = RequestMethod.POST)
   public String Registrationupdate(@ModelAttribute FormModel fm, Model model, HttpSession session) {
       String quiry = fm.getId();
       List<Map<String, Object>> lista = jdbcTemplate.queryForList(
             "select * from ordertb where ordertb.orderid = "
                     + "'" + quiry + "'");
     model.addAttribute("data", lista);
      session.setAttribute("Id", quiry);
      model.addAttribute("id", quiry);

       return "Registrationupdate";
   }

   @RequestMapping(value = "Registrationupdate",params="conp" , method = RequestMethod.POST)
   public String Statementofdelivery(@ModelAttribute FormModel fm, Model model, HttpSession session) {
       String quiry = fm.getId();
       List<Map<String, Object>> lista = jdbcTemplate.queryForList(
               "select * from ordertb where ordertb.orderid = "
                       + "'" + quiry + "'");
       model.addAttribute("data", lista);
       session.setAttribute("Id", quiry);
       model.addAttribute("id", quiry);

       jdbcTemplate.execute(
               "update ordertb set progress='"+ 120 +"'where orderid = "+ quiry +";");


       return "Statementofdelivery";
   }

   @RequestMapping(value = "Registrationupdate" ,params="update" , method = RequestMethod.POST)
   public String Registrationupdates(@ModelAttribute FormModel fm, Model model, HttpSession session) {
       String quiry = fm.getId();
       String postalcode1 = fm.getpostalcode1();
       String postalcode2 = fm.getpostalcode2();
       String address1 = fm.getaddress1();
       String address2 = fm.getaddress2();
       String address3 = fm.getaddress3();
       String tel = fm.getTel();


       if (quiry == "" || postalcode1 == "" || postalcode2 == ""|| address1 == ""|| address2 == ""|| address3 == ""|| tel == "" ) {


              return "toppage2";

       }else{

          }if(!Pattern.compile("\\d{3}").matcher(postalcode1).matches()) {

          }if(!Pattern.compile("\\d{4}").matcher(postalcode2).matches()) {

              return "toppage2";

          }if(!Pattern.compile("^[-a-zA-Z0-9ぁ-ゑァ-ヶ一-龠 　]{1,255}$").matcher(address1).matches()) {

              return "toppage2";

          }if(!Pattern.compile("^[-a-zA-Zぁ-ゑァ-ヶ一-龠 　]{1,255}$").matcher(address2).matches()) {

              return "toppage2";

          }if(!Pattern.compile("^[-a-zA-Zぁ-ゑァ-ヶ一-龠 　]{1,255}$").matcher(address3).matches()) {

              return "toppage2";


          }if(!Pattern.compile("\\d{2,5}-\\d{1,4}-\\d{4}").matcher(tel).matches()) {

              return "toppage2";


       }else{



       jdbcTemplate.execute(
               "update ordertb set postalcode1='"+ postalcode1 +"', postalcode2='"+ postalcode2 +"',"
                       + "address1='"+ address1 +"',address2='"+ address2 +"',address3='"+address3+"',"
                               + "tel='"+ tel +"'where orderid = "+ quiry +";");
       return "Update.success";
   }

   }

 }