# hibernate-service-loader-meta-inf-demo

## Reproduction steps

- Build JAR via `./gradlew bootJar`
- Run JAR `java -jar build/libs/hibernate-service-loader-meta-inf-demo-0.0.1-SNAPSHOT.jar`

You should see a stacktrace similar to this:
```
2022-03-24 17:15:14.809  WARN 41941 --- [           main] o.h.b.r.c.i.AggregatedServiceLoader      : HHH000505: Ignoring ServiceConfigurationError caught while trying to instantiate service 'interface com.example.demo.TestInterface'.

java.util.ServiceConfigurationError: com.example.demo.TestInterface: Provider com.example.demo.TestImplementation not found
        at java.base/java.util.ServiceLoader.fail(ServiceLoader.java:589) ~[na:na]
        at java.base/java.util.ServiceLoader$LazyClassPathLookupIterator.nextProviderClass(ServiceLoader.java:1212) ~[na:na]
        at java.base/java.util.ServiceLoader$LazyClassPathLookupIterator.hasNextService(ServiceLoader.java:1221) ~[na:na]
        at java.base/java.util.ServiceLoader$LazyClassPathLookupIterator.hasNext(ServiceLoader.java:1265) ~[na:na]
        at java.base/java.util.ServiceLoader$2.hasNext(ServiceLoader.java:1300) ~[na:na]
        at java.base/java.util.ServiceLoader$ProviderSpliterator.tryAdvance(ServiceLoader.java:1484) ~[na:na]
        at java.base/java.util.Spliterators$1Adapter.hasNext(Spliterators.java:681) ~[na:na]
        at org.hibernate.boot.registry.classloading.internal.AggregatedServiceLoader$ClassPathAndModulePathAggregatedServiceLoader.hasNextIgnoringServiceConfigurationError(AggregatedServiceLoader.java:241) ~[hibernate-core-5.4.33.jar!/:5.4.33]
        ...
```