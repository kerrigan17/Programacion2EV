package POO2;

class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void recibirAbono(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha abonado " + cantidad + " a la cuenta " + numeroCuenta);
    }

    public boolean pagarRecibo(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se ha pagado " + cantidad + " de la cuenta " + numeroCuenta);
            return true;
        } else {
            System.out.println("Saldo insuficiente en la cuenta " + numeroCuenta);
            return false;
        }
    }

    public void mostrarSaldoDisponible() {
        System.out.println("Saldo disponible en la cuenta " + numeroCuenta + ": " + saldo);
    }
}