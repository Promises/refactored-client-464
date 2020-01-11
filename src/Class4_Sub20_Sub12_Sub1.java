/* Class4_Sub20_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4_Sub20_Sub12_Sub1 extends Class4_Sub20_Sub12 {
	public static void method510(int[] arg0, byte[] arg1, int[] arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8) {
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int i_13_ = -arg6; i_13_ < 0; i_13_++) {
			for (int i_14_ = i; i_14_ < 0; i_14_++) {
				int i_15_ = arg1[arg3++];
				if (i_15_ != 0)
					arg0[arg4++] = arg2[i_15_ & 0xff];
				else
					arg4++;
				i_15_ = arg1[arg3++];
				if (i_15_ != 0)
					arg0[arg4++] = arg2[i_15_ & 0xff];
				else
					arg4++;
				i_15_ = arg1[arg3++];
				if (i_15_ != 0)
					arg0[arg4++] = arg2[i_15_ & 0xff];
				else
					arg4++;
				i_15_ = arg1[arg3++];
				if (i_15_ != 0)
					arg0[arg4++] = arg2[i_15_ & 0xff];
				else
					arg4++;
			}
			for (int i_16_ = arg5; i_16_ < 0; i_16_++) {
				int i_17_ = arg1[arg3++];
				if (i_17_ != 0)
					arg0[arg4++] = arg2[i_17_ & 0xff];
				else
					arg4++;
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public byte[] aByteArray3510;
	public int anInt3507;
	public int anInt3508;
	public int anInt3509;
	public int anInt3511;
	public int anInt3513;
	public int anInt3514;

	public int[] anIntArray3512;

	public void method507(int arg0, int arg1) {
		arg0 += anInt3508;
		arg1 += anInt3513;
		int i = arg0 + arg1 * Class4_Sub20_Sub12.anInt3098;
		int i_0_ = 0;
		int i_1_ = anInt3514;
		int i_2_ = anInt3511;
		int i_3_ = Class4_Sub20_Sub12.anInt3098 - i_2_;
		int i_4_ = 0;
		if (arg1 < Class4_Sub20_Sub12.anInt3103) {
			int i_5_ = Class4_Sub20_Sub12.anInt3103 - arg1;
			i_1_ -= i_5_;
			arg1 = Class4_Sub20_Sub12.anInt3103;
			i_0_ += i_5_ * i_2_;
			i += i_5_ * Class4_Sub20_Sub12.anInt3098;
		}
		if (arg1 + i_1_ > Class4_Sub20_Sub12.anInt3100)
			i_1_ -= arg1 + i_1_ - Class4_Sub20_Sub12.anInt3100;
		if (arg0 < Class4_Sub20_Sub12.anInt3101) {
			int i_6_ = Class4_Sub20_Sub12.anInt3101 - arg0;
			i_2_ -= i_6_;
			arg0 = Class4_Sub20_Sub12.anInt3101;
			i_0_ += i_6_;
			i += i_6_;
			i_4_ += i_6_;
			i_3_ += i_6_;
		}
		if (arg0 + i_2_ > Class4_Sub20_Sub12.anInt3097) {
			int i_7_ = arg0 + i_2_ - Class4_Sub20_Sub12.anInt3097;
			i_2_ -= i_7_;
			i_4_ += i_7_;
			i_3_ += i_7_;
		}
		if (i_2_ > 0 && i_1_ > 0)
			method510(Class4_Sub20_Sub12.anIntArray3099, aByteArray3510,
					anIntArray3512, i_0_, i, i_2_, i_1_, i_3_, i_4_);
	}

	public void method508(int arg0, int arg1, int arg2) {
		for (int i = 0; i < anIntArray3512.length; i++) {
			int i_8_ = anIntArray3512[i] >> 16 & 0xff;
			i_8_ += arg0;
			if (i_8_ < 0)
				i_8_ = 0;
			else if (i_8_ > 255)
				i_8_ = 255;
			int i_9_ = anIntArray3512[i] >> 8 & 0xff;
			i_9_ += arg1;
			if (i_9_ < 0)
				i_9_ = 0;
			else if (i_9_ > 255)
				i_9_ = 255;
			int i_10_ = anIntArray3512[i] & 0xff;
			i_10_ += arg2;
			if (i_10_ < 0)
				i_10_ = 0;
			else if (i_10_ > 255)
				i_10_ = 255;
			anIntArray3512[i] = (i_8_ << 16) + (i_9_ << 8) + i_10_;
		}
	}

	public void method509() {
		if (anInt3511 != anInt3509 || anInt3514 != anInt3507) {
			byte[] is = new byte[anInt3509 * anInt3507];
			int i = 0;
			for (int i_11_ = 0; i_11_ < anInt3514; i_11_++) {
				for (int i_12_ = 0; i_12_ < anInt3511; i_12_++)
					is[i_12_ + anInt3508 + (i_11_ + anInt3513) * anInt3509] = aByteArray3510[i++];
			}
			aByteArray3510 = is;
			anInt3511 = anInt3509;
			anInt3514 = anInt3507;
			anInt3508 = 0;
			anInt3513 = 0;
		}
	}
}
