package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class4_Sub23 extends RSFont {
	public static boolean aBoolean2419;
	public static boolean aBoolean2421;
	public static byte[][] aByteArrayArray2426;
	public static JagexString aJagexString_2417 = JagexString.getRs2PreparedString(
			"Suche nach Updates )2 ");
	public static JagexString aJagexString_2423;
	public static JagexString aJagexString_2429;
	public static JagexString aJagexString_2433;
	public static int anInt2412 = 0;
	public static int anInt2413;
	public static int anInt2414;
	public static int anInt2415;
	public static int anInt2418;
	public static int anInt2422;
	public static int anInt2425;
	public static int[] anIntArray2411;
	public static int[] anIntArray2432;
	public static int[][][] intGroundArray;
	static {
		anInt2415 = 0;
		aBoolean2419 = false;
		aJagexString_2423 = JagexString.getRs2PreparedString(
				"Lade Eingabe)2Steuerungsprogramm)3)3)3");
		aJagexString_2429 = JagexString
				.getRs2PreparedString("Loaded update list");
		aBoolean2421 = false;
		anIntArray2432 = new int[2048];
		aJagexString_2433 = aJagexString_2429;
		intGroundArray = new int[4][105][105];
	}

	public static Class4_Sub20_Sub8 method633(int arg0, byte arg1) {
		try {
			anInt2414++;
			Class4_Sub20_Sub8 class4_sub20_sub8 = ((Class4_Sub20_Sub8) Class14.aClass66_408
					.method1083(arg0, true));
			if (arg1 >= -103)
				anInt2415 = -49;
			if (class4_sub20_sub8 != null)
				return class4_sub20_sub8;
			byte[] is = Class4_Sub17.aClass19_2323.method746(10, (byte) 110,
					arg0);
			class4_sub20_sub8 = new Class4_Sub20_Sub8();
			class4_sub20_sub8.anInt2954 = arg0;
			if (is != null)
				class4_sub20_sub8.method466(122, new StreamBuffer(is));
			class4_sub20_sub8.method463(4065);
			if (class4_sub20_sub8.anInt2986 != -1)
				class4_sub20_sub8.method472(99,
						method633(class4_sub20_sub8.anInt2977, (byte) -107),
						method633(class4_sub20_sub8.anInt2986, (byte) -124));
			if (!Class35.aBoolean744 && class4_sub20_sub8.aBoolean3002) {
				class4_sub20_sub8.anInt3000 = 0;
				class4_sub20_sub8.aJagexStringArray2988 = null;
				class4_sub20_sub8.aJagexString_2991 = Class4_Sub20_Sub11.aJagexString_3096;
				class4_sub20_sub8.aJagexStringArray3008 = null;
			}
			Class14.aClass66_408.method1082(true, arg0, class4_sub20_sub8);
			return class4_sub20_sub8;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ub.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method635(boolean arg0) {
		try {
			anIntArray2411 = null;
			anIntArray2432 = null;
			aByteArrayArray2426 = null;
			aJagexString_2423 = null;
			aJagexString_2417 = null;
			aJagexString_2429 = null;
			intGroundArray = null;
			if (arg0 != false)
				method635(true);
			aJagexString_2433 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ub.C("
					+ arg0 + ')');
		}
	}

	public static void method636(int arg0) {
		try {
			anInt2422++;
			if (arg0 != 0)
				method633(31, (byte) 65);
			for (;;) {
				Class4_Sub12 class4_sub12;
				synchronized (Class37.aClass65_766) {
					class4_sub12 = (Class4_Sub12) Class13.aClass65_383
							.method1072(-2);
				}
				if (class4_sub12 == null)
					break;
				class4_sub12.aClass19_Sub1_2120.method762(
						class4_sub12.aClass10_2117,
						(int) class4_sub12.aLong150,
						class4_sub12.aByteArray2122, false, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ub.E("
					+ arg0 + ')');
		}
	}

	public byte[] aByteArray2410;
	public byte[] aByteArray2420;
	public byte[] aByteArray2424;
	public Class4_Sub4_Sub1[] aClass4_Sub4_Sub1Array2434;

	public Class57[] aClass57Array2427;

	public int anInt2431;

	public int[] anIntArray2428;

	public short[] aShortArray2430;

	public Class4_Sub23() {
		/* empty */
	}

	public Class4_Sub23(byte[] arg0) {
		try {
			aClass57Array2427 = new Class57[128];
			aByteArray2424 = new byte[128];
			anIntArray2428 = new int[128];
			aShortArray2430 = new short[128];
			aByteArray2410 = new byte[128];
			aClass4_Sub4_Sub1Array2434 = new Class4_Sub4_Sub1[128];
			int i = 0;
			aByteArray2420 = new byte[128];
			StreamBuffer class4_sub11;
			for (class4_sub11 = new StreamBuffer(arg0); class4_sub11.byteBuffer[class4_sub11.pointion
					+ i] != 0; i++) {
				/* empty */
			}
			byte[] is = new byte[i];
			for (int i_2_ = 0; i_2_ < i; i_2_++)
				is[i_2_] = class4_sub11.method229(-118);
			class4_sub11.pointion++;
			int i_3_ = class4_sub11.pointion;
			i++;
			int i_4_ = 0;
			for (class4_sub11.pointion += i; ((class4_sub11.byteBuffer[class4_sub11.pointion
					+ i_4_] ^ 0xffffffff) != -1); i_4_++) {
				/* empty */
			}
			byte[] is_5_ = new byte[i_4_];
			for (int i_6_ = 0; i_6_ < i_4_; i_6_++)
				is_5_[i_6_] = class4_sub11.method229(18);
			i_4_++;
			class4_sub11.pointion++;
			int i_7_ = 0;
			int i_8_ = class4_sub11.pointion;
			for (class4_sub11.pointion += i_4_; ((class4_sub11.byteBuffer[class4_sub11.pointion
					+ i_7_] ^ 0xffffffff) != -1); i_7_++) {
				/* empty */
			}
			byte[] is_9_ = new byte[i_7_];
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_10_++)
				is_9_[i_10_] = class4_sub11.method229(-117);
			i_7_++;
			class4_sub11.pointion++;
			byte[] is_11_ = new byte[i_7_];
			int i_12_;
			if ((i_7_ ^ 0xffffffff) < -2) {
				int i_13_ = 1;
				i_12_ = 2;
				is_11_[1] = (byte) 1;
				for (int i_14_ = 2; (i_14_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_14_++) {
					int i_15_ = class4_sub11.get();
					if ((i_15_ ^ 0xffffffff) == -1)
						i_13_ = i_12_++;
					else {
						if (i_15_ <= i_13_)
							i_15_--;
						i_13_ = i_15_;
					}
					is_11_[i_14_] = (byte) i_13_;
				}
			} else
				i_12_ = i_7_;
			Class57[] class57s = new Class57[i_12_];
			for (int i_16_ = 0; (class57s.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				Class57 class57 = class57s[i_16_] = new Class57();
				int i_17_ = class4_sub11.get();
				if ((i_17_ ^ 0xffffffff) < -1)
					class57.aByteArray1144 = new byte[i_17_ * 2];
				i_17_ = class4_sub11.get();
				if ((i_17_ ^ 0xffffffff) < -1) {
					class57.aByteArray1143 = new byte[i_17_ * 2 - -2];
					class57.aByteArray1143[1] = (byte) 64;
				}
			}
			int i_18_ = 0;
			int i_19_ = class4_sub11.get();
			byte[] is_20_ = (i_19_ ^ 0xffffffff) >= -1 ? null
					: new byte[i_19_ * 2];
			i_19_ = class4_sub11.get();
			byte[] is_21_ = i_19_ > 0 ? new byte[2 * i_19_] : null;
			for (/**/; ((class4_sub11.byteBuffer[i_18_ + class4_sub11.pointion] ^ 0xffffffff) != -1); i_18_++) {
				/* empty */
			}
			byte[] is_22_ = new byte[i_18_];
			for (int i_23_ = 0; i_23_ < i_18_; i_23_++)
				is_22_[i_23_] = class4_sub11.method229(14);
			class4_sub11.pointion++;
			i_18_++;
			int i_24_ = 0;
			for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -129; i_25_++) {
				i_24_ += class4_sub11.get();
				aShortArray2430[i_25_] = (short) i_24_;
			}
			i_24_ = 0;
			for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -129; i_26_++) {
				i_24_ += class4_sub11.get();
				aShortArray2430[i_26_] += i_24_ << 2132147496;
			}
			int i_27_ = 0;
			int i_28_ = 0;
			int i_29_ = 0;
			for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -129; i_30_++) {
				if (i_27_ == 0) {
					if (i_29_ < is_22_.length)
						i_27_ = is_22_[i_29_++];
					else
						i_27_ = -1;
					i_28_ = class4_sub11.method228(0);
				}
				i_27_--;
				aShortArray2430[i_30_] += Class59.method1035(i_28_ - 1, 2) << -516371442;
				anIntArray2428[i_30_] = i_28_;
			}
			i_29_ = 0;
			i_27_ = 0;
			int i_31_ = 0;
			for (int i_32_ = 0; i_32_ < 128; i_32_++) {
				if ((anIntArray2428[i_32_] ^ 0xffffffff) != -1) {
					if ((i_27_ ^ 0xffffffff) == -1) {
						if (is.length <= i_29_)
							i_27_ = -1;
						else
							i_27_ = is[i_29_++];
						i_31_ = class4_sub11.byteBuffer[i_3_++] - 1;
					}
					aByteArray2420[i_32_] = (byte) i_31_;
					i_27_--;
				}
			}
			i_29_ = 0;
			i_27_ = 0;
			int i_33_ = 0;
			for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > -129; i_34_++) {
				if (anIntArray2428[i_34_] != 0) {
					if ((i_27_ ^ 0xffffffff) == -1) {
						i_33_ = (16 + class4_sub11.byteBuffer[i_8_++] << -1393596478);
						if ((is_5_.length ^ 0xffffffff) >= (i_29_ ^ 0xffffffff))
							i_27_ = -1;
						else
							i_27_ = is_5_[i_29_++];
					}
					i_27_--;
					aByteArray2424[i_34_] = (byte) i_33_;
				}
			}
			i_27_ = 0;
			i_29_ = 0;
			Class57 class57 = null;
			for (int i_35_ = 0; i_35_ < 128; i_35_++) {
				if (anIntArray2428[i_35_] != 0) {
					if (i_27_ == 0) {
						class57 = class57s[is_11_[i_29_]];
						if ((is_9_.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff))
							i_27_ = is_9_[i_29_++];
						else
							i_27_ = -1;
					}
					i_27_--;
					aClass57Array2427[i_35_] = class57;
				}
			}
			i_27_ = 0;
			i_29_ = 0;
			int i_36_ = 0;
			for (int i_37_ = 0; i_37_ < 128; i_37_++) {
				if (i_27_ == 0) {
					if ((is_22_.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff))
						i_27_ = is_22_[i_29_++];
					else
						i_27_ = -1;
					if ((anIntArray2428[i_37_] ^ 0xffffffff) < -1)
						i_36_ = class4_sub11.get() + 1;
				}
				aByteArray2410[i_37_] = (byte) i_36_;
				i_27_--;
			}
			anInt2431 = 1 + class4_sub11.get();
			for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_38_++) {
				Class57 class57_39_ = class57s[i_38_];
				if (class57_39_.aByteArray1144 != null) {
					for (int i_40_ = 1; ((i_40_ ^ 0xffffffff) > (class57_39_.aByteArray1144.length ^ 0xffffffff)); i_40_ += 2)
						class57_39_.aByteArray1144[i_40_] = class4_sub11
								.method229(20);
				}
				if (class57_39_.aByteArray1143 != null) {
					for (int i_41_ = 3; ((class57_39_.aByteArray1143.length - 2 ^ 0xffffffff) < (i_41_ ^ 0xffffffff)); i_41_ += 2)
						class57_39_.aByteArray1143[i_41_] = class4_sub11
								.method229(-116);
				}
			}
			if (is_20_ != null) {
				for (int i_42_ = 1; i_42_ < is_20_.length; i_42_ += 2)
					is_20_[i_42_] = class4_sub11.method229(18);
			}
			if (is_21_ != null) {
				for (int i_43_ = 1; (i_43_ ^ 0xffffffff) > (is_21_.length ^ 0xffffffff); i_43_ += 2)
					is_21_[i_43_] = class4_sub11.method229(-118);
			}
			for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_44_++) {
				Class57 class57_45_ = class57s[i_44_];
				if (class57_45_.aByteArray1143 != null) {
					i_24_ = 0;
					for (int i_46_ = 2; ((class57_45_.aByteArray1143.length ^ 0xffffffff) < (i_46_ ^ 0xffffffff)); i_46_ += 2) {
						i_24_ = class4_sub11.get() + (i_24_ + 1);
						class57_45_.aByteArray1143[i_46_] = (byte) i_24_;
					}
				}
			}
			for (int i_47_ = 0; (i_12_ ^ 0xffffffff) < (i_47_ ^ 0xffffffff); i_47_++) {
				Class57 class57_48_ = class57s[i_47_];
				if (class57_48_.aByteArray1144 != null) {
					i_24_ = 0;
					for (int i_49_ = 2; ((class57_48_.aByteArray1144.length ^ 0xffffffff) < (i_49_ ^ 0xffffffff)); i_49_ += 2) {
						i_24_ = 1 + (i_24_ - -class4_sub11.get());
						class57_48_.aByteArray1144[i_49_] = (byte) i_24_;
					}
				}
			}
			if (is_20_ != null) {
				i_24_ = class4_sub11.get();
				is_20_[0] = (byte) i_24_;
				for (int i_50_ = 2; (is_20_.length ^ 0xffffffff) < (i_50_ ^ 0xffffffff); i_50_ += 2) {
					i_24_ = 1 + (i_24_ - -class4_sub11.get());
					is_20_[i_50_] = (byte) i_24_;
				}
				int i_51_ = is_20_[0];
				int i_52_ = is_20_[1];
				for (int i_53_ = 0; i_53_ < i_51_; i_53_++)
					aByteArray2410[i_53_] = (byte) (i_52_
							* aByteArray2410[i_53_] + 32 >> 1633250598);
				int i_54_ = 2;
				while ((is_20_.length ^ 0xffffffff) < (i_54_ ^ 0xffffffff)) {
					int i_55_ = is_20_[i_54_];
					int i_56_ = is_20_[1 + i_54_];
					i_54_ += 2;
					int i_57_ = (i_55_ - i_51_) / 2 + i_52_ * (-i_51_ + i_55_);
					for (int i_58_ = i_51_; i_58_ < i_55_; i_58_++) {
						int i_59_ = Class82.method1216(i_57_, -61, i_55_
								- i_51_);
						i_57_ += i_56_ - i_52_;
						aByteArray2410[i_58_] = (byte) (i_59_
								* aByteArray2410[i_58_] + 32 >> 499565126);
					}
					i_51_ = i_55_;
					i_52_ = i_56_;
				}
				for (int i_60_ = i_51_; (i_60_ ^ 0xffffffff) > -129; i_60_++)
					aByteArray2410[i_60_] = (byte) (aByteArray2410[i_60_]
							* i_52_ + 32 >> -1007910522);
			}
			if (is_21_ != null) {
				i_24_ = class4_sub11.get();
				is_21_[0] = (byte) i_24_;
				for (int i_61_ = 2; (i_61_ ^ 0xffffffff) > (is_21_.length ^ 0xffffffff); i_61_ += 2) {
					i_24_ = class4_sub11.get() + (1 + i_24_);
					is_21_[i_61_] = (byte) i_24_;
				}
				int i_62_ = is_21_[1] << -1542837311;
				int i_63_ = is_21_[0];
				for (int i_64_ = 0; (i_63_ ^ 0xffffffff) < (i_64_ ^ 0xffffffff); i_64_++) {
					int i_65_ = i_62_ + (aByteArray2424[i_64_] & 0xff);
					if ((i_65_ ^ 0xffffffff) > -1)
						i_65_ = 0;
					if ((i_65_ ^ 0xffffffff) < -129)
						i_65_ = 128;
					aByteArray2424[i_64_] = (byte) i_65_;
				}
				int i_66_ = 2;
				while ((is_21_.length ^ 0xffffffff) < (i_66_ ^ 0xffffffff)) {
					int i_67_ = is_21_[i_66_];
					int i_68_ = is_21_[i_66_ - -1] << 1636331105;
					i_66_ += 2;
					int i_69_ = (i_67_ + -i_63_) / 2 + i_62_ * (-i_63_ + i_67_);
					for (int i_70_ = i_63_; (i_67_ ^ 0xffffffff) < (i_70_ ^ 0xffffffff); i_70_++) {
						int i_71_ = Class82.method1216(i_69_, -31, -i_63_
								+ i_67_);
						int i_72_ = i_71_ + (0xff & aByteArray2424[i_70_]);
						i_69_ += -i_62_ + i_68_;
						if (i_72_ < 0)
							i_72_ = 0;
						if ((i_72_ ^ 0xffffffff) < -129)
							i_72_ = 128;
						aByteArray2424[i_70_] = (byte) i_72_;
					}
					i_63_ = i_67_;
					i_62_ = i_68_;
				}
				for (int i_73_ = i_63_; (i_73_ ^ 0xffffffff) > -129; i_73_++) {
					int i_74_ = (0xff & aByteArray2424[i_73_]) + i_62_;
					if (i_74_ < 0)
						i_74_ = 0;
					if ((i_74_ ^ 0xffffffff) < -129)
						i_74_ = 128;
					aByteArray2424[i_73_] = (byte) i_74_;
				}
			}
			for (int i_75_ = 0; i_75_ < i_12_; i_75_++)
				class57s[i_75_].anInt1149 = class4_sub11.get();
			for (int i_76_ = 0; (i_76_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_76_++) {
				Class57 class57_77_ = class57s[i_76_];
				if (class57_77_.aByteArray1144 != null)
					class57_77_.anInt1148 = class4_sub11.get();
				if (class57_77_.aByteArray1143 != null)
					class57_77_.anInt1129 = class4_sub11.get();
				if (class57_77_.anInt1149 > 0)
					class57_77_.anInt1140 = class4_sub11.get();
			}
			for (int i_78_ = 0; i_78_ < i_12_; i_78_++)
				class57s[i_78_].anInt1137 = class4_sub11.get();
			for (int i_79_ = 0; i_12_ > i_79_; i_79_++) {
				Class57 class57_80_ = class57s[i_79_];
				if (class57_80_.anInt1137 > 0)
					class57_80_.anInt1125 = class4_sub11.get();
			}
			for (int i_81_ = 0; (i_81_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_81_++) {
				Class57 class57_82_ = class57s[i_81_];
				if (class57_82_.anInt1125 > 0)
					class57_82_.anInt1123 = class4_sub11.get();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ub.<init>(" + (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	public boolean method632(byte[] arg0, Class81 arg1, int[] arg2, boolean arg3) {
		try {
			boolean bool = true;
			anInt2418++;
			if (arg3 != false)
				aClass57Array2427 = null;
			int i = 0;
			Class4_Sub4_Sub1 class4_sub4_sub1 = null;
			for (int i_0_ = 0; i_0_ < 128; i_0_++) {
				if (arg0 == null || (arg0[i_0_] ^ 0xffffffff) != -1) {
					int i_1_ = anIntArray2428[i_0_];
					if (i_1_ != 0) {
						if ((i ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
							i = i_1_;
							i_1_--;
							if ((0x1 & i_1_) != 0)
								class4_sub4_sub1 = arg1.method1209(arg2, -109,
										i_1_ >> 1719224578);
							else
								class4_sub4_sub1 = arg1.method1210(
										i_1_ >> -1621840478, -17993, arg2);
							if (class4_sub4_sub1 == null)
								bool = false;
						}
						if (class4_sub4_sub1 != null) {
							aClass4_Sub4_Sub1Array2434[i_0_] = class4_sub4_sub1;
							anIntArray2428[i_0_] = 0;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ub.A("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public void method634(int arg0) {
		anIntArray2428 = null;
		anInt2425++;
		if (arg0 != 0)
			aByteArray2424 = null;
	}
}
