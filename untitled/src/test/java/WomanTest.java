import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomanTest {
        private Man man;
        private Woman woman;

        @BeforeMethod
        public void setUp() {
            man = new Man("John", "Doe", 70, null);
            woman = new Woman("Jane", "Smith", 65, null, "Smith");

        }

        @Test
        public void testIsRetired() {
            Assert.assertTrue(woman.isRetired());
        }

        @Test
        public void testRegisteredPartnership() {
            woman.registeredPartner(man);
            Assert.assertEquals(woman.getPartner(), man);
            Assert.assertEquals(woman.getPartner(), man);
            Assert.assertEquals(woman.getLastName(), man.getLastName());
        }

        @Test
        public void testDeregisteredPartnership() {
            woman.registeredPartner(man);
            woman.deregisterPartnership(true);
            Assert.assertNull(woman.getPartner());
            Assert.assertNull(woman.getPartner());
            Assert.assertEquals(woman.getLastName(), woman.getMaidenName());
        }



}
