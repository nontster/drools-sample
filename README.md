# Drools NPE

Command
```bash
mvn clean test
```

Output
```
[ERROR] Errors:
[ERROR]   RuleTest.testForDroolsGroup:34 » NullPointer Cannot invoke "org.drools.core.reteoo.AbstractTuple.setPrevious(org.drools.core.reteoo.Tuple)" because "next" is null
[INFO]
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
```