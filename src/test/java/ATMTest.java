import com.juaracoding.ranujian2jf.ujian2.ATM;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
    private ATM atm;

    @BeforeMethod
    public void setUp() {
        atm = new ATM(1000); // Inisialisasi saldo awal = 1000
    }

    @Test
    public void testLihatSaldo() {
        int saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 1000, "Saldo awal harus 1000");
    }

    @Test
    public void testSetorUang() {
        atm.setorUang(500);
        Assert.assertEquals(atm.lihatSaldo(), 1500, "Saldo harus menjadi 1500 setelah setor 500");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif() {
        atm.setorUang(-100);
    }

    @Test
    public void testTarikUang() {
        atm.tarikUang(200);
        Assert.assertEquals(atm.lihatSaldo(), 800, "Saldo harus menjadi 800 setelah tarik 200");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo() {
        atm.tarikUang(1200);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif() {
        atm.tarikUang(-50);
    }
}
