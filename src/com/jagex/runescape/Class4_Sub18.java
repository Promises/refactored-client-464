package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class4_Sub18 extends RSFont {
	public static Class4_Sub18 method311(Class19 arg0, int arg1, int arg2) {
		byte[] is = arg0.method746(arg1, (byte) 105, arg2);
		if (is == null)
			return null;
		return new Class4_Sub18(new StreamBuffer(is));
	}

	public byte[] aByteArray2335;

	public Class16 aClass16_2336;

	public Class4_Sub18(StreamBuffer arg0) {
		arg0.pointion = arg0.byteBuffer.length - 3;
		int i = arg0.get();
		int i_15_ = arg0.method209((byte) -126);
		int i_16_ = 14 + i * 10;
		arg0.pointion = 0;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		while_1_: for (int i_25_ = 0; i_25_ < i; i_25_++) {
			int i_26_ = -1;
			for (;;) {
				int i_27_ = arg0.get();
				if (i_27_ != i_26_)
					i_16_++;
				i_26_ = i_27_ & 0xf;
				if (i_27_ == 7)
					continue while_1_;
				if (i_27_ == 23)
					i_17_++;
				else if (i_26_ == 0)
					i_19_++;
				else if (i_26_ == 1)
					i_20_++;
				else if (i_26_ == 2)
					i_18_++;
				else if (i_26_ == 3)
					i_21_++;
				else if (i_26_ == 4)
					i_22_++;
				else if (i_26_ == 5)
					i_23_++;
				else {
					if (i_26_ != 6)
						break;
					i_24_++;
				}
			}
			throw new RuntimeException();
		}
		i_16_ += 5 * i_17_;
		i_16_ += 2 * (i_19_ + i_20_ + i_18_ + i_21_ + i_23_);
		i_16_ += i_22_ + i_24_;
		int i_28_ = arg0.pointion;
		int i_29_ = (i + i_17_ + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_);
		for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
			arg0.method228(0);
		i_16_ += arg0.pointion - i_28_;
		int i_31_ = arg0.pointion;
		int i_32_ = 0;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		for (int i_45_ = 0; i_45_ < i_18_; i_45_++) {
			i_44_ = i_44_ + arg0.get() & 0x7f;
			if (i_44_ == 0 || i_44_ == 32)
				i_24_++;
			else if (i_44_ == 1)
				i_32_++;
			else if (i_44_ == 33)
				i_33_++;
			else if (i_44_ == 7)
				i_34_++;
			else if (i_44_ == 39)
				i_35_++;
			else if (i_44_ == 10)
				i_36_++;
			else if (i_44_ == 42)
				i_37_++;
			else if (i_44_ == 99)
				i_38_++;
			else if (i_44_ == 98)
				i_39_++;
			else if (i_44_ == 101)
				i_40_++;
			else if (i_44_ == 100)
				i_41_++;
			else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120 || i_44_ == 121
					|| i_44_ == 123)
				i_42_++;
			else
				i_43_++;
		}
		int i_46_ = 0;
		int i_47_ = arg0.pointion;
		arg0.pointion += i_42_;
		int i_48_ = arg0.pointion;
		arg0.pointion += i_23_;
		int i_49_ = arg0.pointion;
		arg0.pointion += i_22_;
		int i_50_ = arg0.pointion;
		arg0.pointion += i_21_;
		int i_51_ = arg0.pointion;
		arg0.pointion += i_32_;
		int i_52_ = arg0.pointion;
		arg0.pointion += i_34_;
		int i_53_ = arg0.pointion;
		arg0.pointion += i_36_;
		int i_54_ = arg0.pointion;
		arg0.pointion += i_19_ + i_20_ + i_23_;
		int i_55_ = arg0.pointion;
		arg0.pointion += i_19_;
		int i_56_ = arg0.pointion;
		arg0.pointion += i_43_;
		int i_57_ = arg0.pointion;
		arg0.pointion += i_20_;
		int i_58_ = arg0.pointion;
		arg0.pointion += i_33_;
		int i_59_ = arg0.pointion;
		arg0.pointion += i_35_;
		int i_60_ = arg0.pointion;
		arg0.pointion += i_37_;
		int i_61_ = arg0.pointion;
		arg0.pointion += i_24_;
		int i_62_ = arg0.pointion;
		arg0.pointion += i_21_;
		int i_63_ = arg0.pointion;
		arg0.pointion += i_38_;
		int i_64_ = arg0.pointion;
		arg0.pointion += i_39_;
		int i_65_ = arg0.pointion;
		arg0.pointion += i_40_;
		int i_66_ = arg0.pointion;
		arg0.pointion += i_41_;
		int i_67_ = arg0.pointion;
		arg0.pointion += i_17_ * 3;
		aByteArray2335 = new byte[i_16_];
		StreamBuffer class4_sub11 = new StreamBuffer(aByteArray2335);
		class4_sub11.method236(181, 1297377380);
		class4_sub11.method236(181, 6);
		class4_sub11.method207(i > 1 ? 1 : 0, 2018779304);
		class4_sub11.method207(i, 2018779304);
		class4_sub11.method207(i_15_, 2018779304);
		arg0.pointion = i_28_;
		int i_68_ = 0;
		int i_69_ = 0;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		int[] is = new int[128];
		i_44_ = 0;
		for (int i_75_ = 0; i_75_ < i; i_75_++) {
			class4_sub11.method236(181, 1297379947);
			class4_sub11.pointion += 4;
			int i_76_ = class4_sub11.pointion;
			int i_77_ = -1;
			while_2_: do {
				for (;;) {
					int i_78_ = arg0.method228(0);
					class4_sub11.method254(i_78_, (byte) 67);
					int i_79_ = arg0.byteBuffer[i_46_++] & 0xff;
					boolean bool = i_79_ != i_77_;
					i_77_ = i_79_ & 0xf;
					if (i_79_ == 7) {
						if (bool)
							class4_sub11.method227((byte) -27, 255);
						class4_sub11.method227((byte) -27, 47);
						class4_sub11.method227((byte) -27, 0);
						break while_2_;
					}
					if (i_79_ == 23) {
						if (bool)
							class4_sub11.method227((byte) -27, 255);
						class4_sub11.method227((byte) -27, 81);
						class4_sub11.method227((byte) -27, 3);
						class4_sub11.method227((byte) -27,
								arg0.byteBuffer[i_67_++]);
						class4_sub11.method227((byte) -27,
								arg0.byteBuffer[i_67_++]);
						class4_sub11.method227((byte) -27,
								arg0.byteBuffer[i_67_++]);
					} else {
						i_68_ ^= i_79_ >> 4;
						if (i_77_ == 0) {
							if (bool)
								class4_sub11.method227((byte) -27, 144 + i_68_);
							i_69_ += arg0.byteBuffer[i_54_++];
							i_70_ += arg0.byteBuffer[i_55_++];
							class4_sub11.method227((byte) -27, i_69_ & 0x7f);
							class4_sub11.method227((byte) -27, i_70_ & 0x7f);
						} else if (i_77_ == 1) {
							if (bool)
								class4_sub11.method227((byte) -27, 128 + i_68_);
							i_69_ += arg0.byteBuffer[i_54_++];
							i_71_ += arg0.byteBuffer[i_57_++];
							class4_sub11.method227((byte) -27, i_69_ & 0x7f);
							class4_sub11.method227((byte) -27, i_71_ & 0x7f);
						} else if (i_77_ == 2) {
							if (bool)
								class4_sub11.method227((byte) -27, 176 + i_68_);
							i_44_ = i_44_ + arg0.byteBuffer[i_31_++] & 0x7f;
							class4_sub11.method227((byte) -27, i_44_);
							int i_80_;
							if (i_44_ == 0 || i_44_ == 32)
								i_80_ = arg0.byteBuffer[i_61_++];
							else if (i_44_ == 1)
								i_80_ = arg0.byteBuffer[i_51_++];
							else if (i_44_ == 33)
								i_80_ = arg0.byteBuffer[i_58_++];
							else if (i_44_ == 7)
								i_80_ = arg0.byteBuffer[i_52_++];
							else if (i_44_ == 39)
								i_80_ = arg0.byteBuffer[i_59_++];
							else if (i_44_ == 10)
								i_80_ = arg0.byteBuffer[i_53_++];
							else if (i_44_ == 42)
								i_80_ = arg0.byteBuffer[i_60_++];
							else if (i_44_ == 99)
								i_80_ = arg0.byteBuffer[i_63_++];
							else if (i_44_ == 98)
								i_80_ = arg0.byteBuffer[i_64_++];
							else if (i_44_ == 101)
								i_80_ = arg0.byteBuffer[i_65_++];
							else if (i_44_ == 100)
								i_80_ = arg0.byteBuffer[i_66_++];
							else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120
									|| i_44_ == 121 || i_44_ == 123)
								i_80_ = arg0.byteBuffer[i_47_++];
							else
								i_80_ = arg0.byteBuffer[i_56_++];
							i_80_ += is[i_44_];
							is[i_44_] = i_80_;
							class4_sub11.method227((byte) -27, i_80_ & 0x7f);
						} else if (i_77_ == 3) {
							if (bool)
								class4_sub11.method227((byte) -27, 224 + i_68_);
							i_72_ += arg0.byteBuffer[i_62_++];
							i_72_ += arg0.byteBuffer[i_50_++] << 7;
							class4_sub11.method227((byte) -27, i_72_ & 0x7f);
							class4_sub11.method227((byte) -27,
									i_72_ >> 7 & 0x7f);
						} else if (i_77_ == 4) {
							if (bool)
								class4_sub11.method227((byte) -27, 208 + i_68_);
							i_73_ += arg0.byteBuffer[i_49_++];
							class4_sub11.method227((byte) -27, i_73_ & 0x7f);
						} else if (i_77_ == 5) {
							if (bool)
								class4_sub11.method227((byte) -27, 160 + i_68_);
							i_69_ += arg0.byteBuffer[i_54_++];
							i_74_ += arg0.byteBuffer[i_48_++];
							class4_sub11.method227((byte) -27, i_69_ & 0x7f);
							class4_sub11.method227((byte) -27, i_74_ & 0x7f);
						} else {
							if (i_77_ != 6)
								break;
							if (bool)
								class4_sub11.method227((byte) -27, 192 + i_68_);
							class4_sub11.method227((byte) -27,
									(arg0.byteBuffer[i_61_++]));
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class4_sub11.method249(class4_sub11.pointion - i_76_, -22334);
		}
	}

	public void method309() {
		aClass16_2336 = null;
	}

	public void method310() {
		if (aClass16_2336 == null) {
			aClass16_2336 = new Class16(16);
			int[] is = new int[16];
			int[] is_0_ = new int[16];
			is[9] = is_0_[9] = 128;
			Class29 class29 = new Class29(aByteArray2335);
			int i = class29.method866();
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				class29.method871(i_1_);
				class29.method860(i_1_);
				class29.method861(i_1_);
			}
			while_3_: for (;;) {
				int i_2_ = class29.method867();
				int i_3_ = class29.anIntArray647[i_2_];
				while (class29.anIntArray647[i_2_] == i_3_) {
					class29.method871(i_2_);
					int i_4_ = class29.method870(i_2_);
					if (i_4_ == 1) {
						class29.method856();
						class29.method861(i_2_);
						if (!class29.method858())
							break;
						break while_3_;
					}
					int i_5_ = i_4_ & 0xf0;
					if (i_5_ == 176) {
						int i_6_ = i_4_ & 0xf;
						int i_7_ = i_4_ >> 8 & 0x7f;
						int i_8_ = i_4_ >> 16 & 0x7f;
						if (i_7_ == 0)
							is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
						if (i_7_ == 32)
							is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
					}
					if (i_5_ == 192) {
						int i_9_ = i_4_ & 0xf;
						int i_10_ = i_4_ >> 8 & 0x7f;
						is_0_[i_9_] = is[i_9_] + i_10_;
					}
					if (i_5_ == 144) {
						int i_11_ = i_4_ & 0xf;
						int i_12_ = i_4_ >> 8 & 0x7f;
						int i_13_ = i_4_ >> 16 & 0x7f;
						if (i_13_ > 0) {
							int i_14_ = is_0_[i_11_];
							Class4_Sub17 class4_sub17 = ((Class4_Sub17) aClass16_2336
									.method725((byte) 117, i_14_));
							if (class4_sub17 == null) {
								class4_sub17 = new Class4_Sub17(new byte[128]);
								aClass16_2336.method720(class4_sub17, i_14_,
										false);
							}
							class4_sub17.aByteArray2332[i_12_] = (byte) 1;
						}
					}
					class29.method860(i_2_);
					class29.method861(i_2_);
				}
			}
		}
	}
}
