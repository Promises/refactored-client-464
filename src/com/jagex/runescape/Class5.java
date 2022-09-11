package com.jagex.runescape;

public class Class5 {
	public static JagexString aJagexString_176 = JagexString.getRs2PreparedString(
			"(U0a )2 non)2existant gosub script)2num: ");
	public static JagexString aJagexString_179 = JagexString.getRs2PreparedString(
			"Ihr Charakter)2Profil wird in:");
	public static JagexString aJagexString_194 = null;
	public static JagexString[] aJagexStringArray187;
	public static int anInt171;
	public static int anInt175 = 0;
	public static int anInt182;
	public static int anInt186;
	public static int anInt188;
	public static int anInt189;
	public static int anInt191;
	public static int anInt193;
	public static int anInt196;
	public static int[] anIntArray174;
	public static int[] anIntArray180;
	public static int[] anIntArray181;
	public static int[] anIntArray184;
	public static int[] anIntArray185;
	public static int[] anIntArray190;
	public static int[] anIntArray198;
	public static short[] aShortArray177;
	static {
		anInt188 = 0;
		anInt193 = 50;
		anIntArray174 = new int[anInt193];
		anIntArray181 = new int[anInt193];
		aJagexStringArray187 = new JagexString[anInt193];
		anIntArray184 = new int[anInt193];
		anIntArray190 = new int[anInt193];
		anInt196 = 50;
		anIntArray185 = new int[anInt193];
		anIntArray198 = new int[anInt193];
		anIntArray180 = new int[anInt193];
	}

