package com.jagex.runescape;

public class Class38 {
	public static JagexString aJagexString_769;
	public static JagexString aJagexString_772 = JagexString.getRs2PreparedString(
			"scrollbar");
	public static int anInt768;
	public static int anInt770;
	public static int anInt771;
	public static int anInt773;
	public static int anInt774;
	public static int anInt775;

	static {
		aJagexString_769 = JagexString.getRs2PreparedString("Standort");
		anInt770 = 0;
	}

	public static JagexString method919(int arg0, RSInterface arg1, int arg2) {
		try {
			anInt771++;
			if (!Class4_Sub12.method278(75, arg2,
					Class54.method1011(arg1, -22389))
					&& arg1.anObjectArray2145 == null)
				return null;
			if (arg0 != -10706)
				method921(59);
			if (arg1.aJagexStringArray2247 == null
					|| ((arg1.aJagexStringArray2247.length ^ 0xffffffff) >= (arg2 ^ 0xffffffff))
					|| arg1.aJagexStringArray2247[arg2] == null
					|| (arg1.aJagexStringArray2247[arg2].method815(126).method825(
							-106) == 0)) {
				if (Class19_Sub1.aBoolean2538)
					return (Class4_Sub24.method639(
							new JagexString[] { Class24.aJagexString_551,
									Class74.method1168(-67, arg2) },
							arg0 + 9864));
				return null;
			}
			return arg1.aJagexStringArray2247[arg2];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kd.A("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public static void method920(boolean arg0, int arg1) {
		try {
			anInt768++;
			int i = 0;
			if (arg1 == 12981) {
				for (/**/; (i ^ 0xffffffff) > (RSApplet.anInt12 ^ 0xffffffff); i++) {
					Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[Class4_Sub11_Sub1.anIntArray2695[i]]);
					int i_0_ = 536870912 - -(Class4_Sub11_Sub1.anIntArray2695[i] << -601574610);
					if (class4_sub20_sub7_sub1_sub2 != null
							&& class4_sub20_sub7_sub1_sub2.method384(-19456)
							&& !(class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.aBoolean2826) == !arg0
							&& class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617
									.method355((byte) -43)) {
						int i_1_ = (class4_sub20_sub7_sub1_sub2.anInt3267 >> -1116516633);
						int i_2_ = (class4_sub20_sub7_sub1_sub2.anInt3270 >> 354464647);
						if (i_2_ >= 0 && (i_2_ ^ 0xffffffff) > -105
								&& i_1_ >= 0 && i_1_ < 104) {
							if ((class4_sub20_sub7_sub1_sub2.anInt3244 ^ 0xffffffff) == -2
									&& ((0x7f & class4_sub20_sub7_sub1_sub2.anInt3270) ^ 0xffffffff) == -65
									&& (class4_sub20_sub7_sub1_sub2.anInt3267 & 0x7f) == 64) {
								if (Class43.anInt860 == Class77.anIntArrayArray1592[i_2_][i_1_])
									continue;
								Class77.anIntArrayArray1592[i_2_][i_1_] = Class43.anInt860;
							}
							if (!class4_sub20_sub7_sub1_sub2.aClass4_Sub20_Sub3_3617.aBoolean2835)
								i_0_ += -2147483648;
							Class4_Sub20_Sub7_Sub6.aClass69_3439
									.method1132(
											Class82.anInt1711,
											class4_sub20_sub7_sub1_sub2.anInt3270,
											class4_sub20_sub7_sub1_sub2.anInt3267,
											(Class67.method1090(
													(class4_sub20_sub7_sub1_sub2.anInt3270 - -(64 * ((class4_sub20_sub7_sub1_sub2.anInt3244) + -1))),
													(class4_sub20_sub7_sub1_sub2.anInt3267
															- -(64 * (class4_sub20_sub7_sub1_sub2.anInt3244)) - 64),
													true, Class82.anInt1711)),
											60 + (-64 + 64 * (class4_sub20_sub7_sub1_sub2.anInt3244)),
											class4_sub20_sub7_sub1_sub2,
											class4_sub20_sub7_sub1_sub2.anInt3219,
											i_0_,
											class4_sub20_sub7_sub1_sub2.aBoolean3290);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kd.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method921(int arg0) {
		try {
			if (arg0 != -19752)
				aJagexString_769 = null;
			Class4_Sub16.aClass66_2316.method1084(0);
			Class4_Sub20_Sub4.aClass66_2848.method1084(0);
			anInt773++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "kd.E("
					+ arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub5 method922(int arg0, int arg1) {
		try {
			Class4_Sub20_Sub5 class4_sub20_sub5 = ((Class4_Sub20_Sub5) Class12.aClass66_367
					.method1083(arg0, true));
			anInt775++;
			if (class4_sub20_sub5 != null)
				return class4_sub20_sub5;
			if (arg1 != -10834)
				method920(true, -41);
			byte[] is = Class4_Sub2_Sub1.aClass19_2579.method746(8, (byte) 115,
					arg0);
			class4_sub20_sub5 = new Class4_Sub20_Sub5();
			if (is != null)
				class4_sub20_sub5.method363(new StreamBuffer(is), false);
			Class12.aClass66_367.method1082(true, arg0, class4_sub20_sub5);
			return class4_sub20_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kd.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method923(int arg0) {
		try {
			if (arg0 != 60)
				method919(-88, null, -27);
			aJagexString_772 = null;
			aJagexString_769 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "kd.C("
					+ arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub11 method924(int arg0, int arg1) {
		try {
			Class4_Sub20_Sub11 class4_sub20_sub11 = ((Class4_Sub20_Sub11) Class42.aClass66_853
					.method1083(arg1, true));
			if (arg0 != 536870912)
				anInt770 = -97;
			anInt774++;
			if (class4_sub20_sub11 != null)
				return class4_sub20_sub11;
			byte[] is = Class50.aClass19_1021.method746(5, (byte) 107, arg1);
			class4_sub20_sub11 = new Class4_Sub20_Sub11();
			if (is != null)
				class4_sub20_sub11.method485(new StreamBuffer(is), arg0
						+ -536870799);
			Class42.aClass66_853.method1082(true, arg1, class4_sub20_sub11);
			return class4_sub20_sub11;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kd.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
