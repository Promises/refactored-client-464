package com.jagex.runescape;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class4_Sub20_Sub12_Sub2 extends Class4_Sub20_Sub12 {
	public static void method512(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10) {
		int i = 256 - arg9;
		int i_14_ = (arg10 & 0xff00ff) * i & ~0xff00ff;
		int i_15_ = (arg10 & 0xff00) * i & 0xff0000;
		arg10 = (i_14_ | i_15_) >>> 8;
		for (int i_16_ = -arg6; i_16_ < 0; i_16_++) {
			for (int i_17_ = -arg5; i_17_ < 0; i_17_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0) {
					i_14_ = (arg2 & 0xff00ff) * arg9 & ~0xff00ff;
					i_15_ = (arg2 & 0xff00) * arg9 & 0xff0000;
					arg0[arg4++] = ((i_14_ | i_15_) >>> 8) + arg10;
				} else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public static void method513(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8) {
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int i_18_ = -arg6; i_18_ < 0; i_18_++) {
			for (int i_19_ = i; i_19_ < 0; i_19_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			for (int i_20_ = arg5; i_20_ < 0; i_20_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public static void method514(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7) {
		for (int i = -arg5; i < 0; i++) {
			int i_21_ = arg3 + arg4 - 3;
			while (arg3 < i_21_) {
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
			}
			i_21_ += 3;
			while (arg3 < i_21_)
				arg0[arg3++] = arg1[arg2++];
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	public static void method522(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, byte[] arg11) {
		int i = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int i_57_ = -arg7; i_57_ < 0; i_57_++) {
			for (int i_58_ = i; i_58_ < 0; i_58_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg11[arg5] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg5++;
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg11[arg5] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg5++;
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg11[arg5] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg5++;
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg11[arg5] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg5++;
			}
			for (int i_59_ = arg6; i_59_ < 0; i_59_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0 && arg11[arg5] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg5++;
			}
			arg4 += arg8;
			arg3 += arg9;
			arg5 += arg10;
		}
	}

	public static void method526(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, int arg12) {
		int i = 256 - arg12;
		int i_79_ = arg3;
		for (int i_80_ = -arg8; i_80_ < 0; i_80_++) {
			int i_81_ = (arg4 >> 16) * arg11;
			for (int i_82_ = -arg7; i_82_ < 0; i_82_++) {
				arg2 = arg1[(arg3 >> 16) + i_81_];
				if (arg2 != 0) {
					int i_83_ = arg0[arg5];
					arg0[arg5++] = (((arg2 & 0xff00ff) * arg12
							+ (i_83_ & 0xff00ff) * i & ~0xff00ff) + ((arg2 & 0xff00)
							* arg12 + (i_83_ & 0xff00) * i & 0xff0000)) >> 8;
				} else
					arg5++;
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = i_79_;
			arg5 += arg6;
		}
	}

	public static void method527(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int i = 256 - arg9;
		for (int i_84_ = -arg6; i_84_ < 0; i_84_++) {
			for (int i_85_ = -arg5; i_85_ < 0; i_85_++) {
				arg2 = arg1[arg3++];
				if (arg2 != 0) {
					int i_86_ = arg0[arg4];
					arg0[arg4++] = (((arg2 & 0xff00ff) * arg9
							+ (i_86_ & 0xff00ff) * i & ~0xff00ff) + ((arg2 & 0xff00)
							* arg9 + (i_86_ & 0xff00) * i & 0xff0000)) >> 8;
				} else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public static void method534(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11) {
		int i = arg3;
		for (int i_203_ = -arg8; i_203_ < 0; i_203_++) {
			int i_204_ = (arg4 >> 16) * arg11;
			for (int i_205_ = -arg7; i_205_ < 0; i_205_++) {
				arg2 = arg1[(arg3 >> 16) + i_204_];
				if (arg2 != 0)
					arg0[arg5++] = arg2;
				else
					arg5++;
				arg3 += arg9;
			}
			arg4 += arg10;
			arg3 = i;
			arg5 += arg6;
		}
	}

	public int anInt3516;

	public int anInt3517;

	public int anInt3518;

	public int anInt3519;

	public int anInt3520;

	public int anInt3521;

	public int[] anIntArray3515;

	public Class4_Sub20_Sub12_Sub2() {
		/* empty */
	}

	public Class4_Sub20_Sub12_Sub2(byte[] arg0, Component arg1) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker mediatracker = new MediaTracker(arg1);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			anInt3520 = image.getWidth(arg1);
			anInt3516 = image.getHeight(arg1);
			anInt3519 = anInt3520;
			anInt3517 = anInt3516;
			anInt3518 = 0;
			anInt3521 = 0;
			anIntArray3515 = new int[anInt3520 * anInt3516];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0,
					anInt3520, anInt3516, anIntArray3515, 0, anInt3520);
			pixelgrabber.grabPixels();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public Class4_Sub20_Sub12_Sub2(int arg0, int arg1) {
		anIntArray3515 = new int[arg0 * arg1];
		anInt3520 = anInt3519 = arg0;
		anInt3516 = anInt3517 = arg1;
		anInt3518 = anInt3521 = 0;
	}

	public void method511(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 > 0 && arg3 > 0) {
			int i = anInt3520;
			int i_0_ = anInt3516;
			int i_1_ = 0;
			int i_2_ = 0;
			int i_3_ = anInt3519;
			int i_4_ = anInt3517;
			int i_5_ = (i_3_ << 16) / arg2;
			int i_6_ = (i_4_ << 16) / arg3;
			if (anInt3518 > 0) {
				int i_7_ = ((anInt3518 << 16) + i_5_ - 1) / i_5_;
				arg0 += i_7_;
				i_1_ += i_7_ * i_5_ - (anInt3518 << 16);
			}
			if (anInt3521 > 0) {
				int i_8_ = ((anInt3521 << 16) + i_6_ - 1) / i_6_;
				arg1 += i_8_;
				i_2_ += i_8_ * i_6_ - (anInt3521 << 16);
			}
			if (i < i_3_)
				arg2 = ((i << 16) - i_1_ + i_5_ - 1) / i_5_;
			if (i_0_ < i_4_)
				arg3 = ((i_0_ << 16) - i_2_ + i_6_ - 1) / i_6_;
			int i_9_ = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
			int i_10_ = Class4_Sub20_Sub12.anInt3098 - arg2;
			if (arg1 + arg3 > Class4_Sub20_Sub12.anInt3100)
				arg3 -= arg1 + arg3 - Class4_Sub20_Sub12.anInt3100;
			if (arg1 < Class4_Sub20_Sub12.anInt3103) {
				int i_11_ = Class4_Sub20_Sub12.anInt3103 - arg1;
				arg3 -= i_11_;
				i_9_ += i_11_ * Class4_Sub20_Sub12.anInt3098;
				i_2_ += i_6_ * i_11_;
			}
			if (arg0 + arg2 > Class4_Sub20_Sub12.anInt3097) {
				int i_12_ = arg0 + arg2 - Class4_Sub20_Sub12.anInt3097;
				arg2 -= i_12_;
				i_10_ += i_12_;
			}
			if (arg0 < Class4_Sub20_Sub12.anInt3101) {
				int i_13_ = Class4_Sub20_Sub12.anInt3101 - arg0;
				arg2 -= i_13_;
				i_9_ += i_13_;
				i_1_ += i_5_ * i_13_;
				i_10_ += i_13_;
			}
			method526(Class4_Sub20_Sub12.anIntArray3099, anIntArray3515, 0,
					i_1_, i_2_, i_9_, i_10_, arg2, arg3, i_5_, i_6_, i, arg4);
		}
	}

	public void method515(int arg0, int arg1, int arg2) {
		arg0 += anInt3518;
		arg1 += anInt3521;
		int i = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
		int i_22_ = 0;
		int i_23_ = anInt3516;
		int i_24_ = anInt3520;
		int i_25_ = Class4_Sub20_Sub12.anInt3098 - i_24_;
		int i_26_ = 0;
		if (arg1 < Class4_Sub20_Sub12.anInt3103) {
			int i_27_ = Class4_Sub20_Sub12.anInt3103 - arg1;
			i_23_ -= i_27_;
			arg1 = Class4_Sub20_Sub12.anInt3103;
			i_22_ += i_27_ * i_24_;
			i += i_27_ * Class4_Sub20_Sub12.anInt3098;
		}
		if (arg1 + i_23_ > Class4_Sub20_Sub12.anInt3100)
			i_23_ -= arg1 + i_23_ - Class4_Sub20_Sub12.anInt3100;
		if (arg0 < Class4_Sub20_Sub12.anInt3101) {
			int i_28_ = Class4_Sub20_Sub12.anInt3101 - arg0;
			i_24_ -= i_28_;
			arg0 = Class4_Sub20_Sub12.anInt3101;
			i_22_ += i_28_;
			i += i_28_;
			i_26_ += i_28_;
			i_25_ += i_28_;
		}
		if (arg0 + i_24_ > Class4_Sub20_Sub12.anInt3097) {
			int i_29_ = arg0 + i_24_ - Class4_Sub20_Sub12.anInt3097;
			i_24_ -= i_29_;
			i_26_ += i_29_;
			i_25_ += i_29_;
		}
		if (i_24_ > 0 && i_23_ > 0)
			method527(Class4_Sub20_Sub12.anIntArray3099, anIntArray3515, 0,
					i_22_, i, i_24_, i_23_, i_25_, i_26_, arg2);
	}

	public void method516() {
		Class4_Sub20_Sub12.method493(anIntArray3515, anInt3520, anInt3516);
	}

	public void method517(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, double arg6, int arg7) {
		try {
			int i = -arg2 / 2;
			int i_30_ = -arg3 / 2;
			int i_31_ = (int) (Math.sin(arg6) * 65536.0);
			int i_32_ = (int) (Math.cos(arg6) * 65536.0);
			i_31_ = i_31_ * arg7 >> 8;
			i_32_ = i_32_ * arg7 >> 8;
			int i_33_ = (arg4 << 16) + (i_30_ * i_31_ + i * i_32_);
			int i_34_ = (arg5 << 16) + (i_30_ * i_32_ - i * i_31_);
			int i_35_ = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
			for (arg1 = 0; arg1 < arg3; arg1++) {
				int i_36_ = i_35_;
				int i_37_ = i_33_;
				int i_38_ = i_34_;
				for (arg0 = -arg2; arg0 < 0; arg0++) {
					int i_39_ = (anIntArray3515[(i_37_ >> 16) + (i_38_ >> 16)
							* anInt3520]);
					if (i_39_ != 0)
						Class4_Sub20_Sub12.anIntArray3099[i_36_++] = i_39_;
					else
						i_36_++;
					i_37_ += i_32_;
					i_38_ -= i_31_;
				}
				i_33_ += i_31_;
				i_34_ += i_32_;
				i_35_ += Class4_Sub20_Sub12.anInt3098;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method518() {
		if (anInt3520 != anInt3519 || anInt3516 != anInt3517) {
			int[] is = new int[anInt3519 * anInt3517];
			for (int i = 0; i < anInt3516; i++) {
				for (int i_40_ = 0; i_40_ < anInt3520; i_40_++)
					is[(i + anInt3521) * anInt3519 + (i_40_ + anInt3518)] = anIntArray3515[i
							* anInt3520 + i_40_];
			}
			anIntArray3515 = is;
			anInt3520 = anInt3519;
			anInt3516 = anInt3517;
			anInt3518 = 0;
			anInt3521 = 0;
		}
	}

	public void method519(int arg0, int arg1, int arg2, int arg3) {
		method533(anInt3519 << 3, anInt3517 << 3, arg0 << 4, arg1 << 4, arg2,
				arg3);
	}

	public void method520(int arg0) {
		for (int i = anInt3516 - 1; i > 0; i--) {
			int i_41_ = i * anInt3520;
			for (int i_42_ = anInt3520 - 1; i_42_ > 0; i_42_--) {
				if (anIntArray3515[i_42_ + i_41_] == 0
						&& anIntArray3515[i_42_ + i_41_ - 1 - anInt3520] != 0)
					anIntArray3515[i_42_ + i_41_] = arg0;
			}
		}
	}

	public void method521(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 > 0 && arg3 > 0) {
			int i = anInt3520;
			int i_43_ = anInt3516;
			int i_44_ = 0;
			int i_45_ = 0;
			int i_46_ = anInt3519;
			int i_47_ = anInt3517;
			int i_48_ = (i_46_ << 16) / arg2;
			int i_49_ = (i_47_ << 16) / arg3;
			if (anInt3518 > 0) {
				int i_50_ = ((anInt3518 << 16) + i_48_ - 1) / i_48_;
				arg0 += i_50_;
				i_44_ += i_50_ * i_48_ - (anInt3518 << 16);
			}
			if (anInt3521 > 0) {
				int i_51_ = ((anInt3521 << 16) + i_49_ - 1) / i_49_;
				arg1 += i_51_;
				i_45_ += i_51_ * i_49_ - (anInt3521 << 16);
			}
			if (i < i_46_)
				arg2 = ((i << 16) - i_44_ + i_48_ - 1) / i_48_;
			if (i_43_ < i_47_)
				arg3 = ((i_43_ << 16) - i_45_ + i_49_ - 1) / i_49_;
			int i_52_ = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
			int i_53_ = Class4_Sub20_Sub12.anInt3098 - arg2;
			if (arg1 + arg3 > Class4_Sub20_Sub12.anInt3100)
				arg3 -= arg1 + arg3 - Class4_Sub20_Sub12.anInt3100;
			if (arg1 < Class4_Sub20_Sub12.anInt3103) {
				int i_54_ = Class4_Sub20_Sub12.anInt3103 - arg1;
				arg3 -= i_54_;
				i_52_ += i_54_ * Class4_Sub20_Sub12.anInt3098;
				i_45_ += i_49_ * i_54_;
			}
			if (arg0 + arg2 > Class4_Sub20_Sub12.anInt3097) {
				int i_55_ = arg0 + arg2 - Class4_Sub20_Sub12.anInt3097;
				arg2 -= i_55_;
				i_53_ += i_55_;
			}
			if (arg0 < Class4_Sub20_Sub12.anInt3101) {
				int i_56_ = Class4_Sub20_Sub12.anInt3101 - arg0;
				arg2 -= i_56_;
				i_52_ += i_56_;
				i_44_ += i_48_ * i_56_;
				i_53_ += i_56_;
			}
			method534(Class4_Sub20_Sub12.anIntArray3099, anIntArray3515, 0,
					i_44_, i_45_, i_52_, i_53_, arg2, arg3, i_48_, i_49_, i);
		}
	}

	public void method523(int arg0, int arg1) {
		arg0 += anInt3518;
		arg1 += anInt3521;
		int i = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
		int i_60_ = 0;
		int i_61_ = anInt3516;
		int i_62_ = anInt3520;
		int i_63_ = Class4_Sub20_Sub12.anInt3098 - i_62_;
		int i_64_ = 0;
		if (arg1 < Class4_Sub20_Sub12.anInt3103) {
			int i_65_ = Class4_Sub20_Sub12.anInt3103 - arg1;
			i_61_ -= i_65_;
			arg1 = Class4_Sub20_Sub12.anInt3103;
			i_60_ += i_65_ * i_62_;
			i += i_65_ * Class4_Sub20_Sub12.anInt3098;
		}
		if (arg1 + i_61_ > Class4_Sub20_Sub12.anInt3100)
			i_61_ -= arg1 + i_61_ - Class4_Sub20_Sub12.anInt3100;
		if (arg0 < Class4_Sub20_Sub12.anInt3101) {
			int i_66_ = Class4_Sub20_Sub12.anInt3101 - arg0;
			i_62_ -= i_66_;
			arg0 = Class4_Sub20_Sub12.anInt3101;
			i_60_ += i_66_;
			i += i_66_;
			i_64_ += i_66_;
			i_63_ += i_66_;
		}
		if (arg0 + i_62_ > Class4_Sub20_Sub12.anInt3097) {
			int i_67_ = arg0 + i_62_ - Class4_Sub20_Sub12.anInt3097;
			i_62_ -= i_67_;
			i_64_ += i_67_;
			i_63_ += i_67_;
		}
		if (i_62_ > 0 && i_61_ > 0)
			method514(Class4_Sub20_Sub12.anIntArray3099, anIntArray3515, i_60_,
					i, i_62_, i_61_, i_63_, i_64_);
	}

	public Class4_Sub20_Sub12_Sub2 method524() {
		Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2 = new Class4_Sub20_Sub12_Sub2(
				anInt3520, anInt3516);
		class4_sub20_sub12_sub2.anInt3519 = anInt3519;
		class4_sub20_sub12_sub2.anInt3517 = anInt3517;
		class4_sub20_sub12_sub2.anInt3518 = anInt3519 - anInt3520 - anInt3518;
		class4_sub20_sub12_sub2.anInt3521 = anInt3521;
		for (int i = 0; i < anInt3516; i++) {
			for (int i_68_ = 0; i_68_ < anInt3520; i_68_++)
				class4_sub20_sub12_sub2.anIntArray3515[i * anInt3520 + i_68_] = anIntArray3515[i
						* anInt3520 + anInt3520 - 1 - i_68_];
		}
		return class4_sub20_sub12_sub2;
	}

	public void method525(Class4_Sub20_Sub12_Sub1 arg0, int arg1, int arg2) {
		if ((Class4_Sub20_Sub12.anInt3097 - Class4_Sub20_Sub12.anInt3101 != arg0.anInt3511)
				|| (Class4_Sub20_Sub12.anInt3100 - Class4_Sub20_Sub12.anInt3103 != arg0.anInt3514))
			throw new IllegalStateException();
		arg1 += anInt3518;
		arg2 += anInt3521;
		int i = arg1 + arg2 * Class4_Sub20_Sub12.anInt3098;
		int i_69_ = 0;
		int i_70_ = anInt3516;
		int i_71_ = anInt3520;
		int i_72_ = Class4_Sub20_Sub12.anInt3098 - i_71_;
		int i_73_ = 0;
		if (arg2 < Class4_Sub20_Sub12.anInt3103) {
			int i_74_ = Class4_Sub20_Sub12.anInt3103 - arg2;
			i_70_ -= i_74_;
			arg2 = Class4_Sub20_Sub12.anInt3103;
			i_69_ += i_74_ * i_71_;
			i += i_74_ * Class4_Sub20_Sub12.anInt3098;
		}
		if (arg2 + i_70_ > Class4_Sub20_Sub12.anInt3100)
			i_70_ -= arg2 + i_70_ - Class4_Sub20_Sub12.anInt3100;
		if (arg1 < Class4_Sub20_Sub12.anInt3101) {
			int i_75_ = Class4_Sub20_Sub12.anInt3101 - arg1;
			i_71_ -= i_75_;
			arg1 = Class4_Sub20_Sub12.anInt3101;
			i_69_ += i_75_;
			i += i_75_;
			i_73_ += i_75_;
			i_72_ += i_75_;
		}
		if (arg1 + i_71_ > Class4_Sub20_Sub12.anInt3097) {
			int i_76_ = arg1 + i_71_ - Class4_Sub20_Sub12.anInt3097;
			i_71_ -= i_76_;
			i_73_ += i_76_;
			i_72_ += i_76_;
		}
		if (i_71_ > 0 && i_70_ > 0) {
			int i_77_ = (arg1 - Class4_Sub20_Sub12.anInt3101 + (arg2 - Class4_Sub20_Sub12.anInt3103)
					* arg0.anInt3511);
			int i_78_ = arg0.anInt3511 - i_71_;
			method522(Class4_Sub20_Sub12.anIntArray3099, anIntArray3515, 0,
					i_69_, i, i_77_, i_71_, i_70_, i_72_, i_73_, i_78_,
					arg0.aByteArray3510);
		}
	}

	public void method528(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anIntArray3515.length; i++) {
			int i_87_ = anIntArray3515[i];
			if (i_87_ != 0) {
				int i_88_ = i_87_ >> 16 & 0xff;
				i_88_ += arg0;
				if (i_88_ < 1)
					i_88_ = 1;
				else if (i_88_ > 255)
					i_88_ = 255;
				int i_89_ = i_87_ >> 8 & 0xff;
				i_89_ += arg1;
				if (i_89_ < 1)
					i_89_ = 1;
				else if (i_89_ > 255)
					i_89_ = 255;
				int i_90_ = i_87_ & 0xff;
				i_90_ += arg2;
				if (i_90_ < 1)
					i_90_ = 1;
				else if (i_90_ > 255)
					i_90_ = 255;
				anIntArray3515[i] = (i_88_ << 16) + (i_89_ << 8) + i_90_;
			}
		}
	}

	public void method529() {
		int[] is = new int[anInt3520 * anInt3516];
		int i = 0;
		for (int i_91_ = anInt3516 - 1; i_91_ >= 0; i_91_--) {
			for (int i_92_ = 0; i_92_ < anInt3520; i_92_++)
				is[i++] = anIntArray3515[i_92_ + i_91_ * anInt3520];
		}
		anIntArray3515 = is;
		anInt3521 = anInt3517 - anInt3516 - anInt3521;
	}

	public void method530(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 == 256)
			method532(arg0, arg1);
		else {
			arg0 += anInt3518;
			arg1 += anInt3521;
			int i = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
			int i_93_ = 0;
			int i_94_ = anInt3516;
			int i_95_ = anInt3520;
			int i_96_ = Class4_Sub20_Sub12.anInt3098 - i_95_;
			int i_97_ = 0;
			if (arg1 < Class4_Sub20_Sub12.anInt3103) {
				int i_98_ = Class4_Sub20_Sub12.anInt3103 - arg1;
				i_94_ -= i_98_;
				arg1 = Class4_Sub20_Sub12.anInt3103;
				i_93_ += i_98_ * i_95_;
				i += i_98_ * Class4_Sub20_Sub12.anInt3098;
			}
			if (arg1 + i_94_ > Class4_Sub20_Sub12.anInt3100)
				i_94_ -= arg1 + i_94_ - Class4_Sub20_Sub12.anInt3100;
			if (arg0 < Class4_Sub20_Sub12.anInt3101) {
				int i_99_ = Class4_Sub20_Sub12.anInt3101 - arg0;
				i_95_ -= i_99_;
				arg0 = Class4_Sub20_Sub12.anInt3101;
				i_93_ += i_99_;
				i += i_99_;
				i_97_ += i_99_;
				i_96_ += i_99_;
			}
			if (arg0 + i_95_ > Class4_Sub20_Sub12.anInt3097) {
				int i_100_ = arg0 + i_95_ - Class4_Sub20_Sub12.anInt3097;
				i_95_ -= i_100_;
				i_97_ += i_100_;
				i_96_ += i_100_;
			}
			if (i_95_ > 0 && i_94_ > 0)
				method512(Class4_Sub20_Sub12.anIntArray3099, anIntArray3515, 0,
						i_93_, i, i_95_, i_94_, i_96_, i_97_, arg2, arg3);
		}
	}

	public void method531(int arg0) {
		if (anInt3520 != anInt3519 || anInt3516 != anInt3517) {
			int i = arg0;
			if (i > anInt3518)
				i = anInt3518;
			int i_101_ = arg0;
			if (i_101_ + anInt3518 + anInt3520 > anInt3519)
				i_101_ = anInt3519 - anInt3518 - anInt3520;
			int i_102_ = arg0;
			if (i_102_ > anInt3521)
				i_102_ = anInt3521;
			int i_103_ = arg0;
			if (i_103_ + anInt3521 + anInt3516 > anInt3517)
				i_103_ = anInt3517 - anInt3521 - anInt3516;
			int i_104_ = anInt3520 + i + i_101_;
			int i_105_ = anInt3516 + i_102_ + i_103_;
			int[] is = new int[i_104_ * i_105_];
			for (int i_106_ = 0; i_106_ < anInt3516; i_106_++) {
				for (int i_107_ = 0; i_107_ < anInt3520; i_107_++)
					is[(i_106_ + i_102_) * i_104_ + (i_107_ + i)] = anIntArray3515[i_106_
							* anInt3520 + i_107_];
			}
			anIntArray3515 = is;
			anInt3520 = i_104_;
			anInt3516 = i_105_;
			anInt3518 -= i;
			anInt3521 -= i_102_;
		}
	}

	public void method532(int arg0, int arg1) {
		arg0 += anInt3518;
		arg1 += anInt3521;
		int i = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
		int i_108_ = 0;
		int i_109_ = anInt3516;
		int i_110_ = anInt3520;
		int i_111_ = Class4_Sub20_Sub12.anInt3098 - i_110_;
		int i_112_ = 0;
		if (arg1 < Class4_Sub20_Sub12.anInt3103) {
			int i_113_ = Class4_Sub20_Sub12.anInt3103 - arg1;
			i_109_ -= i_113_;
			arg1 = Class4_Sub20_Sub12.anInt3103;
			i_108_ += i_113_ * i_110_;
			i += i_113_ * Class4_Sub20_Sub12.anInt3098;
		}
		if (arg1 + i_109_ > Class4_Sub20_Sub12.anInt3100)
			i_109_ -= arg1 + i_109_ - Class4_Sub20_Sub12.anInt3100;
		if (arg0 < Class4_Sub20_Sub12.anInt3101) {
			int i_114_ = Class4_Sub20_Sub12.anInt3101 - arg0;
			i_110_ -= i_114_;
			arg0 = Class4_Sub20_Sub12.anInt3101;
			i_108_ += i_114_;
			i += i_114_;
			i_112_ += i_114_;
			i_111_ += i_114_;
		}
		if (arg0 + i_110_ > Class4_Sub20_Sub12.anInt3097) {
			int i_115_ = arg0 + i_110_ - Class4_Sub20_Sub12.anInt3097;
			i_110_ -= i_115_;
			i_112_ += i_115_;
			i_111_ += i_115_;
		}
		if (i_110_ > 0 && i_109_ > 0)
			method513(Class4_Sub20_Sub12.anIntArray3099, anIntArray3515, 0,
					i_108_, i, i_110_, i_109_, i_111_, i_112_);
	}

	public void method533(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		if (arg5 != 0) {
			arg0 -= anInt3518 << 4;
			arg1 -= anInt3521 << 4;
			double d = (arg4 & 0xffff) * 9.587379924285257E-5;
			int i = (int) Math.floor(Math.sin(d) * arg5 + 0.5);
			int i_116_ = (int) Math.floor(Math.cos(d) * arg5 + 0.5);
			int i_117_ = -arg0 * i_116_ + -arg1 * i;
			int i_118_ = arg0 * i + -arg1 * i_116_;
			int i_119_ = ((anInt3520 << 4) - arg0) * i_116_ + -arg1 * i;
			int i_120_ = -((anInt3520 << 4) - arg0) * i + -arg1 * i_116_;
			int i_121_ = -arg0 * i_116_ + ((anInt3516 << 4) - arg1) * i;
			int i_122_ = arg0 * i + ((anInt3516 << 4) - arg1) * i_116_;
			int i_123_ = (((anInt3520 << 4) - arg0) * i_116_ + ((anInt3516 << 4) - arg1)
					* i);
			int i_124_ = (-((anInt3520 << 4) - arg0) * i + ((anInt3516 << 4) - arg1)
					* i_116_);
			int i_125_;
			int i_126_;
			if (i_117_ < i_119_) {
				i_125_ = i_117_;
				i_126_ = i_119_;
			} else {
				i_125_ = i_119_;
				i_126_ = i_117_;
			}
			if (i_121_ < i_125_)
				i_125_ = i_121_;
			if (i_123_ < i_125_)
				i_125_ = i_123_;
			if (i_121_ > i_126_)
				i_126_ = i_121_;
			if (i_123_ > i_126_)
				i_126_ = i_123_;
			int i_127_;
			int i_128_;
			if (i_118_ < i_120_) {
				i_127_ = i_118_;
				i_128_ = i_120_;
			} else {
				i_127_ = i_120_;
				i_128_ = i_118_;
			}
			if (i_122_ < i_127_)
				i_127_ = i_122_;
			if (i_124_ < i_127_)
				i_127_ = i_124_;
			if (i_122_ > i_128_)
				i_128_ = i_122_;
			if (i_124_ > i_128_)
				i_128_ = i_124_;
			i_125_ >>= 12;
			i_126_ = i_126_ + 4095 >> 12;
			i_127_ >>= 12;
			i_128_ = i_128_ + 4095 >> 12;
			i_125_ += arg2;
			i_126_ += arg2;
			i_127_ += arg3;
			i_128_ += arg3;
			i_125_ >>= 4;
			i_126_ = i_126_ + 15 >> 4;
			i_127_ >>= 4;
			i_128_ = i_128_ + 15 >> 4;
			if (i_125_ < Class4_Sub20_Sub12.anInt3101)
				i_125_ = Class4_Sub20_Sub12.anInt3101;
			if (i_126_ > Class4_Sub20_Sub12.anInt3097)
				i_126_ = Class4_Sub20_Sub12.anInt3097;
			if (i_127_ < Class4_Sub20_Sub12.anInt3103)
				i_127_ = Class4_Sub20_Sub12.anInt3103;
			if (i_128_ > Class4_Sub20_Sub12.anInt3100)
				i_128_ = Class4_Sub20_Sub12.anInt3100;
			i_126_ = i_125_ - i_126_;
			if (i_126_ < 0) {
				i_128_ = i_127_ - i_128_;
				if (i_128_ < 0) {
					int i_129_ = i_127_ * Class4_Sub20_Sub12.anInt3098 + i_125_;
					double d_130_ = 1.6777216E7 / arg5;
					int i_131_ = (int) Math.floor(Math.sin(d) * d_130_ + 0.5);
					int i_132_ = (int) Math.floor(Math.cos(d) * d_130_ + 0.5);
					int i_133_ = (i_125_ << 4) + 8 - arg2;
					int i_134_ = (i_127_ << 4) + 8 - arg3;
					int i_135_ = (arg0 << 8) - (i_134_ * i_131_ >> 4);
					int i_136_ = (arg1 << 8) + (i_134_ * i_132_ >> 4);
					if (i_132_ == 0) {
						if (i_131_ == 0) {
							int i_137_ = i_128_;
							while (i_137_ < 0) {
								int i_138_ = i_129_;
								int i_139_ = i_135_;
								int i_140_ = i_136_;
								int i_141_ = i_126_;
								if (i_139_ >= 0 && i_140_ >= 0
										&& i_139_ - (anInt3520 << 12) < 0
										&& i_140_ - (anInt3516 << 12) < 0) {
									for (/**/; i_141_ < 0; i_141_++) {
										int i_142_ = (anIntArray3515[((i_140_ >> 12)
												* anInt3520 + (i_139_ >> 12))]);
										if (i_142_ != 0)
											Class4_Sub20_Sub12.anIntArray3099[i_138_++] = i_142_;
										else
											i_138_++;
									}
								}
								i_137_++;
								i_129_ += Class4_Sub20_Sub12.anInt3098;
							}
						} else if (i_131_ < 0) {
							int i_143_ = i_128_;
							while (i_143_ < 0) {
								int i_144_ = i_129_;
								int i_145_ = i_135_;
								int i_146_ = i_136_ + (i_133_ * i_131_ >> 4);
								int i_147_ = i_126_;
								if (i_145_ >= 0
										&& i_145_ - (anInt3520 << 12) < 0) {
									int i_148_;
									if ((i_148_ = i_146_ - (anInt3516 << 12)) >= 0) {
										i_148_ = (i_131_ - i_148_) / i_131_;
										i_147_ += i_148_;
										i_146_ += i_131_ * i_148_;
										i_144_ += i_148_;
									}
									if ((i_148_ = (i_146_ - i_131_) / i_131_) > i_147_)
										i_147_ = i_148_;
									for (/**/; i_147_ < 0; i_147_++) {
										int i_149_ = (anIntArray3515[((i_146_ >> 12)
												* anInt3520 + (i_145_ >> 12))]);
										if (i_149_ != 0)
											Class4_Sub20_Sub12.anIntArray3099[i_144_++] = i_149_;
										else
											i_144_++;
										i_146_ += i_131_;
									}
								}
								i_143_++;
								i_135_ -= i_131_;
								i_129_ += Class4_Sub20_Sub12.anInt3098;
							}
						} else {
							int i_150_ = i_128_;
							while (i_150_ < 0) {
								int i_151_ = i_129_;
								int i_152_ = i_135_;
								int i_153_ = i_136_ + (i_133_ * i_131_ >> 4);
								int i_154_ = i_126_;
								if (i_152_ >= 0
										&& i_152_ - (anInt3520 << 12) < 0) {
									if (i_153_ < 0) {
										int i_155_ = (i_131_ - 1 - i_153_)
												/ i_131_;
										i_154_ += i_155_;
										i_153_ += i_131_ * i_155_;
										i_151_ += i_155_;
									}
									int i_156_;
									if ((i_156_ = (1 + i_153_
											- (anInt3516 << 12) - i_131_)
											/ i_131_) > i_154_)
										i_154_ = i_156_;
									for (/**/; i_154_ < 0; i_154_++) {
										int i_157_ = (anIntArray3515[((i_153_ >> 12)
												* anInt3520 + (i_152_ >> 12))]);
										if (i_157_ != 0)
											Class4_Sub20_Sub12.anIntArray3099[i_151_++] = i_157_;
										else
											i_151_++;
										i_153_ += i_131_;
									}
								}
								i_150_++;
								i_135_ -= i_131_;
								i_129_ += Class4_Sub20_Sub12.anInt3098;
							}
						}
					} else if (i_132_ < 0) {
						if (i_131_ == 0) {
							int i_158_ = i_128_;
							while (i_158_ < 0) {
								int i_159_ = i_129_;
								int i_160_ = i_135_ + (i_133_ * i_132_ >> 4);
								int i_161_ = i_136_;
								int i_162_ = i_126_;
								if (i_161_ >= 0
										&& i_161_ - (anInt3516 << 12) < 0) {
									int i_163_;
									if ((i_163_ = i_160_ - (anInt3520 << 12)) >= 0) {
										i_163_ = (i_132_ - i_163_) / i_132_;
										i_162_ += i_163_;
										i_160_ += i_132_ * i_163_;
										i_159_ += i_163_;
									}
									if ((i_163_ = (i_160_ - i_132_) / i_132_) > i_162_)
										i_162_ = i_163_;
									for (/**/; i_162_ < 0; i_162_++) {
										int i_164_ = (anIntArray3515[((i_161_ >> 12)
												* anInt3520 + (i_160_ >> 12))]);
										if (i_164_ != 0)
											Class4_Sub20_Sub12.anIntArray3099[i_159_++] = i_164_;
										else
											i_159_++;
										i_160_ += i_132_;
									}
								}
								i_158_++;
								i_136_ += i_132_;
								i_129_ += Class4_Sub20_Sub12.anInt3098;
							}
						} else if (i_131_ < 0) {
							int i_165_ = i_128_;
							while (i_165_ < 0) {
								int i_166_ = i_129_;
								int i_167_ = i_135_ + (i_133_ * i_132_ >> 4);
								int i_168_ = i_136_ + (i_133_ * i_131_ >> 4);
								int i_169_ = i_126_;
								int i_170_;
								if ((i_170_ = i_167_ - (anInt3520 << 12)) >= 0) {
									i_170_ = (i_132_ - i_170_) / i_132_;
									i_169_ += i_170_;
									i_167_ += i_132_ * i_170_;
									i_168_ += i_131_ * i_170_;
									i_166_ += i_170_;
								}
								if ((i_170_ = (i_167_ - i_132_) / i_132_) > i_169_)
									i_169_ = i_170_;
								if ((i_170_ = i_168_ - (anInt3516 << 12)) >= 0) {
									i_170_ = (i_131_ - i_170_) / i_131_;
									i_169_ += i_170_;
									i_167_ += i_132_ * i_170_;
									i_168_ += i_131_ * i_170_;
									i_166_ += i_170_;
								}
								if ((i_170_ = (i_168_ - i_131_) / i_131_) > i_169_)
									i_169_ = i_170_;
								for (/**/; i_169_ < 0; i_169_++) {
									int i_171_ = (anIntArray3515[((i_168_ >> 12)
											* anInt3520 + (i_167_ >> 12))]);
									if (i_171_ != 0)
										Class4_Sub20_Sub12.anIntArray3099[i_166_++] = i_171_;
									else
										i_166_++;
									i_167_ += i_132_;
									i_168_ += i_131_;
								}
								i_165_++;
								i_135_ -= i_131_;
								i_136_ += i_132_;
								i_129_ += Class4_Sub20_Sub12.anInt3098;
							}
						} else {
							int i_172_ = i_128_;
							while (i_172_ < 0) {
								int i_173_ = i_129_;
								int i_174_ = i_135_ + (i_133_ * i_132_ >> 4);
								int i_175_ = i_136_ + (i_133_ * i_131_ >> 4);
								int i_176_ = i_126_;
								int i_177_;
								if ((i_177_ = i_174_ - (anInt3520 << 12)) >= 0) {
									i_177_ = (i_132_ - i_177_) / i_132_;
									i_176_ += i_177_;
									i_174_ += i_132_ * i_177_;
									i_175_ += i_131_ * i_177_;
									i_173_ += i_177_;
								}
								if ((i_177_ = (i_174_ - i_132_) / i_132_) > i_176_)
									i_176_ = i_177_;
								if (i_175_ < 0) {
									i_177_ = (i_131_ - 1 - i_175_) / i_131_;
									i_176_ += i_177_;
									i_174_ += i_132_ * i_177_;
									i_175_ += i_131_ * i_177_;
									i_173_ += i_177_;
								}
								if ((i_177_ = (1 + i_175_ - (anInt3516 << 12) - i_131_)
										/ i_131_) > i_176_)
									i_176_ = i_177_;
								for (/**/; i_176_ < 0; i_176_++) {
									int i_178_ = (anIntArray3515[((i_175_ >> 12)
											* anInt3520 + (i_174_ >> 12))]);
									if (i_178_ != 0)
										Class4_Sub20_Sub12.anIntArray3099[i_173_++] = i_178_;
									else
										i_173_++;
									i_174_ += i_132_;
									i_175_ += i_131_;
								}
								i_172_++;
								i_135_ -= i_131_;
								i_136_ += i_132_;
								i_129_ += Class4_Sub20_Sub12.anInt3098;
							}
						}
					} else if (i_131_ == 0) {
						int i_179_ = i_128_;
						while (i_179_ < 0) {
							int i_180_ = i_129_;
							int i_181_ = i_135_ + (i_133_ * i_132_ >> 4);
							int i_182_ = i_136_;
							int i_183_ = i_126_;
							if (i_182_ >= 0 && i_182_ - (anInt3516 << 12) < 0) {
								if (i_181_ < 0) {
									int i_184_ = (i_132_ - 1 - i_181_) / i_132_;
									i_183_ += i_184_;
									i_181_ += i_132_ * i_184_;
									i_180_ += i_184_;
								}
								int i_185_;
								if ((i_185_ = (1 + i_181_ - (anInt3520 << 12) - i_132_)
										/ i_132_) > i_183_)
									i_183_ = i_185_;
								for (/**/; i_183_ < 0; i_183_++) {
									int i_186_ = (anIntArray3515[((i_182_ >> 12)
											* anInt3520 + (i_181_ >> 12))]);
									if (i_186_ != 0)
										Class4_Sub20_Sub12.anIntArray3099[i_180_++] = i_186_;
									else
										i_180_++;
									i_181_ += i_132_;
								}
							}
							i_179_++;
							i_136_ += i_132_;
							i_129_ += Class4_Sub20_Sub12.anInt3098;
						}
					} else if (i_131_ < 0) {
						int i_187_ = i_128_;
						while (i_187_ < 0) {
							int i_188_ = i_129_;
							int i_189_ = i_135_ + (i_133_ * i_132_ >> 4);
							int i_190_ = i_136_ + (i_133_ * i_131_ >> 4);
							int i_191_ = i_126_;
							if (i_189_ < 0) {
								int i_192_ = (i_132_ - 1 - i_189_) / i_132_;
								i_191_ += i_192_;
								i_189_ += i_132_ * i_192_;
								i_190_ += i_131_ * i_192_;
								i_188_ += i_192_;
							}
							int i_193_;
							if ((i_193_ = (1 + i_189_ - (anInt3520 << 12) - i_132_)
									/ i_132_) > i_191_)
								i_191_ = i_193_;
							if ((i_193_ = i_190_ - (anInt3516 << 12)) >= 0) {
								i_193_ = (i_131_ - i_193_) / i_131_;
								i_191_ += i_193_;
								i_189_ += i_132_ * i_193_;
								i_190_ += i_131_ * i_193_;
								i_188_ += i_193_;
							}
							if ((i_193_ = (i_190_ - i_131_) / i_131_) > i_191_)
								i_191_ = i_193_;
							for (/**/; i_191_ < 0; i_191_++) {
								int i_194_ = (anIntArray3515[(i_190_ >> 12)
										* anInt3520 + (i_189_ >> 12)]);
								if (i_194_ != 0)
									Class4_Sub20_Sub12.anIntArray3099[i_188_++] = i_194_;
								else
									i_188_++;
								i_189_ += i_132_;
								i_190_ += i_131_;
							}
							i_187_++;
							i_135_ -= i_131_;
							i_136_ += i_132_;
							i_129_ += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						int i_195_ = i_128_;
						while (i_195_ < 0) {
							int i_196_ = i_129_;
							int i_197_ = i_135_ + (i_133_ * i_132_ >> 4);
							int i_198_ = i_136_ + (i_133_ * i_131_ >> 4);
							int i_199_ = i_126_;
							if (i_197_ < 0) {
								int i_200_ = (i_132_ - 1 - i_197_) / i_132_;
								i_199_ += i_200_;
								i_197_ += i_132_ * i_200_;
								i_198_ += i_131_ * i_200_;
								i_196_ += i_200_;
							}
							int i_201_;
							if ((i_201_ = (1 + i_197_ - (anInt3520 << 12) - i_132_)
									/ i_132_) > i_199_)
								i_199_ = i_201_;
							if (i_198_ < 0) {
								i_201_ = (i_131_ - 1 - i_198_) / i_131_;
								i_199_ += i_201_;
								i_197_ += i_132_ * i_201_;
								i_198_ += i_131_ * i_201_;
								i_196_ += i_201_;
							}
							if ((i_201_ = (1 + i_198_ - (anInt3516 << 12) - i_131_)
									/ i_131_) > i_199_)
								i_199_ = i_201_;
							for (/**/; i_199_ < 0; i_199_++) {
								int i_202_ = (anIntArray3515[(i_198_ >> 12)
										* anInt3520 + (i_197_ >> 12)]);
								if (i_202_ != 0)
									Class4_Sub20_Sub12.anIntArray3099[i_196_++] = i_202_;
								else
									i_196_++;
								i_197_ += i_132_;
								i_198_ += i_131_;
							}
							i_195_++;
							i_135_ -= i_131_;
							i_136_ += i_132_;
							i_129_ += Class4_Sub20_Sub12.anInt3098;
						}
					}
				}
			}
		}
	}

	public void method535(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		try {
			int i = -arg2 / 2;
			int i_206_ = -arg3 / 2;
			int i_207_ = (int) (Math.sin(arg6 / 326.11) * 65536.0);
			int i_208_ = (int) (Math.cos(arg6 / 326.11) * 65536.0);
			i_207_ = i_207_ * arg7 >> 8;
			i_208_ = i_208_ * arg7 >> 8;
			int i_209_ = (arg4 << 16) + (i_206_ * i_207_ + i * i_208_);
			int i_210_ = (arg5 << 16) + (i_206_ * i_208_ - i * i_207_);
			int i_211_ = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
			for (arg1 = 0; arg1 < arg3; arg1++) {
				int i_212_ = arg8[arg1];
				int i_213_ = i_211_ + i_212_;
				int i_214_ = i_209_ + i_208_ * i_212_;
				int i_215_ = i_210_ - i_207_ * i_212_;
				for (arg0 = -arg9[arg1]; arg0 < 0; arg0++) {
					Class4_Sub20_Sub12.anIntArray3099[i_213_++] = (anIntArray3515[(i_214_ >> 16)
							+ (i_215_ >> 16) * anInt3520]);
					i_214_ += i_208_;
					i_215_ -= i_207_;
				}
				i_209_ += i_207_;
				i_210_ += i_208_;
				i_211_ += Class4_Sub20_Sub12.anInt3098;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method536() {
		int[] is = new int[anInt3520 * anInt3516];
		int i = 0;
		for (int i_216_ = 0; i_216_ < anInt3516; i_216_++) {
			for (int i_217_ = anInt3520 - 1; i_217_ >= 0; i_217_--)
				is[i++] = anIntArray3515[i_217_ + i_216_ * anInt3520];
		}
		anIntArray3515 = is;
		anInt3518 = anInt3519 - anInt3520 - anInt3518;
	}

	public void method537(int arg0) {
		int[] is = new int[anInt3520 * anInt3516];
		int i = 0;
		for (int i_218_ = 0; i_218_ < anInt3516; i_218_++) {
			for (int i_219_ = 0; i_219_ < anInt3520; i_219_++) {
				int i_220_ = anIntArray3515[i];
				if (i_220_ == 0) {
					if (i_219_ > 0 && anIntArray3515[i - 1] != 0)
						i_220_ = arg0;
					else if (i_218_ > 0 && anIntArray3515[i - anInt3520] != 0)
						i_220_ = arg0;
					else if (i_219_ < anInt3520 - 1
							&& anIntArray3515[i + 1] != 0)
						i_220_ = arg0;
					else if (i_218_ < anInt3516 - 1
							&& anIntArray3515[i + anInt3520] != 0)
						i_220_ = arg0;
				}
				is[i++] = i_220_;
			}
		}
		anIntArray3515 = is;
	}
}
