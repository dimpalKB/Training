package com.sapient.util;

public class SapUtil {


		public static double roundup2dec(double val)
		{
			val=Math.round(val*100)/100.0;
			return val;
		}
}



