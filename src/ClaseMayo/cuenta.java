package ClaseMayo;

public class cuenta {
private String titular;
private double cant;

public cuenta(String titular) {
	this.titular = titular;
	this.cant = 0;
}
public cuenta(String titular, double cant) {
	this.titular = titular;
	this.cant = cant > 0 ? cant : 0;
	}
public void ingresar (double cant) {
	if (cant > 0) {
		this.cant += cant;
	}
}
public void retirar (double cant) {
	if (this.cant - cant < 0) {
		this.cant = 0;
	}else {
		this.cant -= cant;
	}
}
public String getTitular() {
	return titular;
}
public void setTitular(String titular) {
	this.titular = titular;
}
public double getCant() {
	return cant;
}
}

