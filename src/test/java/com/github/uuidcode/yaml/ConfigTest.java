package com.github.uuidcode.yaml;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.InputStreamReader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.esotericsoftware.yamlbeans.YamlReader;

@RunWith(MockitoJUnitRunner.class)
public class ConfigTest {

    @Test
    public void test() throws Exception {
        YamlReader yamlReader = new YamlReader(new InputStreamReader(this.getClass().getResourceAsStream("/config.yaml")));

        Config config = yamlReader.read(Config.class);
        assertThat(config.getDatabase().getUrl(), is("test"));

        config = yamlReader.read(Config.class);
        assertThat(config.getDatabase().getUrl(), is("TEST"));

        config = yamlReader.read(Config.class);
        assertThat(config.getDatabase().getDriver(), is("b"));
    }
}
