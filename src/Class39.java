/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class39 {
	public File aFile779;
	public long aLong776;
	public long aLong778;
	public RandomAccessFile aRandomAccessFile777;

	public Class39(File arg0, String arg1, long arg2) throws IOException {
		try {
			if (arg2 == -1L)
				arg2 = 9223372036854775807L;
			if ((arg0.length() ^ 0xffffffffffffffffL) <= (arg2 ^ 0xffffffffffffffffL))
				arg0.delete();
			aRandomAccessFile777 = new RandomAccessFile(arg0, arg1);
			aLong776 = arg2;
			aLong778 = 0L;
			aFile779 = arg0;
			int i = aRandomAccessFile777.read();
			if ((i ^ 0xffffffff) != 0 && !arg1.equals("r")) {
				aRandomAccessFile777.seek(0L);
				aRandomAccessFile777.write(i);
			}
			aRandomAccessFile777.seek(0L);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public void finalize() throws Throwable {
		if (aRandomAccessFile777 != null) {
			System.out
					.println("Warning! fileondisk "
							+ aFile779
							+ " not closed correctly using close(). Auto-closing instead. ");
			method927(0);
		}
	}

	public long method925(int arg0) throws IOException {
		try {
			if (arg0 != -29248)
				aRandomAccessFile777 = null;
			return aRandomAccessFile777.length();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public File method926(byte arg0) {
		try {
			if (arg0 != 79)
				aRandomAccessFile777 = null;
			return aFile779;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public void method927(int arg0) throws IOException {
		try {
			aRandomAccessFile777.close();
			if (arg0 != 0)
				aLong778 = 53L;
			aRandomAccessFile777 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public int method928(byte arg0, int arg1, byte[] arg2, int arg3)
			throws IOException {
		try {
			int i = aRandomAccessFile777.read(arg2, arg1, arg3);
			if (i > 0)
				aLong778 += i;
			if (arg0 != -100)
				aLong778 = 7L;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public void method929(int arg0, long arg1) throws IOException {
		try {
			aRandomAccessFile777.seek(arg1);
			if (arg0 < 85)
				aLong778 = -32L;
			aLong778 = arg1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public void method930(int arg0, byte[] arg1, int arg2, boolean arg3)
			throws IOException {
		try {
			if (arg3 == true) {
				if (aLong778 + arg2 > aLong776) {
					aRandomAccessFile777.seek(1L + aLong776);
					aRandomAccessFile777.write(1);
					throw new EOFException();
				}
				aRandomAccessFile777.write(arg1, arg0, arg2);
				aLong778 += arg2;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
