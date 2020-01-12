package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub20_Sub13 extends Class4_Sub20 {
	public static boolean aBoolean3116 = false;
	public static boolean[] aBooleanArray3124 = { true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, false, false };
	public static Class14 aClass14_3126;
	public static Class27 aClass27_3127;
	public static Class65 aClass65_3106 = new Class65();
	public static int anInt3107;
	public static int anInt3110;
	public static int anInt3111 = 0;
	public static int cameraVelocityVertical = 0;
	public static int anInt3113;
	public static int anInt3115;
	public static int anInt3118;
	public static int anInt3119;
	public static int anInt3121;
	public static int anInt3123;
	public static int anInt3128;
	public static int anInt3129;
	public static int cameraVerticalRotation;
	public static int anInt3132 = 0;
	public static int[] anIntArray3122 = new int[128];
	public static int[] anIntArray3130 = new int[] { 2, 26, 57, 17, 34, 16, 48, 18 };
	public static int[] anIntArray3133 = new int[128];

	public static void method586(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt3128++;
			RSInterface class4_sub13 = Class54.method1012(arg1, -1, arg2);
			if (arg3 > -30)
				anInt3111 = -4;
			if (class4_sub13 != null && class4_sub13.anObjectArray2158 != null) {
				Class4_Sub14 class4_sub14 = new Class4_Sub14();
				class4_sub14.aClass4_Sub13_2282 = class4_sub13;
				class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2158;
				Class16.method721(1, class4_sub14);
			}
			Class4_Sub23.aBoolean2421 = true;
			Class4_Sub20.anInt2357 = arg1;
			Class4_Sub20_Sub11.anInt3088 = arg2;
			Class35.anInt740 = arg0;
			Class67.method1088(class4_sub13);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ne.J("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method587(byte arg0) {
		try {
			if (arg0 != 20)
				aClass14_3126 = null;
			aClass27_3127 = null;
			anIntArray3122 = null;
			aClass14_3126 = null;
			aBooleanArray3124 = null;
			StringUtilities.aJagexString_3108 = null;
			aClass65_3106 = null;
			anIntArray3130 = null;
			StringUtilities.aJagexString_3120 = null;
			anIntArray3133 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ne.I("
					+ arg0 + ')');
		}
	}

	public static int method589(byte arg0, int arg1, RSInterface arg2) {
		try {
			anInt3118++;
			if (arg2.anIntArrayArray2134 == null
					|| arg2.anIntArrayArray2134.length <= arg1)
				return -2;
			try {
				if (arg0 < 41)
					return -86;
				int[] is = arg2.anIntArrayArray2134[arg1];
				int i = 0;
				int i_1_ = 0;
				int i_2_ = 0;
				for (;;) {
					int i_3_ = is[i_2_++];
					int i_4_ = 0;
					int i_5_ = 0;
					if ((i_3_ ^ 0xffffffff) == -1)
						return i;
					if ((i_3_ ^ 0xffffffff) == -2)
						i_5_ = Class76.skillLevel[is[i_2_++]];
					if ((i_3_ ^ 0xffffffff) == -16)
						i_4_ = 1;
					if ((i_3_ ^ 0xffffffff) == -17)
						i_4_ = 2;
					if (i_3_ == 17)
						i_4_ = 3;
					if ((i_3_ ^ 0xffffffff) == -3)
						i_5_ = Class31.skillMaxLevel[is[i_2_++]];
					if (i_3_ == 3)
						i_5_ = Class46.skillExperience[is[i_2_++]];
					if ((i_3_ ^ 0xffffffff) == -5) {
						int i_6_ = is[i_2_++] << 1607309168;
						i_6_ += is[i_2_++];
						RSInterface class4_sub13 = RSInterface.forId(
								i_6_);
						int i_7_ = is[i_2_++];
						if (i_7_ != -1
								&& (!(Class4_Sub23.method633(i_7_, (byte) -106).aBoolean3002) || Class77.aBoolean1590)) {
							for (int i_8_ = 0; i_8_ < class4_sub13.items.length; i_8_++) {
								if (class4_sub13.items[i_8_] == 1 + i_7_)
									i_5_ += class4_sub13.itemAmounts[i_8_];
							}
						}
					}
					if ((i_3_ ^ 0xffffffff) == -6)
						i_5_ = Class31.anIntArray687[is[i_2_++]];
					if ((i_3_ ^ 0xffffffff) == -7)
						i_5_ = (Class34.SKILL_EXPERIENCE[-1
								+ Class31.skillMaxLevel[is[i_2_++]]]);
					if (i_3_ == 7)
						i_5_ = 100 * Class31.anIntArray687[is[i_2_++]] / 46875;
					if ((i_3_ ^ 0xffffffff) == -9)
						i_5_ = (Class4_Sub15.localPlayer.anInt3584);
					if (i_3_ == 9) {
						for (int i_9_ = 0; i_9_ < 25; i_9_++) {
							if (aBooleanArray3124[i_9_])
								i_5_ += Class31.skillMaxLevel[i_9_];
						}
					}
					if (i_3_ == 10) {
						int i_10_ = is[i_2_++] << 2039815920;
						i_10_ += is[i_2_++];
						RSInterface class4_sub13 = RSInterface.forId(
								i_10_);
						int i_11_ = is[i_2_++];
						if ((i_11_ ^ 0xffffffff) != 0
								&& (!(Class4_Sub23
										.method633(i_11_, (byte) -127).aBoolean3002) || Class77.aBoolean1590)) {
							for (int i_12_ = 0; i_12_ < class4_sub13.items.length; i_12_++) {
								if (class4_sub13.items[i_12_] == 1 + i_11_) {
									i_5_ = 999999999;
									break;
								}
							}
						}
					}
					if (i_3_ == 11)
						i_5_ = Actor.runEnergy;
					if ((i_3_ ^ 0xffffffff) == -13)
						i_5_ = Class77.anInt1588;
					if ((i_3_ ^ 0xffffffff) == -14) {
						int i_13_ = Class31.anIntArray687[is[i_2_++]];
						int i_14_ = is[i_2_++];
						i_5_ = (1 << i_14_ & i_13_ ^ 0xffffffff) == -1 ? 0 : 1;
					}
					if ((i_3_ ^ 0xffffffff) == -15) {
						int i_15_ = is[i_2_++];
						i_5_ = Class57.method1028(-1, i_15_);
					}
					if ((i_3_ ^ 0xffffffff) == -19)
						i_5_ = (Class6.anInt217 + ((Class4_Sub15.localPlayer.worldX) >> -686491129));
					if (i_3_ == 19)
						i_5_ = (Class4_Sub20_Sub8.anInt2987 + ((Class4_Sub15.localPlayer.worldY) >> 1473326183));
					if (i_3_ == 20)
						i_5_ = is[i_2_++];
					if (i_4_ == 0) {
						if ((i_1_ ^ 0xffffffff) == -1)
							i += i_5_;
						if (i_1_ == 1)
							i -= i_5_;
						if (i_1_ == 2 && (i_5_ ^ 0xffffffff) != -1)
							i /= i_5_;
						if ((i_1_ ^ 0xffffffff) == -4)
							i *= i_5_;
						i_1_ = 0;
					} else
						i_1_ = i_4_;
				}
			} catch (Exception exception) {
				return -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ne.C("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method592(boolean arg0) {
		try {
			Class4_Sub22 class4_sub22 = (Class4_Sub22) Buffer.aClass65_2073
					.method1071(-122);
			if (arg0 == false) {
				for (/**/; class4_sub22 != null; class4_sub22 = (Class4_Sub22) Buffer.aClass65_2073
						.method1075(18485)) {
					if (class4_sub22.aClass4_Sub20_Sub1_2399 != null)
						class4_sub22.method626(false);
				}
				anInt3121++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ne.B("
					+ arg0 + ')');
		}
	}

	public boolean aBoolean3117;

	public int anInt3125;

	public int[] anIntArray3105 = { -1, -1, -1, -1, -1 };

	public int[] anIntArray3114;

	public short[] aShortArray3104;

	public short[] aShortArray3109;

	public Class4_Sub20_Sub13() {
		aShortArray3104 = new short[6];
		aBoolean3117 = false;
		aShortArray3109 = new short[6];
		anInt3125 = -1;
	}

	public Class4_Sub20_Sub7_Sub2 method583(byte arg0) {
		try {
			anInt3115++;
			if (anIntArray3114 == null)
				return null;
			Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = new Class4_Sub20_Sub7_Sub2[anIntArray3114.length];
			for (int i = 0; (i ^ 0xffffffff) > (anIntArray3114.length ^ 0xffffffff); i++)
				class4_sub20_sub7_sub2s[i] = Class4_Sub20_Sub7_Sub2.method399(
						Class62.aClass19_1240, anIntArray3114[i], 0);
			if (arg0 < 53)
				method586(33, -6, 64, 23);
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2;
			if ((class4_sub20_sub7_sub2s.length ^ 0xffffffff) != -2)
				class4_sub20_sub7_sub2 = (new Class4_Sub20_Sub7_Sub2(
						class4_sub20_sub7_sub2s, class4_sub20_sub7_sub2s.length));
			else
				class4_sub20_sub7_sub2 = class4_sub20_sub7_sub2s[0];
			for (int i = 0; i < 6; i++) {
				if (aShortArray3104[i] == 0)
					break;
				class4_sub20_sub7_sub2.method416(aShortArray3104[i],
						aShortArray3109[i]);
			}
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ne.H("
					+ arg0 + ')');
		}
	}

	public boolean method584(int arg0) {
		try {
			anInt3110++;
			boolean bool = true;
			for (int i = 0; i < 5; i++) {
				if ((anIntArray3105[i] ^ 0xffffffff) != 0
						&& !Class62.aClass19_1240.method739((byte) -4,
								anIntArray3105[i], 0))
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ne.A("
					+ arg0 + ')');
		}
	}

	public void method585(int arg0, int arg1, Buffer arg2) {
		anInt3123++;
		if ((arg1 ^ 0xffffffff) == -2)
			anInt3125 = arg2.get();
		else if (arg1 != 2) {
			if ((arg1 ^ 0xffffffff) != -4) {
				if (arg1 < 40 || (arg1 ^ 0xffffffff) <= -51) {
					if (arg1 < 50 || (arg1 ^ 0xffffffff) <= -61) {
						if (arg1 >= 60 && arg1 < 70)
							anIntArray3105[arg1 - 60] = arg2
									.readShort();
					} else
						aShortArray3109[-50 + arg1] = (short) arg2
								.readShort();
				} else
					aShortArray3104[arg1 + -40] = (short) arg2
							.readShort();
			} else
				aBoolean3117 = true;
		} else {
			int i = arg2.get();
			anIntArray3114 = new int[i];
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (i ^ 0xffffffff); i_0_++)
				anIntArray3114[i_0_] = arg2.readShort();
		}
		if (arg0 != 34)
			method592(true);
	}

	public boolean method588(int arg0) {
		try {
			anInt3129++;
			if (anIntArray3114 == null)
				return true;
			if (arg0 != 23232)
				aBoolean3117 = true;
			boolean bool = true;
			for (int i = 0; i < anIntArray3114.length; i++) {
				if (!Class62.aClass19_1240.method739((byte) -4,
						anIntArray3114[i], 0))
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ne.F("
					+ arg0 + ')');
		}
	}

	public void method590(Buffer arg0, int arg1) {
		for (;;) {
			int i = arg0.get();
			if (i == 0)
				break;
			method585(34, i, arg0);
		}
		anInt3113++;
		if (arg1 != 0)
			aClass65_3106 = null;
	}

	public Class4_Sub20_Sub7_Sub2 method591(int arg0) {
		try {
			Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = new Class4_Sub20_Sub7_Sub2[5];
			anInt3107++;
			int i = 0;
			if (arg0 != -1)
				return null;
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -6; i_16_++) {
				if ((anIntArray3105[i_16_] ^ 0xffffffff) != 0)
					class4_sub20_sub7_sub2s[i++] = Class4_Sub20_Sub7_Sub2
							.method399((Class62.aClass19_1240),
									(anIntArray3105[i_16_]), 0);
			}
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
					class4_sub20_sub7_sub2s, i);
			for (int i_17_ = 0; i_17_ < 6; i_17_++) {
				if (aShortArray3104[i_17_] == 0)
					break;
				class4_sub20_sub7_sub2.method416(aShortArray3104[i_17_],
						aShortArray3109[i_17_]);
			}
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ne.D("
					+ arg0 + ')');
		}
	}
}
