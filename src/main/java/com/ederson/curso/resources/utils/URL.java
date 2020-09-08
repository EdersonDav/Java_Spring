package com.ederson.curso.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class URL {

	public static List<Integer> decodeInList(String intens) {

		String[] intensString = intens.split(",");

		List<Integer> itensInteger = new ArrayList<>();

		for (String item : intensString) {
			itensInteger.add(Integer.parseInt(item));
		}

		return itensInteger;

	}

	public static String decodeParam(String txt) {
		try {
			return URLDecoder.decode(txt, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

}
