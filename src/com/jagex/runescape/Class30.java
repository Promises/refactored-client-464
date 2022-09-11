package com.jagex.runescape;

public class Class30 {
	public static int anInt655;
	public static int anInt656;
	public static int anInt657;
	public static int anInt658;
	public static int anInt663;
	public static int[] anIntArray650;
	public static int[] anIntArray661 = new int[4000];

	public static JagexString method872(int arg0, int arg1) {
		try {
			anInt663++;
			if (arg1 != -1)
				return null;
			if ((arg0 ^ 0xffffffff) > -100001)
				return Class4_Sub24.method639(
						(new JagexString[] { Class82.aJagexString_1724,
								Class74.method1168(arg1 + -11, arg0),
								(StringUtilities.aJagexString_3072) }), -842);
			if (arg0 < 10000000)
				return (Class4_Sub24.method639(
						new JagexString[] { StringUtilities.aJagexString_3181,
								Class74.method1168(-16, arg0 / 1000),
								Class73.aJagexString_1501,
								StringUtilities.aJagexString_3072}, -842));
			return (Class4_Sub24.method639(
					new JagexString[] { StringUtilities.aJagexString_445,
							Class74.method1168(-76, arg0 / 1000000),
							StringUtilities.aJagexString_681,
							StringUtilities.aJagexString_3072}, -842));
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("j.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method873(int arg0) {
		anInt658++;
		Class9.aClass66_277.method1084(0);
		if (arg0 != 4000)
			method874(-89);
	}

	public static void method874(int arg0) {
		try {
			StringUtilities.aJagexString_659 = null;
			anIntArray650 = null;
			StringUtilities.aJagexString_651 = null;
			anIntArray661 = null;
			StringUtilities.aJagexString_652 = null;
			if (arg0 != -1)
				method874(24);
			StringUtilities.aJagexString_662 = null;
			StringUtilities.aJagexString_653 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "j.C("
					+ arg0 + ')');
		}
	}
}
