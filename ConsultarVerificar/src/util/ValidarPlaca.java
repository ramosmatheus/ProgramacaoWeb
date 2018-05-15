package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarPlaca {

	public String validarPlaca(String v1) {
			
		 if(v1.length()==7 || v1.length()==8) {				
				
				
				Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{4}");
				Pattern pattern2 = Pattern.compile("[A-Z]{3}[0-9]{4}");
				
			    Matcher matcher = pattern.matcher(v1);
			    Matcher matcher2 = pattern2.matcher(v1);
			    
				if(matcher.find() || matcher2.find()) {
					return "Válida";
				}
				else {
					return "Inválida";
				}
				
			}
			
			
			else {
				return "Inválida";
			}
		}
	}
