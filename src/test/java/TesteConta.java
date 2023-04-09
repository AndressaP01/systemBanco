import org.junit.Test;

import static org.junit.Assert.*;

public class TesteConta {


    @Test
    public void testeDeposito() {
        Usuario usuario1 = new Usuario();
        double deposito = usuario1.user.depositar(100.0);
        assertEquals(100.0, deposito, 0.01);
    }

    @Test
    public void testeSacar() {
        Usuario usuario2 = new Usuario();
        usuario2.user.depositar(100.0);
        double sacar = usuario2.user.sacar(20.0);
        assertEquals(80.0, sacar, 0.01);
    }

    @Test
    public void testeSaldoInicial() {
        Usuario usuario3 = new Usuario();
        double saldoInicial = usuario3.user.VerSaldo();
        assertEquals(0.0, saldoInicial, 0.01);
    }

    @Test
    public void testeSaldoLimite() {
        Usuario usuario4 = new Usuario();
        usuario4.user.sacarLimite(3000.0);
        double saldoLimite = usuario4.user.saldoLimite();
        assertEquals(7000.0, saldoLimite, 0.01);
    }

    @Test
    public void testeReporLimite() {
        Usuario usuario5 = new Usuario();
        usuario5.user.sacarLimite(4000.0);
        usuario5.user.ReporLimite(4000.0);
        double saldoLimite = usuario5.user.saldoLimite();
        assertEquals(10000.0, saldoLimite, 0.01);
    }

    @Test
    public void testeSaldoInicialLimite() {
        Usuario usuario8 = new Usuario();
        double saldoLimite = usuario8.user.saldoLimite();
        assertEquals(10000.0, saldoLimite, 0.01);
    }

    @Test
    public void testeOpcionalCartaoCredito() {
        Usuario usuario6 = new Usuario();
        boolean CartaoCredito = usuario6.user.OpcionalcartaoCredito(false);
        assertFalse(CartaoCredito);
    }

    @Test
    public void testeOpcionalCartaoCredito2() {
        Usuario usuario7 = new Usuario();
        boolean CartaoCredito = usuario7.user.OpcionalcartaoCredito(true);
        assertTrue(CartaoCredito);
    }

    @Test
    public void testeOpcionalPoupanca() {
        Usuario usuario9 = new Usuario();
        boolean poupanca = usuario9.user.OpcionalContaPoupança(true);
        assertTrue(poupanca);
    }

    @Test
    public void testeOpcionalPoupanca2() {
        Usuario usuario10 = new Usuario();
        boolean poupanca = usuario10.user.OpcionalContaPoupança(false);
        assertFalse(poupanca);
    }
}


