/* Class4_Sub20_Sub12_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class4_Sub20_Sub12_Sub4 extends Class4_Sub20_Sub12 {
	public static JagexString aJagexString_3547 = JagexString.getRs2PreparedString(")4col"
    );
	public static JagexString aJagexString_3548;
	public static JagexString aJagexString_3550;
	public static JagexString aJagexString_3551 = JagexString.getRs2PreparedString(")4shad"
    );
	public static JagexString aJagexString_3552 = JagexString.getRs2PreparedString("br"
    );
	public static JagexString aJagexString_3554;
	public static JagexString aJagexString_3557;
	public static JagexString aJagexString_3560;
	public static JagexString aJagexString_3563;
	public static JagexString aJagexString_3564;
	public static JagexString aJagexString_3565;
	public static JagexString aJagexString_3568;
	public static JagexString aJagexString_3569;
	public static JagexString aJagexString_3574;
	public static JagexString aJagexString_3576;
	public static JagexString[] aJagexStringArray3578;
	public static Class4_Sub20_Sub12_Sub1[] aClass4_Sub20_Sub12_Sub1Array3566;
	public static int anInt3543;
	public static int anInt3544;
	public static int anInt3545;
	public static int anInt3555;
	public static int anInt3561;
	public static int anInt3562;
	public static int anInt3573;
	public static int anInt3575;
	public static int anInt3577;
	public static Random aRandom3570;
	static {
		anInt3543 = 0;
		anInt3544 = -1;
		anInt3545 = -1;
		aJagexString_3548 = JagexString.getRs2PreparedString("str");
		aJagexString_3554 = JagexString.getRs2PreparedString("shad");
		anInt3562 = 256;
		aJagexString_3564 = JagexString.getRs2PreparedString(")4u");
		aJagexString_3550 = JagexString.getRs2PreparedString(")4str");
		aJagexString_3557 = JagexString.getRs2PreparedString("u=");
		aJagexString_3569 = JagexString.getRs2PreparedString("str=");
		aJagexString_3563 = JagexString.getRs2PreparedString("shad=");
		aJagexString_3565 = JagexString.getRs2PreparedString("col=");
		aJagexString_3568 = JagexString.getRs2PreparedString("gt");
		anInt3555 = 0;
		aJagexString_3560 = JagexString.getRs2PreparedString("lt");
		anInt3573 = 0;
		anInt3561 = -1;
		aJagexString_3574 = JagexString.getRs2PreparedString("img=");
		anInt3577 = 0;
		aJagexString_3576 = JagexString.getRs2PreparedString("u");
		anInt3575 = -1;
		aRandom3570 = new Random();
		aJagexStringArray3578 = new JagexString[100];
	}

	public static void method555(byte[] arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		int i = arg1 + arg2 * Class4_Sub20_Sub12.anInt3098;
		int i_0_ = Class4_Sub20_Sub12.anInt3098 - arg3;
		int i_1_ = 0;
		int i_2_ = 0;
		if (arg2 < Class4_Sub20_Sub12.anInt3103) {
			int i_3_ = Class4_Sub20_Sub12.anInt3103 - arg2;
			arg4 -= i_3_;
			arg2 = Class4_Sub20_Sub12.anInt3103;
			i_2_ += i_3_ * arg3;
			i += i_3_ * Class4_Sub20_Sub12.anInt3098;
		}
		if (arg2 + arg4 > Class4_Sub20_Sub12.anInt3100)
			arg4 -= arg2 + arg4 - Class4_Sub20_Sub12.anInt3100;
		if (arg1 < Class4_Sub20_Sub12.anInt3101) {
			int i_4_ = Class4_Sub20_Sub12.anInt3101 - arg1;
			arg3 -= i_4_;
			arg1 = Class4_Sub20_Sub12.anInt3101;
			i_2_ += i_4_;
			i += i_4_;
			i_1_ += i_4_;
			i_0_ += i_4_;
		}
		if (arg1 + arg3 > Class4_Sub20_Sub12.anInt3097) {
			int i_5_ = arg1 + arg3 - Class4_Sub20_Sub12.anInt3097;
			arg3 -= i_5_;
			i_1_ += i_5_;
			i_0_ += i_5_;
		}
		if (arg3 > 0 && arg4 > 0)
			method582(Class4_Sub20_Sub12.anIntArray3099, arg0, arg5, i_2_, i,
					arg3, arg4, i_0_, i_1_, arg6);
	}

	public static int method559(byte[][] arg0, byte[][] arg1, int[] arg2,
			int[] arg3, int[] arg4, int arg5, int arg6) {
		int i = arg2[arg5];
		int i_18_ = i + arg4[arg5];
		int i_19_ = arg2[arg6];
		int i_20_ = i_19_ + arg4[arg6];
		int i_21_ = i;
		if (i_19_ > i)
			i_21_ = i_19_;
		int i_22_ = i_18_;
		if (i_20_ < i_18_)
			i_22_ = i_20_;
		int i_23_ = arg3[arg5];
		if (arg3[arg6] < i_23_)
			i_23_ = arg3[arg6];
		byte[] is = arg1[arg5];
		byte[] is_24_ = arg0[arg6];
		int i_25_ = i_21_ - i;
		int i_26_ = i_21_ - i_19_;
		for (int i_27_ = i_21_; i_27_ < i_22_; i_27_++) {
			int i_28_ = is[i_25_++] + is_24_[i_26_++];
			if (i_28_ < i_23_)
				i_23_ = i_28_;
		}
		return -i_23_;
	}

	public static void method564() {
		aJagexString_3560 = null;
		aJagexString_3568 = null;
		aJagexString_3574 = null;
		aJagexString_3552 = null;
		aJagexString_3565 = null;
		aJagexString_3547 = null;
		aJagexString_3557 = null;
		aJagexString_3576 = null;
		aJagexString_3564 = null;
		aJagexString_3563 = null;
		aJagexString_3554 = null;
		aJagexString_3551 = null;
		aJagexString_3569 = null;
		aJagexString_3548 = null;
		aJagexString_3550 = null;
		aClass4_Sub20_Sub12_Sub1Array3566 = null;
		aRandom3570 = null;
		aJagexStringArray3578 = null;
	}

	public static void method565(byte[] arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		int i = arg1 + arg2 * Class4_Sub20_Sub12.anInt3098;
		int i_60_ = Class4_Sub20_Sub12.anInt3098 - arg3;
		int i_61_ = 0;
		int i_62_ = 0;
		if (arg2 < Class4_Sub20_Sub12.anInt3103) {
			int i_63_ = Class4_Sub20_Sub12.anInt3103 - arg2;
			arg4 -= i_63_;
			arg2 = Class4_Sub20_Sub12.anInt3103;
			i_62_ += i_63_ * arg3;
			i += i_63_ * Class4_Sub20_Sub12.anInt3098;
		}
		if (arg2 + arg4 > Class4_Sub20_Sub12.anInt3100)
			arg4 -= arg2 + arg4 - Class4_Sub20_Sub12.anInt3100;
		if (arg1 < Class4_Sub20_Sub12.anInt3101) {
			int i_64_ = Class4_Sub20_Sub12.anInt3101 - arg1;
			arg3 -= i_64_;
			arg1 = Class4_Sub20_Sub12.anInt3101;
			i_62_ += i_64_;
			i += i_64_;
			i_61_ += i_64_;
			i_60_ += i_64_;
		}
		if (arg1 + arg3 > Class4_Sub20_Sub12.anInt3097) {
			int i_65_ = arg1 + arg3 - Class4_Sub20_Sub12.anInt3097;
			arg3 -= i_65_;
			i_61_ += i_65_;
			i_60_ += i_65_;
		}
		if (arg3 > 0 && arg4 > 0)
			method581(Class4_Sub20_Sub12.anIntArray3099, arg0, arg5, i_62_, i,
					arg3, arg4, i_60_, i_61_);
	}

	public static JagexString method574(JagexString arg0) {
		int i = arg0.method825(-103);
		int i_87_ = 0;
		for (int i_88_ = 0; i_88_ < i; i_88_++) {
			byte i_89_ = arg0.aByteArray1803[i_88_];
			if (i_89_ == 60 || i_89_ == 62)
				i_87_ += 3;
		}
		JagexString jagexString = new JagexString();
		jagexString.anInt1805 = i + i_87_;
		jagexString.aByteArray1803 = new byte[jagexString.anInt1805];
		int i_90_ = 0;
		for (int i_91_ = 0; i_91_ < i; i_91_++) {
			byte i_92_ = arg0.aByteArray1803[i_91_];
			if (i_92_ == 60) {
				jagexString.aByteArray1803[i_90_++] = (byte) 60;
				jagexString.aByteArray1803[i_90_++] = (byte) 108;
				jagexString.aByteArray1803[i_90_++] = (byte) 116;
				jagexString.aByteArray1803[i_90_++] = (byte) 62;
			} else if (i_92_ == 62) {
				jagexString.aByteArray1803[i_90_++] = (byte) 60;
				jagexString.aByteArray1803[i_90_++] = (byte) 103;
				jagexString.aByteArray1803[i_90_++] = (byte) 116;
				jagexString.aByteArray1803[i_90_++] = (byte) 62;
			} else
				jagexString.aByteArray1803[i_90_++] = i_92_;
		}
		return jagexString;
	}

	public static void method581(int[] arg0, byte[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8) {
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int i_98_ = -arg6; i_98_ < 0; i_98_++) {
			for (int i_99_ = i; i_99_ < 0; i_99_++) {
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			for (int i_100_ = arg5; i_100_ < 0; i_100_++) {
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public static void method582(int[] arg0, byte[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg2 = ((arg2 & 0xff00ff) * arg9 & ~0xff00ff)
				+ ((arg2 & 0xff00) * arg9 & 0xff0000) >> 8;
		arg9 = 256 - arg9;
		for (int i = -arg6; i < 0; i++) {
			for (int i_101_ = -arg5; i_101_ < 0; i_101_++) {
				if (arg1[arg3++] != 0) {
					int i_102_ = arg0[arg4];
					arg0[arg4++] = ((((i_102_ & 0xff00ff) * arg9 & ~0xff00ff) + ((i_102_ & 0xff00)
							* arg9 & 0xff0000)) >> 8)
							+ arg2;
				} else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public byte[] aByteArray3558;
	public byte[][] aByteArrayArray3571;

	public int anInt3542;

	public int anInt3546 = 0;

	public int anInt3567;

	public int[] anIntArray3549;

	public int[] anIntArray3553;

	public int[] anIntArray3556;

	public int[] anIntArray3559;

	public int[] anIntArray3572;

	public Class4_Sub20_Sub12_Sub4(byte[] arg0) {
		aByteArrayArray3571 = new byte[256][];
		method562(arg0);
	}

	public Class4_Sub20_Sub12_Sub4(byte[] arg0, int[] arg1, int[] arg2,
			int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
		aByteArrayArray3571 = new byte[256][];
		anIntArray3572 = arg1;
		anIntArray3549 = arg2;
		anIntArray3553 = arg3;
		anIntArray3559 = arg4;
		method562(arg0);
		aByteArrayArray3571 = arg6;
		int i = 2147483647;
		int i_103_ = -2147483648;
		for (int i_104_ = 0; i_104_ < 256; i_104_++) {
			if (anIntArray3549[i_104_] < i && anIntArray3559[i_104_] != 0)
				i = anIntArray3549[i_104_];
			if (anIntArray3549[i_104_] + anIntArray3559[i_104_] > i_103_)
				i_103_ = anIntArray3549[i_104_] + anIntArray3559[i_104_];
		}
		anInt3542 = anInt3546 - i;
		anInt3567 = i_103_ - anInt3546;
	}

	public void method556(JagexString arg0, int arg1, int arg2) {
		arg2 -= anInt3546;
		int i = -1;
		int i_6_ = -1;
		for (int i_7_ = 0; i_7_ < arg0.anInt1805; i_7_++) {
			int i_8_ = arg0.aByteArray1803[i_7_] & 0xff;
			if (i_8_ == 60)
				i = i_7_;
			else {
				if (i_8_ == 62 && i != -1) {
					JagexString jagexString = arg0.method829((byte) -108, i + 1, i_7_);
					i = -1;
					if (jagexString.method802(1, aJagexString_3560))
						i_8_ = 60;
					else if (jagexString.method802(1, aJagexString_3568))
						i_8_ = 62;
					else {
						if (jagexString.method808(aJagexString_3574, (byte) -95)) {
							try {
								int i_9_ = jagexString.method805(4, 89).method804(
										(byte) -83);
								Class4_Sub20_Sub12_Sub1 class4_sub20_sub12_sub1 = aClass4_Sub20_Sub12_Sub1Array3566[i_9_];
								class4_sub20_sub12_sub1
										.method507(
												arg1,
												(arg2 + anInt3546 - class4_sub20_sub12_sub1.anInt3507));
								arg1 += class4_sub20_sub12_sub1.anInt3509;
								i_6_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method580(jagexString);
						continue;
					}
				}
				if (i == -1) {
					if (aByteArray3558 != null && i_6_ != -1)
						arg1 += aByteArray3558[(i_6_ << 8) + i_8_];
					int i_10_ = anIntArray3553[i_8_];
					int i_11_ = anIntArray3559[i_8_];
					if (i_8_ != 32) {
						if (anInt3562 == 256) {
							if (anInt3575 != -1)
								method565(aByteArrayArray3571[i_8_], arg1
										+ anIntArray3572[i_8_] + 1, arg2
										+ anIntArray3549[i_8_] + 1, i_10_,
										i_11_, anInt3575);
							method578(aByteArrayArray3571[i_8_], arg1
									+ anIntArray3572[i_8_], arg2
									+ anIntArray3549[i_8_], i_10_, i_11_,
									anInt3577);
						} else {
							if (anInt3575 != -1)
								method555(aByteArrayArray3571[i_8_], arg1
										+ anIntArray3572[i_8_] + 1, arg2
										+ anIntArray3549[i_8_] + 1, i_10_,
										i_11_, anInt3575, anInt3562);
							method558(aByteArrayArray3571[i_8_], arg1
									+ anIntArray3572[i_8_], arg2
									+ anIntArray3549[i_8_], i_10_, i_11_,
									anInt3577, anInt3562);
						}
					} else if (anInt3573 > 0) {
						anInt3543 += anInt3573;
						arg1 += anInt3543 >> 8;
						anInt3543 &= 0xff;
					}
					int i_12_ = anIntArray3556[i_8_];
					if (anInt3544 != -1)
						Class4_Sub20_Sub12.method505(arg1, arg2
								+ (int) (anInt3546 * 0.7), i_12_, anInt3544);
					if (anInt3561 != -1)
						Class4_Sub20_Sub12.method505(arg1,
								arg2 + anInt3546 + 1, i_12_, anInt3561);
					arg1 += i_12_;
					i_6_ = i_8_;
				}
			}
		}
	}

	public void method557(JagexString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			method576(arg3, arg4);
			method556(arg0, arg1 - method560(arg0), arg2);
		}
	}

	public abstract void method558(byte[] is, int i, int i_13_, int i_14_,
			int i_15_, int i_16_, int i_17_);

	public int method560(JagexString arg0) {
		if (arg0 == null)
			return 0;
		int i = -1;
		int i_29_ = -1;
		int i_30_ = 0;
		for (int i_31_ = 0; i_31_ < arg0.anInt1805; i_31_++) {
			int i_32_ = arg0.aByteArray1803[i_31_] & 0xff;
			if (i_32_ == 60)
				i = i_31_;
			else {
				if (i_32_ == 62 && i != -1) {
					JagexString jagexString = arg0.method829((byte) 13, i + 1, i_31_);
					i = -1;
					if (jagexString.method802(1, aJagexString_3560))
						i_32_ = 60;
					else if (jagexString.method802(1, aJagexString_3568))
						i_32_ = 62;
					else {
						if (jagexString.method808(aJagexString_3574, (byte) -95)) {
							try {
								int i_33_ = jagexString.method805(4, 107)
										.method804((byte) -126);
								i_30_ += (aClass4_Sub20_Sub12_Sub1Array3566[i_33_].anInt3509);
								i_29_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					i_30_ += anIntArray3556[i_32_];
					if (aByteArray3558 != null && i_29_ != -1)
						i_30_ += aByteArray3558[(i_29_ << 8) + i_32_];
					i_29_ = i_32_;
				}
			}
		}
		return i_30_;
	}

	public int method561(JagexString arg0, int[] arg1, JagexString[] arg2) {
		if (arg0 == null)
			return 0;
		int i = 0;
		int i_34_ = 0;
		JagexString jagexString = Class4_Sub10.method205((byte) -126, 100);
		int i_35_ = -1;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = -1;
		int i_39_ = -1;
		int i_40_ = 0;
		int i_41_ = arg0.method825(-101);
		for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
			int i_43_ = arg0.method834(21340, i_42_);
			if (i_43_ == 60)
				i_38_ = i_42_;
			else {
				if (i_43_ == 62 && i_38_ != -1) {
					JagexString jagexString_44_ = arg0.method829((byte) -108,
							i_38_ + 1, i_42_);
					i_38_ = -1;
					jagexString.method824(60, 0);
					jagexString.method832(jagexString_44_, (byte) -28);
					jagexString.method824(62, 0);
					if (jagexString_44_.method802(1, aJagexString_3552)) {
						arg2[i_40_++] = jagexString.method829((byte) 76, i_34_,
								jagexString.method825(-111));
						i_34_ = jagexString.method825(-114);
						i = 0;
						i_35_ = -1;
						i_39_ = -1;
					} else if (jagexString_44_.method802(1, aJagexString_3560)) {
						i += method579(60);
						if (aByteArray3558 != null && i_39_ != -1)
							i += aByteArray3558[(i_39_ << 8) + 60];
						i_39_ = 60;
					} else if (jagexString_44_.method802(1, aJagexString_3568)) {
						i += method579(62);
						if (aByteArray3558 != null && i_39_ != -1)
							i += aByteArray3558[(i_39_ << 8) + 62];
						i_39_ = 62;
					} else if (jagexString_44_.method808(aJagexString_3574, (byte) -95)) {
						try {
							int i_45_ = jagexString_44_.method805(4, -23)
									.method804((byte) -88);
							i += (aClass4_Sub20_Sub12_Sub1Array3566[i_45_].anInt3509);
							i_39_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_43_ = -1;
				}
				if (i_38_ == -1) {
					if (i_43_ != -1) {
						jagexString.method824(i_43_, 0);
						i += method579(i_43_);
						if (aByteArray3558 != null && i_39_ != -1)
							i += aByteArray3558[(i_39_ << 8) + i_43_];
						i_39_ = i_43_;
					}
					if (i_43_ == 32) {
						i_35_ = jagexString.method825(-121);
						i_36_ = i;
						i_37_ = 1;
					}
					if (arg1 != null
							&& i > arg1[(i_40_ < arg1.length ? i_40_
									: arg1.length - 1)] && i_35_ >= 0) {
						arg2[i_40_++] = jagexString.method829((byte) -120, i_34_,
								i_35_ - i_37_);
						i_34_ = i_35_;
						i_35_ = -1;
						i -= i_36_;
						i_39_ = -1;
					}
					if (i_43_ == 45) {
						i_35_ = jagexString.method825(-126);
						i_36_ = i;
						i_37_ = 0;
					}
				}
			}
		}
		if (jagexString.method825(-99) > i_34_)
			arg2[i_40_++] = jagexString.method829((byte) 63, i_34_,
					jagexString.method825(-107));
		return i_40_;
	}

	public void method562(byte[] arg0) {
		anIntArray3556 = new int[256];
		if (arg0.length == 257) {
			for (int i = 0; i < anIntArray3556.length; i++)
				anIntArray3556[i] = arg0[i] & 0xff;
			anInt3546 = arg0[256] & 0xff;
		} else {
			int i = 0;
			for (int i_46_ = 0; i_46_ < 256; i_46_++)
				anIntArray3556[i_46_] = arg0[i++] & 0xff;
			int[] is = new int[256];
			int[] is_47_ = new int[256];
			for (int i_48_ = 0; i_48_ < 256; i_48_++)
				is[i_48_] = arg0[i++] & 0xff;
			for (int i_49_ = 0; i_49_ < 256; i_49_++)
				is_47_[i_49_] = arg0[i++] & 0xff;
			byte[][] is_50_ = new byte[256][];
			for (int i_51_ = 0; i_51_ < 256; i_51_++) {
				is_50_[i_51_] = new byte[is[i_51_]];
				byte i_52_ = 0;
				for (int i_53_ = 0; i_53_ < is_50_[i_51_].length; i_53_++) {
					i_52_ += arg0[i++];
					is_50_[i_51_][i_53_] = i_52_;
				}
			}
			byte[][] is_54_ = new byte[256][];
			for (int i_55_ = 0; i_55_ < 256; i_55_++) {
				is_54_[i_55_] = new byte[is[i_55_]];
				byte i_56_ = 0;
				for (int i_57_ = 0; i_57_ < is_54_[i_55_].length; i_57_++) {
					i_56_ += arg0[i++];
					is_54_[i_55_][i_57_] = i_56_;
				}
			}
			aByteArray3558 = new byte[65536];
			for (int i_58_ = 0; i_58_ < 256; i_58_++) {
				if (i_58_ != 32 && i_58_ != 160) {
					for (int i_59_ = 0; i_59_ < 256; i_59_++) {
						if (i_59_ != 32 && i_59_ != 160)
							aByteArray3558[(i_58_ << 8) + i_59_] = (byte) method559(
									is_50_, is_54_, is_47_, anIntArray3556, is,
									i_58_, i_59_);
					}
				}
			}
			anInt3546 = is_47_[32] + is[32];
		}
	}

	public void method563(JagexString arg0, int arg1, int arg2, int arg3, int arg4,
                          int arg5) {
		if (arg0 != null) {
			method576(arg3, arg4);
			int[] is = new int[arg0.anInt1805];
			for (int i = 0; i < arg0.anInt1805; i++)
				is[i] = (int) (Math.sin(i / 2.0 + arg5 / 5.0) * 5.0);
			method572(arg0, arg1 - method560(arg0) / 2, arg2, null, is);
		}
	}

	public int method566(JagexString arg0, int arg1, int arg2, int arg3, int arg4,
                         int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0 == null)
			return 0;
		method576(arg5, arg6);
		if (arg9 == 0)
			arg9 = anInt3546;
		int[] is = { arg3 };
		if (arg4 < anInt3542 + anInt3567 + arg9 && arg4 < arg9 + arg9)
			is = null;
		int i = method561(arg0, is, aJagexStringArray3578);
		if (arg8 == 3 && i == 1)
			arg8 = 1;
		int i_66_;
		if (arg8 == 0)
			i_66_ = arg2 + anInt3542;
		else if (arg8 == 1)
			i_66_ = (arg2 + anInt3542 + (arg4 - anInt3542 - anInt3567 - (i - 1)
					* arg9) / 2);
		else if (arg8 == 2)
			i_66_ = arg2 + arg4 - anInt3567 - (i - 1) * arg9;
		else {
			int i_67_ = (arg4 - anInt3542 - anInt3567 - (i - 1) * arg9)
					/ (i + 1);
			if (i_67_ < 0)
				i_67_ = 0;
			i_66_ = arg2 + anInt3542 + i_67_;
			arg9 += i_67_;
		}
		for (int i_68_ = 0; i_68_ < i; i_68_++) {
			if (arg7 == 0)
				method556(aJagexStringArray3578[i_68_], arg1, i_66_);
			else if (arg7 == 1)
				method556(
						aJagexStringArray3578[i_68_],
						(arg1 + (arg3 - method560(aJagexStringArray3578[i_68_])) / 2),
						i_66_);
			else if (arg7 == 2)
				method556(aJagexStringArray3578[i_68_], arg1 + arg3
						- method560(aJagexStringArray3578[i_68_]), i_66_);
			else if (i_68_ == i - 1)
				method556(aJagexStringArray3578[i_68_], arg1, i_66_);
			else {
				method573(aJagexStringArray3578[i_68_], arg3);
				method556(aJagexStringArray3578[i_68_], arg1, i_66_);
				anInt3573 = 0;
			}
			i_66_ += arg9;
		}
		return i;
	}

	public void method567(JagexString arg0, int arg1, int arg2, int arg3, int arg4,
                          int arg5, int arg6) {
		if (arg0 != null) {
			method576(arg3, arg4);
			double d = 7.0 - arg6 / 8.0;
			if (d < 0.0)
				d = 0.0;
			int[] is = new int[arg0.anInt1805];
			for (int i = 0; i < arg0.anInt1805; i++)
				is[i] = (int) (Math.sin(i / 1.5 + arg5) * d);
			method572(arg0, arg1 - method560(arg0) / 2, arg2, null, is);
		}
	}

	public int method568(JagexString arg0, int arg1) {
		int i = method561(arg0, new int[] { arg1 }, aJagexStringArray3578);
		int i_69_ = 0;
		for (int i_70_ = 0; i_70_ < i; i_70_++) {
			int i_71_ = method560(aJagexStringArray3578[i_70_]);
			if (i_71_ > i_69_)
				i_69_ = i_71_;
		}
		return i_69_;
	}

	public void method569(JagexString arg0, int arg1, int arg2, int arg3, int arg4,
                          int arg5) {
		if (arg0 != null) {
			method576(arg3, arg4);
			int[] is = new int[arg0.anInt1805];
			int[] is_72_ = new int[arg0.anInt1805];
			for (int i = 0; i < arg0.anInt1805; i++) {
				is[i] = (int) (Math.sin(i / 5.0 + arg5 / 5.0) * 5.0);
				is_72_[i] = (int) (Math.sin(i / 3.0 + arg5 / 5.0) * 5.0);
			}
			method572(arg0, arg1 - method560(arg0) / 2, arg2, is, is_72_);
		}
	}

	public int method570(JagexString arg0, int arg1) {
		return method561(arg0, new int[] { arg1 }, aJagexStringArray3578);
	}

	public void method571(JagexString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			method576(arg3, arg4);
			method556(arg0, arg1 - method560(arg0) / 2, arg2);
		}
	}

	public void method572(JagexString arg0, int arg1, int arg2, int[] arg3,
                          int[] arg4) {
		arg2 -= anInt3546;
		int i = -1;
		int i_73_ = -1;
		int i_74_ = 0;
		for (int i_75_ = 0; i_75_ < arg0.anInt1805; i_75_++) {
			int i_76_ = arg0.aByteArray1803[i_75_] & 0xff;
			if (i_76_ == 60)
				i = i_75_;
			else {
				if (i_76_ == 62 && i != -1) {
					JagexString jagexString = arg0.method829((byte) 110, i + 1, i_75_);
					i = -1;
					if (jagexString.method802(1, aJagexString_3560))
						i_76_ = 60;
					else if (jagexString.method802(1, aJagexString_3568))
						i_76_ = 62;
					else {
						if (jagexString.method808(aJagexString_3574, (byte) -95)) {
							try {
								int i_77_;
								if (arg3 != null)
									i_77_ = arg3[i_74_];
								else
									i_77_ = 0;
								int i_78_;
								if (arg4 != null)
									i_78_ = arg4[i_74_];
								else
									i_78_ = 0;
								i_74_++;
								int i_79_ = jagexString.method805(4, 77).method804(
										(byte) -103);
								Class4_Sub20_Sub12_Sub1 class4_sub20_sub12_sub1 = aClass4_Sub20_Sub12_Sub1Array3566[i_79_];
								class4_sub20_sub12_sub1
										.method507(
												arg1 + i_77_,
												(arg2
														+ anInt3546
														- class4_sub20_sub12_sub1.anInt3507 + i_78_));
								arg1 += class4_sub20_sub12_sub1.anInt3509;
								i_73_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method580(jagexString);
						continue;
					}
				}
				if (i == -1) {
					if (aByteArray3558 != null && i_73_ != -1)
						arg1 += aByteArray3558[(i_73_ << 8) + i_76_];
					int i_80_ = anIntArray3553[i_76_];
					int i_81_ = anIntArray3559[i_76_];
					int i_82_;
					if (arg3 != null)
						i_82_ = arg3[i_74_];
					else
						i_82_ = 0;
					int i_83_;
					if (arg4 != null)
						i_83_ = arg4[i_74_];
					else
						i_83_ = 0;
					i_74_++;
					if (i_76_ != 32) {
						if (anInt3562 == 256) {
							if (anInt3575 != -1)
								method565(
										aByteArrayArray3571[i_76_],
										(arg1 + anIntArray3572[i_76_] + 1 + i_82_),
										(arg2 + anIntArray3549[i_76_] + 1 + i_83_),
										i_80_, i_81_, anInt3575);
							method578(aByteArrayArray3571[i_76_], arg1
									+ anIntArray3572[i_76_] + i_82_, arg2
									+ anIntArray3549[i_76_] + i_83_, i_80_,
									i_81_, anInt3577);
						} else {
							if (anInt3575 != -1)
								method555(
										aByteArrayArray3571[i_76_],
										(arg1 + anIntArray3572[i_76_] + 1 + i_82_),
										(arg2 + anIntArray3549[i_76_] + 1 + i_83_),
										i_80_, i_81_, anInt3575, anInt3562);
							method558(aByteArrayArray3571[i_76_], arg1
									+ anIntArray3572[i_76_] + i_82_, arg2
									+ anIntArray3549[i_76_] + i_83_, i_80_,
									i_81_, anInt3577, anInt3562);
						}
					} else if (anInt3573 > 0) {
						anInt3543 += anInt3573;
						arg1 += anInt3543 >> 8;
						anInt3543 &= 0xff;
					}
					int i_84_ = anIntArray3556[i_76_];
					if (anInt3544 != -1)
						Class4_Sub20_Sub12.method505(arg1, arg2
								+ (int) (anInt3546 * 0.7), i_84_, anInt3544);
					if (anInt3561 != -1)
						Class4_Sub20_Sub12.method505(arg1, arg2 + anInt3546,
								i_84_, anInt3561);
					arg1 += i_84_;
					i_73_ = i_76_;
				}
			}
		}
	}

	public void method573(JagexString arg0, int arg1) {
		int i = 0;
		boolean bool = false;
		for (int i_85_ = 0; i_85_ < arg0.method825(-127); i_85_++) {
			int i_86_ = arg0.method834(21340, i_85_);
			if (i_86_ == 60)
				bool = true;
			else if (i_86_ == 62)
				bool = false;
			else if (!bool && i_86_ == 32)
				i++;
		}
		if (i > 0)
			anInt3573 = (arg1 - method560(arg0) << 8) / i;
	}

	public void method575(JagexString arg0, int arg1, int arg2, int arg3, int arg4,
                          int arg5) {
		if (arg0 != null) {
			method576(arg3, arg4);
			aRandom3570.setSeed(arg5);
			anInt3562 = 192 + (aRandom3570.nextInt() & 0x1f);
			int[] is = new int[arg0.anInt1805];
			int i = 0;
			for (int i_93_ = 0; i_93_ < arg0.anInt1805; i_93_++) {
				is[i_93_] = i;
				if ((aRandom3570.nextInt() & 0x3) == 0)
					i++;
			}
			method572(arg0, arg1, arg2, is, null);
		}
	}

	public void method576(int arg0, int arg1) {
		anInt3544 = -1;
		anInt3561 = -1;
		anInt3575 = anInt3545 = arg1;
		anInt3577 = anInt3555 = arg0;
		anInt3562 = 256;
		anInt3573 = 0;
		anInt3543 = 0;
	}

	public void method577(JagexString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			method576(arg3, arg4);
			method556(arg0, arg1, arg2);
		}
	}

	public abstract void method578(byte[] is, int i, int i_94_, int i_95_,
			int i_96_, int i_97_);

	public int method579(int arg0) {
		return anIntArray3556[arg0 & 0xff];
	}

	public void method580(JagexString arg0) {
		do {
			try {
				if (arg0.method808(aJagexString_3565, (byte) -95))
					anInt3577 = arg0.method805(4, -23).method835(-9613, 16);
				else if (arg0.method802(1, aJagexString_3547))
					anInt3577 = anInt3555;
				else if (arg0.method808(aJagexString_3569, (byte) -95))
					anInt3544 = arg0.method805(4, -88).method835(-9613, 16);
				else if (arg0.method802(1, aJagexString_3548))
					anInt3544 = 8388608;
				else if (arg0.method802(1, aJagexString_3550))
					anInt3544 = -1;
				else if (arg0.method808(aJagexString_3557, (byte) -95))
					anInt3561 = arg0.method805(2, -39).method835(-9613, 16);
				else if (arg0.method802(1, aJagexString_3576))
					anInt3561 = 0;
				else if (arg0.method802(1, aJagexString_3564))
					anInt3561 = -1;
				else if (arg0.method808(aJagexString_3563, (byte) -95))
					anInt3575 = arg0.method805(5, -61).method835(-9613, 16);
				else if (arg0.method802(1, aJagexString_3554))
					anInt3575 = 0;
				else if (arg0.method802(1, aJagexString_3551))
					anInt3575 = anInt3545;
				else {
					if (!arg0.method802(1, aJagexString_3552))
						break;
					method576(anInt3555, anInt3545);
				}
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}
}
