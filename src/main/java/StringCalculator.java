
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
            
            char customDelimiter = getCustomDelimiter(number.split("\n")[0]); 
            
            String[] chuncks = (customDelimiter == ',') ? number.split(",|\n") : number.split("\n|" + customDelimiter);
        
            int skipFirstLines = (customDelimiter == ',') ? 0 : 2;
            
            for (String part : chuncks) {
                if (skipFirstLines > 0) {
                    --skipFirstLines;
                } else {
                    int num = Integer.parseInt(part);
                
                total += num;
                }
            }    
        return total;
        }
        
        private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
        }
        
        private char getCustomDelimiter(String line) {
        if (line == null || line.isEmpty()) {
            return ',';
        }
        if (isNumeric(line)) {
            return ',';
        }
        if (line.length() == 1) {
            return line.charAt(0);
        }
        return ',';
    }
}
