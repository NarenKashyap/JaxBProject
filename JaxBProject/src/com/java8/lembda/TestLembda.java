package com.java8.lembda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class TestLembda {

	public static void main(String[] args) {
		System.out.println("Start Lembda Project");
		
		String date = "2017-04-28 10:04:32";
		DateTimeZone timeZoneLondon = DateTimeZone.forID( "Europe/London" );
		DateTimeZone timeZoneGMT = DateTimeZone.forID( "Etc/Greenwich" );
		DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		DateTime dt1 = formatter.parseDateTime(date);
		System.out.println(DateTimeZone.getDefault().getID());
		System.out.println(dt1);
		
		
		DateTime nowLondon = DateTime.now( timeZoneLondon );
		DateTime nowGMT = nowLondon.withZone( timeZoneGMT );
		//DateTime nowUtc = nowLondon.withZone( DateTimeZone.UTC );
		System.out.println(nowGMT);
		System.out.println(nowLondon);
		
		if(dt1.isBefore(nowLondon.getMillis())){
			System.out.println("equals");
		}
		
	}
}
