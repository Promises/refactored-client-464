package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub6 extends RSFont {
	public static boolean aBoolean1922;
	public static Class19 aClass19_1930;
	public static JagexString aJagexString_1917;
	public static JagexString aJagexString_1928;
	public static JagexString localizedTake;
	public static JagexString aJagexString_1934;
	public static JagexString aJagexString_1938;
	public static JagexString aJagexString_1939;
	public static JagexString aJagexString_1942;
	public static JagexString aJagexString_1943;
	public static int anInt1918;
	public static int anInt1919;
	public static int anInt1923;
	public static int anInt1924;
	public static int anInt1931;
	public static int anInt1932;
	public static int anInt1935;
	public static int anInt1936;
	public static int cameraHorizontalRotation;
	public static int[] anIntArray1915 = new int[50];
	public static int[] anIntArray1921 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
			11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
			28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
			45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61,
			62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95,
			97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119,
			120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145,
			146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169,
			174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188,
			189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201,
			202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214,
			215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227,
			228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240,
			241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70,
			71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100,
			101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127,
			128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149,
			150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172,
			173, 178, 255, 179 };
	static {
		aJagexString_1917 = JagexString.getRs2PreparedString("swe");
		aBoolean1922 = false;
		anInt1932 = -1;
		anInt1918 = 99;
		aJagexString_1939 = JagexString.getRs2PreparedString("Take");
		aJagexString_1934 = JagexString.getRs2PreparedString("Connection timed out)3"
        );
		localizedTake = aJagexString_1939;
		aJagexString_1928 = JagexString.getRs2PreparedString("Spieler");
		aJagexString_1942 = aJagexString_1934;
		aJagexString_1938 = JagexString.getRs2PreparedString(
				"Ung-Ultiges Anmelde)2Paket)3");
		aJagexString_1943 = (JagexString
				.getRs2PreparedString(
						"Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3"
                ));
	}

	public static int method180(int arg0) {
		try {
			anInt1923++;
			int i = 3;
			if ((Class4_Sub20_Sub13.cameraVerticalRotation ^ 0xffffffff) > -311) {
				int i_0_ = Class6.cameraX >> -647756409;
				int i_1_ = Class33.cameraY >> -1345087897;
				if (((Class46.currentSceneTileFlags[Class82.plane][i_0_][i_1_]) & 0x4 ^ 0xffffffff) != -1)
					i = Class82.plane;
				int i_2_ = (Class4_Sub15.localPlayer.worldY >> 173765767);
				int i_3_ = (Class4_Sub15.localPlayer.worldX >> -1374667641);
				int i_4_;
				if (i_0_ >= i_3_)
					i_4_ = i_0_ - i_3_;
				else
					i_4_ = -i_0_ + i_3_;
				int i_5_;
				if (i_2_ <= i_1_)
					i_5_ = -i_2_ + i_1_;
				else
					i_5_ = -i_1_ + i_2_;
				if ((i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
					int i_6_ = i_5_ * 65536 / i_4_;
					int i_7_ = 32768;
					while (i_3_ != i_0_) {
						if ((i_3_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)) {
							if ((i_3_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
								i_0_--;
						} else
							i_0_++;
						i_7_ += i_6_;
						if ((0x4 & (Class46.currentSceneTileFlags[Class82.plane][i_0_][i_1_]) ^ 0xffffffff) != -1)
							i = Class82.plane;
						if (i_7_ >= 65536) {
							i_7_ -= 65536;
							if (i_1_ < i_2_)
								i_1_++;
							else if ((i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
								i_1_--;
							if ((0x4 & (Class46.currentSceneTileFlags[Class82.plane][i_0_][i_1_])) != 0)
								i = Class82.plane;
						}
					}
				} else {
					int i_8_ = 32768;
					int i_9_ = 65536 * i_4_ / i_5_;
					while (i_1_ != i_2_) {
						i_8_ += i_9_;
						if ((i_2_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)) {
							if ((i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
								i_1_--;
						} else
							i_1_++;
						if ((0x4 & (Class46.currentSceneTileFlags[Class82.plane][i_0_][i_1_]) ^ 0xffffffff) != -1)
							i = Class82.plane;
						if (i_8_ >= 65536) {
							if (i_3_ <= i_0_) {
								if ((i_3_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
									i_0_--;
							} else
								i_0_++;
							if (((Class46.currentSceneTileFlags[Class82.plane][i_0_][i_1_]) & 0x4) != 0)
								i = Class82.plane;
							i_8_ -= 65536;
						}
					}
				}
			}
			if (arg0 != 0)
				return -79;
			if (((Class46.currentSceneTileFlags[Class82.plane][(Class4_Sub15.localPlayer.worldX >> 1844525383)][(Class4_Sub15.localPlayer.worldY >> 1104867239)]) & 0x4 ^ 0xffffffff) != -1)
				i = Class82.plane;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "fc.F("
					+ arg0 + ')');
		}
	}

	public static void method181(byte arg0) {
		try {
			if (arg0 <= -75) {
				anIntArray1921 = null;
				aJagexString_1943 = null;
				aJagexString_1928 = null;
				aJagexString_1934 = null;
				aJagexString_1938 = null;
				aJagexString_1942 = null;
				anIntArray1915 = null;
				aClass19_1930 = null;
				aJagexString_1939 = null;
				localizedTake = null;
				aJagexString_1917 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "fc.C("
					+ arg0 + ')');
		}
	}

	public static void method182(int arg0, int arg1, byte[] arg2, Class10 arg3) {
		try {
			if (arg0 != 1778)
				aClass19_1930 = null;
			anInt1931++;
			Class4_Sub12 class4_sub12 = new Class4_Sub12();
			class4_sub12.anInt2124 = 0;
			class4_sub12.aByteArray2122 = arg2;
			class4_sub12.aClass10_2117 = arg3;
			class4_sub12.aLong150 = arg1;
			synchronized (Class37.aClass65_766) {
				Class37.aClass65_766.method1068(class4_sub12, (byte) -127);
			}
			Class64.method1063((byte) 121);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("fc.G("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static int method183(int arg0, int arg1, int arg2) {
		try {
			anInt1919++;
			if (arg1 != 128)
				aBoolean1922 = false;
			Class4_Sub1 class4_sub1 = ((Class4_Sub1) Class31.aClass16_671
					.method725((byte) 117, arg0));
			if (class4_sub1 == null)
				return 0;
			if (arg2 < 0 || class4_sub1.anIntArray1858.length <= arg2)
				return 0;
			return class4_sub1.anIntArray1858[arg2];
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("fc.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static Class4_Sub20_Sub9 method184(int arg0, byte arg1) {
		try {
			anInt1935++;
			Class4_Sub20_Sub9 class4_sub20_sub9 = ((Class4_Sub20_Sub9) Class66.aClass66_1330
					.method1083(arg0, true));
			if (class4_sub20_sub9 != null)
				return class4_sub20_sub9;
			byte[] is = Class1.aClass19_67.method746(4, (byte) 89, arg0);
			class4_sub20_sub9 = new Class4_Sub20_Sub9();
			if (arg1 != -112)
				aJagexString_1917 = null;
			if (is != null)
				class4_sub20_sub9.method476(arg0, new Buffer(is), 255);
			class4_sub20_sub9.method480(arg1 ^ ~0x6f);
			Class66.aClass66_1330.method1082(true, arg0, class4_sub20_sub9);
			return class4_sub20_sub9;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("fc.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static int method185(int arg0, int arg1, byte arg2, int arg3) {
		try {
			anInt1936++;
			if (arg2 != -70)
				method181((byte) -101);
			arg1 &= 0x3;
			if (arg1 == 0)
				return arg0;
			if ((arg1 ^ 0xffffffff) == -2)
				return -arg3 + 7;
			if ((arg1 ^ 0xffffffff) == -3)
				return 7 - arg0;
			return arg3;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("fc.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method186(long arg0, int arg1) {
		do {
			try {
				try {
					Thread.sleep(arg0);
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
				anInt1924++;
				if (arg1 == 135)
					break;
				cameraHorizontalRotation = -123;
			} catch (RuntimeException runtimeexception) {
				throw JagexException.create(runtimeexception,
						("fc.E(" + arg0 + ',' + arg1 + ')'));
			}
			break;
		} while (false);
	}

	public byte[][][] aByteArrayArrayArray1925;

	public Class22[] aClass22Array1927;

	public Class22[] aClass22Array1940;

	public int anInt1916;

	public int anInt1937;

	public int[] anIntArray1920;

	public int[] anIntArray1926;

	public int[] anIntArray1929;
}
