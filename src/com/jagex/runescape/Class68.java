package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class68 {
	public static JagexString aJagexString_1368;
	public static JagexString aJagexString_1374 = JagexString.getRs2PreparedString("VOLL"
    );
	public static JagexString aJagexString_1377;
	public static JagexString aJagexString_1383;
	public static JagexString aJagexString_1386 = JagexString.getRs2PreparedString("Login"
    );
	public static Class4_Sub20_Sub12_Sub4_Sub1 aClass4_Sub20_Sub12_Sub4_Sub1_1384;
	public static int anInt1376;
	public static int anInt1378;
	public static int anInt1379;
	public static int anInt1382;
	public static int anInt1385;
	static {
		aJagexString_1377 = (JagexString.getRs2PreparedString(
				"You can(Wt add yourself to your own friend list"));
		aJagexString_1368 = aJagexString_1386;
		aJagexString_1383 = aJagexString_1377;
	}

	public static int method1092(int arg0, int arg1) {
		try {
			anInt1385++;
			if (arg0 != 14423)
				method1093(66, (byte) -6);
			return 0x3f & arg1 >> 202896363;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("tc.E("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static Class4_Sub20_Sub17 method1093(int arg0, byte arg1) {
		try {
			anInt1376++;
			Class4_Sub20_Sub17 class4_sub20_sub17 = ((Class4_Sub20_Sub17) Class4_Sub3.aClass66_1882
					.method1083(arg0, true));
			if (class4_sub20_sub17 != null)
				return class4_sub20_sub17;
			byte[] is = Class4_Sub20_Sub7_Sub4.aClass19_3371.method746(12,
					(byte) 99, arg0);
			class4_sub20_sub17 = new Class4_Sub20_Sub17();
			if (is != null)
				class4_sub20_sub17.method620((byte) -59, new Buffer(is));
			class4_sub20_sub17.method617(0);
			Class4_Sub3.aClass66_1882
					.method1082(true, arg0, class4_sub20_sub17);
			if (arg1 > -108)
				method1094(-35, -38L);
			return class4_sub20_sub17;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("tc.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static JagexString method1094(int arg0, long arg1) {
		try {
			anInt1382++;
			if ((arg1 ^ 0xffffffffffffffffL) >= -1L
					|| (arg1 ^ 0xffffffffffffffffL) <= -6582952005840035282L)
				return null;
			if ((arg1 % 37L ^ 0xffffffffffffffffL) == -1L)
				return null;
			int i = 0;
			long l = arg1;
			if (arg0 != -5)
				method1092(-85, -16);
			for (/**/; (l ^ 0xffffffffffffffffL) != -1L; l /= 37L)
				i++;
			byte[] is = new byte[i];
			while ((arg1 ^ 0xffffffffffffffffL) != -1L) {
				long l_0_ = arg1;
				arg1 /= 37L;
				is[--i] = Class4_Sub21.aByteArray2367[(int) (-(arg1 * 37L) + l_0_)];
			}
			JagexString jagexString = new JagexString();
			jagexString.aByteArray1803 = is;
			jagexString.anInt1805 = is.length;
			return jagexString;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("tc.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method1095(int arg0) {
		Class62.aClass66_1231.method1084(0);
		anInt1378++;
		Region.aClass66_131.method1084(0);
		Game.aClass66_1844.method1084(arg0 + -2);
		if (arg0 != 2)
			method1092(-99, 27);
	}

	public static int method1096(int arg0, int arg1) {
		try {
			int i = 0;
			anInt1379++;
			if ((arg0 ^ 0xffffffff) > -1 || (arg0 ^ 0xffffffff) <= -65537) {
				i += 16;
				arg0 >>>= 16;
			}
			if (arg0 >= 256) {
				i += 8;
				arg0 >>>= 8;
			}
			if ((arg0 ^ 0xffffffff) <= -17) {
				arg0 >>>= 4;
				i += 4;
			}
			if ((arg0 ^ 0xffffffff) <= -5) {
				i += 2;
				arg0 >>>= 2;
			}
			if (arg0 >= 1) {
				i++;
				arg0 >>>= 1;
			}
			return arg0 + i;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("tc.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method1097(byte arg0) {
		aJagexString_1377 = null;
		aJagexString_1386 = null;
		aJagexString_1383 = null;
		aJagexString_1368 = null;
		aClass4_Sub20_Sub12_Sub4_Sub1_1384 = null;
		aJagexString_1374 = null;
		if (arg0 >= -124)
			aJagexString_1368 = null;
	}

	public Class4_Sub20_Sub7 aClass4_Sub20_Sub7_1372;
	public Class4_Sub20_Sub7 aClass4_Sub20_Sub7_1375;

	public int anInt1369 = 0;

	public int anInt1370;

	public int anInt1371 = 0;

	public int anInt1373;

	public int anInt1380;

	public int anInt1381;

	public int anInt1387;
}
