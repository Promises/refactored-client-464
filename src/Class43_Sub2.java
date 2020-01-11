/* Class43_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class43_Sub2 extends Class43 {
	public static Class<?> aClass2547;

	public static Class<?> method968(String arg0) {
		Class<?> var_class;
		try {
			var_class = Class.forName(arg0);
		} catch (ClassNotFoundException classnotfoundexception) {
			return null;
		}
		return var_class;
	}

	public byte[] aByteArray2546;
	public AudioFormat anAudioFormat2545;
	public int anInt2544;

	public SourceDataLine aSourceDataLine2543;

	@Override
	public void method950() {
		aSourceDataLine2543.flush();
	}

	@Override
	public void method956(Component arg0) {
		anAudioFormat2545 = new AudioFormat(Class67.anInt1354, 16,
				Class4_Sub20_Sub7_Sub1.aBoolean3218 ? 2 : 1, true, false);
		aByteArray2546 = new byte[256 << (!Class4_Sub20_Sub7_Sub1.aBoolean3218 ? 1
				: 2)];
	}

	@Override
	public int method959() {
		int i;
		try {
			i = anInt2544
					- (aSourceDataLine2543.available() >> (!Class4_Sub20_Sub7_Sub1.aBoolean3218 ? 1
							: 2));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	@Override
	public void method960() {
		if (null != aSourceDataLine2543) {
			aSourceDataLine2543.close();
			aSourceDataLine2543 = null;
		}
	}

	@Override
	public void method963(int arg0) throws LineUnavailableException {
		try {
			DataLine.Info info = (new DataLine.Info(
					(aClass2547 == null ? (aClass2547 = method968("javax.sound.sampled.SourceDataLine"))
							: aClass2547), anAudioFormat2545,
					arg0 << (!Class4_Sub20_Sub7_Sub1.aBoolean3218 ? 1 : 2)));
			aSourceDataLine2543 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine2543.open();
			aSourceDataLine2543.start();
			anInt2544 = arg0;
		} catch (LineUnavailableException lineunavailableexception) {
			if ((Class14.method703(858993459, arg0) ^ 0xffffffff) != -2)
				method963(Class12.method677(-473856792, arg0));
			else {
				aSourceDataLine2543 = null;
				throw lineunavailableexception;
			}
		}
	}

	@Override
	public void method965() {
		int i = 256;
		if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
			i <<= 1;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = anIntArray877[i_0_];
			if ((i_1_ + 8388608 & ~0xffffff) != 0)
				i_1_ = 0x7fffff ^ i_1_ >> 31;
			aByteArray2546[i_0_ * 2] = (byte) (i_1_ >> 8);
			aByteArray2546[i_0_ * 2 + 1] = (byte) (i_1_ >> 16);
		}
		aSourceDataLine2543.write(aByteArray2546, 0, i << 1);
	}
}
