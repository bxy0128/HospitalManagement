package GUI;

import GUI.Data_Type.Patient;
import javax.servlet.http.HttpServlet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController extends HttpServlet {
    @RequestMapping("/a2")
    public List<Patient> ajax2(){
        List<Patient> patientlist = new ArrayList<Patient>();
        patientlist.add(new Patient(1,"as","as","asd","ASd","dasd",10,1,"asd","123546"));
        //由于@RestController注解，将list转成json格式返回
        return patientlist;
    }
}
