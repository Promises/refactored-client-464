package com.jagex.runescape;

public class Class31 {
	public static Class16 aClass16_671;
	public static Class16 aClass16_677;
	public static JagexString aJagexString_665;
	public static JagexString aJagexString_667;
	public static JagexString aJagexString_674;
	public static JagexString aJagexString_675;
	public static JagexString aJagexString_678;
	public static JagexString aJagexString_679;
	public static JagexString aJagexString_681;
	public static JagexString aJagexString_682;
	public static JagexString aJagexString_683;
	public static JagexString aJagexString_684;
	public static JagexString aJagexString_685;
	public static JagexString aJagexString_688;
	public static JagexString aJagexString_692;
	public static Class4_Sub20_Sub12_Sub1 aClass4_Sub20_Sub12_Sub1_676;
	public static Class53 aClass53_690;
	public static int anInt664;
	public static int anInt666;
	public static int anInt668;
	public static int anInt669 = 0;
	public static int anInt670;
	public static int anInt672;
	public static int anInt673;
	public static int anInt680;
	public static int anInt686;
	public static int anInt689;
	public static int anInt691;
	public static int[] anIntArray687;
	public static int[] anIntArray693;

	static {
		aJagexString_667 = JagexString.getRs2PreparedString("Examine");
		aJagexString_665 = aJagexString_667;
		aClass16_671 = new Class16(32);
		aJagexString_678 = JagexString.getRs2PreparedString("sl_back");
		aJagexString_674 = JagexString.getRs2PreparedString("Create a free account"
		);
		aJagexString_675 = aJagexString_674;
		aClass16_677 = new Class16(8);
		aJagexString_683 = JagexString.getRs2PreparedString("M");
		aJagexString_685 = JagexString.getRs2PreparedString("Diese Welt ist voll)3"
		);
		aJagexString_681 = aJagexString_683;
		anInt686 = 0;
		aJagexString_682 = JagexString.getRs2PreparedString("Bad session id)3");
		anInt691 = 20;
		anInt689 = 0;
		anIntArray687 = new int[2000];
		aJagexString_679 = aJagexString_683;
		aJagexString_692 = aJagexString_682;
		aJagexString_684 = JagexString.getRs2PreparedString("(U(Y");
		aJagexString_688 = JagexString.getRs2PreparedString(
				"Spiel)2Engine wird gestartet)3)3)3");
		anIntArray693 = new int[25];
		anInt680 = 0;
	}

