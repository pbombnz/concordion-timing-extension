package spec;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.TimerExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@Extensions(TimerExtension.class)
public class TimerFixture {

    public String name() {
        return "Andrew";
    }

    public String lastname() {
        return "Nah";
    }

}
