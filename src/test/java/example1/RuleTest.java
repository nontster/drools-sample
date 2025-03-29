
package example1;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import example1.model.drools_group.Cart;
import example1.model.drools_group.Item;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RuleTest {
    static final Logger LOG = LoggerFactory.getLogger(RuleTest.class);

    @Test
    public void testForDroolsGroup() throws Exception {
        KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession();
        Cart cart = new Cart();
        cart.setItemList(new ArrayList<>(List.of(
                new Item("101", "Item1", 10, 1),
                new Item("102", "Item2", 20, 2),
                new Item("103", "Item3", 30, 3),
                new Item("104", "Item4", 40, 4))));
        ksession.insert(cart);
        ksession.getAgenda().getAgendaGroup("AGENDA1").setFocus();
        ksession.fireAllRules();
        ksession.dispose();
    }
}
