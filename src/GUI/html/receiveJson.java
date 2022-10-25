package GUI.html;


import GUI.Data_Type.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a1")
public class receiveJson {
    public String receiveJson_patient(@RequestBody Patient patient) {
        System.out.println(patient.list());
       return  patient.getPatient_dept();
    }

}
