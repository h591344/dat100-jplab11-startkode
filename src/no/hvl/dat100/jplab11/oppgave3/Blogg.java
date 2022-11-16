package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Tekst;
import no.hvl.dat100.jplab11.oppgave2.Bilde;

public class Blogg extends Innlegg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
		
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for ( int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		int pos = 0;
		
		boolean funnet = false;
		
		while ( pos < nesteledig && !funnet) {
			if(innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			}
			else {
				pos++;
			}
		}
		return funnet;
	}

	public boolean ledigPlass() {
		
		if(nesteledig >= innleggtabell.length) {
			return false;
		}
		return true;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig ++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String utTxt = nesteledig + "\n";
		
		for (int i = 0; i < nesteledig; i++) {
			utTxt += innleggtabell[i].toString();
		}
		
		return utTxt;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}