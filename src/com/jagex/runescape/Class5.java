package com.jagex.runescape;

public class Class5 {
	public static JagexString aJagexString_176 = JagexString.getRs2PreparedString(
			"(U0a )2 non)2existant gosub script)2num: ");
	public static JagexString aJagexString_179 = JagexString.getRs2PreparedString(
			"Ihr Charakter)2Profil wird in:");
	public static JagexString aJagexString_194 = null;
	public static JagexString[] aJagexStringArray187;
	public static int anInt171;
	public static int anInt175 = 0;
	public static int anInt182;
	public static int anInt186;
	public static int anInt188;
	public static int anInt189;
	public static int anInt191;
	public static int anInt193;
	public static int anInt196;
	public static int[] anIntArray174;
	public static int[] anIntArray180;
	public static int[] anIntArray181;
	public static int[] anIntArray184;
	public static int[] anIntArray185;
	public static int[] anIntArray190;
	public static int[] anIntArray198;
	public static short[] aShortArray177;
	static {
		anInt188 = 0;
		anInt193 = 50;
		anIntArray174 = new int[anInt193];
		anIntArray181 = new int[anInt193];
		aJagexStringArray187 = new JagexString[anInt193];
		anIntArray184 = new int[anInt193];
		anIntArray190 = new int[anInt193];
		anInt196 = 50;
		anIntArray185 = new int[anInt193];
		anIntArray198 = new int[anInt193];
		anIntArray180 = new int[anInt193];
	}

	public static void method641(long arg0, byte arg1) {
		try {
			anInt189++;
			if ((arg0 ^ 0xffffffffffffffffL) != -1L && arg1 == 68) {
				for (int i = 0; i < GameShell.anInt23; i++) {
					if ((arg0 ^ 0xffffffffffffffffL) == (Class64.aLongArray1279[i] ^ 0xffffffffffffffffL)) {
						GameShell.anInt23--;
						for (int i_0_ = i; ((GameShell.anInt23 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
							Class4_Sub20_Sub5.aJagexStringArray2893[i_0_] = (Class4_Sub20_Sub5.aJagexStringArray2893[1 + i_0_]);
							Class50.anIntArray1005[i_0_] = Class50.anIntArray1005[1 + i_0_];
							Class64.aLongArray1279[i_0_] = Class64.aLongArray1279[1 + i_0_];
							Class34.anIntArray1743[i_0_] = Class34.anIntArray1743[1 + i_0_];
						}
						Class4_Sub20.anInt2349++;
						Class4_Sub20_Sub1.anInt2718 = Class4_Sub20_Sub10.anInt3053;
						Class66.aClass4_Sub11_Sub1_1328.method264(133, -38);
						Class66.aClass4_Sub11_Sub1_1328.method255(189354448,
								arg0);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("b.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method642(JagexString arg0, boolean arg1) {
		try {
			anInt171++;
			if (arg0.method818(
					JagexString.getRs2PreparedString("::rdata"),
					(byte) -105)) {
				System.out.println(Game.regionsData);
			}
			if ((Class14.anInt410 ^ 0xffffffff) <= -3) {
				if (arg0.method818(Class4_Sub21.garbageCollection, (byte) -105)) {
					System.gc();
				}
				if (arg0.method818(StringUtilities.aJagexString_622, (byte) -105)) {
					Class11.method674(-1);
				}
				if (arg0.method818(Class4_Sub20_Sub5.aJagexString_2886, (byte) -105)) {
					Class4_Sub20_Sub9.aBoolean3048 = true;
				}
				if (arg0.method818(JagexString.getRs2PreparedString("::test"), (byte) -105)) {
					Class43.method955(JagexString.getRs2PreparedString("hello world"),
							JagexString.getRs2PreparedString("Testname:"), (byte) 108, 4);
				}
				if (arg0.method818(StringUtilities.aJagexString_659, (byte) -105)) {
					Class4_Sub20_Sub9.aBoolean3048 = false;
				}
				if (arg0.method818(Class7.aJagexString_223, (byte) -105)) {
					for (int i = 0; i < 4; i++) {
						for (int i_1_ = 1; i_1_ < 103; i_1_++) {
							for (int i_2_ = 1; (i_2_ ^ 0xffffffff) > -104; i_2_++) {
								Class57.regions[i].clippingData[i_1_][i_2_] = 0;
							}
						}
					}
				}
				if (arg0.method818(Class67.aJagexString_1365, (byte) -105)
						&& Class12.anInt341 == 2) {
					throw new RuntimeException();
				}
				if (arg0.method808(Class74.aJagexString_1520, (byte) -95)) {
					Class52.anInt1052 = arg0.method805(12, 86).method815(126)
							.method804((byte) -128);
					Class43.method955(
							(Class4_Sub24.method639(
									(new JagexString[] {
											StringUtilities.aJagexString_451,
											Class74.method1168(-41,
													(Class52.anInt1052)) }),
									-842)), null, (byte) 118, 0);
				}
				if (arg0.method818(Class4_Sub20_Sub7_Sub4.aJagexString_3368,
						(byte) -105)) {
					Class19_Sub1.aBoolean2538 = true;
				}
			}
			if (arg1 != false) {
				method644((byte) 55, -24);
			}
			Class4_Sub20_Sub7_Sub1_Sub2.anInt3614++;
			Class66.aClass4_Sub11_Sub1_1328.method264(165, 117);
			Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
					-1 + arg0.method825(-97));
			Class66.aClass4_Sub11_Sub1_1328.method259(arg0.method805(2, 96),
					18601);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("b.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method643(int arg0) {
		aShortArray177 = null;
		anIntArray185 = null;
		aJagexString_194 = null;
		aJagexString_176 = null;
		anIntArray181 = null;
		anIntArray184 = null;
		anIntArray198 = null;
		anIntArray174 = null;
		anIntArray190 = null;
		aJagexString_179 = null;
		aJagexStringArray187 = null;
		anIntArray180 = null;
		if (arg0 != 0) {
			method644((byte) 10, -47);
		}
	}

	public static boolean method644(byte arg0, int arg1) {
		try {
			anInt191++;
			if (arg0 != -108) {
				method643(-121);
			}
			if ((0x1 & arg1 >> -1802717313) == 0) {
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("b.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method645(int arg0, Class19 arg1, Class19 arg2) {
		try {
			Class65.aClass19_1291 = arg2;
			Class1.aClass19_80 = arg1;
			if (arg0 <= 51) {
				method642(null, false);
			}
			anInt186++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("b.E("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public boolean aBoolean195 = true;

	public int anInt172;

	public int anInt173;

	public int anInt178;

	public int anInt183;

	public int anInt192;

	public int anInt197;

	public Class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
			boolean arg6) {
		try {
			anInt183 = arg1;
			anInt197 = arg3;
			anInt178 = arg2;
			aBoolean195 = arg6;
			anInt172 = arg4;
			anInt192 = arg5;
			anInt173 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("b.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ',' + arg5 + ',' + arg6 + ')'));
		}
	}
}