	public static void method875(byte arg0, Class19 arg1, Class19 arg2) {
		try {
			anInt664++;
			Class61.aClass19_1218 = arg1;
			Class62.aClass19_1240 = arg2;
			if (arg0 != 105)
				anInt669 = -39;
			Class66.anInt1313 = Class61.aClass19_1218.method741(3, true);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ja.G("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method876(Class4_Sub20_Sub12_Sub4_Sub1 arg0,
			Class19 arg1, byte arg2, Class19 arg3, boolean arg4) {
		try {
			Class4_Sub17.aClass19_2323 = arg3;
			anInt672++;
			Class35.aBoolean744 = arg4;
			RSFont.aClass19_169 = arg1;
			Class4_Sub17.aClass19_2323.method741(10, true);
			if (arg2 != -55)
				aJagexString_685 = null;
			Class4_Sub20_Sub1.aClass4_Sub20_Sub12_Sub4_Sub1_2708 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ja.B("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ')'));
		}
	}

	public static void method877(int arg0) {
		try {
			aClass53_690 = null;
			aJagexString_674 = null;
			aJagexString_675 = null;
			aClass4_Sub20_Sub12_Sub1_676 = null;
			aJagexString_681 = null;
			anIntArray693 = null;
			aJagexString_683 = null;
			aJagexString_684 = null;
			aJagexString_679 = null;
			aClass16_671 = null;
			aClass16_677 = null;
			aJagexString_678 = null;
			aJagexString_665 = null;
			aJagexString_688 = null;
			aJagexString_692 = null;
			if (arg0 != 98)
				method875((byte) 47, null, null);
			aJagexString_682 = null;
			aJagexString_667 = null;
			aJagexString_685 = null;
			anIntArray687 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ja.D("
					+ arg0 + ')');
		}
	}

	public static void method878(byte arg0, Class19 arg1) {
		try {
			anInt673++;
			SceneGraph.aClass19_2483 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ja.E("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method879(JagexString arg0, int arg1, Class19 arg2,
                                 boolean arg3, int arg4, int arg5, JagexString arg6) {
		try {
			int i = arg2.method754(arg0, 1);
			anInt668++;
			if (arg5 > -75)
				method877(-113);
			int i_0_ = arg2.method747(false, arg6, i);
			Class77.method1192(i_0_, arg3, arg2, arg1, arg4, i, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ja.F("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ',' + arg5 + ','
					+ (arg6 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method880(int arg0, int arg1, int arg2, byte[] arg3,
			int arg4, int arg5, int arg6, int arg7, Region[] arg8,
			Class69 arg9, int arg10) {
		do {
			try {
				StreamBuffer class4_sub11 = new StreamBuffer(arg3);
				int i = -1;
				anInt666++;
				for (;;) {
					int i_1_ = class4_sub11.getSmart();
					if ((i_1_ ^ 0xffffffff) == -1)
						break;
					i += i_1_;
					int i_2_ = 0;
					for (;;) {
						int i_3_ = class4_sub11.getSmart();
						if (i_3_ == 0)
							break;
						i_2_ += -1 + i_3_;
						int i_4_ = i_2_ >> -450018644;
						int i_5_ = 0x3f & i_2_ >> -320795258;
						int i_6_ = i_2_ & 0x3f;
						int i_7_ = class4_sub11.get();
						int i_8_ = i_7_ >> -592457918;
						int i_9_ = i_7_ & 0x3;
						if ((arg4 ^ 0xffffffff) == (i_4_ ^ 0xffffffff)
								&& (i_5_ ^ 0xffffffff) <= (arg7 ^ 0xffffffff)
								&& (i_5_ ^ 0xffffffff) > (8 + arg7 ^ 0xffffffff)
								&& (i_6_ ^ 0xffffffff) <= (arg2 ^ 0xffffffff)
								&& i_6_ < 8 + arg2) {
							Class4_Sub20_Sub1 class4_sub20_sub1 = Region
									.method56(true, i);
							int i_10_ = (arg1 + Class63.method1057(
									(class4_sub20_sub1.anInt2725), (byte) 23,
									0x7 & i_5_, arg0, i_9_, i_6_ & 0x7,
									(class4_sub20_sub1.anInt2744)));
							int i_11_ = (arg5 + Class40.method933(
									(class4_sub20_sub1.anInt2744), true, arg0,
									0x7 & i_6_, 0x7 & i_5_,
									(class4_sub20_sub1.anInt2725), i_9_));
							if ((i_10_ ^ 0xffffffff) < -1
									&& (i_11_ ^ 0xffffffff) < -1
									&& (i_10_ ^ 0xffffffff) > -104
									&& i_11_ < 103) {
								int i_12_ = arg6;
								Region class3 = null;
								if (((Class46.landscapeData[1][i_10_][i_11_]) & 0x2) == 2)
									i_12_--;
								if (i_12_ >= 0)
									class3 = arg8[i_12_];
								Class42.method945(0x3 & arg0 + i_9_, arg6,
										i_10_, i, i_11_, i_8_, class3, arg9);
							}
						}
					}
				}
				if (arg10 == 537)
					break;
				aJagexString_684 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						("ja.C(" + arg0 + ',' + arg1 + ',' + arg2 + ','
								+ (arg3 != null ? "{...}" : "null") + ','
								+ arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7
								+ ',' + (arg8 != null ? "{...}" : "null") + ','
								+ (arg9 != null ? "{...}" : "null") + ','
								+ arg10 + ')'));
			}
			break;
		} while (false);
	}

	public static int method881(int arg0) {
		try {
			if (arg0 != -10051)
				return -28;
			anInt670++;
			return Class4_Sub21.anInt2379++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ja.A("
					+ arg0 + ')');
		}
	}
}
