package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub12 extends RSFont {
	public static Class66 aClass66_2123 = new Class66(64);
	public static int anInt2118;
	public static int anInt2119;
	public static int anInt2121;
	public static int anInt2125;
	public static int anInt2126;
	public static int anInt2127;
	public static int anInt2128 = -1;

	public static Class14 method276(int arg0) {
		try {
			anInt2119++;
			try {
				return new Class14_Sub2();
			} catch (Throwable throwable) {
				return new SceneGraph();
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "mc.A("
					+ arg0 + ')');
		}
	}

	public static boolean method277(byte arg0, int arg1) {
		try {
			anInt2126++;
			if (Class72.aBooleanArray1487[arg1])
				return true;
			if (!Class9.aClass19_275.method742(arg1, 20619))
				return false;
			int i = Class9.aClass19_275.method741(arg1, true);
			if ((i ^ 0xffffffff) == -1) {
				Class72.aBooleanArray1487[arg1] = true;
				return true;
			}
			if (Class28.aClass4_Sub13ArrayArray632[arg1] == null)
				Class28.aClass4_Sub13ArrayArray632[arg1] = new RSInterface[i];
			if (arg0 <= 107)
				return false;
			for (int i_0_ = 0; i > i_0_; i_0_++) {
				if (Class28.aClass4_Sub13ArrayArray632[arg1][i_0_] == null) {
					byte[] is = Class9.aClass19_275.method746(arg1, (byte) 127,
							i_0_);
					if (is != null) {
						Class28.aClass4_Sub13ArrayArray632[arg1][i_0_] = new RSInterface();
						Class28.aClass4_Sub13ArrayArray632[arg1][i_0_].anInt2172 = (arg1 << -1250456592)
								- -i_0_;
						if ((is[0] ^ 0xffffffff) != 0)
							Class28.aClass4_Sub13ArrayArray632[arg1][i_0_]
									.method283(1, new Buffer(is));
						else
							Class28.aClass4_Sub13ArrayArray632[arg1][i_0_]
									.method287(new Buffer(is), (byte) 80);
					}
				}
			}
			Class72.aBooleanArray1487[arg1] = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("mc.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static boolean method278(int arg0, int arg1, int arg2) {
		try {
			anInt2121++;
			if (arg0 != 75)
				method278(-103, -4, -124);
			if ((0x1 & arg2 >> 1 + arg1) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("mc.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method279(int arg0) {
		try {
			System.out
					.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
			anInt2118++;
			System.exit(arg0);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "mc.B("
					+ arg0 + ')');
		}
	}

	public static void method280(byte arg0) {
		aClass66_2123 = null;
		StringUtilities.aJagexString_2129 = null;
		if (arg0 >= -28)
			anInt2125 = -93;
	}

	public byte[] aByteArray2122;

	public Class10 aClass10_2117;

	public Class19_Sub1 aClass19_Sub1_2120;

	public int anInt2124;
}
