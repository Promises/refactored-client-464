package com.jagex.runescape;
import java.util.Calendar;

public abstract class Class45 {
	public static Calendar aCalendar919 = Calendar.getInstance();
	public static int anInt920 = 2301979;
	public static int anInt923 = 0;
	public static int anInt926;

	public static void method972(int arg0) {
		do {
			try {
				aCalendar919 = null;
				StringUtilities.aJagexString_921 = null;
				StringUtilities.aJagexString_918 = null;
				StringUtilities.aJagexString_922 = null;
				StringUtilities.aJagexString_925 = null;
				StringUtilities.aJagexString_924 = null;
				if (arg0 <= -109)
					break;
				method972(102);
			} catch (RuntimeException runtimeexception) {
				throw JagexException.create(runtimeexception,
						"lf.C(" + arg0 + ')');
			}
			break;
		} while (false);
	}

	public abstract void method970(int i, byte[] is);

	public abstract byte[] method971(boolean bool);
}
