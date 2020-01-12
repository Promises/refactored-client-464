package com.jagex.runescape;

public class Class4_Sub20_Sub7_Sub6 extends Class4_Sub20_Sub7 {
	public static JagexString aJagexString_3430;
	public static JagexString aJagexString_3440;
	public static Class69 aClass69_3439;
	public static int anInt3431 = 0;
	public static int anInt3435;
	public static int anInt3442;
	public static int anInt3443;
	public static int anInt3444;
	public static short[] aShortArray3434;
	static {
		aJagexString_3430 = JagexString.getRs2PreparedString("<col=ff0000>");
		aJagexString_3440 = JagexString.getRs2PreparedString("Null");
		anInt3443 = 0;
		aShortArray3434 = new short[] { 960, 957, -21568, -21571, 22464 };
	}

	public static void method433(int arg0) {
		try {
			if (arg0 != 3052)
				method434(null, false);
			aClass69_3439 = null;
			aJagexString_3440 = null;
			aShortArray3434 = null;
			aJagexString_3430 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ke.A("
					+ arg0 + ')');
		}
	}

	public static void method434(Actor arg0, boolean arg1) {
		try {
			if ((arg0.anInt3245 ^ 0xffffffff) == -1)
				arg0.anInt3217 = 1024;
			int i = 64 * arg0.anInt3244 + 128 * arg0.anInt3279;
			if (arg0.anInt3245 == 1)
				arg0.anInt3217 = 1536;
			int i_0_ = 128 * arg0.anInt3240 - -(64 * arg0.anInt3244);
			int i_1_ = arg0.anInt3224 - Region.anInt134;
			if ((arg0.anInt3245 ^ 0xffffffff) == -3)
				arg0.anInt3217 = 0;
			anInt3444++;
			arg0.anInt3266 = 0;
			arg0.worldX += (i_0_ + -arg0.worldX) / i_1_;
			if (arg1 == false) {
				if ((arg0.anInt3245 ^ 0xffffffff) == -4)
					arg0.anInt3217 = 512;
				arg0.worldY += (-arg0.worldY + i) / i_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ke.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method435(int arg0, boolean arg1) {
		try {
			if (arg0 < 89)
				aJagexString_3440 = null;
			anInt3435++;
			int i = anInt3431;
			if ((Class1.anInt74 == (Class4_Sub15.localPlayer.worldX >> -77714489))
					&& ((Class4_Sub15.localPlayer.worldY >> -1551294617) ^ 0xffffffff) == (Class67.anInt1352 ^ 0xffffffff))
				Class1.anInt74 = 0;
			if (arg1)
				i = 1;
			int i_2_ = 0;
			for (/**/; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
				int i_3_;
				Player player;
				if (!arg1) {
					player = (Class4_Sub20_Sub7_Sub4.aPlayerArray3358[Class4_Sub23.anIntArray2432[i_2_]]);
					i_3_ = Class4_Sub23.anIntArray2432[i_2_] << -946537138;
				} else {
					i_3_ = 33538048;
					player = Class4_Sub15.localPlayer;
				}
				if (player != null
						&& player.method384(-19456)) {
					player.aBoolean3594 = false;
					int i_4_ = player.worldX >> 1802017895;
					if ((Class59.aBoolean1189 && anInt3431 > 50 || (anInt3431 ^ 0xffffffff) < -201)
							&& !arg1
							&& ((player.anInt3265 ^ 0xffffffff) == (player.anInt3257 ^ 0xffffffff)))
						player.aBoolean3594 = true;
					int i_5_ = player.worldY >> 1780117703;
					if (i_4_ >= 0 && (i_4_ ^ 0xffffffff) > -105 && i_5_ >= 0
							&& i_5_ < 104) {
						if ((player.aClass4_Sub20_Sub7_Sub7_3596) != null
								&& (player.anInt3608 ^ 0xffffffff) >= (Region.anInt134 ^ 0xffffffff)
								&& ((Region.anInt134 ^ 0xffffffff) > (player.anInt3601 ^ 0xffffffff))) {
							player.aBoolean3594 = false;
							player.anInt3604 = (Class67
									.getFloorDrawHeight(
											player.worldX,
											player.worldY,
                                            Class82.plane));
							aClass69_3439.method1100(Class82.plane,
									player.worldX,
									player.worldY,
									player.anInt3604, 60,
									player,
									player.anInt3219,
									i_3_,
									player.anInt3611,
									player.anInt3605,
									player.anInt3612,
									player.anInt3591);
						} else {
							if ((0x7f & player.worldX ^ 0xffffffff) == -65
									&& ((0x7f & player.worldY) ^ 0xffffffff) == -65) {
								if (Class43.anInt860 == Class77.anIntArrayArray1592[i_4_][i_5_])
									continue;
								Class77.anIntArrayArray1592[i_4_][i_5_] = Class43.anInt860;
							}
							player.anInt3604 = (Class67
									.getFloorDrawHeight(
											player.worldX,
											player.worldY,
                                            Class82.plane));
							aClass69_3439.method1132(Class82.plane,
									player.worldX,
									player.worldY,
									player.anInt3604, 60,
									player,
									player.anInt3219,
									i_3_,
									player.aBoolean3290);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ke.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub20_Sub17 aClass4_Sub20_Sub17_3428;
	public int anInt3426;
	public int anInt3427;
	public int anInt3429;
	public int anInt3432;
	public int anInt3433;

	public int anInt3436;

	public int anInt3437;

	public int anInt3438;

	public int anInt3441;

	public Class4_Sub20_Sub7_Sub6(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, boolean arg8,
			Class4_Sub20_Sub7 arg9) {
		anInt3426 = arg4;
		anInt3441 = arg5;
		anInt3438 = arg6;
		anInt3432 = arg0;
		anInt3437 = arg2;
		anInt3429 = arg1;
		anInt3433 = arg3;
		if ((arg7 ^ 0xffffffff) != 0) {
			aClass4_Sub20_Sub17_3428 = Class68.method1093(arg7, (byte) -111);
			anInt3427 = Region.anInt134 + -1;
			anInt3436 = 0;
			if ((aClass4_Sub20_Sub17_3428.anInt3191 ^ 0xffffffff) == -1
					&& arg9 != null && arg9 instanceof Class4_Sub20_Sub7_Sub6) {
				Class4_Sub20_Sub7_Sub6 class4_sub20_sub7_sub6 = (Class4_Sub20_Sub7_Sub6) arg9;
				if (class4_sub20_sub7_sub6.aClass4_Sub20_Sub17_3428 == aClass4_Sub20_Sub17_3428) {
					anInt3427 = class4_sub20_sub7_sub6.anInt3427;
					anInt3436 = class4_sub20_sub7_sub6.anInt3436;
					return;
				}
			}
			if (arg8 && (aClass4_Sub20_Sub17_3428.anInt3202 ^ 0xffffffff) != 0) {
				anInt3436 = (int) ((aClass4_Sub20_Sub17_3428.anIntArray3211).length * Math
						.random());
				anInt3427 -= (int) (Math.random() * (aClass4_Sub20_Sub17_3428.anIntArray3200[anInt3436]));
			}
		}
	}

	@Override
	public Class4_Sub20_Sub7_Sub7 method378(boolean arg0) {
		try {
			if (aClass4_Sub20_Sub17_3428 != null) {
				int i = Region.anInt134 - anInt3427;
				if ((i ^ 0xffffffff) < -101
						&& aClass4_Sub20_Sub17_3428.anInt3202 > 0)
					i = 100;
				while (i > aClass4_Sub20_Sub17_3428.anIntArray3200[anInt3436]) {
					i -= aClass4_Sub20_Sub17_3428.anIntArray3200[anInt3436];
					anInt3436++;
					if ((anInt3436 ^ 0xffffffff) <= (aClass4_Sub20_Sub17_3428.anIntArray3211.length ^ 0xffffffff)) {
						anInt3436 -= aClass4_Sub20_Sub17_3428.anInt3202;
						if ((anInt3436 ^ 0xffffffff) > -1
								|| (aClass4_Sub20_Sub17_3428.anIntArray3211.length <= anInt3436)) {
							aClass4_Sub20_Sub17_3428 = null;
							break;
						}
					}
				}
				anInt3427 = -i + Region.anInt134;
			}
			anInt3442++;
			if (arg0 != false)
				anInt3429 = -127;
			Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(!arg0,
					anInt3432);
			if (class4_sub20_sub1.anIntArray2732 != null)
				class4_sub20_sub1 = class4_sub20_sub1.method325(-63);
			if (class4_sub20_sub1 == null)
				return null;
			return class4_sub20_sub1.method334(aClass4_Sub20_Sub17_3428,
					anInt3438, (byte) -77, anInt3436, anInt3426, anInt3433,
					anInt3441, anInt3429, anInt3437);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ke.V("
					+ arg0 + ')');
		}
	}
}
