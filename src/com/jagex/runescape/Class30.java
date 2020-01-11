package com.jagex.runescape;

public class Class30 {
	public static JagexString aJagexString_651;
	public static JagexString aJagexString_652 = JagexString.getRs2PreparedString("(Y"
    );
	public static JagexString aJagexString_653;
	public static JagexString aJagexString_654 = JagexString.getRs2PreparedString(
			"Loading title screen )2 ");
	public static JagexString aJagexString_659;
	public static JagexString aJagexString_660;
	public static JagexString aJagexString_662;
	public static int anInt655;
	public static int anInt656;
	public static int anInt657;
	public static int anInt658;
	public static int anInt663;
	public static int[] anIntArray650;
	public static int[] anIntArray661 = new int[4000];

	static {
		aJagexString_659 = JagexString.getRs2PreparedString("::fpsoff");
		aJagexString_660 = JagexString.getRs2PreparedString(
				"Invalid loginserver requested)3");
		aJagexString_651 = aJagexString_660;
		aJagexString_653 = JagexString.getRs2PreparedString(
				" zuerst von Ihrer Freunde)2Liste(Q");
		aJagexString_662 = aJagexString_654;
	}

	public static JagexString method872(int arg0, int arg1) {
		try {
			anInt663++;
			if (arg1 != -1)
				return null;
			if ((arg0 ^ 0xffffffff) > -100001)
				return Class4_Sub24.method639(
						(new JagexString[] { Class82.aJagexString_1724,
								Class74.method1168(arg1 + -11, arg0),
								(Class4_Sub20_Sub10.aJagexString_3072) }), -842);
			if (arg0 < 10000000)
				return (Class4_Sub24.method639(
						new JagexString[] { Class4_Sub20_Sub16.aJagexString_3181,
								Class74.method1168(-16, arg0 / 1000),
								Class73.aJagexString_1501,
								Class4_Sub20_Sub10.aJagexString_3072}, -842));
			return (Class4_Sub24.method639(
					new JagexString[] { Class16.aJagexString_445,
							Class74.method1168(-76, arg0 / 1000000),
							Class31.aJagexString_681,
							Class4_Sub20_Sub10.aJagexString_3072}, -842));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("j.B("
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
			aJagexString_659 = null;
			anIntArray650 = null;
			aJagexString_654 = null;
			aJagexString_651 = null;
			anIntArray661 = null;
			aJagexString_652 = null;
			aJagexString_660 = null;
			if (arg0 != -1)
				method874(24);
			aJagexString_662 = null;
			aJagexString_653 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "j.C("
					+ arg0 + ')');
		}
	}
}
