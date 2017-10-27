package console

import org.codehaus.griffon.runtime.swing.DefaultSwingWindowDisplayHandler

import javax.annotation.Nonnull
import java.awt.Window

import static griffon.swing.support.SwingUtils.centerOnScreen

/**
 * Created by arellanog on 27/10/17.
 */
class CenteringWindowDisplayHandler extends DefaultSwingWindowDisplayHandler {
    @Override
    void show(@Nonnull String name, @Nonnull Window window) {
        centerOnScreen(window)
        super.show(name, window)
    }
}
