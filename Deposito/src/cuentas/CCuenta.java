package cuentas;

/**
 * Esta clase representa a una cuenta bancaria.
 * 
 * @author Laura Hernández Ciprián
 */

public class CCuenta {

	/**
	 *  Declaración de variables, incluye:nombre del titular, cuenta bancaria, saldo disponible y tipo de interés
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío de la clase CCuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos los atributos.
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta bancaria.
     * @param sal Saldo inicial disponible en la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método Get: devuelve el nombre del titular.
     * @return Nombre del titular.
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Método Set: establece el nombre del titular
     * @param nombre Nombre del titular.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 /**
     * Método Get: devuelve el número de cuenta.
     * @return Número de cuenta.
     */
	public String getCuenta() {
		return cuenta;
	}

	/**
     * Método Set: establece el número de cuenta.
     * @param cuenta Número de cuenta.
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método Get: devuelve el saldo de la cuenta bancaria.
	 * @return Saldo inicial disponible de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método Set: establece el saldo inicial de la cuenta.
	 * @param saldo Saldo de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método Get: devuelve el tipo de interés de la cuenta.
	 * @return Tipo de Interés de la cuenta bancaria.
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Método Set: establece el tipo de interés de la cuenta bancaria.
	 * @param tipoInterés Tipo de interés de la cuenta.
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el saldo actual de la cuenta bancaria.
	 * @return Saldo de la cuenta.
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * Método que ingresa saldo en la cuenta bancaria
	 * @param cantidad Cantidad a ingresar en la cuenta.
	 * @throws Exception Excepción para controlar cantidades negativas.
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Método para retirar dinero de la cuenta bancaria.
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Excepción para controlar la cantidad de retirada, si es negativa o si 
     * no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
