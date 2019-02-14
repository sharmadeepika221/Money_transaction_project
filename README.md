# Money_transaction_project
Spring and Hibernate project for money transaction

Here class  "MoneyMakingBusinessService" is with a "makeMoney" method. So technically, each time you run "MoneyMakingBusinessServiceImplIntegrationTest", you'd be making some money.


Spring and Hibernate based project that demos simple things such as:

A way to structure a project
Maven based structure ( hence can be easily used by gradle ). Configuration and property files organized under "META-INF/conf", "META-INF/props", etc..

A way to separate Spring configs
"tx-spring-config.xml", "persistence-spring-config.xml", "service-spring-config.xml", "repository-spring-config.xml" and "application-context.xml" that includes them all

Properties via PropertyPlaceholderConfigurer
<context:property-placeholder location="classpath:META-INF/props/env.properties"/>
Hibernate overall configuration file
That is injected into AnnotationSessionFactoryBean

Hibernate Named Queries
That are linked to the Hibernate overall config ( <mapping resource="META-INF/conf/hibernate/mapping/startup-bank-named-queries.xml"/> )

Spring's DAO / Hibernate Exception Translation
Via @Repository and "PersistenceExceptionTranslationPostProcessor"

Simple CRUD Repository
public interface MoneyRepository {

	public void make( MoneyRoll moneyRoll );       // C
	public MoneyRoll find( Long id );              // R
	public void update( MoneyRoll moneyRoll );     // U
	public void takeOut( MoneyRoll moneyRoll );    // D
}
with a Hibernate based implementation

Transaction Management with Spring AOP
Declarative, on a Service Level, using "aop:config", "tx:advice" namespaces

Spring Testing
With SpringJUnit4ClassRunner, ContextConfiguration, etc..

Using Embeded in-memory H2 Database for Testing
<jdbc:embedded-database id="dataSource" type="H2"/>
Hibernate Logging
Most useful hibernate "log4j.logger" properties

Demoing how important Transaction is for Hibernate Sessions
"HibernateSessionThreadBoundIntegrationTest" for the second (after LazyInitializationException ) most common Hibernate exception: "No Hibernate Session bound to thread, and configuration does not allow creation of non-transactional one here"

TODO: provide some JPA examples, although, it most likely deserves a separate project to keep things simple
