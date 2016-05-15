package proyecto1;

class Punto {
private int x;
private int y;
private double peso;

Punto(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

int getX() {
	return x;
}

void setX(int x) {
	this.x = x;
}

int getY() {
	return y;
}

void setY(int y) {
	this.y = y;
}

double getPeso() {
	return peso;
}

void setPeso(double peso) {
	if(this.peso>0){
		this.peso--;
	}else{
		peso=0;
	}
}

void incrementaPeso() {
	this.peso++;
}

void decrementePeso(){
	if(this.peso>0){
	this.peso--;
	}
}

@Override
public String toString() {
	return "Punto [x=" + x + ", y=" + y + ", peso=" + peso + "]";
}
//Git TEST.
}
