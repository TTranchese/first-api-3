package co.develhope.firstapi3.services;

import org.springframework.stereotype.Service;

@Service
public class StringService {
	public String returnString(String str1, String str2){
			return str1+str2;
	}
}
