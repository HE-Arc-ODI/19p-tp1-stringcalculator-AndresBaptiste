
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baptiste.andres
 */
public class StringCalculator {
    
        public int Add(String number) {
            
            int total = 0;

            if (number == null || number.isEmpty()) {
                return 0;
            }
           
            
            if  (number != null) {
                    String[] parts = number.split(",|\n");
                    for (String part : parts){
                        total = total + parseInt(part);
                    }
            }
            return total;
        }
}
