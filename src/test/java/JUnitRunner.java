
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Created by Joe on 3/30/17.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
  BoardTest.class,
  GameAPITest.class,
  OrientationClassTest.class,
  TilePlacementTests.class,
  TileTest.class,
  updateSettlementsTest.class,
  HexValidationTest.class
})

public class JUnitRunner {

}