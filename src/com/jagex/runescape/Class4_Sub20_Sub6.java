package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class4_Sub20_Sub6 extends Class4_Sub20 {
	public static boolean aBoolean2895;
	public static boolean aBoolean2914;
	public static Class19_Sub1 aClass19_Sub1_2911;
	public static Class19_Sub1 aClass19_Sub1_2921;
	public static JagexString aJagexString_2896 = JagexString.getRs2PreparedString(
			"Lade Titelbild )2 ");
	public static JagexString aJagexString_2897;
	public static JagexString aJagexString_2899;
	public static JagexString aJagexString_2904 = JagexString.getRs2PreparedString(
			"p11_full");
	public static JagexString aJagexString_2905;
	public static JagexString aJagexString_2916;
	public static JagexString aJagexString_2919;
	public static JagexString aJagexString_2920;
	public static JagexString aJagexString_2923;
	public static JagexString aJagexString_2929;
	public static JagexString aJagexString_2931;
	public static Class43 aClass43_2932;
	public static int anInt2903;
	public static int anInt2906;
	public static int anInt2907;
	public static int anInt2908;
	public static int anInt2915;
	public static int anInt2917;
	public static int anInt2918;
	public static int anInt2924;
	public static int anInt2927;
	public static int anInt2928;
	public static int[] anIntArray2902;
	public static String aString2900;
	static {
		aBoolean2895 = false;
		anInt2906 = 0;
		aJagexString_2920 = (JagexString.getRs2PreparedString(
				"You can(Wt add yourself to your own ignore list"));
		anIntArray2902 = new int[32];
		aJagexString_2923 = JagexString.getRs2PreparedString(
				"Please reload this page)3");
		aJagexString_2916 = JagexString.getRs2PreparedString("Click to switch");
		aJagexString_2905 = (JagexString.getRs2PreparedString(
				"Fehler beim Laden Ihres Spielcharakters)3"));
		aJagexString_2897 = aJagexString_2920;
		anInt2903 = 0;
		aJagexString_2929 = JagexString.getRs2PreparedString("Loaded input handler"
        );
		aJagexString_2919 = aJagexString_2929;
		aJagexString_2931 = aJagexString_2923;
		aJagexString_2899 = aJagexString_2916;
	}

	public static Class4_Sub20_Sub12_Sub1[] method364(Class19 arg0, int arg1,
			int arg2, byte arg3) {
		try {
			if (arg3 != 111)
				method368(-22, 105, -105, (byte) 56, -82, -111, -39, -73);
			anInt2915++;
			if (!Class4_Sub20_Sub14.method594(-30384, arg1, arg2, arg0))
				return null;
			return Class48.method985(-31783);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("hc.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method366(boolean arg0) {
		try {
			aJagexString_2919 = null;
			aJagexString_2923 = null;
			aJagexString_2904 = null;
			aString2900 = null;
			aJagexString_2899 = null;
			aJagexString_2916 = null;
			aJagexString_2896 = null;
			aJagexString_2905 = null;
			aJagexString_2897 = null;
			if (arg0 != false)
				method370(125);
			aClass43_2932 = null;
			aJagexString_2931 = null;
			anIntArray2902 = null;
			aClass19_Sub1_2921 = null;
			aJagexString_2920 = null;
			aJagexString_2929 = null;
			aClass19_Sub1_2911 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "hc.G("
					+ arg0 + ')');
		}
	}

	public static int method367(int arg0, int arg1, int arg2) {
		try {
			long l = (arg2 + (arg0 << -1448663504));
			anInt2907++;
			if (arg1 != 0)
				return -36;
			if (Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990 == null
					|| Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.aLong150 != l)
				return 0;
			return 1 + (99 * Class40.aClass4_Sub11_783.pointion / (Class40.aClass4_Sub11_783.byteBuffer.length - (Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.aByte3052)));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("hc.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method368(int arg0, int arg1, int arg2, byte arg3,
			int arg4, int arg5, int arg6, int arg7) {
		anInt2908++;
		if (arg3 > -20)
			method368(-111, 22, 94, (byte) -61, -47, 42, 71, -20);
		if ((arg2 ^ 0xffffffff) <= -2 && (arg6 ^ 0xffffffff) <= -2
				&& (arg2 ^ 0xffffffff) >= -103 && (arg6 ^ 0xffffffff) >= -103) {
			if (!Class59.aBoolean1189 || arg1 == Class82.plane) {
				int i = 0;
				int i_0_ = -1;
				if (arg7 == 0)
					i = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1126(arg1,
							arg2, arg6);
				if (arg7 == 1)
					i = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1131(arg1,
							arg2, arg6);
				if ((arg7 ^ 0xffffffff) == -3)
					i = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1103(arg1,
							arg2, arg6);
				if ((arg7 ^ 0xffffffff) == -4)
					i = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1101(arg1,
							arg2, arg6);
				if ((i ^ 0xffffffff) != -1) {
					i_0_ = i >> 54112302 & 0x7fff;
					int i_2_ = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1146(
							arg1, arg2, arg6, i);
					int i_3_ = 0x3 & i_2_ >> 731880198;
					int i_4_ = 0x1f & i_2_;
					if (arg7 == 0) {
						Class4_Sub20_Sub7_Sub6.aClass69_3439.method1128(arg1,
								arg2, arg6);
						Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(
								true, i_0_);
						if (class4_sub20_sub1.anInt2741 != 0)
							Class57.regions[arg1].method59(arg2, 1, arg6,
									class4_sub20_sub1.aBoolean2698, i_3_, i_4_);
					}
					if (arg7 == 1)
						Class4_Sub20_Sub7_Sub6.aClass69_3439.method1107(arg1,
								arg2, arg6);
					if ((arg7 ^ 0xffffffff) == -3) {
						Class4_Sub20_Sub7_Sub6.aClass69_3439.method1112(arg1,
								arg2, arg6);
						Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(
								true, i_0_);
						if (((arg2 - -class4_sub20_sub1.anInt2725 ^ 0xffffffff) < -104)
								|| (arg6 - -class4_sub20_sub1.anInt2725 ^ 0xffffffff) < -104
								|| (arg2 - -class4_sub20_sub1.anInt2744 ^ 0xffffffff) < -104
								|| arg6 + class4_sub20_sub1.anInt2744 > 103)
							return;
						if (class4_sub20_sub1.anInt2741 != 0)
							Class57.regions[arg1].method64(arg6, arg2,
									class4_sub20_sub1.anInt2725, (byte) 56,
									class4_sub20_sub1.anInt2744, i_3_,
									class4_sub20_sub1.aBoolean2698);
					}
					if (arg7 == 3) {
						Class4_Sub20_Sub7_Sub6.aClass69_3439.method1098(arg1,
								arg2, arg6);
						Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(
								true, i_0_);
						if (class4_sub20_sub1.anInt2741 == 1)
							Class57.regions[arg1].method61(arg2, arg6, -1);
					}
				}
				if (arg0 >= 0) {
					int i_5_ = arg1;
					if ((i_5_ ^ 0xffffffff) > -4
							&& ((0x2 & Class46.currentSceneTileFlags[1][arg2][arg6]) ^ 0xffffffff) == -3)
						i_5_++;
					StreamBuffer.method257(arg4, Class57.regions[arg1], arg6,
							arg1, arg0, i_5_, arg5, 531, arg2,
							(Class4_Sub20_Sub7_Sub6.aClass69_3439));
				}
			}
		}
	}

	public static void method370(int arg0) {
		anInt2927++;
		Class14.aClass66_408.method1084(0);
		Class25.aClass66_592.method1084(0);
		Class9.aClass66_277.method1084(0);
		if (arg0 >= -35)
			method366(false);
	}

	public int anInt2898 = 128;
	public int anInt2901;
	public int anInt2909 = -1;
	public int anInt2912 = 0;

	public int anInt2913 = 0;

	public int anInt2922;

	public int anInt2926;

	public int anInt2930;

	public short[] aShortArray2910;

	public short[] aShortArray2925;

	public Class4_Sub20_Sub6() {
		anInt2901 = 128;
		anInt2926 = 0;
		aShortArray2925 = new short[6];
		aShortArray2910 = new short[6];
	}

	public void method365(int arg0, StreamBuffer arg1, int arg2) {
		anInt2924++;
		if ((arg2 ^ 0xffffffff) != -2) {
			if ((arg2 ^ 0xffffffff) == -3)
				anInt2909 = arg1.method209((byte) -128);
			else if ((arg2 ^ 0xffffffff) != -5) {
				if (arg2 == 5)
					anInt2898 = arg1.method209((byte) -105);
				else if (arg2 != 6) {
					if ((arg2 ^ 0xffffffff) != -8) {
						if (arg2 == 8)
							anInt2926 = arg1.get();
						else if ((arg2 ^ 0xffffffff) > -41
								|| (arg2 ^ 0xffffffff) <= -51) {
							if ((arg2 ^ 0xffffffff) <= -51 && arg2 < 60)
								aShortArray2925[-50 + arg2] = (short) arg1
										.method209((byte) -122);
						} else
							aShortArray2910[-40 + arg2] = (short) arg1
									.method209((byte) -125);
					} else
						anInt2912 = arg1.get();
				} else
					anInt2913 = arg1.method209((byte) -117);
			} else
				anInt2901 = arg1.method209((byte) -104);
		} else
			anInt2930 = arg1.method209((byte) -104);
		if (arg0 != 32767)
			anInt2913 = -23;
	}

	public void method369(int arg0, StreamBuffer arg1) {
		try {
			anInt2918++;
			if (arg0 == -40) {
				for (;;) {
					int i = arg1.get();
					if (i == 0)
						break;
					method365(32767, arg1, i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("hc.D("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub7 method371(int arg0, int arg1) {
		try {
			anInt2928++;
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) Class67.aClass66_1357
					.method1083(anInt2922, true));
			if (class4_sub20_sub7_sub7 == null) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
						.method399(Class65.aClass19_1291, anInt2930, 0);
				if (class4_sub20_sub7_sub2 == null)
					return null;
				for (int i_6_ = 0; i_6_ < 6; i_6_++) {
					if ((aShortArray2910[0] ^ 0xffffffff) != -1)
						class4_sub20_sub7_sub2.method416(aShortArray2910[i_6_],
								(aShortArray2925[i_6_]));
				}
				class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
						64 + anInt2912, anInt2926 + 850, -30, -50, -30);
				Class67.aClass66_1357.method1082(true, anInt2922,
						class4_sub20_sub7_sub7);
			}
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7_7_;
			if ((anInt2909 ^ 0xffffffff) != 0 && (arg1 ^ 0xffffffff) != 0)
				class4_sub20_sub7_sub7_7_ = Class68.method1093(anInt2909,
						(byte) -122).method619((byte) -77, arg1,
						class4_sub20_sub7_sub7);
			else
				class4_sub20_sub7_sub7_7_ = class4_sub20_sub7_sub7
						.method443(true);
			if ((anInt2901 ^ 0xffffffff) != -129 || anInt2898 != 128)
				class4_sub20_sub7_sub7_7_.method447(anInt2901, anInt2898,
						anInt2901);
			if ((anInt2913 ^ 0xffffffff) != -1) {
				if ((anInt2913 ^ 0xffffffff) == -91)
					class4_sub20_sub7_sub7_7_.method444();
				if ((anInt2913 ^ 0xffffffff) == -181) {
					class4_sub20_sub7_sub7_7_.method444();
					class4_sub20_sub7_sub7_7_.method444();
				}
				if (anInt2913 == 270) {
					class4_sub20_sub7_sub7_7_.method444();
					class4_sub20_sub7_sub7_7_.method444();
					class4_sub20_sub7_sub7_7_.method444();
				}
			}
			return class4_sub20_sub7_sub7_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("hc.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
