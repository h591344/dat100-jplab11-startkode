package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		int antallInnlegg = samling.getAntall();
		Innlegg[] innleggtabell = samling.getSamling();
		PrintWriter skriver = null;
		boolean skrevet = true;
		try {
			skriver = new PrintWriter(mappe + filnavn);
			for (int i = 0; i < antallInnlegg; i++) {
				skriver.println(innleggtabell[i].toString());
			}
			skriver.close();
		} catch (FileNotFoundException e) {
			System.out.println("Feil ved skriving av blogg");
			skrevet = false;
		}
		
		
		return skrevet;
	}
}
