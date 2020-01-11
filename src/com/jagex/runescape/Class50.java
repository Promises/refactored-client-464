package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;
import com.jagex.runescape.util.Signlink;

public class Class50 implements Runnable {
	public static Class19 aClass19_1021;
	public static JagexString aJagexString_1011;
	public static JagexString aJagexString_1015;
	public static JagexString aJagexString_1016;
	public static JagexString aJagexString_1017 = JagexString.getRs2PreparedString(
			"Loaded config");
	public static JagexString aJagexString_1018;
	public static JagexString aJagexString_1019 = null;
	public static JagexString aJagexString_1023;
	public static JagexString aJagexString_1024;
	public static JagexString aJagexString_1026;
	public static long aLong1027;
	public static int anInt1007;
	public static int anInt1008;
	public static int anInt1009;
	public static int anInt1010;
	public static int anInt1020;
	public static int anInt1022;
	public static int anInt1025;
	public static int[] anIntArray1005;
	static {
		aJagexString_1016 = JagexString.getRs2PreparedString("<col=00ff00>");
		anInt1010 = 0;
		anIntArray1005 = new int[200];
		aJagexString_1018 = JagexString.getRs2PreparedString(
				"Bitte benutzen Sie eine andere Welt)3");
		aJagexString_1023 = JagexString.getRs2PreparedString(
				"Spieler kann nicht gefunden werden: ");
		aJagexString_1024 = JagexString.getRs2PreparedString("<col=ffb000>");
		aJagexString_1026 = JagexString.getRs2PreparedString("Ok");
		aJagexString_1015 = aJagexString_1017;
		aLong1027 = 0L;
		aJagexString_1011 = aJagexString_1026;
	}

