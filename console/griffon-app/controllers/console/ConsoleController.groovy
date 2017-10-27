package console

import griffon.core.artifact.GriffonController
import griffon.core.controller.ControllerAction
import griffon.inject.MVCMember
import griffon.metadata.ArtifactProviderFor

import javax.annotation.Nonnull
import javax.inject.Inject

@ArtifactProviderFor(GriffonController)
class ConsoleController {
    @MVCMember @Nonnull
    ConsoleModel model

    @Inject
    Evaluator evaluator

    @ControllerAction
    void executeScript() {
        model.enabled = false
        def result
        try {
            result = evaluator.evaluate(model.scriptSource)
        } finally {
            model.enabled = true
            model.scriptResult = result
        }
    }
}