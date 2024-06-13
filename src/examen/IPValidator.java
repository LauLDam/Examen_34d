package examen;

public class IPValidator {
	
	/**
	 * Esta clase valida la letra (el tipo) de la IP con la dirección IP
	 * 
	 * autor Laura Villar
	 * 
	 * version 1.0
	 * 
	 */
	public static String ipPattern;
	
	/**
	 * Método para validar si una IP coincide con el rango numérico correcto, se le asigna el tipo (la letra) que le corresponde
	 * 
	 * @param ip El parámetro de la dirección IP
	 * @param ipClass El parámetro de la letra de la IP 
	 * @return la IP 
	 */

	public static boolean validateIPAndClass(String ip, char ipClass) {
	
		
		boolean validIPClass = true;
		ipPattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"
				+ "\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(ipPattern);
		java.util.regex.Matcher matcher = pattern.matcher(ip);
		if (!matcher.matches()) {
			validIPClass = false;
		} else {
			int firstOctet = Integer.parseInt(matcher.group(1));
			if (firstOctet <= 126) {
				validIPClass = ipClass == 'A';
			} else if (firstOctet <= 191) {
				validIPClass = ipClass == 'B';
			} else if (firstOctet <= 223) {
				validIPClass = ipClass == 'C';
			} else if (firstOctet <= 239) {
				validIPClass = ipClass == 'D';
			} else if (firstOctet <= 255) {
				validIPClass = ipClass == 'E';
			}
		}
		return validIPClass;
	}
}
