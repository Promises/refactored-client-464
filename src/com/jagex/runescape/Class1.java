package com.jagex.runescape;

public class Class1 {
	public static Class19 aClass19_67;
	public static Class19 aClass19_80;
	public static JagexString aJagexString_69;
	public static JagexString aJagexString_72 = (JagexString.getRs2PreparedString(
			"Sie befinden sich in einem Mitglieder)2Gebiet(Q"));
	public static JagexString aJagexString_79;
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_64;
	public static Class4_Sub20_Sub12_Sub1[] aClass4_Sub20_Sub12_Sub1Array66;
	public static Class76 aClass76_61;
	public static int anInt60;
	public static int anInt62;
	public static int anInt63;
	public static int anInt68;
	public static int anInt70;
	public static int anInt71;
	public static int anInt73;
	public static int anInt74;
	public static int anInt75;
	public static int anInt76;
	public static int anInt77;
	public static int[] anIntArray78;
	static {
		anInt70 = 128;
		aJagexString_69 = JagexString.getRs2PreparedString("Abbrechen");
		anIntArray78 = new int[50];
		aJagexString_79 = JagexString.getRs2PreparedString(
				"60 Sekunden noch einmal)3)3)3");
		anInt74 = 0;
	}

	public static void method39(int arg0) {
		try {
			aClass4_Sub2_Sub1_64 = null;
			aJagexString_79 = null;
			aClass19_80 = null;
			aClass76_61 = null;
			aClass19_67 = null;
			if (arg0 >= -48)
				method41(-12);
			aClass4_Sub20_Sub12_Sub1Array66 = null;
			aJagexString_69 = null;
			anIntArray78 = null;
			aJagexString_72 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "a.A("
					+ arg0 + ')');
		}
	}

	public static void method41(int arg0) {
		anInt71++;
		Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method271((byte) -33);
		int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
				-1432215741, 8);
		if (GameShell.anInt12 > i) {
			for (int i_0_ = i; (i_0_ ^ 0xffffffff) > (GameShell.anInt12 ^ 0xffffffff); i_0_++)
				Class58.anIntArray1164[Class4_Sub20_Sub7_Sub5.anInt3386++] = Class4_Sub11_Sub1.anIntArray2695[i_0_];
		}
		if (GameShell.anInt12 < i)
			throw new RuntimeException("gnpov1");
		GameShell.anInt12 = 0;
		for (int i_1_ = 0; (i ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
			int i_2_ = Class4_Sub11_Sub1.anIntArray2695[i_1_];
			Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_2_];
			int i_3_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
					-1432215741, 1);
			if (i_3_ == 0) {
				Class4_Sub11_Sub1.anIntArray2695[GameShell.anInt12++] = i_2_;
				class4_sub20_sub7_sub1_sub2.anInt3256 = Region.anInt134;
			} else {
				int i_4_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 2);
				if ((i_4_ ^ 0xffffffff) == -1) {
					Class4_Sub11_Sub1.anIntArray2695[GameShell.anInt12++] = i_2_;
					class4_sub20_sub7_sub1_sub2.anInt3256 = Region.anInt134;
					Class48.anIntArray979[JagexException.anInt1726++] = i_2_;
				} else if (i_4_ == 1) {
					Class4_Sub11_Sub1.anIntArray2695[GameShell.anInt12++] = i_2_;
					class4_sub20_sub7_sub1_sub2.anInt3256 = Region.anInt134;
					int i_5_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
							.method266(-1432215741, 3);
					class4_sub20_sub7_sub1_sub2.method386(false, false, i_5_);
					int i_6_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
							.method266(-1432215741, 1);
					if (i_6_ == 1)
						Class48.anIntArray979[JagexException.anInt1726++] = i_2_;
				} else if ((i_4_ ^ 0xffffffff) == -3) {
					Class4_Sub11_Sub1.anIntArray2695[GameShell.anInt12++] = i_2_;
					class4_sub20_sub7_sub1_sub2.anInt3256 = Region.anInt134;
					int i_7_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
							.method266(-1432215741, 3);
					class4_sub20_sub7_sub1_sub2.method386(false, true, i_7_);
					int i_8_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
							.method266(-1432215741, 3);
					class4_sub20_sub7_sub1_sub2.method386(false, true, i_8_);
					int i_9_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
							.method266(arg0 ^ 0x555de0bf, 1);
					if ((i_9_ ^ 0xffffffff) == -2)
						Class48.anIntArray979[JagexException.anInt1726++] = i_2_;
				} else if ((i_4_ ^ 0xffffffff) == -4)
					Class58.anIntArray1164[Class4_Sub20_Sub7_Sub5.anInt3386++] = i_2_;
			}
		}
		if (arg0 != -4)
			method41(-82);
	}

	public Class4_Sub20 aClass4_Sub20_65 = new Class4_Sub20();

	public Class1() {
		try {
			aClass4_Sub20_65.aClass4_Sub20_2355 = aClass4_Sub20_65;
			aClass4_Sub20_65.aClass4_Sub20_2359 = aClass4_Sub20_65;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"a.<init>(" + ')');
		}
	}

	public void method36(Class4_Sub20 arg0, int arg1) {
		try {
			anInt63++;
			if (arg1 != 3)
				aClass19_67 = null;
			if (arg0.aClass4_Sub20_2355 != null)
				arg0.method320(arg1 ^ ~0x3);
			arg0.aClass4_Sub20_2359 = aClass4_Sub20_65;
			arg0.aClass4_Sub20_2355 = aClass4_Sub20_65.aClass4_Sub20_2355;
			arg0.aClass4_Sub20_2355.aClass4_Sub20_2359 = arg0;
			arg0.aClass4_Sub20_2359.aClass4_Sub20_2355 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("a.F("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub20 method37(byte arg0) {
		try {
			Class4_Sub20 class4_sub20 = aClass4_Sub20_65.aClass4_Sub20_2359;
			anInt77++;
			if (arg0 != -122)
				anInt74 = -53;
			if (aClass4_Sub20_65 == class4_sub20)
				return null;
			return class4_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "a.C("
					+ arg0 + ')');
		}
	}

	public void method38(Class4_Sub20 arg0, int arg1) {
		try {
			anInt68++;
			if (arg0.aClass4_Sub20_2355 != null)
				arg0.method320(-1);
			arg0.aClass4_Sub20_2355 = aClass4_Sub20_65;
			if (arg1 != 1)
				aJagexString_72 = null;
			arg0.aClass4_Sub20_2359 = aClass4_Sub20_65.aClass4_Sub20_2359;
			arg0.aClass4_Sub20_2355.aClass4_Sub20_2359 = arg0;
			arg0.aClass4_Sub20_2359.aClass4_Sub20_2355 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("a.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub20 method40(int arg0) {
		try {
			anInt75++;
			Class4_Sub20 class4_sub20 = aClass4_Sub20_65.aClass4_Sub20_2359;
			if (aClass4_Sub20_65 == class4_sub20)
				return null;
			class4_sub20.method320(-1);
			return class4_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "a.D("
					+ arg0 + ')');
		}
	}
}
