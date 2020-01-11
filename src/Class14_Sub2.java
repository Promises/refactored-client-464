/* Class14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2 extends Class14 {
	public long aLong2505 = System.nanoTime();

	@Override
	public void method699(int arg0) {
		aLong2505 = System.nanoTime();
		if (arg0 != -1)
			method699(-84);
	}

	@Override
	public int method705(boolean arg0, int arg1, int arg2) {
		int i;
		try {
			long l = aLong2505 - System.nanoTime();
			if (arg0 != true)
				aLong2505 = 63L;
			int i_0_ = 0;
			long l_1_ = arg1 * 1000000L;
			if (l < l_1_)
				l = l_1_;
			Class25.method799(l / 1000000L, 10);
			long l_2_;
			for (l_2_ = System.nanoTime(); -11 < (i_0_ ^ 0xffffffff)
					&& (1 > i_0_ || aLong2505 < l_2_); aLong2505 += 1000000L * arg2)
				i_0_++;
			if ((aLong2505 ^ 0xffffffffffffffffL) > (l_2_ ^ 0xffffffffffffffffL))
				aLong2505 = l_2_;
			i = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}
}
