package console

/**
 * Created by arellanog on 27/10/17.
 */
class GroovyShellEvaluator implements Evaluator {
    private GroovyShell shell = new GroovyShell()

    @Override
    Object evaluate(String input) {
        shell.evaluate(input)
    }
}
