package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class53 implements Runnable {
	public static JagexString aJagexString_1068;
	public static JagexString aJagexString_1069;
	public static JagexString aJagexString_1074 = JagexString.getRs2PreparedString(
			"Benutzername: ");
	public static JagexString aJagexString_1075;
	public static JagexString aJagexString_1076;
	public static JagexString aJagexString_1077;
	public static JagexString aJagexString_1078;
	public static JagexString aJagexString_1081;
	public static JagexString aJagexString_1083;
	public static JagexString aJagexString_1084;
	public static int anInt1067;
	public static int anInt1070;
	public static int anInt1072;
	public static int anInt1073;
	public static int anInt1079;
	public static int anInt1080;
	public static int anInt1082;
	public static int anInt1085;
	public static int anInt1087;
	static {
		aJagexString_1069 = JagexString.getRs2PreparedString(" seconds)3");
		aJagexString_1076 = aJagexString_1069;
		aJagexString_1075 = (JagexString.getRs2PreparedString(
				"Too many incorrect logins from your address)3"));
		aJagexString_1081 = JagexString.getRs2PreparedString("Please remove ");
		aJagexString_1068 = aJagexString_1075;
		aJagexString_1078 = aJagexString_1081;
		aJagexString_1083 = JagexString.getRs2PreparedString("Location");
		aJagexString_1084 = aJagexString_1081;
		aJagexString_1077 = aJagexString_1083;
	}

	public static boolean method1005(int arg0, RSInterface arg1) {
		try {
			anInt1072++;
			if (Class19_Sub1.aBoolean2538) {
				if ((Class54.method1011(arg1, -22389) ^ 0xffffffff) != -1)
					return false;
				if (arg1.anInt2258 == 0)
					return false;
			}
			if (arg0 < 106)
				return true;
			return arg1.aBoolean2225;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("of.F("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1006(byte arg0) {
		try {
			for (int i = 0; (Class5.anInt175 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				Class25.anIntArray593[i]--;
				if ((Class25.anIntArray593[i] ^ 0xffffffff) > 9) {
					Class5.anInt175--;
					for (int i_0_ = i; (i_0_ ^ 0xffffffff) > (Class5.anInt175 ^ 0xffffffff); i_0_++) {
						Class4_Sub6.anIntArray1915[i_0_] = Class4_Sub6.anIntArray1915[1 + i_0_];
						Class48.aClass36Array974[i_0_] = Class48.aClass36Array974[1 + i_0_];
						Class12.anIntArray342[i_0_] = Class12.anIntArray342[1 + i_0_];
						Class25.anIntArray593[i_0_] = Class25.anIntArray593[i_0_
								- -1];
						Class1.anIntArray78[i_0_] = Class1.anIntArray78[1 + i_0_];
					}
					i--;
				} else {
					Class36 class36 = Class48.aClass36Array974[i];
					if (class36 == null) {
						class36 = Class36.method913(Class66.aClass19_Sub1_1336,
								Class4_Sub6.anIntArray1915[i], 0);
						if (class36 == null)
							continue;
						Class25.anIntArray593[i] += class36.method914();
						Class48.aClass36Array974[i] = class36;
					}
					if (Class25.anIntArray593[i] < 0) {
						int i_1_;
						if (Class1.anIntArray78[i] != 0) {
							int i_2_ = ((0xff7585 & Class1.anIntArray78[i]) >> -527486288);
							int i_3_ = (-(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) + (128 * i_2_ - -64));
							int i_4_ = 128 * (Class1.anIntArray78[i] & 0xff);
							if (i_3_ < 0)
								i_3_ = -i_3_;
							int i_5_ = ((0xff34 & Class1.anIntArray78[i]) >> 237209480);
							int i_6_ = (-(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267)
									+ i_5_ * 128 - -64);
							if ((i_6_ ^ 0xffffffff) > -1)
								i_6_ = -i_6_;
							int i_7_ = i_3_ - (-i_6_ + 128);
							if (i_7_ > i_4_) {
								Class25.anIntArray593[i] = -100;
								continue;
							}
							if ((i_7_ ^ 0xffffffff) > -1)
								i_7_ = 0;
							i_1_ = (-i_7_ + i_4_) * Class71.anInt1480 / i_4_;
						} else
							i_1_ = Class18.anInt476;
						if (i_1_ > 0) {
							Class4_Sub4_Sub1 class4_sub4_sub1 = class36
									.method916().method177(Class8.aClass8_251);
							Class4_Sub2_Sub3 class4_sub2_sub3 = Class4_Sub2_Sub3
									.method153(class4_sub4_sub1, 100, i_1_);
							class4_sub2_sub3.method142(-1
									+ Class12.anIntArray342[i]);
							RSFont.aClass4_Sub2_Sub2_139
									.method120(class4_sub2_sub3);
						}
						Class25.anIntArray593[i] = -100;
					}
				}
			}
			if (Class4_Sub20_Sub6.aBoolean2895 && !Class4_Sub1.method77(91)) {
				if ((Class4_Sub20_Sub8.anInt3021 ^ 0xffffffff) != -1
						&& (Region.anInt136 ^ 0xffffffff) != 0)
					AppletListener.method1151(Class4_Sub20_Sub8.anInt3021, -2,
							Class54.aClass19_Sub1_1107, 0, Region.anInt136,
							false);
				Class4_Sub20_Sub6.aBoolean2895 = false;
			}
			if (arg0 <= 119)
				method1006((byte) -79);
			anInt1067++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "of.E("
					+ arg0 + ')');
		}
	}

	public static void method1007(int arg0) {
		try {
			Class4_Sub20_Sub7_Sub5.anInt3386 = 0;
			anInt1087++;
			if (arg0 != -21432)
				method1007(50);
			JagexException.anInt1726 = 0;
			Class1.method41(arg0 ^ 0x53b4);
			RS2Font.method341((byte) -49);
			Class58.method1031(-1);
			for (int i = 0; ((i ^ 0xffffffff) > (Class4_Sub20_Sub7_Sub5.anInt3386 ^ 0xffffffff)); i++) {
				int i_8_ = Class58.anIntArray1164[i];
				if ((Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_8_].anInt3256) != Region.anInt134) {
					Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_8_].aClass4_Sub20_Sub3_3617 = null;
					Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_8_] = null;
				}
			}
			if (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion != Class4_Sub20_Sub15.anInt3157)
				throw new RuntimeException("gnp1 pos:"
						+ (Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion)
						+ " psize:" + Class4_Sub20_Sub15.anInt3157);
			for (int i = 0; (i ^ 0xffffffff) > (GameShell.anInt12 ^ 0xffffffff); i++) {
				if ((Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[Class4_Sub11_Sub1.anIntArray2695[i]]) == null)
					throw new RuntimeException("gnp2 pos:" + i + " size:"
							+ GameShell.anInt12);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "of.D("
					+ arg0 + ')');
		}
	}

	public static void method1008(int arg0) {
		try {
			aJagexString_1069 = null;
			aJagexString_1083 = null;
			aJagexString_1081 = null;
			aJagexString_1078 = null;
			aJagexString_1084 = null;
			aJagexString_1068 = null;
			aJagexString_1076 = null;
			if (arg0 != 0)
				method1009((byte) -118, null, 76, -19);
			aJagexString_1075 = null;
			aJagexString_1074 = null;
			aJagexString_1077 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "of.B("
					+ arg0 + ')');
		}
	}

	public static int method1009(byte arg0, byte[] arg1, int arg2, int arg3) {
		try {
			anInt1082++;
			if (arg0 >= -109)
				return -96;
			int i = -1;
			for (int i_9_ = arg2; i_9_ < arg3; i_9_++)
				i = (Class46.anIntArray934[0xff & (arg1[i_9_] ^ i)] ^ i >>> 1928750376);
			i ^= 0xffffffff;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("of.C("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method1010(int arg0) {
		anInt1070++;
		try {
			if (StreamBuffer.anInt2085 == 1) {
				int i = Class1.aClass4_Sub2_Sub1_64.method106(true);
				if ((i ^ 0xffffffff) < -1
						&& Class1.aClass4_Sub2_Sub1_64.method119((byte) -25)) {
					i -= Class4_Sub20_Sub5.anInt2888;
					if ((i ^ 0xffffffff) > -1)
						i = 0;
					Class1.aClass4_Sub2_Sub1_64.method112(i, 98);
					return;
				}
				Class1.aClass4_Sub2_Sub1_64.method110((byte) -27);
				Class1.aClass4_Sub2_Sub1_64.method95(arg0 ^ 0x521e);
				Class4_Sub20_Sub1.aClass4_Sub18_2704 = null;
				if (Class67.aClass19_1363 == null)
					StreamBuffer.anInt2085 = 0;
				else
					StreamBuffer.anInt2085 = 2;
				Class4_Sub20_Sub5.aClass81_2880 = null;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			Class1.aClass4_Sub2_Sub1_64.method110((byte) -8);
			Class67.aClass19_1363 = null;
			Class4_Sub20_Sub5.aClass81_2880 = null;
			Class4_Sub20_Sub1.aClass4_Sub18_2704 = null;
			StreamBuffer.anInt2085 = 0;
		}
		if (arg0 != 0)
			method1010(48);
	}

	public boolean aBoolean1071 = true;

	public int anInt1089;

	public int[] anIntArray1088 = new int[500];

	public int[] anIntArray1090 = new int[500];

	public Object anObject1086 = new Object();

	public Class53() {
		anInt1089 = 0;
	}

	@Override
	public void run() {
		try {
			while (aBoolean1071) {
				synchronized (anObject1086) {
					if ((anInt1089 ^ 0xffffffff) > -501) {
						anIntArray1090[anInt1089] = Class37.anInt767;
						anIntArray1088[anInt1089] = Class4_Sub1.anInt1859;
						anInt1089++;
					}
				}
				Class25.method799(50L, 10);
			}
			anInt1073++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"of.run(" + ')');
		}
	}
}
