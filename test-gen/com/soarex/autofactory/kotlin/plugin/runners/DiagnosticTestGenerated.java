

package com.soarex.autofactory.kotlin.plugin.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link com.soarex.autofactory.kotlin.plugin.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class DiagnosticTestGenerated extends AbstractDiagnosticTest {
    @Test
    public void testAllFilesPresentInDiagnostics() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("primaryConstructorParametersAreVal.kt")
    public void testPrimaryConstructorParametersAreVal() throws Exception {
        runTest("testData/diagnostics/primaryConstructorParametersAreVal.kt");
    }

    @Test
    @TestMetadata("suitableConstructors.kt")
    public void testSuitableConstructors() throws Exception {
        runTest("testData/diagnostics/suitableConstructors.kt");
    }

    @Test
    @TestMetadata("uselessIgnoreAnnotation.kt")
    public void testUselessIgnoreAnnotation() throws Exception {
        runTest("testData/diagnostics/uselessIgnoreAnnotation.kt");
    }
}
