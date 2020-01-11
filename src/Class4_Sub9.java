/* Class4_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4_Sub9 extends RSFont {
	public static boolean aBoolean1999 = false;
	public static boolean[] aBooleanArray2005;
	public static byte[] aByteArray1981;
	public static Class15[] aClass15Array2010;
	public static Class17[] aClass17Array1994;
	public static Class55[] aClass55Array2009;
	public static Class60[] aClass60Array2006;
	public static float[] aFloatArray1986;
	public static float[] aFloatArray1989;
	public static float[] aFloatArray1992;
	public static float[] aFloatArray1993;
	public static float[] aFloatArray1996;
	public static float[] aFloatArray2000;
	public static float[] aFloatArray2002;
	public static int anInt1983;
	public static int anInt1984;
	public static int anInt2004;
	public static int anInt2008;
	public static int[] anIntArray1988;
	public static int[] anIntArray1991;
	public static int[] anIntArray1995;

	public static boolean method193(Class19 arg0) {
		if (!aBoolean1999) {
			byte[] is = arg0.method746(0, (byte) 105, 0);
			if (is == null)
				return false;
			method199(is);
			aBoolean1999 = true;
		}
		return true;
	}

	public static Class4_Sub9 method194(Class19 arg0, int arg1, int arg2) {
		if (!method193(arg0)) {
			arg0.method739((byte) -4, arg1, arg2);
			return null;
		}
		byte[] is = arg0.method746(arg1, (byte) 124, arg2);
		if (is == null)
			return null;
		return new Class4_Sub9(is);
	}

	public static void method195(byte[] arg0, int arg1) {
		aByteArray1981 = arg0;
		anInt2008 = arg1;
		anInt2004 = 0;
	}

	public static float method197(int arg0) {
		int i = arg0 & 0x1fffff;
		int i_82_ = arg0 & ~0x7fffffff;
		int i_83_ = (arg0 & 0x7fe00000) >> 21;
		if (i_82_ != 0)
			i = -i;
		return (float) (i * Math.pow(2.0, (i_83_ - 788)));
	}

	public static int method198(int arg0) {
		int i = 0;
		int i_84_ = 0;
		int i_85_;
		for (/**/; arg0 >= 8 - anInt2004; arg0 -= i_85_) {
			i_85_ = 8 - anInt2004;
			int i_86_ = (1 << i_85_) - 1;
			i += (aByteArray1981[anInt2008] >> anInt2004 & i_86_) << i_84_;
			anInt2004 = 0;
			anInt2008++;
			i_84_ += i_85_;
		}
		if (arg0 > 0) {
			i_85_ = (1 << arg0) - 1;
			i += (aByteArray1981[anInt2008] >> anInt2004 & i_85_) << i_84_;
			anInt2004 += arg0;
		}
		return i;
	}

	public static void method199(byte[] arg0) {
		method195(arg0, 0);
		anInt1984 = 1 << method198(4);
		anInt1983 = 1 << method198(4);
		aFloatArray1989 = new float[anInt1983];
		for (int i = 0; i < 2; i++) {
			int i_87_ = i != 0 ? anInt1983 : anInt1984;
			int i_88_ = i_87_ >> 1;
			int i_89_ = i_87_ >> 2;
			int i_90_ = i_87_ >> 3;
			float[] fs = new float[i_88_];
			for (int i_91_ = 0; i_91_ < i_89_; i_91_++) {
				fs[2 * i_91_] = (float) Math.cos((4 * i_91_)
						* 3.141592653589793 / i_87_);
				fs[2 * i_91_ + 1] = -(float) Math.sin((4 * i_91_)
						* 3.141592653589793 / i_87_);
			}
			float[] fs_92_ = new float[i_88_];
			for (int i_93_ = 0; i_93_ < i_89_; i_93_++) {
				fs_92_[2 * i_93_] = (float) Math.cos((2 * i_93_ + 1)
						* 3.141592653589793 / (2 * i_87_));
				fs_92_[2 * i_93_ + 1] = (float) Math.sin((2 * i_93_ + 1)
						* 3.141592653589793 / (2 * i_87_));
			}
			float[] fs_94_ = new float[i_89_];
			for (int i_95_ = 0; i_95_ < i_90_; i_95_++) {
				fs_94_[2 * i_95_] = (float) Math.cos((4 * i_95_ + 2)
						* 3.141592653589793 / i_87_);
				fs_94_[2 * i_95_ + 1] = -(float) Math.sin((4 * i_95_ + 2)
						* 3.141592653589793 / i_87_);
			}
			int[] is = new int[i_90_];
			int i_96_ = Class68.method1096(i_90_ - 1, 73);
			for (int i_97_ = 0; i_97_ < i_90_; i_97_++)
				is[i_97_] = JagexString.method840(-46, i_97_, i_96_);
			if (i != 0) {
				aFloatArray1992 = fs;
				aFloatArray2002 = fs_92_;
				aFloatArray1996 = fs_94_;
				anIntArray1995 = is;
			} else {
				aFloatArray1993 = fs;
				aFloatArray2000 = fs_92_;
				aFloatArray1986 = fs_94_;
				anIntArray1988 = is;
			}
		}
		int i = method198(8) + 1;
		aClass60Array2006 = new Class60[i];
		for (int i_98_ = 0; i_98_ < i; i_98_++)
			aClass60Array2006[i_98_] = new Class60();
		int i_99_ = method198(6) + 1;
		for (int i_100_ = 0; i_100_ < i_99_; i_100_++)
			method198(16);
		int i_101_ = method198(6) + 1;
		aClass15Array2010 = new Class15[i_101_];
		for (int i_102_ = 0; i_102_ < i_101_; i_102_++)
			aClass15Array2010[i_102_] = new Class15();
		int i_103_ = method198(6) + 1;
		aClass17Array1994 = new Class17[i_103_];
		for (int i_104_ = 0; i_104_ < i_103_; i_104_++)
			aClass17Array1994[i_104_] = new Class17();
		int i_105_ = method198(6) + 1;
		aClass55Array2009 = new Class55[i_105_];
		for (int i_106_ = 0; i_106_ < i_105_; i_106_++)
			aClass55Array2009[i_106_] = new Class55();
		int i_107_ = method198(6) + 1;
		aBooleanArray2005 = new boolean[i_107_];
		anIntArray1991 = new int[i_107_];
		for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
			aBooleanArray2005[i_108_] = method201() != 0;
			method198(16);
			method198(16);
			anIntArray1991[i_108_] = method198(8);
		}
	}

	public static void method200() {
		aByteArray1981 = null;
		aClass60Array2006 = null;
		aClass15Array2010 = null;
		aClass17Array1994 = null;
		aClass55Array2009 = null;
		aBooleanArray2005 = null;
		anIntArray1991 = null;
		aFloatArray1989 = null;
		aFloatArray1993 = null;
		aFloatArray2000 = null;
		aFloatArray1986 = null;
		aFloatArray1992 = null;
		aFloatArray2002 = null;
		aFloatArray1996 = null;
		anIntArray1988 = null;
		anIntArray1995 = null;
	}

	public static int method201() {
		int i = aByteArray1981[anInt2008] >> anInt2004 & 0x1;
		anInt2004++;
		anInt2008 += anInt2004 >> 3;
		anInt2004 &= 0x7;
		return i;
	}

	public boolean aBoolean1985;
	public boolean aBoolean1997;
	public byte[] aByteArray2012;
	public byte[][] aByteArrayArray1987;
	public float[] aFloatArray2001;

	public int anInt1982;

	public int anInt1990;

	public int anInt1998;

	public int anInt2003;

	public int anInt2007;

	public int anInt2011;

	public int anInt2013;

	public int anInt2014;

	public Class4_Sub9(byte[] arg0) {
		method192(arg0);
	}

	public float[] method191(int arg0) {
		method195(aByteArrayArray1987[arg0], 0);
		method201();
		int i = method198(Class68.method1096(anIntArray1991.length - 1, -128));
		boolean bool = aBooleanArray2005[i];
		int i_0_ = bool ? anInt1983 : anInt1984;
		boolean bool_1_ = false;
		boolean bool_2_ = false;
		if (bool) {
			bool_1_ = method201() != 0;
			bool_2_ = method201() != 0;
		}
		int i_3_ = i_0_ >> 1;
		int i_4_;
		int i_5_;
		int i_6_;
		if (bool && !bool_1_) {
			i_4_ = (i_0_ >> 2) - (anInt1984 >> 2);
			i_5_ = (i_0_ >> 2) + (anInt1984 >> 2);
			i_6_ = anInt1984 >> 1;
		} else {
			i_4_ = 0;
			i_5_ = i_3_;
			i_6_ = i_0_ >> 1;
		}
		int i_7_;
		int i_8_;
		int i_9_;
		if (bool && !bool_2_) {
			i_7_ = i_0_ - (i_0_ >> 2) - (anInt1984 >> 2);
			i_8_ = i_0_ - (i_0_ >> 2) + (anInt1984 >> 2);
			i_9_ = anInt1984 >> 1;
		} else {
			i_7_ = i_3_;
			i_8_ = i_0_;
			i_9_ = i_0_ >> 1;
		}
		Class55 class55 = aClass55Array2009[anIntArray1991[i]];
		int i_10_ = class55.anInt1110;
		int i_11_ = class55.anIntArray1113[i_10_];
		boolean bool_12_ = !aClass15Array2010[i_11_].method712();
		boolean bool_13_ = bool_12_;
		for (int i_14_ = 0; i_14_ < class55.anInt1111; i_14_++) {
			Class17 class17 = aClass17Array1994[class55.anIntArray1112[i_14_]];
			float[] fs = aFloatArray1989;
			class17.method730(fs, i_0_ >> 1, bool_13_);
		}
		if (!bool_12_) {
			int i_15_ = class55.anInt1110;
			int i_16_ = class55.anIntArray1113[i_15_];
			aClass15Array2010[i_16_].method715(aFloatArray1989, i_0_ >> 1);
		}
		if (bool_12_) {
			for (int i_17_ = i_0_ >> 1; i_17_ < i_0_; i_17_++)
				aFloatArray1989[i_17_] = 0.0F;
		} else {
			int i_18_ = i_0_ >> 1;
			int i_19_ = i_0_ >> 2;
			int i_20_ = i_0_ >> 3;
			float[] fs = aFloatArray1989;
			for (int i_21_ = 0; i_21_ < i_18_; i_21_++)
				fs[i_21_] *= 0.5F;
			for (int i_22_ = i_18_; i_22_ < i_0_; i_22_++)
				fs[i_22_] = -fs[i_0_ - i_22_ - 1];
			float[] fs_23_ = bool ? aFloatArray1992 : aFloatArray1993;
			float[] fs_24_ = bool ? aFloatArray2002 : aFloatArray2000;
			float[] fs_25_ = bool ? aFloatArray1996 : aFloatArray1986;
			int[] is = bool ? anIntArray1995 : anIntArray1988;
			for (int i_26_ = 0; i_26_ < i_19_; i_26_++) {
				float f = fs[4 * i_26_] - fs[i_0_ - 4 * i_26_ - 1];
				float f_27_ = fs[4 * i_26_ + 2] - fs[i_0_ - 4 * i_26_ - 3];
				float f_28_ = fs_23_[2 * i_26_];
				float f_29_ = fs_23_[2 * i_26_ + 1];
				fs[i_0_ - 4 * i_26_ - 1] = f * f_28_ - f_27_ * f_29_;
				fs[i_0_ - 4 * i_26_ - 3] = f * f_29_ + f_27_ * f_28_;
			}
			for (int i_30_ = 0; i_30_ < i_20_; i_30_++) {
				float f = fs[i_18_ + 3 + 4 * i_30_];
				float f_31_ = fs[i_18_ + 1 + 4 * i_30_];
				float f_32_ = fs[4 * i_30_ + 3];
				float f_33_ = fs[4 * i_30_ + 1];
				fs[i_18_ + 3 + 4 * i_30_] = f + f_32_;
				fs[i_18_ + 1 + 4 * i_30_] = f_31_ + f_33_;
				float f_34_ = fs_23_[i_18_ - 4 - 4 * i_30_];
				float f_35_ = fs_23_[i_18_ - 3 - 4 * i_30_];
				fs[4 * i_30_ + 3] = (f - f_32_) * f_34_ - (f_31_ - f_33_)
						* f_35_;
				fs[4 * i_30_ + 1] = (f_31_ - f_33_) * f_34_ + (f - f_32_)
						* f_35_;
			}
			int i_36_ = Class68.method1096(i_0_ - 1, -118);
			for (int i_37_ = 0; i_37_ < i_36_ - 3; i_37_++) {
				int i_38_ = i_0_ >> i_37_ + 2;
				int i_39_ = 8 << i_37_;
				for (int i_40_ = 0; i_40_ < 2 << i_37_; i_40_++) {
					int i_41_ = i_0_ - i_38_ * 2 * i_40_;
					int i_42_ = i_0_ - i_38_ * (2 * i_40_ + 1);
					for (int i_43_ = 0; i_43_ < i_0_ >> i_37_ + 4; i_43_++) {
						int i_44_ = 4 * i_43_;
						float f = fs[i_41_ - 1 - i_44_];
						float f_45_ = fs[i_41_ - 3 - i_44_];
						float f_46_ = fs[i_42_ - 1 - i_44_];
						float f_47_ = fs[i_42_ - 3 - i_44_];
						fs[i_41_ - 1 - i_44_] = f + f_46_;
						fs[i_41_ - 3 - i_44_] = f_45_ + f_47_;
						float f_48_ = fs_23_[i_43_ * i_39_];
						float f_49_ = fs_23_[i_43_ * i_39_ + 1];
						fs[i_42_ - 1 - i_44_] = (f - f_46_) * f_48_
								- (f_45_ - f_47_) * f_49_;
						fs[i_42_ - 3 - i_44_] = (f_45_ - f_47_) * f_48_
								+ (f - f_46_) * f_49_;
					}
				}
			}
			for (int i_50_ = 1; i_50_ < i_20_ - 1; i_50_++) {
				int i_51_ = is[i_50_];
				if (i_50_ < i_51_) {
					int i_52_ = 8 * i_50_;
					int i_53_ = 8 * i_51_;
					float f = fs[i_52_ + 1];
					fs[i_52_ + 1] = fs[i_53_ + 1];
					fs[i_53_ + 1] = f;
					f = fs[i_52_ + 3];
					fs[i_52_ + 3] = fs[i_53_ + 3];
					fs[i_53_ + 3] = f;
					f = fs[i_52_ + 5];
					fs[i_52_ + 5] = fs[i_53_ + 5];
					fs[i_53_ + 5] = f;
					f = fs[i_52_ + 7];
					fs[i_52_ + 7] = fs[i_53_ + 7];
					fs[i_53_ + 7] = f;
				}
			}
			for (int i_54_ = 0; i_54_ < i_18_; i_54_++)
				fs[i_54_] = fs[2 * i_54_ + 1];
			for (int i_55_ = 0; i_55_ < i_20_; i_55_++) {
				fs[i_0_ - 1 - 2 * i_55_] = fs[4 * i_55_];
				fs[i_0_ - 2 - 2 * i_55_] = fs[4 * i_55_ + 1];
				fs[i_0_ - i_19_ - 1 - 2 * i_55_] = fs[4 * i_55_ + 2];
				fs[i_0_ - i_19_ - 2 - 2 * i_55_] = fs[4 * i_55_ + 3];
			}
			for (int i_56_ = 0; i_56_ < i_20_; i_56_++) {
				float f = fs_25_[2 * i_56_];
				float f_57_ = fs_25_[2 * i_56_ + 1];
				float f_58_ = fs[i_18_ + 2 * i_56_];
				float f_59_ = fs[i_18_ + 2 * i_56_ + 1];
				float f_60_ = fs[i_0_ - 2 - 2 * i_56_];
				float f_61_ = fs[i_0_ - 1 - 2 * i_56_];
				float f_62_ = f_57_ * (f_58_ - f_60_) + f * (f_59_ + f_61_);
				fs[i_18_ + 2 * i_56_] = (f_58_ + f_60_ + f_62_) * 0.5F;
				fs[i_0_ - 2 - 2 * i_56_] = (f_58_ + f_60_ - f_62_) * 0.5F;
				f_62_ = f_57_ * (f_59_ + f_61_) - f * (f_58_ - f_60_);
				fs[i_18_ + 2 * i_56_ + 1] = (f_59_ - f_61_ + f_62_) * 0.5F;
				fs[i_0_ - 1 - 2 * i_56_] = (-f_59_ + f_61_ + f_62_) * 0.5F;
			}
			for (int i_63_ = 0; i_63_ < i_19_; i_63_++) {
				fs[i_63_] = (fs[2 * i_63_ + i_18_] * fs_24_[2 * i_63_] + fs[2
						* i_63_ + 1 + i_18_]
						* fs_24_[2 * i_63_ + 1]);
				fs[i_18_ - 1 - i_63_] = (fs[2 * i_63_ + i_18_]
						* fs_24_[2 * i_63_ + 1] - fs[2 * i_63_ + 1 + i_18_]
						* fs_24_[2 * i_63_]);
			}
			for (int i_64_ = 0; i_64_ < i_19_; i_64_++)
				fs[i_0_ - i_19_ + i_64_] = -fs[i_64_];
			for (int i_65_ = 0; i_65_ < i_19_; i_65_++)
				fs[i_65_] = fs[i_19_ + i_65_];
			for (int i_66_ = 0; i_66_ < i_19_; i_66_++)
				fs[i_19_ + i_66_] = -fs[i_19_ - i_66_ - 1];
			for (int i_67_ = 0; i_67_ < i_19_; i_67_++)
				fs[i_18_ + i_67_] = fs[i_0_ - i_67_ - 1];
			for (int i_68_ = i_4_; i_68_ < i_5_; i_68_++) {
				float f = (float) Math.sin(((i_68_ - i_4_) + 0.5) / i_6_ * 0.5
						* 3.141592653589793);
				aFloatArray1989[i_68_] *= (float) Math.sin(1.5707963267948966
						* f * f);
			}
			for (int i_69_ = i_7_; i_69_ < i_8_; i_69_++) {
				float f = (float) Math
						.sin((((i_69_ - i_7_) + 0.5) / i_9_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray1989[i_69_] *= (float) Math.sin(1.5707963267948966
						* f * f);
			}
		}
		float[] fs = null;
		if (anInt1982 > 0) {
			int i_70_ = anInt1982 + i_0_ >> 2;
			fs = new float[i_70_];
			if (!aBoolean1997) {
				for (int i_71_ = 0; i_71_ < anInt2003; i_71_++) {
					int i_72_ = (anInt1982 >> 1) + i_71_;
					fs[i_71_] += aFloatArray2001[i_72_];
				}
			}
			if (!bool_12_) {
				for (int i_73_ = i_4_; i_73_ < i_0_ >> 1; i_73_++) {
					int i_74_ = fs.length - (i_0_ >> 1) + i_73_;
					fs[i_74_] += aFloatArray1989[i_73_];
				}
			}
		}
		float[] fs_75_ = aFloatArray2001;
		aFloatArray2001 = aFloatArray1989;
		aFloatArray1989 = fs_75_;
		anInt1982 = i_0_;
		anInt2003 = i_8_ - (i_0_ >> 1);
		aBoolean1997 = bool_12_;
		return fs;
	}

	public void method192(byte[] arg0) {
		StreamBuffer class4_sub11 = new StreamBuffer(arg0);
		anInt1990 = class4_sub11.method219((byte) 73);
		anInt2011 = class4_sub11.method219((byte) 73);
		anInt2007 = class4_sub11.method219((byte) 73);
		anInt1998 = class4_sub11.method219((byte) 73);
		if (anInt1998 < 0) {
			anInt1998 = anInt1998 ^ 0xffffffff;
			aBoolean1985 = true;
		}
		int i = class4_sub11.method219((byte) 73);
		aByteArrayArray1987 = new byte[i][];
		for (int i_76_ = 0; i_76_ < i; i_76_++) {
			int i_77_ = 0;
			int i_78_;
			do {
				i_78_ = class4_sub11.get();
				i_77_ += i_78_;
			} while (i_78_ >= 255);
			byte[] is = new byte[i_77_];
			class4_sub11.method253(0, (byte) -12, i_77_, is);
			aByteArrayArray1987[i_76_] = is;
		}
	}

	public Class4_Sub4_Sub1 method196(int[] arg0) {
		if (arg0 != null && arg0[0] <= 0)
			return null;
		if (aByteArray2012 == null) {
			anInt1982 = 0;
			aFloatArray2001 = new float[anInt1983];
			aByteArray2012 = new byte[anInt2011];
			anInt2013 = 0;
			anInt2014 = 0;
		}
		for (/**/; anInt2014 < aByteArrayArray1987.length; anInt2014++) {
			if (arg0 != null && arg0[0] <= 0)
				return null;
			float[] fs = method191(anInt2014);
			if (fs != null) {
				int i = anInt2013;
				int i_79_ = fs.length;
				if (i_79_ > anInt2011 - i)
					i_79_ = anInt2011 - i;
				for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
					int i_81_ = (int) (128.0F + fs[i_80_] * 128.0F);
					if ((i_81_ & ~0xff) != 0)
						i_81_ = (i_81_ ^ 0xffffffff) >> 31;
					aByteArray2012[i++] = (byte) (i_81_ - 128);
				}
				if (arg0 != null)
					arg0[0] -= i - anInt2013;
				anInt2013 = i;
			}
		}
		aFloatArray2001 = null;
		byte[] is = aByteArray2012;
		aByteArray2012 = null;
		return new Class4_Sub4_Sub1(anInt1990, is, anInt2007, anInt1998,
				aBoolean1985);
	}
}
