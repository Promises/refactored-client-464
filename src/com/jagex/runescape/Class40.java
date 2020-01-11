package com.jagex.runescape;
import java.awt.Component;

public class Class40 {
	public static JagexString aJagexString_788;
	public static JagexString aJagexString_791;
	public static JagexString aJagexString_792;
	public static StreamBuffer aClass4_Sub11_783;
	public static Class65[][][] aClass65ArrayArrayArray787 = new Class65[4][104][104];
	public static int anInt780 = -1;
	public static int anInt781;
	public static int anInt782;
	public static int anInt784;
	public static int anInt785;
	public static int anInt786;
	public static int anInt790;
	public static int[] anIntArray789;

	static {
		anInt781 = 0;
		aJagexString_792 = (JagexString.getRs2PreparedString(
				"We suspect someone knows your password)3"));
		anIntArray789 = new int[500];
		aJagexString_791 = JagexString.getRs2PreparedString(" )2>");
		aJagexString_788 = aJagexString_792;
	}

	public static Class43 method931(int arg0, int arg1, Signlink arg2,
			Component arg3, int arg4) {
		try {
			anInt784++;
			if (Class67.anInt1354 == 0)
				throw new IllegalStateException();
			if ((arg4 ^ 0xffffffff) > -1 || arg4 >= 2)
				throw new IllegalArgumentException();
			if (arg1 < 256)
				arg1 = 256;
			try {
				Class43 class43 = (Class43) Class.forName("com.jagex.runescape.Class43_Sub2")
						.newInstance();
				class43.anInt896 = arg1;
				class43.anIntArray877 = new int[256 * (Class4_Sub20_Sub7_Sub1.aBoolean3218 ? 2
						: 1)];
				class43.method956(arg3);
				class43.anInt902 = 1024 + (~0x3ff & arg1);
				if (arg0 >= -56)
					method932(97);
				if ((class43.anInt902 ^ 0xffffffff) < -16385)
					class43.anInt902 = 16384;
				class43.method963(class43.anInt902);
				if (Class4_Sub12.anInt2125 > 0 && Class47.aClass50_960 == null) {
					Class47.aClass50_960 = new Class50();
					Class47.aClass50_960.aClass75_1014 = arg2;
					arg2.method1172(Class47.aClass50_960,
							Class4_Sub12.anInt2125, 83);
				}
				if (Class47.aClass50_960 != null) {
					if (Class47.aClass50_960.aClass43Array1013[arg4] != null)
						throw new IllegalArgumentException();
					Class47.aClass50_960.aClass43Array1013[arg4] = class43;
				}
				return class43;
			} catch (Throwable throwable) {
				try {
					Class43_Sub1 class43_sub1 = new Class43_Sub1(arg2, arg4);
					class43_sub1.anIntArray877 = new int[(!Class4_Sub20_Sub7_Sub1.aBoolean3218 ? 1
							: 2) * 256];
					class43_sub1.anInt896 = arg1;
					class43_sub1.method956(arg3);
					class43_sub1.anInt902 = 16384;
					class43_sub1.method963(class43_sub1.anInt902);
					if ((Class4_Sub12.anInt2125 ^ 0xffffffff) < -1
							&& Class47.aClass50_960 == null) {
						Class47.aClass50_960 = new Class50();
						Class47.aClass50_960.aClass75_1014 = arg2;
						arg2.method1172(Class47.aClass50_960,
								Class4_Sub12.anInt2125, 10);
					}
					if (Class47.aClass50_960 != null) {
						if (Class47.aClass50_960.aClass43Array1013[arg4] != null)
							throw new IllegalArgumentException();
						Class47.aClass50_960.aClass43Array1013[arg4] = class43_sub1;
					}
					return class43_sub1;
				} catch (Throwable throwable_0_) {
					return new Class43();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("la.D("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ')'));
		}
	}

	public static void method932(int arg0) {
		try {
			anIntArray789 = null;
			aJagexString_792 = null;
			if (arg0 != 14778)
				anInt781 = -93;
			aClass65ArrayArrayArray787 = null;
			aJagexString_788 = null;
			aJagexString_791 = null;
			aClass4_Sub11_783 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "la.A("
					+ arg0 + ')');
		}
	}

