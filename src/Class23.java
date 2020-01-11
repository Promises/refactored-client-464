/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23 {
	public static Class41 aClass41_546 = new Class41();

	public static void method778(int[] arg0, int[] arg1, int[] arg2,
			byte[] arg3, int arg4, int arg5, int arg6) {
		int i = 0;
		for (int i_0_ = arg4; i_0_ <= arg5; i_0_++) {
			for (int i_1_ = 0; i_1_ < arg6; i_1_++) {
				if (arg3[i_1_] == i_0_) {
					arg2[i] = i_1_;
					i++;
				}
			}
		}
		for (int i_2_ = 0; i_2_ < 23; i_2_++)
			arg1[i_2_] = 0;
		for (int i_3_ = 0; i_3_ < arg6; i_3_++)
			arg1[arg3[i_3_] + 1]++;
		for (int i_4_ = 1; i_4_ < 23; i_4_++)
			arg1[i_4_] += arg1[i_4_ - 1];
		for (int i_5_ = 0; i_5_ < 23; i_5_++)
			arg0[i_5_] = 0;
		int i_6_ = 0;
		for (int i_7_ = arg4; i_7_ <= arg5; i_7_++) {
			i_6_ += arg1[i_7_ + 1] - arg1[i_7_];
			arg0[i_7_] = i_6_ - 1;
			i_6_ <<= 1;
		}
		for (int i_8_ = arg4 + 1; i_8_ <= arg5; i_8_++)
			arg1[i_8_] = (arg0[i_8_ - 1] + 1 << 1) - arg1[i_8_];
	}

	public static void method779(Class41 arg0) {
		arg0.anInt801 = 0;
		for (int i = 0; i < 256; i++) {
			if (arg0.aBooleanArray812[i]) {
				arg0.aByteArray800[arg0.anInt801] = (byte) i;
				arg0.anInt801++;
			}
		}
	}

	public static int method780(byte[] arg0, int arg1, byte[] arg2, int arg3,
			int arg4) {
		synchronized (aClass41_546) {
			aClass41_546.aByteArray794 = arg2;
			aClass41_546.anInt825 = arg4;
			aClass41_546.aByteArray831 = arg0;
			aClass41_546.anInt832 = 0;
			aClass41_546.anInt826 = arg1;
			aClass41_546.anInt814 = 0;
			aClass41_546.anInt799 = 0;
			aClass41_546.anInt827 = 0;
			aClass41_546.anInt819 = 0;
			method786(aClass41_546);
			arg1 -= aClass41_546.anInt826;
			aClass41_546.aByteArray794 = null;
			aClass41_546.aByteArray831 = null;
			return arg1;
		}
	}

	public static int method781(int arg0, Class41 arg1) {
		int i;
		for (;;) {
			if (arg1.anInt814 >= arg0) {
				int i_9_ = arg1.anInt799 >> arg1.anInt814 - arg0 & (1 << arg0)
						- 1;
				arg1.anInt814 -= arg0;
				i = i_9_;
				break;
			}
			arg1.anInt799 = (arg1.anInt799 << 8 | arg1.aByteArray794[arg1.anInt825] & 0xff);
			arg1.anInt814 += 8;
			arg1.anInt825++;
			arg1.anInt827++;
		}
		return i;
	}

	public static byte method782(Class41 arg0) {
		return (byte) method781(1, arg0);
	}

	public static byte method783(Class41 arg0) {
		return (byte) method781(8, arg0);
	}

	public static void method784() {
		aClass41_546 = null;
	}

	public static void method785(Class41 arg0) {
		byte i = arg0.aByte795;
		int i_10_ = arg0.anInt802;
		int i_11_ = arg0.anInt824;
		int i_12_ = arg0.anInt820;
		int[] is = Class65.anIntArray1304;
		int i_13_ = arg0.anInt809;
		byte[] is_14_ = arg0.aByteArray831;
		int i_15_ = arg0.anInt832;
		int i_16_ = arg0.anInt826;
		int i_17_ = i_16_;
		int i_18_ = arg0.anInt810 + 1;
		while_4_: for (;;) {
			if (i_10_ > 0) {
				for (;;) {
					if (i_16_ == 0)
						break while_4_;
					if (i_10_ == 1)
						break;
					is_14_[i_15_] = i;
					i_10_--;
					i_15_++;
					i_16_--;
				}
				if (i_16_ == 0) {
					i_10_ = 1;
					break;
				}
				is_14_[i_15_] = i;
				i_15_++;
				i_16_--;
			}
			boolean bool = true;
			while (bool) {
				bool = false;
				if (i_11_ == i_18_) {
					i_10_ = 0;
					break while_4_;
				}
				i = (byte) i_12_;
				i_13_ = is[i_13_];
				int i_19_ = (byte) (i_13_ & 0xff);
				i_13_ >>= 8;
				i_11_++;
				if (i_19_ != i_12_) {
					i_12_ = i_19_;
					if (i_16_ == 0) {
						i_10_ = 1;
						break while_4_;
					}
					is_14_[i_15_] = i;
					i_15_++;
					i_16_--;
					bool = true;
				} else if (i_11_ == i_18_) {
					if (i_16_ == 0) {
						i_10_ = 1;
						break while_4_;
					}
					is_14_[i_15_] = i;
					i_15_++;
					i_16_--;
					bool = true;
				}
			}
			i_10_ = 2;
			i_13_ = is[i_13_];
			int i_20_ = (byte) (i_13_ & 0xff);
			i_13_ >>= 8;
			if (++i_11_ != i_18_) {
				if (i_20_ != i_12_)
					i_12_ = i_20_;
				else {
					i_10_ = 3;
					i_13_ = is[i_13_];
					i_20_ = (byte) (i_13_ & 0xff);
					i_13_ >>= 8;
					if (++i_11_ != i_18_) {
						if (i_20_ != i_12_)
							i_12_ = i_20_;
						else {
							i_13_ = is[i_13_];
							i_20_ = (byte) (i_13_ & 0xff);
							i_13_ >>= 8;
							i_11_++;
							i_10_ = (i_20_ & 0xff) + 4;
							i_13_ = is[i_13_];
							i_12_ = (byte) (i_13_ & 0xff);
							i_13_ >>= 8;
							i_11_++;
						}
					}
				}
			}
		}
		arg0.anInt819 += i_17_ - i_16_;
		arg0.aByte795 = i;
		arg0.anInt802 = i_10_;
		arg0.anInt824 = i_11_;
		arg0.anInt820 = i_12_;
		Class65.anIntArray1304 = is;
		arg0.anInt809 = i_13_;
		arg0.aByteArray831 = is_14_;
		arg0.anInt832 = i_15_;
		arg0.anInt826 = i_16_;
	}

	public static void method786(Class41 arg0) {
		int i = 0;
		int[] is = null;
		int[] is_39_ = null;
		int[] is_40_ = null;
		arg0.anInt805 = 1;
		if (Class65.anIntArray1304 == null)
			Class65.anIntArray1304 = new int[arg0.anInt805 * 100000];
		boolean bool_41_ = true;
		while (bool_41_) {
			byte i_42_ = method783(arg0);
			if (i_42_ == 23)
				break;
			i_42_ = method783(arg0);
			i_42_ = method783(arg0);
			i_42_ = method783(arg0);
			i_42_ = method783(arg0);
			i_42_ = method783(arg0);
			i_42_ = method783(arg0);
			i_42_ = method783(arg0);
			i_42_ = method783(arg0);
			i_42_ = method783(arg0);
			i_42_ = method782(arg0);
			arg0.anInt821 = 0;
			int i_43_ = method783(arg0);
			arg0.anInt821 = arg0.anInt821 << 8 | i_43_ & 0xff;
			i_43_ = method783(arg0);
			arg0.anInt821 = arg0.anInt821 << 8 | i_43_ & 0xff;
			i_43_ = method783(arg0);
			arg0.anInt821 = arg0.anInt821 << 8 | i_43_ & 0xff;
			for (int i_44_ = 0; i_44_ < 16; i_44_++) {
				i_42_ = method782(arg0);
				if (i_42_ == 1)
					arg0.aBooleanArray813[i_44_] = true;
				else
					arg0.aBooleanArray813[i_44_] = false;
			}
			for (int i_45_ = 0; i_45_ < 256; i_45_++)
				arg0.aBooleanArray812[i_45_] = false;
			for (int i_46_ = 0; i_46_ < 16; i_46_++) {
				if (arg0.aBooleanArray813[i_46_]) {
					for (int i_47_ = 0; i_47_ < 16; i_47_++) {
						i_42_ = method782(arg0);
						if (i_42_ == 1)
							arg0.aBooleanArray812[i_46_ * 16 + i_47_] = true;
					}
				}
			}
			method779(arg0);
			int i_48_ = arg0.anInt801 + 2;
			int i_49_ = method781(3, arg0);
			int i_50_ = method781(15, arg0);
			for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
				int i_52_ = 0;
				for (;;) {
					i_42_ = method782(arg0);
					if (i_42_ == 0)
						break;
					i_52_++;
				}
				arg0.aByteArray830[i_51_] = (byte) i_52_;
			}
			byte[] is_53_ = new byte[6];
			for (byte i_54_ = 0; i_54_ < i_49_; i_54_++)
				is_53_[i_54_] = i_54_;
			for (int i_55_ = 0; i_55_ < i_50_; i_55_++) {
				byte i_56_ = arg0.aByteArray830[i_55_];
				byte i_57_ = is_53_[i_56_];
				for (/**/; i_56_ > 0; i_56_--)
					is_53_[i_56_] = is_53_[i_56_ - 1];
				is_53_[0] = i_57_;
				arg0.aByteArray829[i_55_] = i_57_;
			}
			for (int i_58_ = 0; i_58_ < i_49_; i_58_++) {
				int i_59_ = method781(5, arg0);
				for (int i_60_ = 0; i_60_ < i_48_; i_60_++) {
					for (;;) {
						i_42_ = method782(arg0);
						if (i_42_ == 0)
							break;
						i_42_ = method782(arg0);
						if (i_42_ == 0)
							i_59_++;
						else
							i_59_--;
					}
					arg0.aByteArrayArray811[i_58_][i_60_] = (byte) i_59_;
				}
			}
			for (int i_61_ = 0; i_61_ < i_49_; i_61_++) {
				int i_62_ = 32;
				byte i_63_ = 0;
				for (int i_64_ = 0; i_64_ < i_48_; i_64_++) {
					if (arg0.aByteArrayArray811[i_61_][i_64_] > i_63_)
						i_63_ = arg0.aByteArrayArray811[i_61_][i_64_];
					if (arg0.aByteArrayArray811[i_61_][i_64_] < i_62_)
						i_62_ = arg0.aByteArrayArray811[i_61_][i_64_];
				}
				method778(arg0.anIntArrayArray823[i_61_],
						arg0.anIntArrayArray815[i_61_],
						arg0.anIntArrayArray798[i_61_],
						arg0.aByteArrayArray811[i_61_], i_62_, i_63_, i_48_);
				arg0.anIntArray833[i_61_] = i_62_;
			}
			int i_65_ = arg0.anInt801 + 1;
			int i_66_ = -1;
			int i_67_ = 0;
			for (int i_68_ = 0; i_68_ <= 255; i_68_++)
				arg0.anIntArray806[i_68_] = 0;
			int i_69_ = 4095;
			for (int i_70_ = 15; i_70_ >= 0; i_70_--) {
				for (int i_71_ = 15; i_71_ >= 0; i_71_--) {
					arg0.aByteArray793[i_69_] = (byte) (i_70_ * 16 + i_71_);
					i_69_--;
				}
				arg0.anIntArray816[i_70_] = i_69_ + 1;
			}
			int i_72_ = 0;
			if (i_67_ == 0) {
				i_66_++;
				i_67_ = 50;
				byte i_73_ = arg0.aByteArray829[i_66_];
				i = arg0.anIntArray833[i_73_];
				is = arg0.anIntArrayArray823[i_73_];
				is_40_ = arg0.anIntArrayArray798[i_73_];
				is_39_ = arg0.anIntArrayArray815[i_73_];
			}
			i_67_--;
			int i_74_ = i;
			int i_75_;
			int i_76_;
			for (i_76_ = method781(i_74_, arg0); i_76_ > is[i_74_]; i_76_ = i_76_ << 1
					| i_75_) {
				i_74_++;
				i_75_ = method782(arg0);
			}
			int i_77_ = is_40_[i_76_ - is_39_[i_74_]];
			while (i_77_ != i_65_) {
				if (i_77_ == 0 || i_77_ == 1) {
					int i_78_ = -1;
					int i_79_ = 1;
					do {
						if (i_77_ == 0)
							i_78_ += i_79_;
						else if (i_77_ == 1)
							i_78_ += 2 * i_79_;
						i_79_ *= 2;
						if (i_67_ == 0) {
							i_66_++;
							i_67_ = 50;
							byte i_80_ = arg0.aByteArray829[i_66_];
							i = arg0.anIntArray833[i_80_];
							is = arg0.anIntArrayArray823[i_80_];
							is_40_ = arg0.anIntArrayArray798[i_80_];
							is_39_ = arg0.anIntArrayArray815[i_80_];
						}
						i_67_--;
						i_74_ = i;
						for (i_76_ = method781(i_74_, arg0); i_76_ > is[i_74_]; i_76_ = i_76_ << 1
								| i_75_) {
							i_74_++;
							i_75_ = method782(arg0);
						}
						i_77_ = is_40_[i_76_ - is_39_[i_74_]];
					} while (i_77_ == 0 || i_77_ == 1);
					i_78_++;
					i_43_ = (arg0.aByteArray800[arg0.aByteArray793[arg0.anIntArray816[0]] & 0xff]);
					arg0.anIntArray806[i_43_ & 0xff] += i_78_;
					for (/**/; i_78_ > 0; i_78_--) {
						Class65.anIntArray1304[i_72_] = i_43_ & 0xff;
						i_72_++;
					}
				} else {
					int i_81_ = i_77_ - 1;
					if (i_81_ < 16) {
						int i_82_ = arg0.anIntArray816[0];
						i_42_ = arg0.aByteArray793[i_82_ + i_81_];
						for (/**/; i_81_ > 3; i_81_ -= 4) {
							int i_83_ = i_82_ + i_81_;
							arg0.aByteArray793[i_83_] = arg0.aByteArray793[i_83_ - 1];
							arg0.aByteArray793[i_83_ - 1] = arg0.aByteArray793[i_83_ - 2];
							arg0.aByteArray793[i_83_ - 2] = arg0.aByteArray793[i_83_ - 3];
							arg0.aByteArray793[i_83_ - 3] = arg0.aByteArray793[i_83_ - 4];
						}
						for (/**/; i_81_ > 0; i_81_--)
							arg0.aByteArray793[i_82_ + i_81_] = arg0.aByteArray793[i_82_
									+ i_81_ - 1];
						arg0.aByteArray793[i_82_] = i_42_;
					} else {
						int i_84_ = i_81_ / 16;
						int i_85_ = i_81_ % 16;
						int i_86_ = arg0.anIntArray816[i_84_] + i_85_;
						i_42_ = arg0.aByteArray793[i_86_];
						for (/**/; i_86_ > arg0.anIntArray816[i_84_]; i_86_--)
							arg0.aByteArray793[i_86_] = arg0.aByteArray793[i_86_ - 1];
						arg0.anIntArray816[i_84_]++;
						for (/**/; i_84_ > 0; i_84_--) {
							arg0.anIntArray816[i_84_]--;
							arg0.aByteArray793[arg0.anIntArray816[i_84_]] = (arg0.aByteArray793[arg0.anIntArray816[i_84_ - 1] + 16 - 1]);
						}
						arg0.anIntArray816[0]--;
						arg0.aByteArray793[arg0.anIntArray816[0]] = i_42_;
						if (arg0.anIntArray816[0] == 0) {
							int i_87_ = 4095;
							for (int i_88_ = 15; i_88_ >= 0; i_88_--) {
								for (int i_89_ = 15; i_89_ >= 0; i_89_--) {
									arg0.aByteArray793[i_87_] = (arg0.aByteArray793[(arg0.anIntArray816[i_88_] + i_89_)]);
									i_87_--;
								}
								arg0.anIntArray816[i_88_] = i_87_ + 1;
							}
						}
					}
					arg0.anIntArray806[(arg0.aByteArray800[i_42_ & 0xff] & 0xff)]++;
					Class65.anIntArray1304[i_72_] = arg0.aByteArray800[i_42_ & 0xff] & 0xff;
					i_72_++;
					if (i_67_ == 0) {
						i_66_++;
						i_67_ = 50;
						byte i_90_ = arg0.aByteArray829[i_66_];
						i = arg0.anIntArray833[i_90_];
						is = arg0.anIntArrayArray823[i_90_];
						is_40_ = arg0.anIntArrayArray798[i_90_];
						is_39_ = arg0.anIntArrayArray815[i_90_];
					}
					i_67_--;
					i_74_ = i;
					for (i_76_ = method781(i_74_, arg0); i_76_ > is[i_74_]; i_76_ = i_76_ << 1
							| i_75_) {
						i_74_++;
						i_75_ = method782(arg0);
					}
					i_77_ = is_40_[i_76_ - is_39_[i_74_]];
				}
			}
			arg0.anInt802 = 0;
			arg0.aByte795 = (byte) 0;
			arg0.anIntArray807[0] = 0;
			for (int i_91_ = 1; i_91_ <= 256; i_91_++)
				arg0.anIntArray807[i_91_] = arg0.anIntArray806[i_91_ - 1];
			for (int i_92_ = 1; i_92_ <= 256; i_92_++)
				arg0.anIntArray807[i_92_] += arg0.anIntArray807[i_92_ - 1];
			for (int i_93_ = 0; i_93_ < i_72_; i_93_++) {
				i_43_ = (byte) (Class65.anIntArray1304[i_93_] & 0xff);
				Class65.anIntArray1304[arg0.anIntArray807[i_43_ & 0xff]] |= i_93_ << 8;
				arg0.anIntArray807[i_43_ & 0xff]++;
			}
			arg0.anInt809 = Class65.anIntArray1304[arg0.anInt821] >> 8;
			arg0.anInt824 = 0;
			arg0.anInt809 = Class65.anIntArray1304[arg0.anInt809];
			arg0.anInt820 = (byte) (arg0.anInt809 & 0xff);
			arg0.anInt809 >>= 8;
			arg0.anInt824++;
			arg0.anInt810 = i_72_;
			method785(arg0);
			if (arg0.anInt824 == arg0.anInt810 + 1 && arg0.anInt802 == 0)
				bool_41_ = true;
			else
				bool_41_ = false;
		}
	}
}
