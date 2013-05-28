package time;

import java.io.File;
import edu.stanford.nlp.io.IOUtils;

/**
 * A simple example of how to use run the system on an arbitrary String expression.
 *
 * The command to run this example, from the root of the git tree, is the following:
 *
 * javac -d bin -cp dist/time-release.jar src/time/JavaExample.java && java -mx4g -cp bin:dist/time-release.jar:/u/nlp/data/StanfordCoreNLPModels/stanford-corenlp-2012-04-09-models.jar time.JavaExample
 *
 * Note that the models must be from 2012-04-09 (version 1.3.1 @ http://www-nlp.stanford.edu/software/stanford-corenlp-2012-04-09.tgz)
 *
 */
class JavaExample {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    TreeTime model = IOUtils.readObjectFromFileNoExceptions(new File("dist/interpretModel.ser.gz"));

    System.out.println("Last week was " + model.parseTimex("last week", System.currentTimeMillis()));
    System.out.println("Next week will be " + model.parseTimex("next week", System.currentTimeMillis()));
    System.out.println("Last quarter was " + model.parseTimex("last quarter", System.currentTimeMillis()));
  }
}