	public static boolean method993(int arg0, byte arg1) {
		try {
			if (arg1 > -63)
				anIntArray1005 = null;
			anInt1009++;
			if ((arg0 ^ 0xffffffff) > -49 || arg0 > 57)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("nd.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method994(int arg0) {
		try {
			aClass19_1021 = null;
			aJagexString_1017 = null;
			aJagexString_1024 = null;
			aJagexString_1011 = null;
			aJagexString_1015 = null;
			anIntArray1005 = null;
			aJagexString_1023 = null;
			aJagexString_1016 = null;
			aJagexString_1018 = null;
			aJagexString_1026 = null;
			aJagexString_1019 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "nd.B("
					+ arg0 + ')');
		}
	}

	public static void method995(int arg0) {
		try {
			Class66.aClass66_1337.method1084(0);
			if (arg0 > 109) {
				anInt1008++;
				Class67.aClass66_1357.method1084(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "nd.E("
					+ arg0 + ')');
		}
	}

	public static void method996(int arg0) {
		anInt1020++;
		Class67.method1088(Class4_Sub20_Sub16.aClass4_Sub13_3179);
		Class4_Sub20_Sub7.anInt2947++;
		if (!Class57.aBoolean1132 || !Class33.aBoolean711) {
			if ((Class4_Sub20_Sub7.anInt2947 ^ 0xffffffff) < -2)
				Class4_Sub20_Sub16.aClass4_Sub13_3179 = null;
		} else {
			int i = Class37.anInt767;
			i -= Class74.anInt1513;
			int i_0_ = Class4_Sub1.anInt1859;
			i_0_ -= Class72.anInt1494;
			if ((Class4_Sub20_Sub1.anInt2740 ^ 0xffffffff) < (i ^ 0xffffffff))
				i = Class4_Sub20_Sub1.anInt2740;
			if ((Class58.aClass4_Sub13_1159.anInt2156 + Class4_Sub20_Sub1.anInt2740) < i
					- -Class4_Sub20_Sub16.aClass4_Sub13_3179.anInt2156)
				i = (Class58.aClass4_Sub13_1159.anInt2156
						+ Class4_Sub20_Sub1.anInt2740 - Class4_Sub20_Sub16.aClass4_Sub13_3179.anInt2156);
			int i_2_ = -Class33.anInt714 + i;
			if (i_0_ < Class4_Sub20_Sub7.anInt2941)
				i_0_ = Class4_Sub20_Sub7.anInt2941;
			if (Class4_Sub20_Sub16.aClass4_Sub13_3179.anInt2185 + i_0_ > (Class58.aClass4_Sub13_1159.anInt2185 + Class4_Sub20_Sub7.anInt2941))
				i_0_ = (-Class4_Sub20_Sub16.aClass4_Sub13_3179.anInt2185
						+ Class4_Sub20_Sub7.anInt2941 + Class58.aClass4_Sub13_1159.anInt2185);
			int i_3_ = -Class4_Sub20_Sub7_Sub1.anInt3287 + i_0_;
			int i_4_ = Class4_Sub20_Sub16.aClass4_Sub13_3179.anInt2248;
			int i_5_ = (Class58.aClass4_Sub13_1159.anInt2238
					+ -Class4_Sub20_Sub7.anInt2941 + i_0_);
			int i_6_ = (i + -Class4_Sub20_Sub1.anInt2740 - -Class58.aClass4_Sub13_1159.anInt2231);
			if ((Class4_Sub20_Sub7.anInt2947 > Class4_Sub20_Sub16.aClass4_Sub13_3179.anInt2198)
					&& ((i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)
							|| i_2_ < -i_4_ || i_4_ < i_3_ || -i_4_ > i_3_))
				Class4_Sub6.aBoolean1922 = true;
			if (Class4_Sub20_Sub16.aClass4_Sub13_3179.anObjectArray2135 != null
					&& Class4_Sub6.aBoolean1922) {
				Class4_Sub14 class4_sub14 = new Class4_Sub14();
				class4_sub14.aClass4_Sub13_2282 = Class4_Sub20_Sub16.aClass4_Sub13_3179;
				class4_sub14.anInt2280 = i_5_;
				class4_sub14.anObjectArray2267 = Class4_Sub20_Sub16.aClass4_Sub13_3179.anObjectArray2135;
				class4_sub14.anInt2268 = i_6_;
				Class16.method721(1, class4_sub14);
			}
			if (Class4_Sub20_Sub7_Sub1_Sub1.anInt3587 == 0) {
				if (Class4_Sub6.aBoolean1922) {
					if (Class4_Sub20_Sub16.aClass4_Sub13_3179.anObjectArray2164 != null) {
						Class4_Sub14 class4_sub14 = new Class4_Sub14();
						class4_sub14.aClass4_Sub13_2282 = Class4_Sub20_Sub16.aClass4_Sub13_3179;
						class4_sub14.anObjectArray2267 = (Class4_Sub20_Sub16.aClass4_Sub13_3179.anObjectArray2164);
						class4_sub14.anInt2268 = i_6_;
						class4_sub14.anInt2280 = i_5_;
						class4_sub14.aClass4_Sub13_2270 = Class4_Sub15.aClass4_Sub13_2301;
						Class16.method721(1, class4_sub14);
					}
					if (Class4_Sub15.aClass4_Sub13_2301 != null
							&& RS2Font.method338(
									(Class4_Sub20_Sub16.aClass4_Sub13_3179),
									true) != null) {
						Class46.anInt929++;
						Class66.aClass4_Sub11_Sub1_1328.method264(233, -105);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								Class4_Sub15.aClass4_Sub13_2301.anInt2163,
								2018779304);
						Class66.aClass4_Sub11_Sub1_1328
								.method218(
										94,
										Class4_Sub20_Sub16.aClass4_Sub13_3179.anInt2163);
						Class66.aClass4_Sub11_Sub1_1328
								.method244(
										89,
										Class4_Sub20_Sub16.aClass4_Sub13_3179.anInt2172);
						Class66.aClass4_Sub11_Sub1_1328.method211(
								Class4_Sub15.aClass4_Sub13_2301.anInt2172,
								-1387540232);
					}
				} else if (((Class81.anInt1681 ^ 0xffffffff) == -2 || Class42
						.method942(-56, (Class4_Sub20_Sub8.anInt2980 + -1)))
						&& Class4_Sub20_Sub8.anInt2980 > 2)
					SceneGraph.method707(-21);
				else if (Class4_Sub20_Sub8.anInt2980 > 0)
					StreamBuffer.method221(0, Class4_Sub20_Sub8.anInt2980 + -1);
				Class4_Sub20_Sub16.aClass4_Sub13_3179 = null;
			}
		}
	}

	public static int method997(int arg0, int arg1, int arg2) {
		try {
			anInt1007++;
			Class4_Sub1 class4_sub1 = ((Class4_Sub1) Class31.aClass16_671
					.method725((byte) 117, arg2));
			if (class4_sub1 == null)
				return -1;
			if ((arg1 ^ 0xffffffff) > arg0
					|| ((class4_sub1.anIntArray1866.length ^ 0xffffffff) >= (arg1 ^ 0xffffffff)))
				return -1;
			return class4_sub1.anIntArray1866[arg1];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("nd.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static int method998(int arg0, int arg1, int arg2) {
		try {
			anInt1025++;
			int i = (Class4_Sub20_Sub7_Sub1_Sub1.method392(arg2 - 1, -1 + arg1,
					32315) - (-Class4_Sub20_Sub7_Sub1_Sub1.method392(1 + arg2,
					arg1 - 1, arg0 ^ ~0x7e3b) - (Class4_Sub20_Sub7_Sub1_Sub1
					.method392(arg2 - 1, arg1 - arg0, 32315) - -Class4_Sub20_Sub7_Sub1_Sub1
					.method392(arg2 - -1, arg1 + 1, 32315))));
			int i_7_ = (Class4_Sub20_Sub7_Sub1_Sub1.method392(-1 + arg2, arg1,
					arg0 + 32316) - (-Class4_Sub20_Sub7_Sub1_Sub1.method392(
					1 + arg2, arg1, 32315)
					- Class4_Sub20_Sub7_Sub1_Sub1.method392(arg2, -1 + arg1,
							32315) - Class4_Sub20_Sub7_Sub1_Sub1.method392(
					arg2, 1 + arg1, 32315)));
			int i_8_ = Class4_Sub20_Sub7_Sub1_Sub1.method392(arg2, arg1, 32315);
			return i_8_ / 4 + (i_7_ / 8 + i / 16);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("nd.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public volatile boolean aBoolean1006;

	public volatile boolean aBoolean1012;

	public volatile Class43[] aClass43Array1013 = new Class43[2];

	public Signlink aClass75_1014;

	public Class50() {
		aBoolean1012 = false;
		aBoolean1006 = false;
	}

	@Override
	public void run() {
		try {
			aBoolean1006 = true;
			try {
				while (!aBoolean1012) {
					for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
						Class43 class43 = aClass43Array1013[i];
						if (class43 != null)
							class43.method954((byte) -125);
					}
					Class25.method799(10L, 10);
					Class4_Sub20_Sub7_Sub4.method424((byte) -61, null,
							aClass75_1014);
				}
			} catch (Exception exception) {
				Class4_Sub20_Sub7_Sub4.method422(exception, -82, null);
			} finally {
				aBoolean1006 = false;
			}
			anInt1022++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"nd.run(" + ')');
		}
	}
}
