    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <configuration>
                    <!-- Docker Desktop 4.21+ requires API >= 1.40; Testcontainers defaults to 1.32 -->
                    <argLine>-Dapi.version=1.41</argLine>
                </configuration>
            </plugin>
        </plugins>
    </build>
