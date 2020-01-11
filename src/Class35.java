/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class35 {
	public static boolean aBoolean744;
	public static JagexString aJagexString_724;
	public static JagexString aJagexString_728;
	public static JagexString aJagexString_733;
	public static JagexString aJagexString_735 = JagexString.getRs2PreparedString("null"
    );
	public static JagexString aJagexString_741 = (JagexString.getRs2PreparedString(
			"Zu viele Anmelde)2Versuche von Ihrer Adresse"));
	public static JagexString aJagexString_753;
	public static Class4_Sub20_Sub12_Sub2[] aClass4_Sub20_Sub12_Sub2Array749;
	public static int anInt723;
	public static int anInt727;
	public static int anInt729;
	public static int anInt730;
	public static int anInt731;
	public static int anInt734;
	public static int anInt736;
	public static int anInt737;
	public static int anInt738;
	public static int anInt740;
	public static int anInt742;
	public static int anInt743;
	public static int anInt745;
	public static int anInt746;
	public static int anInt747;
	public static int anInt752;
	public static int anInt754;
	public static int[] anIntArray726;
	static {
		aJagexString_733 = JagexString.getRs2PreparedString(
				"Sorry invited players only)3");
		aJagexString_724 = (JagexString.getRs2PreparedString(
				"You are standing in a members)2only area)3"));
		aJagexString_728 = aJagexString_724;
		aJagexString_753 = aJagexString_733;
	}

	public static void method900(int arg0, int arg1, int arg2, int arg3) {
		anInt738++;
		if (arg3 != 12644)
			aJagexString_735 = null;
		if ((Class18.anInt476 ^ 0xffffffff) != -1 && (arg2 ^ 0xffffffff) != -1
				&& Class5.anInt175 < 50) {
			Class4_Sub6.anIntArray1915[Class5.anInt175] = arg1;
			Class12.anIntArray342[Class5.anInt175] = arg2;
			Class25.anIntArray593[Class5.anInt175] = arg0;
			Class48.aClass36Array974[Class5.anInt175] = null;
			Class1.anIntArray78[Class5.anInt175] = 0;
			Class5.anInt175++;
		}
	}

	public static boolean method902(RSInterface arg0, int arg1) {
		try {
			anInt736++;
			if (arg1 != 2)
				method909(125);
			if (arg0.anIntArray2144 == null)
				return false;
			for (int i = 0; (arg0.anIntArray2144.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				int i_1_ = Class4_Sub20_Sub13.method589((byte) 81, i, arg0);
				int i_2_ = arg0.anIntArray2166[i];
				if (arg0.anIntArray2144[i] != 2) {
					if (arg0.anIntArray2144[i] == 3) {
						if ((i_1_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))
							return false;
					} else if ((arg0.anIntArray2144[i] ^ 0xffffffff) == -5) {
						if (i_2_ == i_1_)
							return false;
					} else if (i_2_ != i_1_)
						return false;
				} else if ((i_1_ ^ 0xffffffff) <= (i_2_ ^ 0xffffffff))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jf.F("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method907(int arg0) {
		try {
			aJagexString_741 = null;
			aJagexString_733 = null;
			aJagexString_724 = null;
			anIntArray726 = null;
			if (arg0 != -3)
				anIntArray726 = null;
			aClass4_Sub20_Sub12_Sub2Array749 = null;
			aJagexString_753 = null;
			aJagexString_735 = null;
			aJagexString_728 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jf.E("
					+ arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub12_Sub2[] method909(int arg0) {
		try {
			Class4_Sub20_Sub12_Sub2[] class4_sub20_sub12_sub2s = new Class4_Sub20_Sub12_Sub2[Class49.anInt991];
			anInt754++;
			for (int i = 0; (Class49.anInt991 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2 = (class4_sub20_sub12_sub2s[i] = new Class4_Sub20_Sub12_Sub2());
				class4_sub20_sub12_sub2.anInt3519 = Class53.anInt1080;
				class4_sub20_sub12_sub2.anInt3517 = Class32.anInt696;
				class4_sub20_sub12_sub2.anInt3518 = anIntArray726[i];
				class4_sub20_sub12_sub2.anInt3521 = Class4_Sub20_Sub7_Sub5.anIntArray3395[i];
				class4_sub20_sub12_sub2.anInt3520 = Class30.anIntArray650[i];
				class4_sub20_sub12_sub2.anInt3516 = Class13_Sub2.anIntArray2480[i];
				int i_13_ = (class4_sub20_sub12_sub2.anInt3516 * class4_sub20_sub12_sub2.anInt3520);
				byte[] is = Class4_Sub23.aByteArrayArray2426[i];
				class4_sub20_sub12_sub2.anIntArray3515 = new int[i_13_];
				for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_14_++)
					class4_sub20_sub12_sub2.anIntArray3515[i_14_] = (Class67.anIntArray1367[Class59
							.method1035(255, is[i_14_])]);
			}
			Class43.method953(true);
			if (arg0 != 255)
				return null;
			return class4_sub20_sub12_sub2s;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jf.I("
					+ arg0 + ')');
		}
	}

	public static void method911(int arg0, int arg1) {
		try {
			if (arg0 != 23245)
				aJagexString_724 = null;
			if (StreamBuffer.anInt2085 == 0)
				Class1.aClass4_Sub2_Sub1_64.method112(arg1, 98);
			else
				Class4_Sub20_Sub9.anInt3050 = arg1;
			anInt742++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jf.G("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static JagexString method912(byte arg0, int arg1) {
		try {
			anInt745++;
			if (arg0 < 55)
				return null;
			JagexString jagexString = Class74.method1168(-52, arg1);
			for (int i = -3 + jagexString.method825(-105); i > 0; i -= 3)
				jagexString = Class4_Sub24.method639(
						(new JagexString[] { jagexString.method829((byte) 121, 0, i),
								(Class4_Sub20_Sub7_Sub5.aJagexString_3404),
								jagexString.method805(i, -123) }), -842);
			if ((jagexString.method825(-114) ^ 0xffffffff) < -10)
				return (Class4_Sub24.method639(
						(new JagexString[] {
								Class4_Sub11_Sub1.aJagexString_2693,
								jagexString.method829((byte) 6, 0,
										-8 + jagexString.method825(-111)),
								Class31.aJagexString_679,
								Class4_Sub7.aJagexString_1957, jagexString,
								Class7.aJagexString_232}), -842));
			if ((jagexString.method825(-126) ^ 0xffffffff) < -7)
				return (Class4_Sub24.method639(
						(new JagexString[] {
								Class41.aJagexString_838,
								jagexString.method829((byte) 17, 0,
										jagexString.method825(-110) + -4),
								Class73.aJagexString_1507,
								Class4_Sub7.aJagexString_1957, jagexString,
								Class7.aJagexString_232}), -842));
			return Class4_Sub24
					.method639((new JagexString[] { Class45.aJagexString_922, jagexString,
							Class8.aJagexString_240}), -842);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jf.N("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean aBoolean725;

	public long aLong732;

	public long aLong748;

	public int anInt739;

	public int[] anIntArray750;

	public int[] anIntArray751;

	public int method898(int arg0) {
		try {
			anInt737++;
			if (arg0 != -256)
				aJagexString_735 = null;
			if (anInt739 != -1)
				return Class71.method1155(-68, anInt739).anInt2820 + 305419896;
			return (anIntArray751[1] + ((anIntArray751[0] << -1453261649) + ((anIntArray750[4] << 1838644244)
					+ ((anIntArray750[0] << -1760859751) - -(anIntArray751[8] << -613566870)) - -(anIntArray751[11] << -365586267))));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jf.C("
					+ arg0 + ')');
		}
	}

	public void method899(boolean arg0, int arg1, int arg2) {
		anInt743++;
		if ((arg2 ^ 0xffffffff) != -2 || !aBoolean725) {
			int i = anIntArray751[Class67.anIntArray1340[arg2]];
			if (i != 0) {
				i -= 256;
				Class4_Sub20_Sub13 class4_sub20_sub13;
				do {
					if (!arg0) {
						if ((--i ^ 0xffffffff) > -1)
							i = -1 + Class66.anInt1313;
					} else if (++i >= Class66.anInt1313)
						i = 0;
					class4_sub20_sub13 = Class33.method889((byte) 121, i);
				} while (class4_sub20_sub13 == null
						|| class4_sub20_sub13.aBoolean3117
						|| ((aBoolean725 ? 7 : 0) + arg2 != class4_sub20_sub13.anInt3125));
				anIntArray751[Class67.anIntArray1340[arg2]] = 256 + i;
				method910((byte) 11);
				if (arg1 != 7872)
					method910((byte) -1);
			}
		}
	}

	public void method901(int[] arg0, int[] arg1, int arg2, byte arg3,
			boolean arg4) {
		try {
			anInt734++;
			if (arg1 == null) {
				arg1 = new int[12];
				for (int i = 0; (i ^ 0xffffffff) > -8; i++) {
					for (int i_0_ = 0; ((Class66.anInt1313 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
						Class4_Sub20_Sub13 class4_sub20_sub13 = Class33
								.method889((byte) -85, i_0_);
						if (class4_sub20_sub13 != null
								&& !class4_sub20_sub13.aBoolean3117
								&& ((class4_sub20_sub13.anInt3125 ^ 0xffffffff) == (i
										+ (!arg4 ? 0 : 7) ^ 0xffffffff))) {
							arg1[Class67.anIntArray1340[i]] = 256 + i_0_;
							break;
						}
					}
				}
			}
			anInt739 = arg2;
			anIntArray750 = arg0;
			aBoolean725 = arg4;
			if (arg3 != -79)
				aJagexString_724 = null;
			anIntArray751 = arg1;
			method910((byte) 11);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jf.H("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ arg3 + ',' + arg4 + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub2 method903(int arg0) {
		try {
			anInt746++;
			if ((anInt739 ^ 0xffffffff) != arg0)
				return Class71.method1155(-59, anInt739).method353(0);
			boolean bool = false;
			for (int i = 0; i < 12; i++) {
				int i_3_ = anIntArray751[i];
				if ((i_3_ ^ 0xffffffff) <= -257
						&& (i_3_ ^ 0xffffffff) > -513
						&& !Class33.method889((byte) 89, i_3_ - 256).method584(
								127))
					bool = true;
				if (i_3_ >= 512
						&& !Class4_Sub23.method633(-512 + i_3_, (byte) -122)
								.method459((byte) -73, aBoolean725))
					bool = true;
			}
			if (bool)
				return null;
			Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = new Class4_Sub20_Sub7_Sub2[12];
			int i = 0;
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -13; i_4_++) {
				int i_5_ = anIntArray751[i_4_];
				if ((i_5_ ^ 0xffffffff) <= -257 && (i_5_ ^ 0xffffffff) > -513) {
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class33
							.method889((byte) -117, i_5_ - 256).method591(-1);
					if (class4_sub20_sub7_sub2 != null)
						class4_sub20_sub7_sub2s[i++] = class4_sub20_sub7_sub2;
				}
				if (i_5_ >= 512) {
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub23
							.method633(-512 + i_5_, (byte) -126).method468(
									aBoolean725, arg0);
					if (class4_sub20_sub7_sub2 != null)
						class4_sub20_sub7_sub2s[i++] = class4_sub20_sub7_sub2;
				}
			}
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
					class4_sub20_sub7_sub2s, i);
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -6; i_6_++) {
				if ((anIntArray750[i_6_] ^ 0xffffffff) > (Class13_Sub2.aShortArrayArray2476[i_6_].length ^ 0xffffffff))
					class4_sub20_sub7_sub2
							.method416(
									(Class16.aShortArray448[i_6_]),
									(Class13_Sub2.aShortArrayArray2476[i_6_][anIntArray750[i_6_]]));
				if ((Class4_Sub14.aShortArrayArray2284[i_6_].length ^ 0xffffffff) < (anIntArray750[i_6_] ^ 0xffffffff))
					class4_sub20_sub7_sub2
							.method416(
									(Class5.aShortArray177[i_6_]),
									(Class4_Sub14.aShortArrayArray2284[i_6_][anIntArray750[i_6_]]));
			}
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jf.J("
					+ arg0 + ')');
		}
	}

	public Class4_Sub20_Sub7_Sub7 method904(int arg0, Class4_Sub20_Sub17 arg1,
			int arg2, int arg3, Class4_Sub20_Sub17 arg4) {
		try {
			anInt729++;
			if ((anInt739 ^ 0xffffffff) != 0)
				return Class71.method1155(-69, anInt739).method347(
						arg3 ^ 0x352, arg1, arg4, arg0, arg2);
			int[] is = anIntArray751;
			long l = aLong748;
			if (arg3 != 850)
				anIntArray750 = null;
			if (arg1 != null
					&& (arg1.anInt3196 >= 0 || (arg1.anInt3201 ^ 0xffffffff) <= -1)) {
				is = new int[12];
				for (int i = 0; i < 12; i++)
					is[i] = anIntArray751[i];
				if (arg1.anInt3196 >= 0) {
					l += (arg1.anInt3196 - anIntArray751[5] << -1612643448);
					is[5] = arg1.anInt3196;
				}
				if ((arg1.anInt3201 ^ 0xffffffff) <= -1) {
					l += (arg1.anInt3201 - anIntArray751[3] << -291331472);
					is[3] = arg1.anInt3201;
				}
			}
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) Class4_Sub3.aClass66_1902
					.method1083(l, true));
			if (class4_sub20_sub7_sub7 == null) {
				boolean bool = false;
				for (int i = 0; i < 12; i++) {
					int i_7_ = is[i];
					if ((i_7_ ^ 0xffffffff) <= -257
							&& (i_7_ ^ 0xffffffff) > -513
							&& !Class33.method889((byte) -125, i_7_ + -256)
									.method588(23232))
						bool = true;
					if ((i_7_ ^ 0xffffffff) <= -513
							&& !Class4_Sub23
									.method633(-512 + i_7_, (byte) -110)
									.method460(-1, aBoolean725))
						bool = true;
				}
				if (bool) {
					if (aLong732 != -1L)
						class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) Class4_Sub3.aClass66_1902
								.method1083(aLong732, true));
					if (class4_sub20_sub7_sub7 == null)
						return null;
				}
				if (class4_sub20_sub7_sub7 == null) {
					Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = new Class4_Sub20_Sub7_Sub2[12];
					int i = 0;
					for (int i_8_ = 0; i_8_ < 12; i_8_++) {
						int i_9_ = is[i_8_];
						if (i_9_ >= 256 && (i_9_ ^ 0xffffffff) > -513) {
							Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class33
									.method889((byte) -61, i_9_ + -256)
									.method583((byte) 104);
							if (class4_sub20_sub7_sub2 != null)
								class4_sub20_sub7_sub2s[i++] = class4_sub20_sub7_sub2;
						}
						if ((i_9_ ^ 0xffffffff) <= -513) {
							Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub23
									.method633(-512 + i_9_, (byte) -107)
									.method473(aBoolean725, -25);
							if (class4_sub20_sub7_sub2 != null)
								class4_sub20_sub7_sub2s[i++] = class4_sub20_sub7_sub2;
						}
					}
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
							class4_sub20_sub7_sub2s, i);
					for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -6; i_10_++) {
						if (anIntArray750[i_10_] < Class13_Sub2.aShortArrayArray2476[i_10_].length)
							class4_sub20_sub7_sub2
									.method416(
											Class16.aShortArray448[i_10_],
											(Class13_Sub2.aShortArrayArray2476[i_10_][anIntArray750[i_10_]]));
						if ((anIntArray750[i_10_] ^ 0xffffffff) > (Class4_Sub14.aShortArrayArray2284[i_10_].length ^ 0xffffffff))
							class4_sub20_sub7_sub2
									.method416(
											Class5.aShortArray177[i_10_],
											(Class4_Sub14.aShortArrayArray2284[i_10_][anIntArray750[i_10_]]));
					}
					class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
							64, 850, -30, -50, -30);
					Class4_Sub3.aClass66_1902.method1082(true, l,
							class4_sub20_sub7_sub7);
					aLong732 = l;
				}
			}
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7_11_;
			if (arg1 != null || arg4 != null) {
				if (arg1 == null || arg4 == null) {
					if (arg1 == null)
						class4_sub20_sub7_sub7_11_ = arg4.method612(
								(byte) -102, arg0, class4_sub20_sub7_sub7);
					else
						class4_sub20_sub7_sub7_11_ = arg1.method612((byte) 58,
								arg2, class4_sub20_sub7_sub7);
				} else
					class4_sub20_sub7_sub7_11_ = arg1.method614(
							class4_sub20_sub7_sub7, arg0, arg4, arg2,
							arg3 ^ 0x5d5b);
			} else
				return class4_sub20_sub7_sub7;
			return class4_sub20_sub7_sub7_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jf.B("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ',' + arg3 + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method905(boolean arg0, byte arg1) {
		try {
			if (arg1 >= 61) {
				anInt752++;
				if (arg0 != aBoolean725)
					method901(anIntArray750, null, -1, (byte) -79, arg0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jf.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method906(boolean arg0, int arg1, int arg2) {
		try {
			anInt723++;
			int i = anIntArray750[arg1];
			if (!arg0) {
				if (--i < 0)
					i = -1 + Class13_Sub2.aShortArrayArray2476[arg1].length;
			} else if ((++i ^ 0xffffffff) <= (Class13_Sub2.aShortArrayArray2476[arg1].length ^ 0xffffffff))
				i = 0;
			if (arg2 <= 55)
				anInt730 = 37;
			anIntArray750[arg1] = i;
			method910((byte) 11);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jf.M("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public void method908(StreamBuffer arg0, int arg1) {
		try {
			arg0.method227((byte) -27, aBoolean725 ? 1 : 0);
			anInt731++;
			for (int i = 0; (i ^ 0xffffffff) > -8; i++) {
				int i_12_ = anIntArray751[Class67.anIntArray1340[i]];
				if ((i_12_ ^ 0xffffffff) != -1)
					arg0.method227((byte) -27, i_12_ - 256);
				else
					arg0.method227((byte) -27, -1);
			}
			if (arg1 > -45)
				method912((byte) 99, -75);
			for (int i = 0; i < 5; i++)
				arg0.method227((byte) -27, anIntArray750[i]);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jf.O("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public void method910(byte arg0) {
		anInt747++;
		long l = aLong748;
		if (arg0 == 11) {
			int i = anIntArray751[5];
			aLong748 = 0L;
			int i_15_ = anIntArray751[9];
			anIntArray751[9] = i;
			anIntArray751[5] = i_15_;
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -13; i_16_++) {
				aLong748 <<= 4;
				if (anIntArray751[i_16_] >= 256)
					aLong748 += (anIntArray751[i_16_] - 256);
			}
			if (anIntArray751[0] >= 256)
				aLong748 += (anIntArray751[0] - 256 >> 674122180);
			if (anIntArray751[1] >= 256)
				aLong748 += (anIntArray751[1] + -256 >> 1107704872);
			for (int i_17_ = 0; i_17_ < 5; i_17_++) {
				aLong748 <<= 3;
				aLong748 += anIntArray750[i_17_];
			}
			anIntArray751[9] = i_15_;
			anIntArray751[5] = i;
			aLong748 <<= 1;
			Class35 class35 = this;
			class35.aLong748 = class35.aLong748 + (!aBoolean725 ? 0 : 1);
			if ((l ^ 0xffffffffffffffffL) != -1L
					&& (l ^ 0xffffffffffffffffL) != (aLong748 ^ 0xffffffffffffffffL))
				Class4_Sub3.aClass66_1902.method1081(-68, l);
		}
	}
}
