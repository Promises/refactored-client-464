package com.jagex.runescape;

public class Class4_Sub20_Sub12_Sub4_Sub1 extends Class4_Sub20_Sub12_Sub4 {
	public Class4_Sub20_Sub12_Sub4_Sub1(byte[] arg0) {
		super(arg0);
	}

	public Class4_Sub20_Sub12_Sub4_Sub1(byte[] arg0, int[] arg1, int[] arg2,
			int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Override
	public void method558(byte[] arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
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
			Class4_Sub20_Sub12_Sub4.method582(
					(Class4_Sub20_Sub12.anIntArray3099), arg0, arg5, i_2_, i,
					arg3, arg4, i_0_, i_1_, arg6);
	}

	@Override
	public void method578(byte[] arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		int i = arg1 + arg2 * Class4_Sub20_Sub12.anInt3098;
		int i_6_ = Class4_Sub20_Sub12.anInt3098 - arg3;
		int i_7_ = 0;
		int i_8_ = 0;
		if (arg2 < Class4_Sub20_Sub12.anInt3103) {
			int i_9_ = Class4_Sub20_Sub12.anInt3103 - arg2;
			arg4 -= i_9_;
			arg2 = Class4_Sub20_Sub12.anInt3103;
			i_8_ += i_9_ * arg3;
			i += i_9_ * Class4_Sub20_Sub12.anInt3098;
		}
		if (arg2 + arg4 > Class4_Sub20_Sub12.anInt3100)
			arg4 -= arg2 + arg4 - Class4_Sub20_Sub12.anInt3100;
		if (arg1 < Class4_Sub20_Sub12.anInt3101) {
			int i_10_ = Class4_Sub20_Sub12.anInt3101 - arg1;
			arg3 -= i_10_;
			arg1 = Class4_Sub20_Sub12.anInt3101;
			i_8_ += i_10_;
			i += i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
		}
		if (arg1 + arg3 > Class4_Sub20_Sub12.anInt3097) {
			int i_11_ = arg1 + arg3 - Class4_Sub20_Sub12.anInt3097;
			arg3 -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}
		if (arg3 > 0 && arg4 > 0)
			Class4_Sub20_Sub12_Sub4.method581(
					(Class4_Sub20_Sub12.anIntArray3099), arg0, arg5, i_8_, i,
					arg3, arg4, i_6_, i_7_);
	}
}
