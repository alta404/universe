package org.yul.github.universe;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class JsonToPojo {

    private static final String RESOURCE_PATH = JsonToPojo.class.getClassLoader().getResource("schedule.json").getPath();

    @Test
    void jsonToPojo() throws IOException {
        var inputJsonUrl = Paths.get(RESOURCE_PATH).toUri().toURL();
        var outputJavaClassDirectory = new File("/Users/alta/dev/Projects/universe/src/main/java/");
        var packageName = "org.yul.github.universe.domain";
        var javaClassName = "GithubUniverseSchedule";
        convertJsonToJavaClass(inputJsonUrl, outputJavaClassDirectory, packageName, javaClassName);
    }

    private void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName)
            throws IOException {
        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {

            @Override
            public boolean isIncludeToString() {
                return false;
            }

            @Override
            public boolean isIncludeGetters() {
                return false;
            }

            @Override
            public boolean isIncludeHashcodeAndEquals() {
                return false;
            }

            @Override
            public boolean isIncludeSetters() {
                return false;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

        jcodeModel.build(outputJavaClassDirectory);
    }

}