	public static void method641(long arg0, byte arg1) {
		try {
			anInt189++;
			if ((arg0 ^ 0xffffffffffffffffL) != -1L && arg1 == 68) {
				for (int i = 0; i < GameShell.anInt23; i++) {
					if ((arg0 ^ 0xffffffffffffffffL) == (Class64.aLongArray1279[i] ^ 0xffffffffffffffffL)) {
						GameShell.anInt23--;
						for (int i_0_ = i; ((GameShell.anInt23 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
							StringUtilities.aJagexStringArray2893[i_0_] = (StringUtilities.aJagexStringArray2893[1 + i_0_]);
							Class50.anIntArray1005[i_0_] = Class50.anIntArray1005[1 + i_0_];
							Class64.aLongArray1279[i_0_] = Class64.aLongArray1279[1 + i_0_];
							Class34.anIntArray1743[i_0_] = Class34.anIntArray1743[1 + i_0_];
						}
						Class4_Sub20.anInt2349++;
						Class4_Sub20_Sub1.anInt2718 = Class4_Sub20_Sub10.anInt3053;
						Class66.aClass4_Sub11_Sub1_1328.method264(133, -38);
						Class66.aClass4_Sub11_Sub1_1328.method255(189354448,
								arg0);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("b.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method642(JagexString arg0, boolean arg1) {
		try {
			anInt171++;
			if (arg0.stringEquals(
					JagexString.getRs2PreparedString("::rdata")
            )) {
				System.out.println(Game.regionsData);
			}
			if ((Class14.anInt410 ^ 0xffffffff) <= -3) {
				if (arg0.stringEquals(Class4_Sub21.garbageCollection)) {
					System.gc();
				}
				if (arg0.stringEquals(StringUtilities.aJagexString_622)) {
					Class11.method674(-1);
				}
				if (arg0.stringEquals(StringUtilities.aJagexString_2886)) {
					Class4_Sub20_Sub9.aBoolean3048 = true;
				}
				if (arg0.stringEquals(JagexString.getRs2PreparedString("::test"))) {
					Class43.method955(JagexString.getRs2PreparedString("hello world"),
							JagexString.getRs2PreparedString("Testname:"), (byte) 108, 4);
//					String[][] musicnames = {{"7th realm", "2005", "January", "17"}, {"adventure", "2004", "March", "15"}, {"al kharid", "2004", "March", "15"}, {"alls fairy in love and war", "2006", "July", "11"}, {"alone", "2004", "March", "15"}, {"alternative root", "2007", "March", "27"}, {"ambient jungle", "2004", "March", "15"}, {"anywhere", "2004", "December", "6"}, {"arabian", "2004", "March", "15"}, {"arabian2", "2004", "March", "15"}, {"arabian3", "2004", "March", "15"}, {"arabique", "2004", "March", "15"}, {"army of darkness", "2004", "March", "15"}, {"arrival", "2004", "March", "15"}, {"artistry", "2004", "August", "2"}, {"assault and battery", "2007", "January", "4"}, {"attack i", "2004", "March", "15"}, {"attack ii", "2004", "March", "15"}, {"attack iii", "2004", "March", "15"}, {"attack iv", "2004", "March", "15"}, {"attack v", "2004", "March", "15"}, {"attack vi", "2004", "March", "15"}, {"attention", "2004", "March", "15"}, {"autumn voyage", "2004", "March", "15"}, {"aye car rum ba", "2005", "October", "31"}, {"aztec", "2004", "July", "27"}, {"back to life", "2007", "January", "10"}, {"background", "2004", "March", "15"}, {"ballad of enchantment", "2004", "March", "15"}, {"bandit camp", "2004", "March", "15"}, {"barb wire", "2007", "July", "3"}, {"barbarianism", "2006", "July", "4"}, {"barking mad", "2005", "January", "31"}, {"baroque", "2004", "March", "15"}, {"beetle juice", "2007", "January", "10"}, {"beyond", "2004", "March", "15"}, {"big chords", "2004", "March", "15"}, {"blistering barnacles", "2005", "October", "31"}, {"body parts", "2005", "January", "31"}, {"bone dance", "2004", "October", "18"}, {"bone dry", "2005", "April", "18"}, {"book of spells", "2004", "March", "15"}, {"borderland", "2004", "November", "2"}, {"breeze", "2004", "March", "29"}, {"brew hoo hoo", "2005", "February", "15"}, {"brimstails scales", "2006", "August", "15"}, {"bubble and squeak", "2005", "November", "28"}, {"cabin fever", "2006", "February", "7"}, {"camelot", "2004", "March", "15"}, {"castle wars", "2004", "December", "13"}, {"catch me if you can", "2005", "November", "28"}, {"cave background", "2004", "March", "15"}, {"cave of beasts", "2005", "March", "7"}, {"cave of the goblins", "2005", "March", "7"}, {"cavern", "2004", "March", "15"}, {"cellar song", "2004", "March", "15"}, {"chain of command", "2004", "March", "15"}, {"chamber", "2004", "December", "21"}, {"chef surprize", "2006", "March", "15"}, {"chickened out", "2006", "March", "15"}, {"chompy hunt", "2004", "May", "18"}, {"city of the dead", "2005", "April", "26"}, {"claustrophobia", "2005", "March", "21"}, {"close quarters", "2004", "March", "15"}, {"competition", "2004", "November", "24"}, {"complication", "2004", "March", "29"}, {"contest", "2004", "August", "24"}, {"corporal punishment", "2005", "October", "24"}, {"corridors of power", "2006", "May", "22"}, {"courage", "2004", "March", "29"}, {"creature cruelty", "2007", "February", "19"}, {"crystal castle", "2004", "September", "20"}, {"crystal cave", "2004", "March", "15"}, {"crystal sword", "2004", "March", "15"}, {"cursed", "2004", "April", "15"}, {"dagannoth dawn", "2005", "November", "7"}, {"dance of death", "2006", "July", "4"}, {"dance of the undead", "2005", "May", "9"}, {"dangerous", "2004", "March", "15"}, {"dangerous road", "2004", "March", "29"}, {"dangerous way", "2005", "May", "9"}, {"dark", "2004", "March", "15"}, {"darkness", "2004", "March", "29"}, {"davy joness locker", "2006", "March", "15"}, {"dead can dance", "2004", "March", "15"}, {"dead quiet", "2004", "July", "13"}, {"deadlands", "2004", "June", "29"}, {"deep down", "2004", "December", "21"}, {"deep wildy", "2004", "March", "15"}, {"desert heat", "2005", "December", "5"}, {"desert voyage", "2004", "March", "15"}, {"diangos little helpers", "2005", "December", "19"}, {"dimension x", "2006", "July", "11"}, {"distant land", "2006", "March", "22"}, {"distillery hilarity", "2006", "July", "4"}, {"dogs of war", "2006", "July", "4"}, {"doorways", "2004", "March", "15"}, {"dorgeshuun city", "2007", "March", "20"}, {"dorgeshuun deep", "2007", "March", "20"}, {"down below", "2004", "March", "15"}, {"down and out", "2007", "May", "15"}, {"down to earth", "2004", "March", "15"}, {"dragontooth island", "2005", "February", "15"}, {"dream", "2004", "March", "15"}, {"dreamstate", "2006", "July", "24"}, {"duel arena", "2004", "March", "15"}, {"dunjun", "2004", "March", "29"}, {"dwarf theme", "2004", "March", "15"}, {"dynasty", "2005", "April", "4"}, {"eagle peak", "2006", "November", "28"}, {"easter jig", "2007", "April", "2"}, {"egypt", "2004", "March", "15"}, {"elven mist", "2004", "September", "20"}, {"emotion", "2004", "March", "15"}, {"emperor", "2004", "March", "15"}, {"escape", "2004", "March", "15"}, {"espionage", "2007", "January", "29"}, {"etcetera", "2004", "November", "29"}, {"everlasting", "2007", "May", "15"}, {"everlasting fire", "2004", "March", "15"}, {"everywhere", "2004", "September", "20"}, {"evil bobs island", "2005", "August", "9"}, {"expanse", "2004", "March", "15"}, {"expecting", "2004", "March", "15"}, {"expedition", "2004", "March", "15"}, {"exposed", "2004", "September", "20"}, {"faerie", "2004", "March", "15"}, {"faithless", "2004", "November", "17"}, {"fanfare", "2004", "March", "15"}, {"fanfare2", "2004", "March", "15"}, {"fanfare3", "2004", "March", "15"}, {"fangs for the memory", "2006", "March", "22"}, {"far away", "2005", "July", "19"}, {"fe fi fo fum", "2007", "June", "4"}, {"fear and loathing", "2006", "April", "3"}, {"fenkenstrains refrain", "2005", "January", "31"}, {"fight or flight", "2005", "July", "19"}, {"find my way", "2004", "December", "6"}, {"fire and brimstone", "2005", "September", "19"}, {"fishing", "2004", "March", "15"}, {"floating free", "2006", "November", "6"}, {"flute salad", "2004", "March", "15"}, {"food for thought", "2006", "July", "4"}, {"forbidden", "2004", "March", "15"}, {"forest", "2004", "September", "20"}, {"forever", "2004", "March", "15"}, {"forgettable melody", "2005", "July", "26"}, {"forgotten", "2005", "April", "11"}, {"frogland", "2005", "August", "1"}, {"frostbite", "2005", "April", "18"}, {"fruits de mer", "2004", "March", "15"}, {"funny bunnies", "2006", "April", "10"}, {"gaol", "2004", "March", "15"}, {"garden", "2004", "March", "15"}, {"garden of autumn", "2007", "February", "12"}, {"garden of spring", "2007", "February", "12"}, {"garden of summer", "2007", "February", "12"}, {"garden of winter", "2007", "February", "12"}, {"gnome king", "2004", "March", "15"}, {"gnome village i", "2004", "March", "15"}, {"gnome village ii", "2004", "March", "15"}, {"gnomeball", "2004", "March", "15"}, {"goblin game", "2004", "March", "15"}, {"goblin village", "2004", "March", "15"}, {"golden touch", "2006", "January", "4"}, {"greatness", "2004", "March", "15"}, {"grip of the talon", "2005", "November", "14"}, {"grotto", "2004", "July", "13"}, {"ground scape", "2005", "July", "11"}, {"grumpy", "2004", "May", "18"}, {"h.a.m. fisted", "2006", "June", "21"}, {"ham attack", "2007", "April", "24"}, {"ham and seek", "2007", "April", "24"}, {"harmony", "2004", "March", "15"}, {"harmony2", "2004", "March", "15"}, {"haunted mine", "2004", "December", "21"}, {"have a blast", "2005", "August", "23"}, {"have an ice day", "2007", "January", "29"}, {"head to head", "2006", "May", "22"}, {"heart and mind", "2004", "March", "15"}, {"hells bells", "2005", "January", "5"}, {"hermit", "2004", "August", "9"}, {"high seas", "2004", "March", "15"}, {"high spirits", "2006", "October", "30"}, {"home sweet home", "2006", "May", "31"}, {"homescape", "2006", "May", "31"}, {"horizon", "2004", "March", "15"}, {"hypnotized", "2005", "April", "26"}, {"iban", "2004", "March", "15"}, {"ice melody", "2004", "March", "15"}, {"illusive", "2007", "May", "15"}, {"impetuous", "2007", "June", "11"}, {"in between", "2005", "March", "21"}, {"in the brine", "2006", "February", "7"}, {"in the clink", "2006", "January", "10"}, {"in the manor", "2004", "March", "29"}, {"in the pits", "2005", "September", "19"}, {"inadequacy", "2007", "May", "15"}, {"incantation", "2005", "November", "14"}, {"insect queen", "2004", "September", "7"}, {"inspiration", "2004", "March", "15"}, {"into the abyss", "2005", "June", "13"}, {"intrepid", "2004", "March", "15"}, {"island life", "2004", "December", "6"}, {"island of the trolls", "2007", "February", "6"}, {"isle of everywhere", "2006", "July", "24"}, {"jester minute", "2007", "February", "6"}, {"jolly-r", "2004", "March", "15"}, {"joy of the hunt", "2006", "November", "21"}, {"jungle bells", "2006", "December", "18"}, {"jungle hunt", "2006", "November", "21"}, {"jungle island", "2004", "March", "15"}, {"jungle island xmas", "2006", "December", "18"}, {"jungle troubles", "2004", "March", "15"}, {"jungly1", "2004", "March", "15"}, {"jungly2", "2004", "March", "15"}, {"jungly3", "2004", "March", "15"}, {"karamja jam", "2005", "January", "17"}, {"kingdom", "2004", "August", "9"}, {"knightly", "2004", "March", "15"}, {"la mort", "2005", "October", "17"}, {"labyrinth", "2007", "January", "10"}, {"lair", "2004", "October", "18"}, {"lament", "2006", "January", "23"}, {"lament of meiyerditch", "2006", "September", "4"}, {"land down under", "2006", "May", "22"}, {"land of the dwarves", "2005", "May", "31"}, {"landlubber", "2004", "March", "15"}, {"last stand", "2006", "May", "2"}, {"lasting", "2004", "March", "15"}, {"legend", "2004", "August", "24"}, {"legion", "2004", "March", "29"}, {"lifes a beach!", "2006", "February", "7"}, {"lighthouse", "2004", "November", "17"}, {"lightwalk", "2004", "March", "15"}, {"little cave of horrors", "2006", "July", "4"}, {"lonesome", "2004", "March", "15"}, {"long ago", "2004", "March", "15"}, {"long way home", "2004", "March", "29"}, {"looking back", "2007", "May", "29"}, {"lost soul", "2004", "September", "20"}, {"lullaby", "2004", "March", "15"}, {"mad eadgar", "2004", "October", "5"}, {"mage arena", "2004", "March", "15"}, {"magic dance", "2002", "October", "29"}, {"magic magic magic", "2007", "February", "19"}, {"magical journey", "2004", "March", "15"}, {"major miner", "2007", "February", "6"}, {"making waves", "2006", "May", "2"}, {"malady", "2006", "July", "4"}, {"march", "2004", "March", "15"}, {"marooned", "2004", "December", "6"}, {"marzipan", "2005", "May", "31"}, {"masquerade", "2005", "January", "26"}, {"mastermindless", "2006", "March", "15"}, {"mausoleum", "2004", "June", "29"}, {"meddling kids", "2006", "May", "22"}, {"medieval", "2004", "March", "29"}, {"mellow", "2004", "March", "15"}, {"melodrama", "2004", "December", "13"}, {"melzars maze", "2007", "June", "18"}, {"meridian", "2004", "September", "20"}, {"method of madness", "2006", "April", "3"}, {"miles away", "2004", "March", "29"}, {"mind over matter", "2006", "January", "4"}, {"miracle dance", "2004", "March", "29"}, {"mirage", "2005", "April", "26"}, {"miscellania", "2004", "November", "29"}, {"monarch waltz", "2004", "March", "15"}, {"monkey madness", "2004", "December", "6"}, {"monster melee", "2005", "May", "31"}, {"moody", "2004", "March", "31"}, {"morytania", "2004", "June", "29"}, {"mouse trap", "2007", "June", "4"}, {"mudskipper melody", "2005", "October", "24"}, {"mutant medley", "2007", "February", "19"}, {"my arms journey", "2006", "October", "23"}, {"narnodes theme", "2004", "March", "15"}, {"natural", "2004", "July", "13"}, {"neverland", "2004", "March", "15"}, {"newbie melody", "2004", "March", "29"}, {"night of the vampyre", "2006", "September", "4"}, {"nightfall", "2004", "March", "29"}, {"no way out", "2006", "April", "3"}, {"nomad", "2004", "March", "15"}, {"norse code", "2007", "February", "6"}, {"null and void", "2006", "April", "18"}, {"ogre the top", "2007", "February", "6"}, {"on the up", "2007", "May", "15"}, {"on the wing", "2006", "November", "21"}, {"oriental", "2003", "January", "27"}, {"out of the deep", "2004", "November", "17"}, {"over to nardah", "2005", "December", "5"}, {"overpass", "2004", "September", "20"}, {"overture", "2004", "March", "15"}, {"parade", "2004", "March", "29"}, {"path of peril", "2005", "April", "18"}, {"pathways", "2005", "January", "17"}, {"pest control", "2006", "April", "18"}, {"pharaohs tomb", "2006", "January", "16"}, {"phasmatys", "2005", "February", "15"}, {"pheasant peasant", "2005", "August", "1"}, {"pinball wizard", "2006", "May", "22"}, {"pirates of penance", "2007", "January", "4"}, {"pirates of peril", "2004", "March", "15"}, {"poles apart", "2006", "November", "21"}, {"prime time", "2006", "October", "2"}, {"principality", "2004", "August", "9"}, {"quest", "2004", "March", "15"}, {"rat hunt", "2005", "November", "28"}, {"rat a tat tat", "2005", "November", "28"}, {"ready for battle", "2004", "December", "13"}, {"regal", "2004", "March", "15"}, {"reggae", "2004", "March", "15"}, {"reggae2", "2004", "March", "15"}, {"rellekka", "2004", "November", "2"}, {"right on track", "2005", "July", "26"}, {"righteousness", "2004", "March", "29"}, {"rising damp", "2007", "April", "10"}, {"riverside", "2004", "March", "15"}, {"roc and roll", "2006", "October", "23"}, {"roll the bones", "2006", "January", "4"}, {"romancing the crone", "2005", "January", "5"}, {"romper chomper", "2005", "May", "17"}, {"royale", "2004", "March", "15"}, {"rune essence", "2004", "March", "29"}, {"sad meadow", "2004", "March", "15"}, {"saga", "2004", "August", "24"}, {"sarcophagus", "2005", "April", "18"}, {"sarims vermin", "2005", "November", "28"}, {"scape cave", "2004", "March", "15"}, {"scape hunter", "2006", "November", "21"}, {"scape main", "2005", "April", "11"}, {"scape original", "2004", "March", "15"}, {"scape sad", "2004", "March", "15"}, {"scape santa", "2004", "March", "15"}, {"scape scared", "2005", "October", "31"}, {"scape soft", "2004", "March", "15"}, {"scape wild", "2004", "March", "15"}, {"scarab", "2005", "April", "18"}, {"schools out", "2007", "July", "17"}, {"sea shanty i", "2004", "March", "15"}, {"sea shanty ii", "2004", "March", "15"}, {"sea shanty xmas", "2006", "December", "18"}, {"serenade", "2004", "March", "15"}, {"serene", "2004", "March", "15"}, {"settlement", "2005", "March", "7"}, {"shadowland", "2004", "October", "18"}, {"shine", "2004", "March", "15"}, {"shining", "2004", "March", "15"}, {"shipwrecked", "2005", "February", "15"}, {"showdown", "2004", "December", "6"}, {"sigmunds showdown", "2006", "June", "21"}, {"slice of silent movie", "2007", "April", "24"}, {"slice of station", "2007", "April", "24"}, {"slither and thither", "2006", "May", "22"}, {"slug a bug ball", "2006", "September", "20"}, {"sojourn", "2004", "August", "24"}, {"soundscape", "2004", "March", "15"}, {"sphinx", "2005", "April", "26"}, {"spirit", "2004", "March", "15"}, {"spirits of elid", "2005", "December", "5"}, {"splendour", "2004", "March", "15"}, {"spooky", "2004", "March", "15"}, {"spooky2", "2004", "December", "21"}, {"spooky jungle", "2004", "March", "15"}, {"stagnant", "2004", "July", "13"}, {"starlight", "2004", "March", "15"}, {"start", "2004", "March", "15"}, {"stillness", "2005", "January", "10"}, {"storm brew", "2006", "February", "20"}, {"stranded", "2005", "January", "5"}, {"strange place", "2005", "September", "26"}, {"stratosphere", "2002", "February", "27"}, {"subterranea", "2005", "November", "7"}, {"sunburn", "2005", "April", "18"}, {"superstition", "2004", "October", "26"}, {"suspicious", "2004", "December", "6"}, {"tale of keldagrim", "2005", "May", "31"}, {"talking forest", "2004", "March", "15"}, {"tears of guthix", "2005", "May", "4"}, {"technology", "2004", "December", "6"}, {"temple", "2004", "December", "6"}, {"temple of light", "2005", "October", "17"}, {"the cellar dwellers", "2004", "March", "15"}, {"the chosen", "2005", "June", "27"}, {"the depths", "2007", "January", "10"}, {"the desert", "2004", "March", "15"}, {"the desolate isle", "2005", "August", "1"}, {"the enchanter", "2006", "January", "4"}, {"the far side", "2005", "June", "25"}, {"the galleon", "2006", "July", "24"}, {"the genie", "2005", "December", "5"}, {"the golem", "2005", "April", "11"}, {"the last shanty", "2006", "September", "4"}, {"the lost melody", "2005", "May", "31"}, {"the lost tribe", "2005", "May", "31"}, {"the lunar isle", "2006", "July", "24"}, {"the mad mole", "2006", "March", "7"}, {"the mollusc menace", "2006", "September", "20"}, {"the monsters below", "2005", "August", "1"}, {"the navigator", "2004", "November", "2"}, {"the noble rodent", "2005", "November", "28"}, {"the other side", "2005", "February", "15"}, {"the power of tears", "2006", "June", "21"}, {"the quiz master", "2005", "August", "1"}, {"the rogues den", "2005", "June", "25"}, {"the shadow", "2004", "March", "15"}, {"the slayer", "2005", "January", "26"}, {"the terrible tower", "2005", "January", "26"}, {"the tower", "2004", "March", "15"}, {"theme", "2004", "March", "15"}, {"throne of the demon", "2005", "April", "11"}, {"time out", "2004", "August", "2"}, {"time to mine", "2005", "March", "21"}, {"tiptoe", "2004", "March", "29"}, {"title fight", "2005", "December", "12"}, {"tomb raider", "2006", "July", "17"}, {"tomorrow", "2004", "March", "15"}, {"too many cooks...", "2006", "March", "15"}, {"trawler", "2003", "July", "28"}, {"trawler minor", "2003", "July", "28"}, {"tree spirits", "2004", "March", "15"}, {"tremble", "2004", "August", "9"}, {"tribal", "2004", "March", "15"}, {"tribal2", "2004", "March", "15"}, {"tribal background", "2004", "March", "15"}, {"trinity", "2004", "March", "15"}, {"trouble brewing", "2006", "July", "4"}, {"troubled", "2004", "March", "15"}, {"twilight", "2004", "June", "2"}, {"tzhaar!", "2005", "October", "4"}, {"undead dungeon", "2007", "January", "22"}, {"undercurrent", "2004", "March", "15"}, {"underground", "2004", "March", "15"}, {"underground pass", "2004", "March", "15"}, {"understanding", "2004", "May", "18"}, {"unknown land", "2004", "March", "15"}, {"untouchable", "2007", "May", "15"}, {"upcoming", "2004", "March", "15"}, {"venture", "2004", "March", "15"}, {"venture2", "2004", "March", "15"}, {"victory is mine", "2005", "December", "12"}, {"village", "2004", "October", "14"}, {"vision", "2004", "March", "15"}, {"volcanic vikings", "2007", "February", "6"}, {"voodoo cult", "2004", "March", "15"}, {"voyage", "2004", "March", "15"}, {"waking dream", "2006", "July", "24"}, {"wander", "2004", "March", "15"}, {"warrior", "2004", "November", "2"}, {"warriors guild", "2006", "June", "12"}, {"waterfall", "2004", "March", "15"}, {"waterlogged", "2004", "July", "13"}, {"way of the enchanter", "2006", "July", "24"}, {"wayward", "2005", "May", "17"}, {"we are the fairies", "2006", "July", "11"}, {"well of voyage", "2004", "September", "20"}, {"where eagles lair", "2006", "November", "28"}, {"wild isle", "2004", "March", "15"}, {"wild side", "2004", "March", "15"}, {"wilderness i", "2004", "March", "15"}, {"wilderness ii", "2004", "March", "15"}, {"wilderness iii", "2004", "March", "15"}, {"wildwood", "2004", "March", "15"}, {"witching", "2004", "March", "15"}, {"woe of the wyvern", "2005", "December", "12"}, {"wonder", "2004", "March", "15"}, {"wonderous", "2004", "March", "15"}, {"woodland", "2004", "September", "20"}, {"work work work", "2007", "February", "19"}, {"workshop", "2004", "March", "15"}, {"wrath and ruin", "2006", "April", "3"}, {"xenophobe", "2005", "August", "1"}, {"yesteryear", "2004", "March", "15"}, {"zealot", "2004", "March", "15"}, {"zogre dance", "2005", "May", "17"}, {"zombiism", "2007", "March", "6"}};
//					System.out.println("[");
//					for (String[] music : musicnames) {
//						int i = Class54.aClass19_Sub1_1107.method754(JagexString.getRs2PreparedString(music[0]), 1);
//						System.out.printf("{ \"id:\": %d, \"name\": \"%s\" },",i,music[0]);
//					}
//					System.out.println("]");



				}
				if (arg0.stringEquals(StringUtilities.aJagexString_659)) {
					Class4_Sub20_Sub9.aBoolean3048 = false;
				}
				if (arg0.stringEquals(Class7.aJagexString_223)) {
					for (int i = 0; i < 4; i++) {
						for (int i_1_ = 1; i_1_ < 103; i_1_++) {
							for (int i_2_ = 1; (i_2_ ^ 0xffffffff) > -104; i_2_++) {
								Class57.regions[i].clippingData[i_1_][i_2_] = 0;
							}
						}
					}
				}
				if (arg0.stringEquals(Class67.aJagexString_1365)
						&& Class12.anInt341 == 2) {
					throw new RuntimeException();
				}
				if (arg0.method808(Class74.aJagexString_1520, (byte) -95)) {
					Class52.anInt1052 = arg0.method805(12, 86).method815(126)
							.method804((byte) -128);
					Class43.method955(
							(Class4_Sub24.method639(
									(new JagexString[] {
											StringUtilities.aJagexString_451,
											Class74.method1168(-41,
													(Class52.anInt1052)) }),
									-842)), null, (byte) 118, 0);
				}
				if (arg0.stringEquals(Class4_Sub20_Sub7_Sub4.aJagexString_3368
                )) {
					Class19_Sub1.aBoolean2538 = true;
				}
			}
			if (arg1 != false) {
				method644((byte) 55, -24);
			}
			Npc.anInt3614++;
			Class66.aClass4_Sub11_Sub1_1328.method264(165, 117);
			Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27,
					-1 + arg0.method825(-97));
			Class66.aClass4_Sub11_Sub1_1328.method259(arg0.method805(2, 96),
					18601);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("b.D("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method643(int arg0) {
		aShortArray177 = null;
		anIntArray185 = null;
		aJagexString_194 = null;
		aJagexString_176 = null;
		anIntArray181 = null;
		anIntArray184 = null;
		anIntArray198 = null;
		anIntArray174 = null;
		anIntArray190 = null;
		aJagexString_179 = null;
		aJagexStringArray187 = null;
		anIntArray180 = null;
		if (arg0 != 0) {
			method644((byte) 10, -47);
		}
	}

	public static boolean method644(byte arg0, int arg1) {
		try {
			anInt191++;
			if (arg0 != -108) {
				method643(-121);
			}
			if ((0x1 & arg1 >> -1802717313) == 0) {
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("b.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method645(int arg0, Class19 arg1, Class19 arg2) {
		try {
			Class65.aClass19_1291 = arg2;
			Class1.aClass19_80 = arg1;
			if (arg0 <= 51) {
				method642(null, false);
			}
			anInt186++;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("b.E("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public boolean aBoolean195 = true;

	public int anInt172;

	public int anInt173;

	public int anInt178;

	public int anInt183;

	public int anInt192;

	public int anInt197;

	public Class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
			boolean arg6) {
		try {
			anInt183 = arg1;
			anInt197 = arg3;
			anInt178 = arg2;
			aBoolean195 = arg6;
			anInt172 = arg4;
			anInt192 = arg5;
			anInt173 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception,
					("b.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ',' + arg5 + ',' + arg6 + ')'));
		}
	}
}
