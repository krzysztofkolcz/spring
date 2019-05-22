# tomcat
sudo su
/opt/tomcat/apache-tomcat-8.5.39/bin
sh ./startup.sh
http://localhost:8080/

## tomcat users:
/opt/tomcat/apache-tomcat-8.5.39/conf/tomcat-users.xml

## deploy
mvn clean install
cp ../file.war /opt/tomcat/apache-tomcat-8.5.39/webapps/
np.:
~/IdeaProjects/spring/Spring4MVCFormValidationExample/target$ sudo cp Spring4MVCFormValidationExample.war /opt/tomcat/apache-tomcat-8.5.39/webapps/

lub

https://www.baeldung.com/tomcat-deploy-war

~/.m2/repository$ touch settings.xml

http://maven.apache.org/settings.html

<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                          https://maven.apache.org/xsd/settings-1.0.0.xsd">
  <localRepository/>
  <interactiveMode/>
  <offline/>
  <pluginGroups/>
  <servers>
  <server>
    <id>TomcatServer</id>
    <username>tomcat</username>
    <password>***</password>
  </server>
  </servers>
  <mirrors/>
  <proxies/>
  <profiles/>
  <activeProfiles/>
</settings>



'No plugin found for prefix 'tomcat7' in the current project and in the plugin groups'

Dodanie do pom.xml:
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.tomcat.maven</groupId>
            <artifactId>tomcat7-maven-plugin</artifactId>
            <version>2.3-SNAPSHOT</version>
        </plugin>
    </plugins>
</build>

'Failed to retrieve plugin descriptor for org.apache.tomcat.maven:tomcat7-maven-plugin:2.3-SNAPSHOT: Plugin org.apache.tomcat.maven:tomcat7-maven-plugin:2.3-SNAPSHOT or one of its dependencies could not be resolved: Could not find artifact org.apache.tomcat.maven:tomcat7-maven-plugin:jar:2.3-SNAPSHOT'
https://stackoverflow.com/questions/2013576/maven-is-failing-to-download-the-tomcat-maven-plugin-snapshot

Dodanie do pom.xml:
<repositories>
    <repository>
        <id>people.apache.snapshots</id>
        <url>http://repository.apache.org/content/groups/snapshots-group/</url>
        <releases>
            <enabled>false</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>

<pluginRepositories>
    <pluginRepository>
        <id>apache.snapshots</id>
        <name>Apache Snapshots</name>
        <url>http://repository.apache.org/content/groups/snapshots-group/</url>
        <releases>
            <enabled>false</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </pluginRepository>
</pluginRepositories>


w plikach pom.xml modułów:

```
<build>
    <pluginManagement>
        <plugins>
            ...
            <plugin>
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat7-maven-plugin</artifactId>
                <version>2.2</version>
                <configuration>
                    <url>http://localhost:8080/manager/text</url>
                    <server>TomcatServer</server>
                    <path>/Spring4MVCHelloWorldNoXMLDemo</path>
                </configuration>
            </plugin>
        </plugins>
    </pluginManagement>
    <finalName>Spring4MVCHelloWorldNoXMLDemo</finalName>
</build>
```

# spring
Application - 
Spring4HelloWorldBeanApp - http://websystique.com/spring/spring-4-hello-world-example-annotation-tutorial-full-example/
SpringAutowiringXML - http://websystique.com/spring/spring-beans-auto-wiring-example-using-xml-configuration/
SpringDIAutowired - http://websystique.com/spring/spring-dependency-injection-annotation-beans-auto-wiring-using-autowired-qualifier-resource-annotations-configuration/
WSq004Spring4ComponentScanning - http://websystique.com/spring/spring-auto-detection-autowire-component-scanning-example-with-annotations/
WSq005Spring4PropertySource - http://websystique.com/spring/spring-propertysource-value-annotations-example/
