
public class Tresor <T> {
 T inhalt;
int pin;
public Tresor(T inhalt, int pin) {
	this.inhalt=inhalt;
	this.pin=pin;
}
public  T oeffnen(int pin) {
	if(this.pin!=pin) {
		throw new IllegalArgumentException("falscher PIN angegeben!");
	}
	return this.inhalt;	
}
public void ersetzen(int pin, T neuerInhalt) {
	if(this.pin!=pin) {
		throw new IllegalArgumentException("falscher PIN angegeben!");
	}
	this.inhalt=neuerInhalt;
}

}
