package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Player extends Actor {
	public static JagexString aJagexString_3589;
	public static JagexString aJagexString_3592;
	public static JagexString aJagexString_3595 = JagexString.getRs2PreparedString("Close"
    );
	public static JagexString aJagexString_3600;
	public static JagexString aJagexString_3603 = JagexString.getRs2PreparedString(
			"Loading interfaces )2 ");
	public static JagexString aJagexString_3606 = JagexString.getRs2PreparedString("wave:"
    );
	public static JagexString aJagexString_3610;
	public static Class9[] aClass9Array3579;
	public static int anInt3580;
	public static int anInt3581;
	public static int anInt3582;
	public static int anInt3587 = 0;
	public static int anInt3588;
	public static int anInt3599;
	public static int anInt3607;
	public static int anInt3613;
	static {
		aJagexString_3600 = aJagexString_3606;
		anInt3581 = 0;
		aJagexString_3610 = aJagexString_3603;
		aJagexString_3589 = aJagexString_3606;
		aJagexString_3592 = aJagexString_3595;
	}

	public static void method390(int arg0, int arg1) {
		try {
			anInt3580++;
			if (arg1 != -20339)
				aJagexString_3589 = null;
			if (Class4_Sub12.method277((byte) 110, arg0))
				Class4_Sub3.method173(-1, arg1 ^ ~0x4f6d,
						(Class28.aClass4_Sub13ArrayArray632[arg0]));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("d.AA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static int method392(int arg0, int arg1, int arg2) {
		try {
			anInt3599++;
			if (arg2 != 32315)
				return 123;
			int i = 57 * arg1 + arg0;
			i ^= i << -2044597523;
			int i_8_ = i * (789221 + i * i * 15731) - -1376312589 & 0x7fffffff;
			return i_8_ >> -317691917 & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("d.CA("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method393(int arg0) {
		try {
			aClass9Array3579 = null;
			aJagexString_3592 = null;
			aJagexString_3595 = null;
			if (arg0 != 65535)
				aClass9Array3579 = null;
			aJagexString_3603 = null;
			aJagexString_3600 = null;
			aJagexString_3589 = null;
			aJagexString_3606 = null;
			aJagexString_3610 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "d.W("
					+ arg0 + ')');
		}
	}

	public static JagexString method394(int arg0, StreamBuffer arg1, boolean arg2) {
		try {
			anInt3582++;
			if (arg2 != false)
				return null;
			try {
				JagexString jagexString = new JagexString();
				jagexString.anInt1805 = arg1.getSmart();
				if (jagexString.anInt1805 > arg0)
					jagexString.anInt1805 = arg0;
				jagexString.aByteArray1803 = new byte[jagexString.anInt1805];
				arg1.pointion += Class10.aClass47_305.method980(
						arg1.byteBuffer, jagexString.anInt1805, arg1.pointion,
						jagexString.aByteArray1803, arg2, 0);
				return jagexString;
			} catch (Exception exception) {
				return StringUtilities.aJagexString_2936;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("d.U("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public boolean aBoolean3594;
	public JagexString aJagexString_3593;
	public Class35 aClass35_3609;
	public Class4_Sub20_Sub7_Sub7 aClass4_Sub20_Sub7_Sub7_3596;
	public int anInt3583;
	public int anInt3584;
	public int anInt3585;
	public int anInt3586 = 0;
	public int anInt3590 = 0;
	public int anInt3591;
	public int anInt3597;
	public int anInt3598;
	public int anInt3601;
	public int anInt3602;

	public int anInt3604;

	public int anInt3605;

	public int anInt3608;

	public int anInt3611;

	public int anInt3612;

	public Player() {
		anInt3585 = -1;
		anInt3597 = -1;
		aBoolean3594 = false;
		anInt3601 = 0;
		anInt3608 = 0;
		anInt3584 = 0;
	}

	@Override
	public Class4_Sub20_Sub7_Sub7 method378(boolean arg0) {
		try {
			if (arg0 != false)
				method394(-3, null, true);
			anInt3613++;
			if (aClass35_3609 == null)
				return null;
			Class4_Sub20_Sub17 class4_sub20_sub17 = (((anInt3277 ^ 0xffffffff) != 0 && (anInt3222 ^ 0xffffffff) == -1) ? Class68
					.method1093(anInt3277, (byte) -121) : null);
			Class4_Sub20_Sub17 class4_sub20_sub17_9_ = (((anInt3257 ^ 0xffffffff) == 0
					|| aBoolean3594 || ((anInt3265 ^ 0xffffffff) == (anInt3257 ^ 0xffffffff) && class4_sub20_sub17 != null)) ? null
					: Class68.method1093(anInt3257, (byte) -117));
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = aClass35_3609
					.method904(anInt3258, class4_sub20_sub17, anInt3239, 850,
							class4_sub20_sub17_9_);
			if (class4_sub20_sub7_sub7 == null)
				return null;
			class4_sub20_sub7_sub7.method446();
			anInt3282 = class4_sub20_sub7_sub7.anInt2938;
			if (!aBoolean3594 && anInt3226 != -1 && anInt3242 != -1) {
				Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7_10_ = Class4_Sub20_Sub14
						.method593(-23222, anInt3226).method371(124, anInt3242);
				if (class4_sub20_sub7_sub7_10_ != null) {
					Class4_Sub20_Sub7_Sub7[] class4_sub20_sub7_sub7s = {
							class4_sub20_sub7_sub7, class4_sub20_sub7_sub7_10_ };
					class4_sub20_sub7_sub7_10_.method445(0, -anInt3229, 0);
					class4_sub20_sub7_sub7 = new Class4_Sub20_Sub7_Sub7(
							class4_sub20_sub7_sub7s, 2);
				}
			}
			if (!aBoolean3594 && aClass4_Sub20_Sub7_Sub7_3596 != null) {
				if (anInt3601 <= Region.anInt134)
					aClass4_Sub20_Sub7_Sub7_3596 = null;
				if (Region.anInt134 >= anInt3608 && anInt3601 > Region.anInt134) {
					Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7_11_ = aClass4_Sub20_Sub7_Sub7_3596;
					class4_sub20_sub7_sub7_11_.method445(anInt3602 - worldX,
							(-anInt3604 + anInt3583), (-worldY + anInt3598));
					Class4_Sub20_Sub7_Sub7[] class4_sub20_sub7_sub7s = {
							class4_sub20_sub7_sub7, class4_sub20_sub7_sub7_11_ };
					if ((anInt3217 ^ 0xffffffff) != -513) {
						if (anInt3217 != 1024) {
							if ((anInt3217 ^ 0xffffffff) == -1537)
								class4_sub20_sub7_sub7_11_.method444();
						} else {
							class4_sub20_sub7_sub7_11_.method444();
							class4_sub20_sub7_sub7_11_.method444();
						}
					} else {
						class4_sub20_sub7_sub7_11_.method444();
						class4_sub20_sub7_sub7_11_.method444();
						class4_sub20_sub7_sub7_11_.method444();
					}
					class4_sub20_sub7_sub7 = new Class4_Sub20_Sub7_Sub7(
							class4_sub20_sub7_sub7s, 2);
					if (anInt3217 != 512) {
						if (anInt3217 != 1024) {
							if ((anInt3217 ^ 0xffffffff) == -1537) {
								class4_sub20_sub7_sub7_11_.method444();
								class4_sub20_sub7_sub7_11_.method444();
								class4_sub20_sub7_sub7_11_.method444();
							}
						} else {
							class4_sub20_sub7_sub7_11_.method444();
							class4_sub20_sub7_sub7_11_.method444();
						}
					} else
						class4_sub20_sub7_sub7_11_.method444();
					class4_sub20_sub7_sub7_11_.method445(
							(-anInt3602 + worldX), anInt3604 - anInt3583,
							(-anInt3598 + worldY));
				}
			}
			class4_sub20_sub7_sub7.aBoolean3454 = true;
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "d.V("
					+ arg0 + ')');
		}
	}

	@Override
	public boolean method384(int arg0) {
		try {
			anInt3607++;
			if (aClass35_3609 == null)
				return false;
			if (arg0 != -19456)
				aJagexString_3589 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "d.D("
					+ arg0 + ')');
		}
	}

	public void method391(int arg0, StreamBuffer arg1) {
		try {
			arg1.pointion = 0;
			anInt3588++;
			int i = arg1.get();
			anInt3597 = arg1.method229(arg0 ^ ~0x7b);
			anInt3585 = arg1.method229(78);
			anInt3590 = 0;
			int i_0_ = -1;
			int[] is = new int[12];
			for (int i_1_ = 0; i_1_ < 12; i_1_++) {
				int i_2_ = arg1.get();
				if ((i_2_ ^ 0xffffffff) == -1)
					is[i_1_] = 0;
				else {
					int i_3_ = arg1.get();
					is[i_1_] = (i_2_ << -1745695480) + i_3_;
					if (i_1_ == 0 && (is[0] ^ 0xffffffff) == -65536) {
						i_0_ = arg1.method209((byte) -113);
						break;
					}
					if (is[i_1_] >= 512) {
						int i_4_ = (Class4_Sub23.method633(-512 + is[i_1_],
								(byte) -118).anInt3000);
						if (i_4_ != 0)
							anInt3590 = i_4_;
					}
				}
			}
			int[] is_5_ = new int[5];
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -6; i_6_++) {
				int i_7_ = arg1.get();
				if (i_7_ < 0
						|| Class13_Sub2.aShortArrayArray2476[i_6_].length <= i_7_)
					i_7_ = 0;
				is_5_[i_6_] = i_7_;
			}
			anInt3265 = arg1.method209((byte) -115);
			if (anInt3265 == 65535)
				anInt3265 = -1;
			anInt3250 = arg1.method209((byte) -101);
			if (anInt3250 == 65535)
				anInt3250 = -1;
			anInt3246 = anInt3250;
			anInt3272 = arg1.method209((byte) -117);
			if ((anInt3272 ^ 0xffffffff) == -65536)
				anInt3272 = -1;
			anInt3269 = arg1.method209((byte) -128);
			if ((anInt3269 ^ 0xffffffff) == -65536)
				anInt3269 = -1;
			anInt3263 = arg1.method209((byte) -111);
			if (anInt3263 == 65535)
				anInt3263 = -1;
			anInt3251 = arg1.method209((byte) -105);
			if (anInt3251 == 65535)
				anInt3251 = -1;
			anInt3274 = arg1.method209((byte) -109);
			if (anInt3274 == 65535)
				anInt3274 = -1;
			long name = arg1.readLong((byte) 33);
			JagexString string1 = Class68.method1094(-5, name);
			aJagexString_3593 = string1.method839(arg0 ^ 0x5d);
			anInt3584 = arg1.get();
			anInt3586 = arg1.method209((byte) -123);
			if (aClass35_3609 == null)
				aClass35_3609 = new Class35();
			aClass35_3609.method901(is_5_, is, i_0_, (byte) -79, i == 1);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("d.BA("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}
}