	public static int method933(int arg0, boolean arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		try {
			if ((arg6 & 0x1) == 1) {
				int i = arg5;
				arg5 = arg0;
				arg0 = i;
			}
			if (arg1 != true)
				method934(-25, -35, -32);
			arg2 &= 0x3;
			anInt786++;
			if (arg2 == 0)
				return arg3;
			if ((arg2 ^ 0xffffffff) == -2)
				return -arg4 + 7 - (arg5 - 1);
			if ((arg2 ^ 0xffffffff) == -3)
				return 7 + (-arg3 - (-1 + arg0));
			return arg4;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("la.C("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public static void method934(int arg0, int arg1, int arg2) {
		anInt790++;
		if ((Class4_Sub20_Sub9.anInt3051 ^ 0xffffffff) == -1
				|| Class4_Sub20_Sub9.anInt3051 == 3) {
			if (arg2 != 0)
				aClass65ArrayArrayArray787 = null;
			if ((Class62.anInt1227 ^ 0xffffffff) == -2) {
				int i = -arg1 + (-25 + Class37.anInt758);
				int i_1_ = -arg0 + (JagexException.anInt1729 + -5);
				if (i >= 0 && (i_1_ ^ 0xffffffff) <= -1 && i < 146
						&& i_1_ < 151) {
					i -= 73;
					i_1_ -= 75;
					int i_2_ = 0x7ff & Class49.anInt999 + Class31.anInt680;
					int i_3_ = Class4_Sub20_Sub12_Sub3.anIntArray3524[i_2_];
					i_3_ = (i_3_ * (Class4_Sub20_Sub5.anInt2889 - -256) >> -1900486776);
					int i_4_ = Class4_Sub20_Sub12_Sub3.anIntArray3528[i_2_];
					i_4_ = (i_4_ * (256 + Class4_Sub20_Sub5.anInt2889) >> 1857221832);
					int i_5_ = i_4_ * i_1_ - i * i_3_ >> 1238261835;
					int i_6_ = i_1_ * i_3_ - -(i * i_4_) >> 2082875563;
					int i_7_ = (i_6_
							+ (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270) >> 940282087);
					int i_8_ = (-i_5_
							+ (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267) >> -823395769);
					boolean bool = (Class4_Sub20
							.method319(
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3247[0]),
									i_8_,
									i_7_,
									0,
									0,
									true,
									1,
									0,
									0,
									0,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anIntArray3248[0])));
					if (bool) {
						Class66.aClass4_Sub11_Sub1_1328
								.method227((byte) -27, i);
						Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
								i_1_);
						Class66.aClass4_Sub11_Sub1_1328.method207(
								Class49.anInt999, 2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
								57);
						Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
								Class31.anInt680);
						Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
								Class4_Sub20_Sub5.anInt2889);
						Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
								89);
						Class66.aClass4_Sub11_Sub1_1328
								.method207(
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3270),
										2018779304);
						Class66.aClass4_Sub11_Sub1_1328
								.method207(
										(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3267),
										2018779304);
						Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
								Class4_Sub20_Sub3.anInt2816);
						Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
								63);
					}
				}
			}
		}
	}

	public static void method935(int arg0) {
		try {
			anInt785++;
			if (Class4_Sub20_Sub17.aClass76_3189 != null) {
				Class4_Sub20_Sub17.aClass76_3189.method1181(-31709);
				Class4_Sub20_Sub17.aClass76_3189 = null;
			}
			Class62.method1050(true);
			Class4_Sub20_Sub7_Sub6.aClass69_3439.method1136();
			for (int i = arg0; (i ^ 0xffffffff) > -5; i++)
				Class57.regions[i].method68(true);
			System.gc();
			Class32.method882(2, arg0 + 69);
			Class4_Sub20_Sub6.aBoolean2895 = false;
			Region.anInt136 = -1;
			Class49.method992((byte) 93);
			Region.method50(10, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "la.B("
					+ arg0 + ')');
		}
	}

	public static void method936(byte arg0, int arg1, JagexString arg2) {
		try {
			Class66.aClass4_Sub11_Sub1_1328.method264(66, -83);
			Class66.aClass4_Sub11_Sub1_1328.method210(arg1, 128);
			Class42.anInt851++;
			anInt782++;
			Class66.aClass4_Sub11_Sub1_1328.method256(1918583904,
					arg2.method806((byte) -111));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("la.F("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}
}
