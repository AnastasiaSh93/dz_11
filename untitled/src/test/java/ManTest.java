import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ManTest {

        private Man man;
        private Woman woman;

        @BeforeMethod
        public void setUp() {
            man = new Man("John", "Doe", 70, null);
            woman = new Woman("Jane", "Smith", 65, null, "Smith");

        }

        @Test
        public void testIsRetired() {
            Assert.assertTrue(man.isRetired());
        }

        @Test
        public void testRegisteredPartnership() {
            man.registeredPartner(woman);
            Assert.assertEquals(man.getPartner(), woman);
            Assert.assertEquals(woman.getPartner(), man);
            Assert.assertEquals(woman.getLastName(), man.getLastName());
        }

        @Test
        public void testDeregisteredPartnership() {
            man.registeredPartner(woman);
            man.deregisterPartnership(true);
            Assert.assertNull(man.getPartner());
            Assert.assertNull(woman.getPartner());
            Assert.assertEquals(woman.getLastName(), woman.getMaidenName());
        }
    }



