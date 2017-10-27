package console

import griffon.core.test.GriffonFestRule
import org.fest.swing.fixture.FrameFixture
import org.junit.Rule
import org.junit.Test

class ConsoleIntegrationTest {
    static {
        System.setProperty('org.slf4j.simpleLogger.defaultLogLevel', 'trace')
        System.setProperty('griffon.swing.edt.violations.check', 'true')
        System.setProperty('griffon.swing.edt.hang.monitor', 'true')
    }

    @Rule
    public final GriffonFestRule fest = new GriffonFestRule()

    private FrameFixture window

    @Test
    void clickButton() {

    }
}
