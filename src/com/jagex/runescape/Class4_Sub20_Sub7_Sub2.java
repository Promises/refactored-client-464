package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub20_Sub7_Sub2 extends Class4_Sub20_Sub7 {
	public static int anInt3322;
	public static int[] anIntArray3300;
	public static int[] anIntArray3304 = new int[10000];
	public static int[] anIntArray3315 = new int[10000];
	static {
		anIntArray3300 = new int[128];
		anInt3322 = 0;
		int i = 0;
		int i_115_ = 248;
		while (i < 9)
			anIntArray3300[i++] = 255;
		while (i < 16) {
			anIntArray3300[i++] = i_115_;
			i_115_ -= 8;
		}
		while (i < 32) {
			anIntArray3300[i++] = i_115_;
			i_115_ -= 4;
		}
		while (i < 64) {
			anIntArray3300[i++] = i_115_;
			i_115_ -= 2;
		}
		while (i < 128)
			anIntArray3300[i++] = i_115_--;
	}

	public static Class4_Sub20_Sub7_Sub2 method399(Class19 arg0, int arg1,
			int arg2) {
		byte[] is = arg0.method746(arg1, (byte) 121, arg2);
		if (is == null)
			return null;
		return new Class4_Sub20_Sub7_Sub2(is);
	}

	public static void method402() {
		anIntArray3315 = null;
		anIntArray3304 = null;
		anIntArray3300 = null;
	}

	public static int method407(int arg0) {
		if (arg0 < 0)
			arg0 = 0;
		else if (arg0 > 127)
			arg0 = 127;
		arg0 = anIntArray3300[arg0];
		return arg0;
	}

	public static int method412(int arg0, int arg1) {
		arg1 = arg1 * (arg0 & 0x7f) >> 7;
		if (arg1 < 2)
			arg1 = 2;
		else if (arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public static void method415(Class4_Sub20_Sub7_Sub2 arg0,
			Class4_Sub20_Sub7_Sub2 arg1, int arg2, int arg3, int arg4,
			boolean arg5) {
		arg0.method403();
		arg0.method414();
		arg1.method403();
		arg1.method414();
		anInt3322++;
		int i = 0;
		int[] is = arg1.anIntArray3326;
		int i_49_ = arg1.anInt3327;
		for (int i_50_ = 0; i_50_ < arg0.anInt3327; i_50_++) {
			Class7 class7 = arg0.aClass7Array3311[i_50_];
			if (class7.anInt227 != 0) {
				int i_51_ = arg0.anIntArray3314[i_50_] - arg3;
				if (i_51_ <= arg1.anInt3302) {
					int i_52_ = arg0.anIntArray3326[i_50_] - arg2;
					if (i_52_ >= arg1.anInt3306 && i_52_ <= arg1.anInt3325) {
						int i_53_ = arg0.anIntArray3309[i_50_] - arg4;
						if (i_53_ >= arg1.anInt3305 && i_53_ <= arg1.anInt3329) {
							for (int i_54_ = 0; i_54_ < i_49_; i_54_++) {
								Class7 class7_55_ = arg1.aClass7Array3311[i_54_];
								if (i_52_ == is[i_54_]
										&& i_53_ == arg1.anIntArray3309[i_54_]
										&& i_51_ == arg1.anIntArray3314[i_54_]
										&& class7_55_.anInt227 != 0) {
									if (arg0.aClass7Array3312 == null)
										arg0.aClass7Array3312 = new Class7[arg0.anInt3327];
									if (arg1.aClass7Array3312 == null)
										arg1.aClass7Array3312 = new Class7[i_49_];
									Class7 class7_56_ = arg0.aClass7Array3312[i_50_];
									if (class7_56_ == null)
										class7_56_ = arg0.aClass7Array3312[i_50_] = new Class7(
												class7);
									Class7 class7_57_ = arg1.aClass7Array3312[i_54_];
									if (class7_57_ == null)
										class7_57_ = arg1.aClass7Array3312[i_54_] = new Class7(
												class7_55_);
									class7_56_.anInt229 += class7_55_.anInt229;
									class7_56_.anInt231 += class7_55_.anInt231;
									class7_56_.anInt237 += class7_55_.anInt237;
									class7_56_.anInt227 += class7_55_.anInt227;
									class7_57_.anInt229 += class7.anInt229;
									class7_57_.anInt231 += class7.anInt231;
									class7_57_.anInt237 += class7.anInt237;
									class7_57_.anInt227 += class7.anInt227;
									i++;
									anIntArray3315[i_50_] = anInt3322;
									anIntArray3304[i_54_] = anInt3322;
								}
							}
						}
					}
				}
			}
		}
		if (i >= 3 && arg5) {
			for (int i_58_ = 0; i_58_ < arg0.anInt3303; i_58_++) {
				if (anIntArray3315[arg0.anIntArray3331[i_58_]] == anInt3322
						&& anIntArray3315[arg0.anIntArray3320[i_58_]] == anInt3322
						&& (anIntArray3315[arg0.anIntArray3324[i_58_]] == anInt3322)) {
					if (arg0.aByteArray3308 == null)
						arg0.aByteArray3308 = new byte[arg0.anInt3303];
					arg0.aByteArray3308[i_58_] = (byte) 2;
				}
			}
			for (int i_59_ = 0; i_59_ < arg1.anInt3303; i_59_++) {
				if (anIntArray3304[arg1.anIntArray3331[i_59_]] == anInt3322
						&& anIntArray3304[arg1.anIntArray3320[i_59_]] == anInt3322
						&& (anIntArray3304[arg1.anIntArray3324[i_59_]] == anInt3322)) {
					if (arg1.aByteArray3308 == null)
						arg1.aByteArray3308 = new byte[arg1.anInt3303];
					arg1.aByteArray3308[i_59_] = (byte) 2;
				}
			}
		}
	}

	public boolean aBoolean3307;
	public byte aByte3319;
	public byte[] aByteArray3295;
	public byte[] aByteArray3297;
	public byte[] aByteArray3298;
	public byte[] aByteArray3308;
	public Class54[] aClass54Array3316;
	public Class7[] aClass7Array3311;
	public Class7[] aClass7Array3312;
	public int anInt3302;
	public int anInt3303;
	public int anInt3305;
	public int anInt3306;
	public int anInt3317 = 0;
	public int anInt3325;
	public int anInt3327;
	public int anInt3329;
	public int[] anIntArray3296;
	public int[] anIntArray3309;
	public int[] anIntArray3314;
	public int[] anIntArray3320;
	public int[] anIntArray3321;
	public int[] anIntArray3323;
	public int[] anIntArray3324;
	public int[] anIntArray3326;
	public int[] anIntArray3328;
	public int[] anIntArray3330;

	public int[] anIntArray3331;

	public int[][] anIntArrayArray3299;

	public int[][] anIntArrayArray3301;

	public short aShort3310;

	public short aShort3313;

	public short[] aShortArray3318;

	public Class4_Sub20_Sub7_Sub2() {
		aBoolean3307 = false;
		aByte3319 = (byte) 0;
		anInt3303 = 0;
		anInt3327 = 0;
	}

	public Class4_Sub20_Sub7_Sub2(byte[] arg0) {
		aBoolean3307 = false;
		aByte3319 = (byte) 0;
		anInt3303 = 0;
		anInt3327 = 0;
		boolean bool = false;
		boolean bool_60_ = false;
		Buffer class4_sub11 = new Buffer(arg0);
		Buffer class4_sub11_61_ = new Buffer(arg0);
		Buffer class4_sub11_62_ = new Buffer(arg0);
		Buffer class4_sub11_63_ = new Buffer(arg0);
		Buffer class4_sub11_64_ = new Buffer(arg0);
		class4_sub11.pointer = arg0.length - 18;
		int i = class4_sub11.read_u16((byte) -125);
		int i_65_ = class4_sub11.read_u16((byte) -113);
		int i_66_ = class4_sub11.get();
		int i_67_ = class4_sub11.get();
		int i_68_ = class4_sub11.get();
		int i_69_ = class4_sub11.get();
		int i_70_ = class4_sub11.get();
		int i_71_ = class4_sub11.get();
		int i_72_ = class4_sub11.read_u16((byte) -126);
		int i_73_ = class4_sub11.read_u16((byte) -125);
		int i_74_ = class4_sub11.read_u16((byte) -116);
		int i_75_ = class4_sub11.read_u16((byte) -107);
		int i_76_ = 0;
		int i_77_ = i_76_;
		i_76_ += i;
		int i_78_ = i_76_;
		i_76_ += i_65_;
		int i_79_ = i_76_;
		if (i_68_ == 255)
			i_76_ += i_65_;
		int i_80_ = i_76_;
		if (i_70_ == 1)
			i_76_ += i_65_;
		int i_81_ = i_76_;
		if (i_67_ == 1)
			i_76_ += i_65_;
		int i_82_ = i_76_;
		if (i_71_ == 1)
			i_76_ += i;
		int i_83_ = i_76_;
		if (i_69_ == 1)
			i_76_ += i_65_;
		int i_84_ = i_76_;
		i_76_ += i_75_;
		int i_85_ = i_76_;
		i_76_ += i_65_ * 2;
		int i_86_ = i_76_;
		i_76_ += i_66_ * 6;
		int i_87_ = i_76_;
		i_76_ += i_72_;
		int i_88_ = i_76_;
		i_76_ += i_73_;
		int i_89_ = i_76_;
		i_76_ += i_74_;
		anInt3327 = i;
		anInt3303 = i_65_;
		anInt3317 = i_66_;
		anIntArray3326 = new int[i];
		anIntArray3314 = new int[i];
		anIntArray3309 = new int[i];
		anIntArray3331 = new int[i_65_];
		anIntArray3320 = new int[i_65_];
		anIntArray3324 = new int[i_65_];
		if (i_66_ > 0) {
			anIntArray3321 = new int[i_66_];
			anIntArray3328 = new int[i_66_];
			anIntArray3296 = new int[i_66_];
		}
		if (i_71_ == 1)
			anIntArray3323 = new int[i];
		if (i_67_ == 1) {
			aByteArray3308 = new byte[i_65_];
			aByteArray3297 = new byte[i_65_];
		}
		if (i_68_ == 255)
			aByteArray3295 = new byte[i_65_];
		else
			aByte3319 = (byte) i_68_;
		if (i_69_ == 1)
			aByteArray3298 = new byte[i_65_];
		if (i_70_ == 1)
			anIntArray3330 = new int[i_65_];
		aShortArray3318 = new short[i_65_];
		class4_sub11.pointer = i_77_;
		class4_sub11_61_.pointer = i_87_;
		class4_sub11_62_.pointer = i_88_;
		class4_sub11_63_.pointer = i_89_;
		class4_sub11_64_.pointer = i_82_;
		int i_90_ = 0;
		int i_91_ = 0;
		int i_92_ = 0;
		for (int i_93_ = 0; i_93_ < i; i_93_++) {
			int i_94_ = class4_sub11.get();
			int i_95_ = 0;
			if ((i_94_ & 0x1) != 0)
				i_95_ = class4_sub11_61_.readSmart(-58);
			int i_96_ = 0;
			if ((i_94_ & 0x2) != 0)
				i_96_ = class4_sub11_62_.readSmart(-126);
			int i_97_ = 0;
			if ((i_94_ & 0x4) != 0)
				i_97_ = class4_sub11_63_.readSmart(-121);
			anIntArray3326[i_93_] = i_90_ + i_95_;
			anIntArray3314[i_93_] = i_91_ + i_96_;
			anIntArray3309[i_93_] = i_92_ + i_97_;
			i_90_ = anIntArray3326[i_93_];
			i_91_ = anIntArray3314[i_93_];
			i_92_ = anIntArray3309[i_93_];
			if (i_71_ == 1)
				anIntArray3323[i_93_] = class4_sub11_64_.get();
		}
		class4_sub11.pointer = i_85_;
		class4_sub11_61_.pointer = i_81_;
		class4_sub11_62_.pointer = i_79_;
		class4_sub11_63_.pointer = i_83_;
		class4_sub11_64_.pointer = i_80_;
		for (int i_98_ = 0; i_98_ < i_65_; i_98_++) {
			aShortArray3318[i_98_] = (short) class4_sub11
					.read_u16((byte) -105);
			if (i_67_ == 1) {
				int i_99_ = class4_sub11_61_.get();
				if ((i_99_ & 0x1) == 1) {
					aByteArray3308[i_98_] = (byte) 1;
					bool_60_ = true;
				} else
					aByteArray3308[i_98_] = (byte) 0;
				if ((i_99_ & 0x2) == 2) {
					aByteArray3297[i_98_] = (byte) (i_99_ >> 2);
					bool = true;
				} else
					aByteArray3297[i_98_] = (byte) -1;
			}
			if (i_68_ == 255)
				aByteArray3295[i_98_] = class4_sub11_62_.method229(56);
			if (i_69_ == 1)
				aByteArray3298[i_98_] = class4_sub11_63_.method229(89);
			if (i_70_ == 1)
				anIntArray3330[i_98_] = class4_sub11_64_.get();
		}
		class4_sub11.pointer = i_84_;
		class4_sub11_61_.pointer = i_78_;
		int i_100_ = 0;
		int i_101_ = 0;
		int i_102_ = 0;
		int i_103_ = 0;
		for (int i_104_ = 0; i_104_ < i_65_; i_104_++) {
			int i_105_ = class4_sub11_61_.get();
			if (i_105_ == 1) {
				i_100_ = class4_sub11.readSmart(-125) + i_103_;
				i_103_ = i_100_;
				i_101_ = class4_sub11.readSmart(-74) + i_103_;
				i_103_ = i_101_;
				i_102_ = class4_sub11.readSmart(-116) + i_103_;
				i_103_ = i_102_;
				anIntArray3331[i_104_] = i_100_;
				anIntArray3320[i_104_] = i_101_;
				anIntArray3324[i_104_] = i_102_;
			}
			if (i_105_ == 2) {
				i_101_ = i_102_;
				i_102_ = class4_sub11.readSmart(-115) + i_103_;
				i_103_ = i_102_;
				anIntArray3331[i_104_] = i_100_;
				anIntArray3320[i_104_] = i_101_;
				anIntArray3324[i_104_] = i_102_;
			}
			if (i_105_ == 3) {
				i_100_ = i_102_;
				i_102_ = class4_sub11.readSmart(-77) + i_103_;
				i_103_ = i_102_;
				anIntArray3331[i_104_] = i_100_;
				anIntArray3320[i_104_] = i_101_;
				anIntArray3324[i_104_] = i_102_;
			}
			if (i_105_ == 4) {
				int i_106_ = i_100_;
				i_100_ = i_101_;
				i_101_ = i_106_;
				i_102_ = class4_sub11.readSmart(-98) + i_103_;
				i_103_ = i_102_;
				anIntArray3331[i_104_] = i_100_;
				anIntArray3320[i_104_] = i_101_;
				anIntArray3324[i_104_] = i_102_;
			}
		}
		class4_sub11.pointer = i_86_;
		for (int i_107_ = 0; i_107_ < i_66_; i_107_++) {
			anIntArray3321[i_107_] = class4_sub11.read_u16((byte) -109);
			anIntArray3328[i_107_] = class4_sub11.read_u16((byte) -112);
			anIntArray3296[i_107_] = class4_sub11.read_u16((byte) -122);
		}
		if (!bool)
			aByteArray3297 = null;
		if (!bool_60_)
			aByteArray3308 = null;
	}

	public Class4_Sub20_Sub7_Sub2(Class4_Sub20_Sub7_Sub2 arg0, boolean arg1,
			boolean arg2, boolean arg3) {
		aBoolean3307 = false;
		aByte3319 = (byte) 0;
		anInt3303 = 0;
		anInt3327 = 0;
		anInt3327 = arg0.anInt3327;
		anInt3303 = arg0.anInt3303;
		anInt3317 = arg0.anInt3317;
		if (arg1) {
			anIntArray3326 = arg0.anIntArray3326;
			anIntArray3314 = arg0.anIntArray3314;
			anIntArray3309 = arg0.anIntArray3309;
		} else {
			anIntArray3326 = new int[anInt3327];
			anIntArray3314 = new int[anInt3327];
			anIntArray3309 = new int[anInt3327];
			for (int i = 0; i < anInt3327; i++) {
				anIntArray3326[i] = arg0.anIntArray3326[i];
				anIntArray3314[i] = arg0.anIntArray3314[i];
				anIntArray3309[i] = arg0.anIntArray3309[i];
			}
		}
		if (arg2)
			aShortArray3318 = arg0.aShortArray3318;
		else {
			aShortArray3318 = new short[anInt3303];
			for (int i = 0; i < anInt3303; i++)
				aShortArray3318[i] = arg0.aShortArray3318[i];
		}
		if (arg3)
			aByteArray3298 = arg0.aByteArray3298;
		else {
			aByteArray3298 = new byte[anInt3303];
			if (arg0.aByteArray3298 == null) {
				for (int i = 0; i < anInt3303; i++)
					aByteArray3298[i] = (byte) 0;
			} else {
				for (int i = 0; i < anInt3303; i++)
					aByteArray3298[i] = arg0.aByteArray3298[i];
			}
		}
		anIntArray3331 = arg0.anIntArray3331;
		anIntArray3320 = arg0.anIntArray3320;
		anIntArray3324 = arg0.anIntArray3324;
		aByteArray3308 = arg0.aByteArray3308;
		aByteArray3295 = arg0.aByteArray3295;
		aByteArray3297 = arg0.aByteArray3297;
		aByte3319 = arg0.aByte3319;
		anIntArray3321 = arg0.anIntArray3321;
		anIntArray3328 = arg0.anIntArray3328;
		anIntArray3296 = arg0.anIntArray3296;
		anIntArray3323 = arg0.anIntArray3323;
		anIntArray3330 = arg0.anIntArray3330;
		anIntArrayArray3301 = arg0.anIntArrayArray3301;
		anIntArrayArray3299 = arg0.anIntArrayArray3299;
		aClass7Array3311 = arg0.aClass7Array3311;
		aClass54Array3316 = arg0.aClass54Array3316;
		aClass7Array3312 = arg0.aClass7Array3312;
		aShort3313 = arg0.aShort3313;
		aShort3310 = arg0.aShort3310;
	}

	public Class4_Sub20_Sub7_Sub2(Class4_Sub20_Sub7_Sub2[] arg0, int arg1) {
		aBoolean3307 = false;
		aByte3319 = (byte) 0;
		anInt3303 = 0;
		anInt3327 = 0;
		boolean bool = false;
		boolean bool_108_ = false;
		boolean bool_109_ = false;
		boolean bool_110_ = false;
		boolean bool_111_ = false;
		anInt3327 = 0;
		anInt3303 = 0;
		anInt3317 = 0;
		aByte3319 = (byte) -1;
		for (int i = 0; i < arg1; i++) {
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = arg0[i];
			if (class4_sub20_sub7_sub2 != null) {
				anInt3327 += class4_sub20_sub7_sub2.anInt3327;
				anInt3303 += class4_sub20_sub7_sub2.anInt3303;
				anInt3317 += class4_sub20_sub7_sub2.anInt3317;
				if (class4_sub20_sub7_sub2.aByteArray3295 != null)
					bool_108_ = true;
				else {
					if (aByte3319 == -1)
						aByte3319 = class4_sub20_sub7_sub2.aByte3319;
					if (aByte3319 != class4_sub20_sub7_sub2.aByte3319)
						bool_108_ = true;
				}
				bool = bool | class4_sub20_sub7_sub2.aByteArray3308 != null;
				bool_109_ = (bool_109_ | class4_sub20_sub7_sub2.aByteArray3298 != null);
				bool_110_ = (bool_110_ | class4_sub20_sub7_sub2.anIntArray3330 != null);
				bool_111_ = (bool_111_ | class4_sub20_sub7_sub2.aByteArray3297 != null);
			}
		}
		anIntArray3326 = new int[anInt3327];
		anIntArray3314 = new int[anInt3327];
		anIntArray3309 = new int[anInt3327];
		anIntArray3323 = new int[anInt3327];
		anIntArray3331 = new int[anInt3303];
		anIntArray3320 = new int[anInt3303];
		anIntArray3324 = new int[anInt3303];
		if (anInt3317 > 0) {
			anIntArray3321 = new int[anInt3317];
			anIntArray3328 = new int[anInt3317];
			anIntArray3296 = new int[anInt3317];
		}
		if (bool)
			aByteArray3308 = new byte[anInt3303];
		if (bool_108_)
			aByteArray3295 = new byte[anInt3303];
		if (bool_109_)
			aByteArray3298 = new byte[anInt3303];
		if (bool_111_)
			aByteArray3297 = new byte[anInt3303];
		if (bool_110_)
			anIntArray3330 = new int[anInt3303];
		aShortArray3318 = new short[anInt3303];
		anInt3327 = 0;
		anInt3303 = 0;
		anInt3317 = 0;
		int i = 0;
		for (int i_112_ = 0; i_112_ < arg1; i_112_++) {
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = arg0[i_112_];
			if (class4_sub20_sub7_sub2 != null) {
				for (int i_113_ = 0; i_113_ < class4_sub20_sub7_sub2.anInt3303; i_113_++) {
					if (bool && class4_sub20_sub7_sub2.aByteArray3308 != null)
						aByteArray3308[anInt3303] = class4_sub20_sub7_sub2.aByteArray3308[i_113_];
					if (bool_108_) {
						if (class4_sub20_sub7_sub2.aByteArray3295 != null)
							aByteArray3295[anInt3303] = (class4_sub20_sub7_sub2.aByteArray3295[i_113_]);
						else
							aByteArray3295[anInt3303] = class4_sub20_sub7_sub2.aByte3319;
					}
					if (bool_109_
							&& class4_sub20_sub7_sub2.aByteArray3298 != null)
						aByteArray3298[anInt3303] = class4_sub20_sub7_sub2.aByteArray3298[i_113_];
					if (bool_111_) {
						if (class4_sub20_sub7_sub2.aByteArray3297 != null
								&& (class4_sub20_sub7_sub2.aByteArray3297[i_113_] != -1))
							aByteArray3297[anInt3303] = (byte) ((class4_sub20_sub7_sub2.aByteArray3297[i_113_]) + i);
						else
							aByteArray3297[anInt3303] = (byte) -1;
					}
					if (bool_110_
							&& class4_sub20_sub7_sub2.anIntArray3330 != null)
						anIntArray3330[anInt3303] = class4_sub20_sub7_sub2.anIntArray3330[i_113_];
					aShortArray3318[anInt3303] = class4_sub20_sub7_sub2.aShortArray3318[i_113_];
					anIntArray3331[anInt3303] = method398(
							class4_sub20_sub7_sub2,
							(class4_sub20_sub7_sub2.anIntArray3331[i_113_]));
					anIntArray3320[anInt3303] = method398(
							class4_sub20_sub7_sub2,
							(class4_sub20_sub7_sub2.anIntArray3320[i_113_]));
					anIntArray3324[anInt3303] = method398(
							class4_sub20_sub7_sub2,
							(class4_sub20_sub7_sub2.anIntArray3324[i_113_]));
					anInt3303++;
				}
				for (int i_114_ = 0; i_114_ < class4_sub20_sub7_sub2.anInt3317; i_114_++) {
					anIntArray3321[anInt3317] = method398(
							class4_sub20_sub7_sub2,
							(class4_sub20_sub7_sub2.anIntArray3321[i_114_]));
					anIntArray3328[anInt3317] = method398(
							class4_sub20_sub7_sub2,
							(class4_sub20_sub7_sub2.anIntArray3328[i_114_]));
					anIntArray3296[anInt3317] = method398(
							class4_sub20_sub7_sub2,
							(class4_sub20_sub7_sub2.anIntArray3296[i_114_]));
					anInt3317++;
				}
				i += class4_sub20_sub7_sub2.anInt3317;
			}
		}
	}

	public void method397() {
		for (int i = 0; i < anInt3327; i++)
			anIntArray3309[i] = -anIntArray3309[i];
		for (int i = 0; i < anInt3303; i++) {
			int i_0_ = anIntArray3331[i];
			anIntArray3331[i] = anIntArray3324[i];
			anIntArray3324[i] = i_0_;
		}
		method409();
	}

	public int method398(Class4_Sub20_Sub7_Sub2 arg0, int arg1) {
		int i = -1;
		int i_1_ = arg0.anIntArray3326[arg1];
		int i_2_ = arg0.anIntArray3314[arg1];
		int i_3_ = arg0.anIntArray3309[arg1];
		for (int i_4_ = 0; i_4_ < anInt3327; i_4_++) {
			if (i_1_ == anIntArray3326[i_4_] && i_2_ == anIntArray3314[i_4_]
					&& i_3_ == anIntArray3309[i_4_]) {
				i = i_4_;
				break;
			}
		}
		if (i == -1) {
			anIntArray3326[anInt3327] = i_1_;
			anIntArray3314[anInt3327] = i_2_;
			anIntArray3309[anInt3327] = i_3_;
			if (arg0.anIntArray3323 != null)
				anIntArray3323[anInt3327] = arg0.anIntArray3323[arg1];
			i = anInt3327++;
		}
		return i;
	}

	public Class4_Sub20_Sub7_Sub2 method400() {
		Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2();
		if (aByteArray3308 != null) {
			class4_sub20_sub7_sub2.aByteArray3308 = new byte[anInt3303];
			for (int i = 0; i < anInt3303; i++)
				class4_sub20_sub7_sub2.aByteArray3308[i] = aByteArray3308[i];
		}
		class4_sub20_sub7_sub2.anInt3327 = anInt3327;
		class4_sub20_sub7_sub2.anInt3303 = anInt3303;
		class4_sub20_sub7_sub2.anInt3317 = anInt3317;
		class4_sub20_sub7_sub2.anIntArray3326 = anIntArray3326;
		class4_sub20_sub7_sub2.anIntArray3314 = anIntArray3314;
		class4_sub20_sub7_sub2.anIntArray3309 = anIntArray3309;
		class4_sub20_sub7_sub2.anIntArray3331 = anIntArray3331;
		class4_sub20_sub7_sub2.anIntArray3320 = anIntArray3320;
		class4_sub20_sub7_sub2.anIntArray3324 = anIntArray3324;
		class4_sub20_sub7_sub2.aByteArray3295 = aByteArray3295;
		class4_sub20_sub7_sub2.aByteArray3298 = aByteArray3298;
		class4_sub20_sub7_sub2.aByteArray3297 = aByteArray3297;
		class4_sub20_sub7_sub2.aShortArray3318 = aShortArray3318;
		class4_sub20_sub7_sub2.aByte3319 = aByte3319;
		class4_sub20_sub7_sub2.anIntArray3321 = anIntArray3321;
		class4_sub20_sub7_sub2.anIntArray3328 = anIntArray3328;
		class4_sub20_sub7_sub2.anIntArray3296 = anIntArray3296;
		class4_sub20_sub7_sub2.anIntArray3323 = anIntArray3323;
		class4_sub20_sub7_sub2.anIntArray3330 = anIntArray3330;
		class4_sub20_sub7_sub2.anIntArrayArray3301 = anIntArrayArray3301;
		class4_sub20_sub7_sub2.anIntArrayArray3299 = anIntArrayArray3299;
		class4_sub20_sub7_sub2.aClass7Array3311 = aClass7Array3311;
		class4_sub20_sub7_sub2.aClass54Array3316 = aClass54Array3316;
		class4_sub20_sub7_sub2.aShort3313 = aShort3313;
		class4_sub20_sub7_sub2.aShort3310 = aShort3310;
		return class4_sub20_sub7_sub2;
	}

	public void method401() {
		for (int i = 0; i < anInt3327; i++) {
			anIntArray3326[i] = -anIntArray3326[i];
			anIntArray3309[i] = -anIntArray3309[i];
		}
		method409();
	}

	public void method403() {
		if (!aBoolean3307) {
			anInt2938 = 0;
			anInt3302 = 0;
			anInt3306 = 999999;
			anInt3325 = -999999;
			anInt3329 = -99999;
			anInt3305 = 99999;
			for (int i = 0; i < anInt3327; i++) {
				int i_5_ = anIntArray3326[i];
				int i_6_ = anIntArray3314[i];
				int i_7_ = anIntArray3309[i];
				if (i_5_ < anInt3306)
					anInt3306 = i_5_;
				if (i_5_ > anInt3325)
					anInt3325 = i_5_;
				if (i_7_ < anInt3305)
					anInt3305 = i_7_;
				if (i_7_ > anInt3329)
					anInt3329 = i_7_;
				if (-i_6_ > anInt2938)
					anInt2938 = -i_6_;
				if (i_6_ > anInt3302)
					anInt3302 = i_6_;
			}
			aBoolean3307 = true;
		}
	}

	public Class4_Sub20_Sub7_Sub2 method404(int arg0, int arg1, int arg2,
			int arg3, boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3)
			return this;
		Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2;
		if (arg4) {
			class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2();
			class4_sub20_sub7_sub2.anInt3327 = anInt3327;
			class4_sub20_sub7_sub2.anInt3303 = anInt3303;
			class4_sub20_sub7_sub2.anInt3317 = anInt3317;
			class4_sub20_sub7_sub2.anIntArray3326 = anIntArray3326;
			class4_sub20_sub7_sub2.anIntArray3309 = anIntArray3309;
			class4_sub20_sub7_sub2.anIntArray3331 = anIntArray3331;
			class4_sub20_sub7_sub2.anIntArray3320 = anIntArray3320;
			class4_sub20_sub7_sub2.anIntArray3324 = anIntArray3324;
			class4_sub20_sub7_sub2.aByteArray3308 = aByteArray3308;
			class4_sub20_sub7_sub2.aByteArray3295 = aByteArray3295;
			class4_sub20_sub7_sub2.aByteArray3298 = aByteArray3298;
			class4_sub20_sub7_sub2.aByteArray3297 = aByteArray3297;
			class4_sub20_sub7_sub2.aShortArray3318 = aShortArray3318;
			class4_sub20_sub7_sub2.aByte3319 = aByte3319;
			class4_sub20_sub7_sub2.anIntArray3321 = anIntArray3321;
			class4_sub20_sub7_sub2.anIntArray3328 = anIntArray3328;
			class4_sub20_sub7_sub2.anIntArray3296 = anIntArray3296;
			class4_sub20_sub7_sub2.anIntArray3323 = anIntArray3323;
			class4_sub20_sub7_sub2.anIntArray3330 = anIntArray3330;
			class4_sub20_sub7_sub2.anIntArrayArray3301 = anIntArrayArray3301;
			class4_sub20_sub7_sub2.anIntArrayArray3299 = anIntArrayArray3299;
			class4_sub20_sub7_sub2.aShort3313 = aShort3313;
			class4_sub20_sub7_sub2.aShort3310 = aShort3310;
			class4_sub20_sub7_sub2.anIntArray3314 = new int[class4_sub20_sub7_sub2.anInt3327];
		} else
			class4_sub20_sub7_sub2 = this;
		int i = (arg0 + arg1 + arg2 + arg3) / 4;
		for (int i_8_ = 0; i_8_ < class4_sub20_sub7_sub2.anInt3327; i_8_++) {
			int i_9_ = anIntArray3326[i_8_];
			int i_10_ = anIntArray3314[i_8_];
			int i_11_ = anIntArray3309[i_8_];
			int i_12_ = arg0 + (arg1 - arg0) * (i_9_ + 64) / 128;
			int i_13_ = arg3 + (arg2 - arg3) * (i_9_ + 64) / 128;
			int i_14_ = i_12_ + (i_13_ - i_12_) * (i_11_ + 64) / 128;
			class4_sub20_sub7_sub2.anIntArray3314[i_8_] = i_10_ + i_14_ - i;
		}
		class4_sub20_sub7_sub2.method409();
		return class4_sub20_sub7_sub2;
	}

	public void method405() {
		for (int i = 0; i < anInt3327; i++) {
			int i_15_ = anIntArray3309[i];
			anIntArray3309[i] = anIntArray3326[i];
			anIntArray3326[i] = -i_15_;
		}
		method409();
	}

	public void method406(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anInt3327; i++) {
			anIntArray3326[i] = anIntArray3326[i] * arg0 / 128;
			anIntArray3314[i] = anIntArray3314[i] * arg1 / 128;
			anIntArray3309[i] = anIntArray3309[i] * arg2 / 128;
		}
		method409();
	}

	public void method408() {
		for (int i = 0; i < anInt3327; i++) {
			int i_16_ = anIntArray3326[i];
			anIntArray3326[i] = anIntArray3309[i];
			anIntArray3309[i] = -i_16_;
		}
		method409();
	}

	public void method409() {
		aClass7Array3311 = null;
		aClass7Array3312 = null;
		aClass54Array3316 = null;
		aBoolean3307 = false;
	}

	public void method410(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anInt3327; i++) {
			anIntArray3326[i] += arg0;
			anIntArray3314[i] += arg1;
			anIntArray3309[i] += arg2;
		}
		method409();
	}

	public Class4_Sub20_Sub7_Sub7 method411(int arg0, int arg1, int arg2,
			int arg3, int arg4) {
		method414();
		int i = (int) Math.sqrt((arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		int i_17_ = arg1 * i >> 8;
		Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = new Class4_Sub20_Sub7_Sub7();
		class4_sub20_sub7_sub7.anIntArray3457 = new int[anInt3303];
		class4_sub20_sub7_sub7.anIntArray3465 = new int[anInt3303];
		class4_sub20_sub7_sub7.anIntArray3449 = new int[anInt3303];
		for (int i_18_ = 0; i_18_ < anInt3303; i_18_++) {
			byte i_19_;
			if (aByteArray3308 == null)
				i_19_ = (byte) 0;
			else
				i_19_ = aByteArray3308[i_18_];
			if (aByteArray3297 == null || aByteArray3297[i_18_] == -1) {
				if (i_19_ == 0) {
					int i_20_ = aShortArray3318[i_18_] & 0xffff;
					Class7 class7;
					if (aClass7Array3312 != null
							&& aClass7Array3312[anIntArray3331[i_18_]] != null)
						class7 = aClass7Array3312[anIntArray3331[i_18_]];
					else
						class7 = aClass7Array3311[anIntArray3331[i_18_]];
					int i_21_ = arg0
							+ ((arg2 * class7.anInt229 + arg3 * class7.anInt231 + arg4
									* class7.anInt237) / (i_17_ * class7.anInt227));
					class4_sub20_sub7_sub7.anIntArray3457[i_18_] = method412(
							i_20_, i_21_);
					if (aClass7Array3312 != null
							&& aClass7Array3312[anIntArray3320[i_18_]] != null)
						class7 = aClass7Array3312[anIntArray3320[i_18_]];
					else
						class7 = aClass7Array3311[anIntArray3320[i_18_]];
					i_21_ = arg0
							+ ((arg2 * class7.anInt229 + arg3 * class7.anInt231 + arg4
									* class7.anInt237) / (i_17_ * class7.anInt227));
					class4_sub20_sub7_sub7.anIntArray3465[i_18_] = method412(
							i_20_, i_21_);
					if (aClass7Array3312 != null
							&& aClass7Array3312[anIntArray3324[i_18_]] != null)
						class7 = aClass7Array3312[anIntArray3324[i_18_]];
					else
						class7 = aClass7Array3311[anIntArray3324[i_18_]];
					i_21_ = arg0
							+ ((arg2 * class7.anInt229 + arg3 * class7.anInt231 + arg4
									* class7.anInt237) / (i_17_ * class7.anInt227));
					class4_sub20_sub7_sub7.anIntArray3449[i_18_] = method412(
							i_20_, i_21_);
				} else if (i_19_ == 1) {
					Class54 class54 = aClass54Array3316[i_18_];
					int i_22_ = arg0
							+ ((arg2 * class54.anInt1097 + arg3
									* class54.anInt1096 + arg4
									* class54.anInt1094) / (i_17_ + i_17_ / 2));
					class4_sub20_sub7_sub7.anIntArray3457[i_18_] = method412(
							aShortArray3318[i_18_] & 0xffff, i_22_);
					class4_sub20_sub7_sub7.anIntArray3449[i_18_] = -1;
				} else
					class4_sub20_sub7_sub7.anIntArray3449[i_18_] = -2;
			} else if (i_19_ == 0) {
				Class7 class7;
				if (aClass7Array3312 != null
						&& aClass7Array3312[anIntArray3331[i_18_]] != null)
					class7 = aClass7Array3312[anIntArray3331[i_18_]];
				else
					class7 = aClass7Array3311[anIntArray3331[i_18_]];
				int i_23_ = arg0
						+ ((arg2 * class7.anInt229 + arg3 * class7.anInt231 + arg4
								* class7.anInt237) / (i_17_ * class7.anInt227));
				class4_sub20_sub7_sub7.anIntArray3457[i_18_] = method407(i_23_);
				if (aClass7Array3312 != null
						&& aClass7Array3312[anIntArray3320[i_18_]] != null)
					class7 = aClass7Array3312[anIntArray3320[i_18_]];
				else
					class7 = aClass7Array3311[anIntArray3320[i_18_]];
				i_23_ = arg0
						+ ((arg2 * class7.anInt229 + arg3 * class7.anInt231 + arg4
								* class7.anInt237) / (i_17_ * class7.anInt227));
				class4_sub20_sub7_sub7.anIntArray3465[i_18_] = method407(i_23_);
				if (aClass7Array3312 != null
						&& aClass7Array3312[anIntArray3324[i_18_]] != null)
					class7 = aClass7Array3312[anIntArray3324[i_18_]];
				else
					class7 = aClass7Array3311[anIntArray3324[i_18_]];
				i_23_ = arg0
						+ ((arg2 * class7.anInt229 + arg3 * class7.anInt231 + arg4
								* class7.anInt237) / (i_17_ * class7.anInt227));
				class4_sub20_sub7_sub7.anIntArray3449[i_18_] = method407(i_23_);
			} else if (i_19_ == 1) {
				Class54 class54 = aClass54Array3316[i_18_];
				int i_24_ = (arg0 + (arg2 * class54.anInt1097 + arg3
						* class54.anInt1096 + arg4 * class54.anInt1094)
						/ (i_17_ + i_17_ / 2));
				class4_sub20_sub7_sub7.anIntArray3457[i_18_] = method407(i_24_);
				class4_sub20_sub7_sub7.anIntArray3449[i_18_] = -1;
			} else
				class4_sub20_sub7_sub7.anIntArray3449[i_18_] = -2;
		}
		method413();
		class4_sub20_sub7_sub7.anInt3478 = anInt3327;
		class4_sub20_sub7_sub7.anIntArray3494 = anIntArray3326;
		class4_sub20_sub7_sub7.anIntArray3451 = anIntArray3314;
		class4_sub20_sub7_sub7.anIntArray3450 = anIntArray3309;
		class4_sub20_sub7_sub7.anInt3464 = anInt3303;
		class4_sub20_sub7_sub7.anIntArray3460 = anIntArray3331;
		class4_sub20_sub7_sub7.anIntArray3452 = anIntArray3320;
		class4_sub20_sub7_sub7.anIntArray3459 = anIntArray3324;
		class4_sub20_sub7_sub7.aByteArray3471 = aByteArray3295;
		class4_sub20_sub7_sub7.aByteArray3458 = aByteArray3298;
		class4_sub20_sub7_sub7.aByteArray3447 = aByteArray3297;
		if (class4_sub20_sub7_sub7.aByteArray3447 != null)
			class4_sub20_sub7_sub7.aShortArray3485 = aShortArray3318;
		else
			class4_sub20_sub7_sub7.aShortArray3485 = null;
		class4_sub20_sub7_sub7.aByte3501 = aByte3319;
		class4_sub20_sub7_sub7.anInt3468 = anInt3317;
		class4_sub20_sub7_sub7.anIntArray3497 = anIntArray3321;
		class4_sub20_sub7_sub7.anIntArray3461 = anIntArray3328;
		class4_sub20_sub7_sub7.anIntArray3462 = anIntArray3296;
		class4_sub20_sub7_sub7.anIntArrayArray3455 = anIntArrayArray3301;
		class4_sub20_sub7_sub7.anIntArrayArray3477 = anIntArrayArray3299;
		return class4_sub20_sub7_sub7;
	}

	public void method413() {
		if (anIntArray3323 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_25_ = 0; i_25_ < anInt3327; i_25_++) {
				int i_26_ = anIntArray3323[i_25_];
				is[i_26_]++;
				if (i_26_ > i)
					i = i_26_;
			}
			anIntArrayArray3301 = new int[i + 1][];
			for (int i_27_ = 0; i_27_ <= i; i_27_++) {
				anIntArrayArray3301[i_27_] = new int[is[i_27_]];
				is[i_27_] = 0;
			}
			for (int i_28_ = 0; i_28_ < anInt3327; i_28_++) {
				int i_29_ = anIntArray3323[i_28_];
				anIntArrayArray3301[i_29_][is[i_29_]++] = i_28_;
			}
			anIntArray3323 = null;
		}
		if (anIntArray3330 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_30_ = 0; i_30_ < anInt3303; i_30_++) {
				int i_31_ = anIntArray3330[i_30_];
				is[i_31_]++;
				if (i_31_ > i)
					i = i_31_;
			}
			anIntArrayArray3299 = new int[i + 1][];
			for (int i_32_ = 0; i_32_ <= i; i_32_++) {
				anIntArrayArray3299[i_32_] = new int[is[i_32_]];
				is[i_32_] = 0;
			}
			for (int i_33_ = 0; i_33_ < anInt3303; i_33_++) {
				int i_34_ = anIntArray3330[i_33_];
				anIntArrayArray3299[i_34_][is[i_34_]++] = i_33_;
			}
			anIntArray3330 = null;
		}
	}

	public void method414() {
		if (aClass7Array3311 == null) {
			aClass7Array3311 = new Class7[anInt3327];
			for (int i = 0; i < anInt3327; i++)
				aClass7Array3311[i] = new Class7();
			for (int i = 0; i < anInt3303; i++) {
				int i_35_ = anIntArray3331[i];
				int i_36_ = anIntArray3320[i];
				int i_37_ = anIntArray3324[i];
				int i_38_ = anIntArray3326[i_36_] - anIntArray3326[i_35_];
				int i_39_ = anIntArray3314[i_36_] - anIntArray3314[i_35_];
				int i_40_ = anIntArray3309[i_36_] - anIntArray3309[i_35_];
				int i_41_ = anIntArray3326[i_37_] - anIntArray3326[i_35_];
				int i_42_ = anIntArray3314[i_37_] - anIntArray3314[i_35_];
				int i_43_ = anIntArray3309[i_37_] - anIntArray3309[i_35_];
				int i_44_ = i_39_ * i_43_ - i_42_ * i_40_;
				int i_45_ = i_40_ * i_41_ - i_43_ * i_38_;
				int i_46_;
				for (i_46_ = i_38_ * i_42_ - i_41_ * i_39_; (i_44_ > 8192
						|| i_45_ > 8192 || i_46_ > 8192 || i_44_ < -8192
						|| i_45_ < -8192 || i_46_ < -8192); i_46_ >>= 1) {
					i_44_ >>= 1;
					i_45_ >>= 1;
				}
				int i_47_ = (int) Math
						.sqrt((i_44_ * i_44_ + i_45_ * i_45_ + i_46_ * i_46_));
				if (i_47_ <= 0)
					i_47_ = 1;
				i_44_ = i_44_ * 256 / i_47_;
				i_45_ = i_45_ * 256 / i_47_;
				i_46_ = i_46_ * 256 / i_47_;
				byte i_48_;
				if (aByteArray3308 == null)
					i_48_ = (byte) 0;
				else
					i_48_ = aByteArray3308[i];
				if (i_48_ == 0) {
					Class7 class7 = aClass7Array3311[i_35_];
					class7.anInt229 += i_44_;
					class7.anInt231 += i_45_;
					class7.anInt237 += i_46_;
					class7.anInt227++;
					class7 = aClass7Array3311[i_36_];
					class7.anInt229 += i_44_;
					class7.anInt231 += i_45_;
					class7.anInt237 += i_46_;
					class7.anInt227++;
					class7 = aClass7Array3311[i_37_];
					class7.anInt229 += i_44_;
					class7.anInt231 += i_45_;
					class7.anInt237 += i_46_;
					class7.anInt227++;
				} else if (i_48_ == 1) {
					if (aClass54Array3316 == null)
						aClass54Array3316 = new Class54[anInt3303];
					Class54 class54 = aClass54Array3316[i] = new Class54();
					class54.anInt1097 = i_44_;
					class54.anInt1096 = i_45_;
					class54.anInt1094 = i_46_;
				}
			}
		}
	}

	public void method416(short arg0, short arg1) {
		for (int i = 0; i < anInt3303; i++) {
			if (aShortArray3318[i] == arg0)
				aShortArray3318[i] = arg1;
		}
	}
}
