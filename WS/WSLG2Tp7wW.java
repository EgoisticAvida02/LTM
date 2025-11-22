/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS;
import java.util.*;
import javax.xml.datatype.XMLGregorianCalendar;
import vn.medianews.*;

/**
 *
 * @author Admin
 */
//Object - Tinh so ngay lam vien
public class WSLG2Tp7wW {
    public static void main(String[] args) {
        String studentCode = "B21DCCN550";
        String qCode = "LG2Tp7wW";
        
        ObjectService_Service service = new ObjectService_Service();
        ObjectService port = service.getObjectServicePort();
        
        Employee e = port.requestEmployee(studentCode, qCode);
        System.out.println(e.getStartDate());
        System.out.println(e.getEndDate());
        
        int workingDays = calWorkingDays(e.getStartDate(), e.getEndDate());
        e.setWorkingDays(workingDays);
        
        port.submitEmployee(studentCode, qCode, e);
    }
    
    private static int calWorkingDays(XMLGregorianCalendar startDate, XMLGregorianCalendar endDate) {
        Calendar start = new GregorianCalendar();
        Calendar end = new GregorianCalendar();
        start.setTime(startDate.toGregorianCalendar().getTime());
        end.setTime(endDate.toGregorianCalendar().getTime());
        
        int workingDays = 0;
        
        while(!start.after(end)) {
            int dayOfWeek = start.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                workingDays++;
            }
            start.add(Calendar.DATE, 1);
        }
        return workingDays;
    }
}
