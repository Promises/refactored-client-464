package com.jagex.runescape;

public class Class4_Sub20_Sub7_Sub3 extends Class4_Sub20_Sub7 {
	public static boolean[] aBooleanArray3342;
	public static JagexString aJagexString_3332;
	public static JagexString aJagexString_3334;
	public static JagexString aJagexString_3337 = JagexString.getRs2PreparedString(
			"title_mute");
	public static JagexString aJagexString_3343;
	public static JagexString aJagexString_3351;
	public static JagexString aJagexString_3355;
	public static long aLong3335;
	public static int anInt3333;
	public static int anInt3339;
	public static int anInt3340;
	public static int anInt3346;
	public static int anInt3347;
	public static int anInt3354;
	public static int anInt3356;
	static {
		aJagexString_3334 = JagexString.getRs2PreparedString("");
		aJagexString_3332 = JagexString.getRs2PreparedString("auf der Hautpseite)3"
        );
		aJagexString_3351 = JagexString.getRs2PreparedString(" has logged in)3");
		aJagexString_3343 = aJagexString_3351;
		aBooleanArray3342 = new boolean[100];
		anInt3354 = 0;
		aJagexString_3355 = (JagexString.getRs2PreparedString(
				"RuneScape wird geladen )2 bitte warten)3)3)3"));
	}

	public static void method417(byte arg0) {
		try {
			aJagexString_3337 = null;
			aJagexString_3355 = null;
			aJagexString_3343 = null;
			aJagexString_3351 = null;
			if (arg0 >= -40)
				method417((byte) 39);
			aBooleanArray3342 = null;
			aJagexString_3334 = null;
			aJagexString_3332 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ga.C("
					+ arg0 + ')');
		}
	}

	public static void method418(int arg0, boolean arg1, Class4_Sub16 arg2) {
		anInt3346++;
		int i = arg2.anInt2311;
		int i_0_ = (int) arg2.aLong150;
		arg2.clear();
		if (arg1)
			Class52.method1003(-119, i);
		Class4_Sub3.method174((byte) 62, i);
		RSInterface class4_sub13 = Class4_Sub20.method322(true, i_0_);
		if (class4_sub13 != null)
			Class67.method1088(class4_sub13);
		Class4_Sub20_Sub8.anInt2980 = 0;
		Class4_Sub20_Sub16.aBoolean3169 = false;
		Class4_Sub20_Sub17.method621(Class4_Sub1.anInt1860, 16052,
				Class63.anInt1243, Class4_Sub20_Sub17.anInt3195,
				Class45.anInt926);
		if ((Class4_Sub6.anInt1932 ^ 0xffffffff) != 0)
			Class58.method1032(0, 1, Class4_Sub6.anInt1932);
	}

	public boolean aBoolean3338 = false;
	public Class4_Sub20_Sub17 aClass4_Sub20_Sub17_3350;
	public int anInt3336 = 0;
	public int anInt3341;
	public int anInt3344;
	public int anInt3345;
	public int anInt3348;

	public int anInt3349;

	public int anInt3352 = 0;

	public int anInt3353;

	public Class4_Sub20_Sub7_Sub3(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		try {
			anInt3349 = arg4;
			anInt3341 = arg5 + arg6;
			anInt3353 = arg0;
			anInt3348 = arg3;
			anInt3344 = arg2;
			anInt3345 = arg1;
			int i = Class4_Sub20_Sub14.method593(-23222, anInt3353).anInt2909;
			if (i == -1)
				aBoolean3338 = true;
			else {
				aBoolean3338 = false;
				aClass4_Sub20_Sub17_3350 = Class68.method1093(i, (byte) -116);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ga.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	@Override
	public Class4_Sub20_Sub7_Sub7 method378(boolean arg0) {
		try {
			if (arg0 != false)
				return null;
			anInt3340++;
			Class4_Sub20_Sub6 class4_sub20_sub6 = Class4_Sub20_Sub14.method593(
					-23222, anInt3353);
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7;
			if (!aBoolean3338)
				class4_sub20_sub7_sub7 = class4_sub20_sub6.method371(83,
						anInt3352);
			else
				class4_sub20_sub7_sub7 = class4_sub20_sub6.method371(-112, -1);
			if (class4_sub20_sub7_sub7 == null)
				return null;
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ga.V("
					+ arg0 + ')');
		}
	}

	public void method419(byte arg0, int arg1) {
		try {
			anInt3333++;
			if (!aBoolean3338 && arg0 >= 115) {
				anInt3336 += arg1;
				while ((anInt3336 ^ 0xffffffff) < (aClass4_Sub20_Sub17_3350.anIntArray3200[anInt3352] ^ 0xffffffff)) {
					anInt3336 -= aClass4_Sub20_Sub17_3350.anIntArray3200[anInt3352];
					anInt3352++;
					if ((anInt3352 ^ 0xffffffff) <= (aClass4_Sub20_Sub17_3350.anIntArray3211.length ^ 0xffffffff)) {
						aBoolean3338 = true;
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ga.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
