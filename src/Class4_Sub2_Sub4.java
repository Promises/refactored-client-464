/* Class4_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4_Sub2_Sub4 extends Class4_Sub2 {
	public static Class19 aClass19_2648;
	public static JagexString aJagexString_2650 = (JagexString.getRs2PreparedString(
			"Startseite auf (WSpielkonto wiederherstellen(W)3"));
	public static JagexString aJagexString_2653 = JagexString.getRs2PreparedString(
			"bevor Sie den Vorgang wiederholen)3");
	public static int anInt2642;
	public static int anInt2643;
	public static int anInt2645;
	public static int anInt2646;
	public static int anInt2647;
	public static int anInt2649;
	public static int anInt2651;
	public static int anInt2652;
	public static int anInt2655;
	public static int anInt2656;
	public static int anInt2657;
	public static int anInt2658;

	public static JagexString method167(int arg0, RSInterface arg1) {
		try {
			if (arg0 >= -56)
				method170(2, null);
			anInt2649++;
			if (Class68.method1092(14423, Class54.method1011(arg1, -22389)) == 0)
				return null;
			if (arg1.aJagexString_2174 == null
					|| arg1.aJagexString_2174.method815(127).method825(-108) == 0) {
				if (Class19_Sub1.aBoolean2538)
					return RS2Font.aJagexString_2767;
				return null;
			}
			return arg1.aJagexString_2174;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ue.D("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method168(int arg0) {
		try {
			aJagexString_2653 = null;
			aJagexString_2650 = null;
			aClass19_2648 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ue.C("
					+ arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub12_Sub4_Sub1 method170(int arg0, byte[] arg1) {
		try {
			anInt2643++;
			if (arg1 == null)
				return null;
			if (arg0 != -21408)
				aClass19_2648 = null;
			Class4_Sub20_Sub12_Sub4_Sub1 class4_sub20_sub12_sub4_sub1 = (new Class4_Sub20_Sub12_Sub4_Sub1(
					arg1, Class35.anIntArray726,
					Class4_Sub20_Sub7_Sub5.anIntArray3395,
					Class30.anIntArray650, Class13_Sub2.anIntArray2480,
					Class67.anIntArray1367, Class4_Sub23.aByteArrayArray2426));
			Class43.method953(true);
			return class4_sub20_sub12_sub4_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ue.B("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static Class42 method172(boolean arg0) {
		try {
			anInt2656++;
			try {
				if (arg0 != true)
					method168(93);
				return (Class42) Class.forName("Class42_Sub1").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ue.F("
					+ arg0 + ')');
		}
	}

	public Class4_Sub2_Sub1 aClass4_Sub2_Sub1_2644;

	public Class4_Sub2_Sub2 aClass4_Sub2_Sub2_2659 = new Class4_Sub2_Sub2();

	public Class65 aClass65_2654 = new Class65();

	public Class4_Sub2_Sub4(Class4_Sub2_Sub1 arg0) {
		try {
			aClass4_Sub2_Sub1_2644 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ue.<init>(" + (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method169(int arg0, byte arg1, Class4_Sub10 arg2) {
		try {
			anInt2647++;
			if (arg1 != 116)
				method79();
			if ((aClass4_Sub2_Sub1_2644.anIntArray2573[arg2.anInt2015] & 0x4 ^ 0xffffffff) != -1
					&& (arg2.anInt2016 ^ 0xffffffff) > -1) {
				int i = (aClass4_Sub2_Sub1_2644.anIntArray2604[arg2.anInt2015] / Class67.anInt1354);
				int i_1_ = (1048575 - (-i + arg2.anInt2043)) / i;
				arg2.anInt2043 = 0xfffff & arg2.anInt2043 + i * arg0;
				if (i_1_ <= arg0) {
					if ((aClass4_Sub2_Sub1_2644.anIntArray2599[arg2.anInt2015] ^ 0xffffffff) != -1) {
						arg2.aClass4_Sub2_Sub3_2028 = (Class4_Sub2_Sub3
								.method139(
										arg2.aClass4_Sub4_Sub1_2031,
										arg2.aClass4_Sub2_Sub3_2028.method162(),
										0,
										arg2.aClass4_Sub2_Sub3_2028.method151()));
						aClass4_Sub2_Sub1_2644
								.method114(
										((arg2.aClass4_Sub23_2035.aShortArray2430[arg2.anInt2039]) < 0),
										(byte) -103, arg2);
					} else
						arg2.aClass4_Sub2_Sub3_2028 = (Class4_Sub2_Sub3
								.method139(
										arg2.aClass4_Sub4_Sub1_2031,
										arg2.aClass4_Sub2_Sub3_2028.method162(),
										arg2.aClass4_Sub2_Sub3_2028.method128(),
										arg2.aClass4_Sub2_Sub3_2028.method151()));
					if (((arg2.aClass4_Sub23_2035.aShortArray2430[arg2.anInt2039]) ^ 0xffffffff) > -1)
						arg2.aClass4_Sub2_Sub3_2028.method142(-1);
					arg0 = arg2.anInt2043 / i;
				}
			}
			arg2.aClass4_Sub2_Sub3_2028.method82(arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ue.E("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method171(int arg0, int arg1, int[] arg2, int arg3,
			Class4_Sub10 arg4, int arg5) {
		try {
			if ((aClass4_Sub2_Sub1_2644.anIntArray2573[arg4.anInt2015] & 0x4 ^ 0xffffffff) != -1
					&& (arg4.anInt2016 ^ 0xffffffff) > -1) {
				int i = (aClass4_Sub2_Sub1_2644.anIntArray2604[arg4.anInt2015] / Class67.anInt1354);
				for (;;) {
					int i_2_ = (i + (1048575 - arg4.anInt2043)) / i;
					if ((i_2_ ^ 0xffffffff) < (arg5 ^ 0xffffffff))
						break;
					arg4.aClass4_Sub2_Sub3_2028.method80(arg2, arg0, i_2_);
					arg5 -= i_2_;
					arg4.anInt2043 += -1048576 + i_2_ * i;
					arg0 += i_2_;
					int i_3_ = Class67.anInt1354 / 100;
					int i_4_ = 262144 / i;
					Class4_Sub2_Sub3 class4_sub2_sub3 = arg4.aClass4_Sub2_Sub3_2028;
					if ((i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
						i_3_ = i_4_;
					if ((aClass4_Sub2_Sub1_2644.anIntArray2599[arg4.anInt2015] ^ 0xffffffff) != -1) {
						arg4.aClass4_Sub2_Sub3_2028 = (Class4_Sub2_Sub3
								.method139(arg4.aClass4_Sub4_Sub1_2031,
										class4_sub2_sub3.method162(), 0,
										class4_sub2_sub3.method151()));
						aClass4_Sub2_Sub1_2644
								.method114(
										((arg4.aClass4_Sub23_2035.aShortArray2430[arg4.anInt2039]) < 0),
										(byte) 47, arg4);
						arg4.aClass4_Sub2_Sub3_2028.method152(i_3_,
								class4_sub2_sub3.method128());
					} else
						arg4.aClass4_Sub2_Sub3_2028 = (Class4_Sub2_Sub3
								.method139(arg4.aClass4_Sub4_Sub1_2031,
										class4_sub2_sub3.method162(),
										class4_sub2_sub3.method128(),
										class4_sub2_sub3.method151()));
					if (((arg4.aClass4_Sub23_2035.aShortArray2430[arg4.anInt2039]) ^ 0xffffffff) > -1)
						arg4.aClass4_Sub2_Sub3_2028.method142(-1);
					class4_sub2_sub3.method164(i_3_);
					class4_sub2_sub3.method80(arg2, arg0, -arg0 + arg1);
					if (class4_sub2_sub3.method158())
						aClass4_Sub2_Sub2_2659.method120(class4_sub2_sub3);
				}
				arg4.anInt2043 += arg5 * i;
			}
			if (arg3 == 0) {
				arg4.aClass4_Sub2_Sub3_2028.method80(arg2, arg0, arg5);
				anInt2651++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ue.A("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ')'));
		}
	}

	@Override
	public int method78() {
		try {
			anInt2652++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"ue.QA(" + ')');
		}
	}

	@Override
	public Class4_Sub2 method79() {
		try {
			anInt2645++;
			Class4_Sub10 class4_sub10 = (Class4_Sub10) aClass65_2654
					.method1071(-128);
			if (class4_sub10 == null)
				return null;
			if (class4_sub10.aClass4_Sub2_Sub3_2028 != null)
				return class4_sub10.aClass4_Sub2_Sub3_2028;
			return method81();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"ue.BA(" + ')');
		}
	}

	@Override
	public void method80(int[] arg0, int arg1, int arg2) {
		try {
			aClass4_Sub2_Sub2_2659.method80(arg0, arg1, arg2);
			anInt2642++;
			Class4_Sub10 class4_sub10 = (Class4_Sub10) aClass65_2654
					.method1071(-126);
			while_9_: for (/**/; class4_sub10 != null; class4_sub10 = (Class4_Sub10) aClass65_2654
					.method1075(18485)) {
				if (!aClass4_Sub2_Sub1_2644.method108(class4_sub10, 0)) {
					int i = arg2;
					int i_0_ = arg1;
					while ((i ^ 0xffffffff) < (class4_sub10.anInt2017 ^ 0xffffffff)) {
						method171(i_0_, i + i_0_, arg0, 0, class4_sub10,
								class4_sub10.anInt2017);
						i -= class4_sub10.anInt2017;
						i_0_ += class4_sub10.anInt2017;
						if (aClass4_Sub2_Sub1_2644.method99(i_0_, class4_sub10,
								arg0, (byte) 76, i))
							continue while_9_;
					}
					method171(i_0_, i_0_ + i, arg0, 0, class4_sub10, i);
					class4_sub10.anInt2017 -= i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ue.Q("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	@Override
	public Class4_Sub2 method81() {
		try {
			anInt2657++;
			Class4_Sub10 class4_sub10;
			do {
				class4_sub10 = (Class4_Sub10) aClass65_2654.method1075(18485);
				if (class4_sub10 == null)
					return null;
			} while (class4_sub10.aClass4_Sub2_Sub3_2028 == null);
			return class4_sub10.aClass4_Sub2_Sub3_2028;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"ue.TA(" + ')');
		}
	}

	@Override
	public void method82(int arg0) {
		try {
			anInt2655++;
			aClass4_Sub2_Sub2_2659.method82(arg0);
			Class4_Sub10 class4_sub10 = (Class4_Sub10) aClass65_2654
					.method1071(-123);
			while_11_: for (/**/; class4_sub10 != null; class4_sub10 = (Class4_Sub10) aClass65_2654
					.method1075(18485)) {
				if (!aClass4_Sub2_Sub1_2644.method108(class4_sub10, 0)) {
					int i = arg0;
					while ((i ^ 0xffffffff) < (class4_sub10.anInt2017 ^ 0xffffffff)) {
						method169(class4_sub10.anInt2017, (byte) 116,
								class4_sub10);
						i -= class4_sub10.anInt2017;
						if (aClass4_Sub2_Sub1_2644.method99(0, class4_sub10,
								null, (byte) 59, i))
							continue while_11_;
					}
					method169(i, (byte) 116, class4_sub10);
					class4_sub10.anInt2017 -= i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ue.T("
					+ arg0 + ')');
		}
	}
}
