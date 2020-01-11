/* Class13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class13_Sub1 extends Class13 {
	public Component aComponent2452;

	@Override
	public void method680(int arg0, byte arg1, Graphics arg2, int arg3,
			int arg4, int arg5) {
		Shape shape = arg2.getClip();
		arg2.clipRect(arg3, arg5, arg0, arg4);
		arg2.drawImage(anImage378, 0, 0, aComponent2452);
		arg2.setClip(shape);
	}

	@Override
	public void method686(Component arg0, int arg1, int arg2, int arg3) {
		anIntArray384 = new int[arg1 * arg3 + 1];
		anInt371 = arg1;
		anInt376 = arg3;
		DataBufferInt databufferint = new DataBufferInt(anIntArray384,
				anIntArray384.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680,
				65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster(
				directcolormodel
						.createCompatibleSampleModel(anInt376, anInt371),
				databufferint, null));
		if (arg2 <= -63) {
			anImage378 = new BufferedImage(directcolormodel, writableraster,
					false, new Hashtable<Object, Object>());
			aComponent2452 = arg0;
			method689(27);
		}
	}

	@Override
	public void method687(Graphics arg0, int arg1, int arg2, boolean arg3) {
		if (arg3 == true)
			arg0.drawImage(anImage378, arg1, arg2, aComponent2452);
	}
}
