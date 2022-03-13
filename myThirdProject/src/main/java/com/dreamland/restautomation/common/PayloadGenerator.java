package com.dreamland.restautomation.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayloadGenerator {

	
	public static String generatePayload(String payloadFileName) throws IOException
	{
		String payloadsDir =System.getProperty("user.dir")+"\\src\\main\\resources\\payloads\\";
		System.out.print(payloadsDir+payloadFileName);
		byte[] b = Files.readAllBytes(Paths.get(payloadsDir+payloadFileName));
		String payload = new String (b);
	return payload;
	}
}
