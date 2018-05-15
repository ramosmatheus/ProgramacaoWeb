package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarPlaca {

	public String validarPlaca(String placa) {
			
		 if(placa.length()==7 || placa.length()==8) {				
				
				
				Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{4}");
				Pattern pattern2 = Pattern.compile("[A-Z]{3}[0-9]{4}");
				
			    Matcher matcher = pattern.matcher(placa);
			    Matcher matcher2 = pattern2.matcher(placa);
			    
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
