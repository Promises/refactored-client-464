package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class33 {
	public static boolean aBoolean711 = false;
	public static Class4_Sub20_Sub12_Sub4_Sub1 aClass4_Sub20_Sub12_Sub4_Sub1_717;
	public static int anInt704;
	public static int anInt705;
	public static int anInt706;
	public static int anInt707;
	public static int anInt708;
	public static int anInt710;
	public static int anInt712;
	public static int anInt714 = -1;
	public static int anInt715 = 2;
	public static int anInt720;

	public static void method886(int arg0) {
		synchronized (Class4_Sub14.aClass18_2272) {
			Class4_Sub20_Sub10.anInt3057 = Class4_Sub20_Sub10.anInt3060;
			if ((Class4_Sub20_Sub11.anInt3093 ^ 0xffffffff) > -1) {
				for (int i = 0; (i ^ 0xffffffff) > -113; i++)
					Class4_Sub17.aBooleanArray2320[i] = false;
				Class4_Sub20_Sub11.anInt3093 = Class4_Sub20_Sub13.anInt3111;
			} else {
				while ((Class4_Sub20_Sub13.anInt3111 ^ 0xffffffff) != (Class4_Sub20_Sub11.anInt3093 ^ 0xffffffff)) {
					int i = Class80.anIntArray1645[Class4_Sub20_Sub13.anInt3111];
					Class4_Sub20_Sub13.anInt3111 = 0x7f & Class4_Sub20_Sub13.anInt3111 + 1;
					if (i >= 0)
						Class4_Sub17.aBooleanArray2320[i] = true;
					else
						Class4_Sub17.aBooleanArray2320[i ^ 0xffffffff] = false;
				}
			}
			Class4_Sub20_Sub10.anInt3060 = Class4_Sub21.anInt2380;
		}
		anInt710++;
		if (arg0 != -490212280)
			aBoolean711 = false;
	}

	public static void method888(byte arg0) {
		aClass4_Sub20_Sub12_Sub4_Sub1_717 = null;
		if (arg0 <= 47)
			method889((byte) -77, 101);
	}

	public static Class4_Sub20_Sub13 method889(byte arg0, int arg1) {
		try {
			Class4_Sub20_Sub13 class4_sub20_sub13 = ((Class4_Sub20_Sub13) Class13_Sub2.aClass66_2468
					.method1083(arg1, true));
			anInt720++;
			if (class4_sub20_sub13 != null)
				return class4_sub20_sub13;
			byte[] is = Class61.aClass19_1218.method746(3, (byte) 102, arg1);
			class4_sub20_sub13 = new Class4_Sub20_Sub13();
			if (is != null)
				class4_sub20_sub13.method590(new StreamBuffer(is), 0);
			Class13_Sub2.aClass66_2468.method1082(true, arg1,
					class4_sub20_sub13);
			return class4_sub20_sub13;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jc.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int anInt713;
	public int anInt716;
	public int anInt718;

	public int anInt722;

	public int[] anIntArray709;

	public int[] anIntArray719;

	public Class33(int[] arg0) {
		try {
			anIntArray709 = new int[256];
			anIntArray719 = new int[256];
			for (int i = 0; i < arg0.length; i++)
				anIntArray719[i] = arg0[i];
			method885(true);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("jc.<init>(" + (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public int method884(int arg0) {
		try {
			if (anInt713-- == 0) {
				method887(true);
				anInt713 = 255;
			}
			anInt706++;
			if (arg0 != 6)
				return 83;
			return 0;
			// return anIntArray719[anInt713];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jc.E("
					+ arg0 + ')');
		}
	}

	public void method885(boolean arg0) {
		try {
			anInt707++;
			int i_0_;
			int i_1_;
			int i_2_;
			int i_3_;
			int i_4_;
			int i_5_;
			int i_6_;
			int i = i_0_ = i_1_ = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = -1640531527;
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -5; i_7_++) {
				i ^= i_0_ << 535622891;
				i_0_ += i_1_;
				i_2_ += i;
				i_0_ ^= i_1_ >>> 1671374754;
				i_3_ += i_0_;
				i_1_ += i_2_;
				i_1_ ^= i_2_ << 1453766376;
				i_2_ += i_3_;
				i_4_ += i_1_;
				i_2_ ^= i_3_ >>> -361866320;
				i_3_ += i_4_;
				i_3_ ^= i_4_ << -2016754422;
				i_6_ += i_3_;
				i_5_ += i_2_;
				i_4_ += i_5_;
				i_4_ ^= i_5_ >>> 1447752196;
				i_5_ += i_6_;
				i += i_4_;
				i_5_ ^= i_6_ << 1791663112;
				i_6_ += i;
				i_6_ ^= i >>> 1334673865;
				i_0_ += i_5_;
				i += i_0_;
				i_1_ += i_6_;
			}
			for (int i_8_ = 0; i_8_ < 256; i_8_ += 8) {
				i_3_ += anIntArray719[4 + i_8_];
				i_5_ += anIntArray719[6 + i_8_];
				i_6_ += anIntArray719[7 + i_8_];
				i_4_ += anIntArray719[i_8_ + 5];
				i_0_ += anIntArray719[1 + i_8_];
				i_2_ += anIntArray719[i_8_ - -3];
				i += anIntArray719[i_8_];
				i ^= i_0_ << -1521366901;
				i_1_ += anIntArray719[2 + i_8_];
				i_2_ += i;
				i_0_ += i_1_;
				i_0_ ^= i_1_ >>> -940688222;
				i_3_ += i_0_;
				i_1_ += i_2_;
				i_1_ ^= i_2_ << -2137279896;
				i_4_ += i_1_;
				i_2_ += i_3_;
				i_2_ ^= i_3_ >>> 1038340176;
				i_5_ += i_2_;
				i_3_ += i_4_;
				i_3_ ^= i_4_ << -988787766;
				i_6_ += i_3_;
				i_4_ += i_5_;
				i_4_ ^= i_5_ >>> 1717651684;
				i_5_ += i_6_;
				i += i_4_;
				i_5_ ^= i_6_ << -2031408600;
				i_0_ += i_5_;
				i_6_ += i;
				i_6_ ^= i >>> 704698473;
				i += i_0_;
				i_1_ += i_6_;
				anIntArray709[i_8_] = i;
				anIntArray709[i_8_ + 1] = i_0_;
				anIntArray709[2 + i_8_] = i_1_;
				anIntArray709[3 + i_8_] = i_2_;
				anIntArray709[i_8_ - -4] = i_3_;
				anIntArray709[i_8_ - -5] = i_4_;
				anIntArray709[i_8_ + 6] = i_5_;
				anIntArray709[7 + i_8_] = i_6_;
			}
			for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
				i_1_ += anIntArray709[2 + i_9_];
				i_3_ += anIntArray709[4 + i_9_];
				i_4_ += anIntArray709[5 + i_9_];
				i_2_ += anIntArray709[3 + i_9_];
				i += anIntArray709[i_9_];
				i_0_ += anIntArray709[1 + i_9_];
				i ^= i_0_ << 1522462795;
				i_0_ += i_1_;
				i_0_ ^= i_1_ >>> -375269022;
				i_6_ += anIntArray709[7 + i_9_];
				i_3_ += i_0_;
				i_5_ += anIntArray709[6 + i_9_];
				i_2_ += i;
				i_1_ += i_2_;
				i_1_ ^= i_2_ << -490212280;
				i_2_ += i_3_;
				i_2_ ^= i_3_ >>> 1871314096;
				i_4_ += i_1_;
				i_5_ += i_2_;
				i_3_ += i_4_;
				i_3_ ^= i_4_ << -1732576406;
				i_6_ += i_3_;
				i_4_ += i_5_;
				i_4_ ^= i_5_ >>> 1782037572;
				i_5_ += i_6_;
				i_5_ ^= i_6_ << -2022517848;
				i += i_4_;
				i_0_ += i_5_;
				i_6_ += i;
				i_6_ ^= i >>> -569490743;
				i += i_0_;
				i_1_ += i_6_;
				anIntArray709[i_9_] = i;
				anIntArray709[1 + i_9_] = i_0_;
				anIntArray709[2 + i_9_] = i_1_;
				anIntArray709[3 + i_9_] = i_2_;
				anIntArray709[4 + i_9_] = i_3_;
				anIntArray709[5 + i_9_] = i_4_;
				anIntArray709[6 + i_9_] = i_5_;
				anIntArray709[7 + i_9_] = i_6_;
			}
			method887(arg0);
			anInt713 = 256;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jc.A("
					+ arg0 + ')');
		}
	}

	public void method887(boolean arg0) {
		try {
			anInt722 += ++anInt716;
			anInt712++;
			if (arg0 != true)
				GameShell.eventClickY = 58;
			for (int i = 0; i < 256; i++) {
				int i_10_ = anIntArray709[i];
				if ((0x2 & i ^ 0xffffffff) == -1) {
					if ((i & 0x1 ^ 0xffffffff) != -1)
						anInt718 ^= anInt718 >>> 1577521990;
					else
						anInt718 ^= anInt718 << -863140979;
				} else if ((i & 0x1 ^ 0xffffffff) != -1)
					anInt718 ^= anInt718 >>> -140861488;
				else
					anInt718 ^= anInt718 << 1833125186;
				anInt718 += anIntArray709[0xff & i - -128];
				int i_11_;
				anIntArray709[i] = i_11_ = (anIntArray709[Class59.method1035(
						255, i_10_ >> 968942658)] + anInt718 - -anInt722);
				anIntArray719[i] = anInt722 = i_10_
						+ (anIntArray709[(Class59.method1035(1020,
								i_11_ >> 349102440) >> 967568802)]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jc.F("
					+ arg0 + ')');
		}
	}
}
